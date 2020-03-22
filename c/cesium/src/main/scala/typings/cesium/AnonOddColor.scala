package typings.cesium

import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOddColor extends js.Object {
  var evenColor: js.UndefOr[Property] = js.undefined
  var oddColor: js.UndefOr[Property] = js.undefined
  var offset: js.UndefOr[Property] = js.undefined
  var orientation: js.UndefOr[Property] = js.undefined
  var repeat: js.UndefOr[Property] = js.undefined
}

object AnonOddColor {
  @scala.inline
  def apply(
    evenColor: Property = null,
    oddColor: Property = null,
    offset: Property = null,
    orientation: Property = null,
    repeat: Property = null
  ): AnonOddColor = {
    val __obj = js.Dynamic.literal()
    if (evenColor != null) __obj.updateDynamic("evenColor")(evenColor.asInstanceOf[js.Any])
    if (oddColor != null) __obj.updateDynamic("oddColor")(oddColor.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOddColor]
  }
}

