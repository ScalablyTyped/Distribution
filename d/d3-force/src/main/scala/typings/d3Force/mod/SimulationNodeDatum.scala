package typings.d3Force.mod

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
    fx: js.UndefOr[Null | Double] = js.undefined,
    fy: js.UndefOr[Null | Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    vx: js.UndefOr[Double] = js.undefined,
    vy: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): SimulationNodeDatum = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fx)) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (!js.isUndefined(fy)) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vx)) __obj.updateDynamic("vx")(vx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vy)) __obj.updateDynamic("vy")(vy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationNodeDatum]
  }
}

