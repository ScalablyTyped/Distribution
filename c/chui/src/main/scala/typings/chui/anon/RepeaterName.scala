package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeaterName extends js.Object {
  var repeaterName: js.UndefOr[js.Any] = js.undefined
}

object RepeaterName {
  @scala.inline
  def apply(repeaterName: js.Any = null): RepeaterName = {
    val __obj = js.Dynamic.literal()
    if (repeaterName != null) __obj.updateDynamic("repeaterName")(repeaterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeaterName]
  }
}

