package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLoop extends js.Object {
  var id: js.UndefOr[js.Any] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var material: js.UndefOr[Material] = js.undefined
  var positions: js.UndefOr[js.Array[Cartesian3]] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_IdLoop {
  @scala.inline
  def apply(
    id: js.Any = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    material: Material = null,
    positions: js.Array[Cartesian3] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): Anon_IdLoop = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdLoop]
  }
}

