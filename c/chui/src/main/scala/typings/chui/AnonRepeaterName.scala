package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRepeaterName extends js.Object {
  var repeaterName: js.UndefOr[js.Any] = js.undefined
}

object AnonRepeaterName {
  @scala.inline
  def apply(repeaterName: js.Any = null): AnonRepeaterName = {
    val __obj = js.Dynamic.literal()
    if (repeaterName != null) __obj.updateDynamic("repeaterName")(repeaterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRepeaterName]
  }
}

