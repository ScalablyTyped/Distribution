package typings.d3DashForce.d3DashForceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimulationNodeDatum extends js.Object {
  /**
    * Node’s fixed x-position (if position was fixed)
    */
  var fx: js.UndefOr[Double | Null] = js.undefined
  /**
    * Node’s fixed y-position (if position was fixed)
    */
  var fy: js.UndefOr[Double | Null] = js.undefined
  /**
    * Node’s zero-based index into nodes array. This property is set during the initialization process of a simulation.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Node’s current x-velocity
    */
  var vx: js.UndefOr[Double] = js.undefined
  /**
    * Node’s current y-velocity
    */
  var vy: js.UndefOr[Double] = js.undefined
  /**
    * Node’s current x-position
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Node’s current y-position
    */
  var y: js.UndefOr[Double] = js.undefined
}

object SimulationNodeDatum {
  @scala.inline
  def apply(
    fx: Int | Double = null,
    fy: Int | Double = null,
    index: Int | Double = null,
    vx: Int | Double = null,
    vy: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): SimulationNodeDatum = {
    val __obj = js.Dynamic.literal()
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fy != null) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (vx != null) __obj.updateDynamic("vx")(vx.asInstanceOf[js.Any])
    if (vy != null) __obj.updateDynamic("vy")(vy.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationNodeDatum]
  }
}

