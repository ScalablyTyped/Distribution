package typings.cesium

import typings.cesium.mod.Color
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvenColor extends js.Object {
  var evenColor: js.UndefOr[Color] = js.undefined
  var oddColor: js.UndefOr[Color] = js.undefined
  var repeat: js.UndefOr[Property] = js.undefined
}

object AnonEvenColor {
  @scala.inline
  def apply(evenColor: Color = null, oddColor: Color = null, repeat: Property = null): AnonEvenColor = {
    val __obj = js.Dynamic.literal()
    if (evenColor != null) __obj.updateDynamic("evenColor")(evenColor.asInstanceOf[js.Any])
    if (oddColor != null) __obj.updateDynamic("oddColor")(oddColor.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvenColor]
  }
}

