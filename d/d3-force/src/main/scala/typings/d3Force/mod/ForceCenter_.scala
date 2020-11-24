package typings.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceCenter_[NodeDatum /* <: SimulationNodeDatum */]
  extends Force[NodeDatum, js.Any] {
  
  /**
    * Supplies the array of nodes and random source to this force. This method is called when a force is bound to a simulation via simulation.force
    * and when the simulation’s nodes change via simulation.nodes.
    *
    * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
    */
  @JSName("initialize")
  def initialize_MForceCenter_(nodes: js.Array[NodeDatum], random: js.Function0[Double]): Unit = js.native
  
  /**
    * Returns the force’s current strength, which defaults to 1.
    */
  def strength(): Double = js.native
  /**
    * Sets the centering force’s strength.
    * A reduced strength of e.g. 0.05 softens the movements on interactive graphs in which new nodes enter or exit the graph.
    * @param strength The centering force's strength.
    */
  def strength(strength: Double): this.type = js.native
  
  /**
    * Return the current x-coordinate of the centering position, which defaults to zero.
    */
  def x(): Double = js.native
  /**
    * Set the x-coordinate of the centering position.
    *
    * @param x x-coordinate.
    */
  def x(x: Double): this.type = js.native
  
  /**
    * Return the current y-coordinate of the centering position, which defaults to zero.
    */
  def y(): Double = js.native
  /**
    * Set the y-coordinate of the centering position.
    *
    * @param y y-coordinate.
    */
  def y(y: Double): this.type = js.native
}
