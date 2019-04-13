package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClampToGround extends js.Object {
  var clampToGround: js.UndefOr[scala.Boolean] = js.undefined
  var fill: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
  var markerColor: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
  var markerSize: js.UndefOr[scala.Double] = js.undefined
  var markerSymbol: js.UndefOr[java.lang.String] = js.undefined
  var sourceUri: js.UndefOr[java.lang.String] = js.undefined
  var stroke: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ClampToGround {
  @scala.inline
  def apply(
    clampToGround: js.UndefOr[scala.Boolean] = js.undefined,
    fill: cesiumLib.cesiumMod.Color = null,
    markerColor: cesiumLib.cesiumMod.Color = null,
    markerSize: scala.Int | scala.Double = null,
    markerSymbol: java.lang.String = null,
    sourceUri: java.lang.String = null,
    stroke: cesiumLib.cesiumMod.Color = null,
    strokeWidth: scala.Int | scala.Double = null
  ): Anon_ClampToGround = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor)
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerSymbol != null) __obj.updateDynamic("markerSymbol")(markerSymbol)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClampToGround]
  }
}

