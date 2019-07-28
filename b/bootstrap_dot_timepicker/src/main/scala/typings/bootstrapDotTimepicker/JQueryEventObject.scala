package typings.bootstrapDotTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryEventObject extends js.Object {
  var time: js.UndefOr[TimepickerTime] = js.undefined
}

object JQueryEventObject {
  @scala.inline
  def apply(time: TimepickerTime = null): JQueryEventObject = {
    val __obj = js.Dynamic.literal()
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[JQueryEventObject]
  }
}

