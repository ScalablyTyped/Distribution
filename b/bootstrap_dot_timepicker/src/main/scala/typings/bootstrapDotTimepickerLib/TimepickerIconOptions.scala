package typings
package bootstrapDotTimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerIconOptions extends js.Object {
  var down: js.UndefOr[java.lang.String] = js.undefined
  var up: js.UndefOr[java.lang.String] = js.undefined
}

object TimepickerIconOptions {
  @scala.inline
  def apply(down: java.lang.String = null, up: java.lang.String = null): TimepickerIconOptions = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down)
    if (up != null) __obj.updateDynamic("up")(up)
    __obj.asInstanceOf[TimepickerIconOptions]
  }
}

