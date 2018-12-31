package typings
package d3DashForceLib.d3DashForceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Force[NodeDatum /* <: SimulationNodeDatum */, LinkDatum /* <: js.UndefOr[SimulationLinkDatum[NodeDatum]] */] extends js.Object {
  /**
    * Assign the array of nodes to this force. This method is called when a force is bound to a simulation via simulation.force
    * and when the simulation’s nodes change via simulation.nodes.
    *
    * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
    */
  var initialize: js.UndefOr[js.Function1[/* nodes */ js.Array[NodeDatum], scala.Unit]] = js.native
  /**
    * Apply this force, optionally observing the specified alpha.
    * Typically, the force is applied to the array of nodes previously passed to force.initialize,
    * however, some forces may apply to a subset of nodes, or behave differently.
    * For example, d3.forceLink applies to the source and target of each link.
    */
  def apply(alpha: scala.Double): scala.Unit = js.native
}

