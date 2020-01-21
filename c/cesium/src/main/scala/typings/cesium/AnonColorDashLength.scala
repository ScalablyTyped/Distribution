package typings.cesium

import typings.cesium.mod.Color
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorDashLength extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var dashLength: js.UndefOr[Property] = js.undefined
  var dashPattern: js.UndefOr[Property] = js.undefined
  var gapColor: js.UndefOr[Color] = js.undefined
}

object AnonColorDashLength {
  @scala.inline
  def apply(
    color: Color = null,
    dashLength: Property = null,
    dashPattern: Property = null,
    gapColor: Color = null
  ): AnonColorDashLength = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashLength != null) __obj.updateDynamic("dashLength")(dashLength.asInstanceOf[js.Any])
    if (dashPattern != null) __obj.updateDynamic("dashPattern")(dashPattern.asInstanceOf[js.Any])
    if (gapColor != null) __obj.updateDynamic("gapColor")(gapColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorDashLength]
  }
}

