package typings.dateFns

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

trait Anon0123 extends js.Object {
  var firstWeekContainsDate: js.UndefOr[Double] = js.undefined
  var locale: js.UndefOr[typings.dateFns.mod.Locale] = js.undefined
  var useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.undefined
  var useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object Anon0123 {
  @scala.inline
  def apply(
    firstWeekContainsDate: Int | Double = null,
    locale: typings.dateFns.mod.Locale = null,
    useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.undefined,
    useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.undefined,
    weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null
  ): Anon0123 = {
    val __obj = js.Dynamic.literal()
    if (firstWeekContainsDate != null) __obj.updateDynamic("firstWeekContainsDate")(firstWeekContainsDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(useAdditionalDayOfYearTokens)) __obj.updateDynamic("useAdditionalDayOfYearTokens")(useAdditionalDayOfYearTokens.asInstanceOf[js.Any])
    if (!js.isUndefined(useAdditionalWeekYearTokens)) __obj.updateDynamic("useAdditionalWeekYearTokens")(useAdditionalWeekYearTokens.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0123]
  }
}

