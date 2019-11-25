package typings.cesium

import typings.cesium.cesiumMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClampToGround extends js.Object {
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Color] = js.undefined
  var markerColor: js.UndefOr[Color] = js.undefined
  var markerSize: js.UndefOr[Double] = js.undefined
  var markerSymbol: js.UndefOr[String] = js.undefined
  var sourceUri: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[Color] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object Anon_ClampToGround {
  @scala.inline
  def apply(
    clampToGround: js.UndefOr[Boolean] = js.undefined,
    fill: Color = null,
    markerColor: Color = null,
    markerSize: Int | Double = null,
    markerSymbol: String = null,
    sourceUri: String = null,
    stroke: Color = null,
    strokeWidth: Int | Double = null
  ): Anon_ClampToGround = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerSymbol != null) __obj.updateDynamic("markerSymbol")(markerSymbol.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClampToGround]
  }
}

