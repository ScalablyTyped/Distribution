package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonOptions extends js.Object {
  var enableClicking: js.UndefOr[Boolean] = js.undefined
  var enableEditing: js.UndefOr[Boolean] = js.undefined
  var enableMassClear: js.UndefOr[Boolean] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeStyle: js.UndefOr[String] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
}

object PolygonOptions {
  @scala.inline
  def apply(
    enableClicking: js.UndefOr[Boolean] = js.undefined,
    enableEditing: js.UndefOr[Boolean] = js.undefined,
    enableMassClear: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    strokeColor: String = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeStyle: String = null,
    strokeWeight: js.UndefOr[Double] = js.undefined
  ): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableClicking)) __obj.updateDynamic("enableClicking")(enableClicking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableEditing)) __obj.updateDynamic("enableEditing")(enableEditing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMassClear)) __obj.updateDynamic("enableMassClear")(enableMassClear.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWeight)) __obj.updateDynamic("strokeWeight")(strokeWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonOptions]
  }
}

