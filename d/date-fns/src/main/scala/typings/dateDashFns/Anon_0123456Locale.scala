package typings.dateDashFns

import typings.dateDashFns.dateDashFnsNumbers.`0`
import typings.dateDashFns.dateDashFnsNumbers.`1`
import typings.dateDashFns.dateDashFnsNumbers.`2`
import typings.dateDashFns.dateDashFnsNumbers.`3`
import typings.dateDashFns.dateDashFnsNumbers.`4`
import typings.dateDashFns.dateDashFnsNumbers.`5`
import typings.dateDashFns.dateDashFnsNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0123456Locale extends js.Object {
  var locale: js.UndefOr[Locale] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object Anon_0123456Locale {
  @scala.inline
  def apply(locale: Locale = null, weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null): Anon_0123456Locale = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0123456Locale]
  }
}

