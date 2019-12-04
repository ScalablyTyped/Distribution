package typings.baseui.datepickerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerState extends js.Object {
  var value: js.UndefOr[Date | js.Array[Date]] = js.undefined
}

object ContainerState {
  @scala.inline
  def apply(value: Date | js.Array[Date] = null): ContainerState = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerState]
  }
}

