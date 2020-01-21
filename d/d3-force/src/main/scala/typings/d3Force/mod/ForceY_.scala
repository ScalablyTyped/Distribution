package typings.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceY_[NodeDatum /* <: SimulationNodeDatum */]
  extends Force[NodeDatum, js.Any] {
  /**
    * Assign the array of nodes to this force. This method is called when a force is bound to a simulation via simulation.force
    * and when the simulation’s nodes change via simulation.nodes.
    *
    * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
    */
  @JSName("initialize")
  def initialize_MForceY_(nodes: js.Array[NodeDatum]): Unit = js.native
  /**
    *  Returns the current strength accessor, which defaults to a constant strength for all nodes of 0.1.
    */
  def strength(): js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double] = js.native
  /**
    * Set the strength accessor to the specified function, re-evaluates the strength accessor for each node, and returns this force.
    *
    * The strength determines how much to increment the node’s y-velocity: (y - node.y) × strength.
    *
    * For example, a value of 0.1 indicates that the node should move a tenth of the way from its current y-position to the target y-position with each application.
    * Higher values moves nodes more quickly to the target position, often at the expense of other forces or constraints.
    *
    * A value outside the range [0,1] is not recommended.
    *
    * The strength accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the strength of each node is only recomputed when the force is initialized or
    * when this method is called with a new strength, and not on every application of the force.
    *
    * @param strength A strength accessor function which is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The function returns the strength.
    */
  def strength(strength: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): this.type = js.native
  /**
    * Set the strength accessor to the specified constant strength for all nodes, re-evaluates the strength accessor for each node, and returns this force.
    *
    * The strength determines how much to increment the node’s y-velocity: (y - node.y) × strength.
    *
    * For example, a value of 0.1 indicates that the node should move a tenth of the way from its current y-position to the target y-position with each application.
    * Higher values moves nodes more quickly to the target position, often at the expense of other forces or constraints.
    *
    * A value outside the range [0,1] is not recommended.
    *
    * The constant is internally wrapped into a strength accessor function.
    *
    * The strength accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the strength of each node is only recomputed when the force is initialized or
    * when this method is called with a new strength, and not on every application of the force.
    *
    * @param strength Constant value of strength to be used for all nodes.
    */
  def strength(strength: Double): this.type = js.native
  /**
    * Return the current y-accessor, which defaults to a function returning 0 for all nodes.
    */
  def y(): js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double] = js.native
  /**
    * Set the y-coordinate accessor to the specified function, re-evaluates the y-accessor for each node,
    * and returns this force.
    *
    * The y-accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the target y-coordinate of each node is only recomputed when the force is initialized or
    * when this method is called with a new y, and not on every application of the force.
    *
    * @param y A y-coordinate accessor function which is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The function returns the y-coordinate.
    */
  def y(y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): this.type = js.native
  /**
    * Set the y-coordinate accessor to the specified number, re-evaluates the y-accessor for each node,
    * and returns this force.
    *
    * The constant is internally wrapped into a y-coordinate accessor function.
    *
    * The y-accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the target y-coordinate of each node is only recomputed when the force is initialized or
    * when this method is called with a new y, and not on every application of the force.
    *
    * @param y Constant y-coordinate to be used for all nodes.
    */
  def y(y: Double): this.type = js.native
}

