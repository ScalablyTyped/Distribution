package typings
package d3DashForceLib.d3DashForceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceCenter[NodeDatum /* <: SimulationNodeDatum */]
  extends Force[NodeDatum, js.Any] {
  /**
    * Assign the array of nodes to this force. This method is called when a force is bound to a simulation via simulation.force
    * and when the simulation’s nodes change via simulation.nodes.
    *
    * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
    */
  @JSName("initialize")
  def initialize_MForceCenter(nodes: js.Array[NodeDatum]): scala.Unit = js.native
  /**
    * Return the current x-coordinate of the centering position, which defaults to zero.
    */
  def x(): scala.Double = js.native
  /**
    * Set the x-coordinate of the centering position.
    *
    * @param x x-coordinate.
    */
  def x(x: scala.Double): this.type = js.native
  /**
    * Return the current y-coordinate of the centering position, which defaults to zero.
    */
  def y(): scala.Double = js.native
  /**
    * Set the y-coordinate of the centering position.
    *
    * @param y y-coordinate.
    */
  def y(y: scala.Double): this.type = js.native
}

