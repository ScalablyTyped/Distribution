package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLoop extends js.Object {
  var id: js.UndefOr[js.Any] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Material] = js.undefined
  var positions: js.UndefOr[js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_IdLoop {
  @scala.inline
  def apply(
    id: js.Any = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    material: cesiumLib.cesiumMod.CesiumNs.Material = null,
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Anon_IdLoop = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (material != null) __obj.updateDynamic("material")(material)
    if (positions != null) __obj.updateDynamic("positions")(positions)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdLoop]
  }
}

