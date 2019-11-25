package typings.bootstrapDotTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerIconOptions extends js.Object {
  var down: js.UndefOr[String] = js.undefined
  var up: js.UndefOr[String] = js.undefined
}

object TimepickerIconOptions {
  @scala.inline
  def apply(down: String = null, up: String = null): TimepickerIconOptions = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimepickerIconOptions]
  }
}

