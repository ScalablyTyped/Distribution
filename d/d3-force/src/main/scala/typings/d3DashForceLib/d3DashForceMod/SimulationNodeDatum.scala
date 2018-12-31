package typings
package d3DashForceLib.d3DashForceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimulationNodeDatum extends js.Object {
  /**
    * Node’s fixed x-position (if position was fixed)
    */
  var fx: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Node’s fixed y-position (if position was fixed)
    */
  var fy: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Node’s zero-based index into nodes array. This property is set during the initialization process of a simulation.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Node’s current x-velocity
    */
  var vx: js.UndefOr[scala.Double] = js.undefined
  /**
    * Node’s current y-velocity
    */
  var vy: js.UndefOr[scala.Double] = js.undefined
  /**
    * Node’s current x-position
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Node’s current y-position
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

