package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonOptions extends js.Object {
  var enableClicking: js.UndefOr[scala.Boolean] = js.undefined
  var enableEditing: js.UndefOr[scala.Boolean] = js.undefined
  var enableMassClear: js.UndefOr[scala.Boolean] = js.undefined
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  var strokeStyle: js.UndefOr[scala.Double] = js.undefined
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
}

object PolygonOptions {
  @scala.inline
  def apply(
    enableClicking: js.UndefOr[scala.Boolean] = js.undefined,
    enableEditing: js.UndefOr[scala.Boolean] = js.undefined,
    enableMassClear: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeStyle: scala.Int | scala.Double = null,
    strokeWeight: scala.Int | scala.Double = null
  ): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableClicking)) __obj.updateDynamic("enableClicking")(enableClicking)
    if (!js.isUndefined(enableEditing)) __obj.updateDynamic("enableEditing")(enableEditing)
    if (!js.isUndefined(enableMassClear)) __obj.updateDynamic("enableMassClear")(enableMassClear)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonOptions]
  }
}

