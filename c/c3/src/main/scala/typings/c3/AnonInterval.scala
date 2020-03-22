package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInterval extends js.Object {
  var interval: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object AnonInterval {
  @scala.inline
  def apply(interval: js.Any = null, `type`: js.Any = null): AnonInterval = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInterval]
  }
}

