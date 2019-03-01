package typings
package dateDashFnsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var additionalDigits: js.UndefOr[
    dateDashFnsLib.dateDashFnsLibNumbers.`0` | dateDashFnsLib.dateDashFnsLibNumbers.`1` | dateDashFnsLib.dateDashFnsLibNumbers.`2`
  ] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    additionalDigits: dateDashFnsLib.dateDashFnsLibNumbers.`0` | dateDashFnsLib.dateDashFnsLibNumbers.`1` | dateDashFnsLib.dateDashFnsLibNumbers.`2` = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal()
    if (additionalDigits != null) __obj.updateDynamic("additionalDigits")(additionalDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

