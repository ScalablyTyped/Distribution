package typings.dateFns

import typings.dateFns.dateFnsNumbers.`0`
import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditionalDigits extends js.Object {
  var additionalDigits: js.UndefOr[`0` | `1` | `2`] = js.undefined
}

object AnonAdditionalDigits {
  @scala.inline
  def apply(additionalDigits: `0` | `1` | `2` = null): AnonAdditionalDigits = {
    val __obj = js.Dynamic.literal()
    if (additionalDigits != null) __obj.updateDynamic("additionalDigits")(additionalDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionalDigits]
  }
}

