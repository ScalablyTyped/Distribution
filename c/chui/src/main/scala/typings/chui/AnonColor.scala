package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String | Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object AnonColor {
  @scala.inline
  def apply(
    color: String = null,
    duration: String = null,
    position: String | Boolean = null,
    size: String = null
  ): AnonColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

