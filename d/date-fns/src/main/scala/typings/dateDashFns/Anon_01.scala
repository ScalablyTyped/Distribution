package typings.dateDashFns

import typings.dateDashFns.dateDashFnsNumbers.`0`
import typings.dateDashFns.dateDashFnsNumbers.`1`
import typings.dateDashFns.dateDashFnsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01 extends js.Object {
  var additionalDigits: js.UndefOr[`0` | `1` | `2`] = js.undefined
}

object Anon_01 {
  @scala.inline
  def apply(additionalDigits: `0` | `1` | `2` = null): Anon_01 = {
    val __obj = js.Dynamic.literal()
    if (additionalDigits != null) __obj.updateDynamic("additionalDigits")(additionalDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01]
  }
}

