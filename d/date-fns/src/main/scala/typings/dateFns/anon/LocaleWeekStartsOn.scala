package typings.dateFns.anon

import typings.dateFns.dateFnsNumbers.`0`
import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import typings.dateFns.dateFnsNumbers.`3`
import typings.dateFns.dateFnsNumbers.`4`
import typings.dateFns.dateFnsNumbers.`5`
import typings.dateFns.dateFnsNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleWeekStartsOn extends js.Object {
  var locale: js.UndefOr[typings.dateFns.Locale] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object LocaleWeekStartsOn {
  @scala.inline
  def apply(
    locale: typings.dateFns.Locale = null,
    weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null
  ): LocaleWeekStartsOn = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleWeekStartsOn]
  }
}

