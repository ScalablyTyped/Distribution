package typings.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceCollide_[NodeDatum /* <: SimulationNodeDatum */]
  extends Force[NodeDatum, js.Any] {
  /**
    * Assign the array of nodes to this force. This method is called when a force is bound to a simulation via simulation.force
    * and when the simulation’s nodes change via simulation.nodes.
    *
    * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
    */
  @JSName("initialize")
  def initialize_MForceCollide_(nodes: js.Array[NodeDatum]): Unit = js.native
  /**
    * Return the current iteration count which defaults to 1.
    */
  def iterations(): Double = js.native
  /**
    * Sets the number of iterations per application to the specified number and return this force.
    *
    * Increasing the number of iterations greatly increases the rigidity of the constraint and avoids partial overlap of nodes,
    * but also increases the runtime cost to evaluate the force.
    *
    * @param iterations Number of iterations.
    */
  def iterations(iterations: Double): this.type = js.native
  /**
    * Returns the current radius accessor function.
    */
  def radius(): js.Function3[/* node */ NodeDatum, /* i */ Double, /* nodes */ js.Array[NodeDatum], Double] = js.native
  /**
    * Set the radius accessor function determining the radius for each node in collision detection.
    *
    * The radius accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the radius of each node is only recomputed
    * when the force is initialized or when this method is called with a new radius, and not on every application of the force.
    *
    * @param radius A radius accessor function which is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The function returns a radius.
    */
  def radius(
    radius: js.Function3[/* node */ NodeDatum, /* i */ Double, /* nodes */ js.Array[NodeDatum], Double]
  ): this.type = js.native
  /**
    * Set the radius used in collision detection to a constant number for each node.
    *
    * The constant is internally wrapped into a radius accessor function.
    *
    * The radius accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the radius of each node is only recomputed
    * when the force is initialized or when this method is called with a new radius, and not on every application of the force.
    *
    * @param radius A constant radius for each node.
    */
  def radius(radius: Double): this.type = js.native
  /**
    * Return the current strength, which defaults to 0.7.
    */
  def strength(): Double = js.native
  /**
    * Set the force strength to the specified number in the range [0,1] and return this force.
    * The default strength is 0.7.
    *
    * Overlapping nodes are resolved through iterative relaxation.
    * For each node, the other nodes that are anticipated to overlap at the next tick (using the anticipated positions [x + vx,y + vy]) are determined;
    * the node’s velocity is then modified to push the node out of each overlapping node.
    * The change in velocity is dampened by the force’s strength such that the resolution of simultaneous overlaps can be blended together to find a stable solution.
    *
    * @param strength Strength.
    */
  def strength(strength: Double): this.type = js.native
}

