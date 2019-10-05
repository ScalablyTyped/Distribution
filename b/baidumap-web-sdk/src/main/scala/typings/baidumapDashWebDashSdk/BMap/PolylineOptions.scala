package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends js.Object {
  var enableClicking: js.UndefOr[Boolean] = js.undefined
  var enableEditing: js.UndefOr[Boolean] = js.undefined
  var enableMassClear: js.UndefOr[Boolean] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeStyle: js.UndefOr[String] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
}

object PolylineOptions {
  @scala.inline
  def apply(
    enableClicking: js.UndefOr[Boolean] = js.undefined,
    enableEditing: js.UndefOr[Boolean] = js.undefined,
    enableMassClear: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: String = null,
    strokeWeight: Int | Double = null
  ): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableClicking)) __obj.updateDynamic("enableClicking")(enableClicking)
    if (!js.isUndefined(enableEditing)) __obj.updateDynamic("enableEditing")(enableEditing)
    if (!js.isUndefined(enableMassClear)) __obj.updateDynamic("enableMassClear")(enableMassClear)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptions]
  }
}

