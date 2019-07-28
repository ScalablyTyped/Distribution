package typings.delay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueUnknown extends js.Object {
  /**
  			Value to reject in the returned promise.
  			*/
  var value: js.UndefOr[js.Any] = js.undefined
}

object Anon_ValueUnknown {
  @scala.inline
  def apply(value: js.Any = null): Anon_ValueUnknown = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ValueUnknown]
  }
}

