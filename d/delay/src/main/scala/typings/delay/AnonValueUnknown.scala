package typings.delay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueUnknown extends js.Object {
  /**
  			Value to reject in the returned promise.
  			*/
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonValueUnknown {
  @scala.inline
  def apply(value: js.Any = null): AnonValueUnknown = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueUnknown]
  }
}

