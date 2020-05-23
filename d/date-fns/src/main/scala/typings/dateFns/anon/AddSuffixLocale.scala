package typings.dateFns.anon

import typings.dateFns.dateFnsStrings.ceil
import typings.dateFns.dateFnsStrings.day
import typings.dateFns.dateFnsStrings.floor
import typings.dateFns.dateFnsStrings.hour
import typings.dateFns.dateFnsStrings.minute
import typings.dateFns.dateFnsStrings.month
import typings.dateFns.dateFnsStrings.round
import typings.dateFns.dateFnsStrings.second
import typings.dateFns.dateFnsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSuffixLocale extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[typings.dateFns.Locale] = js.undefined
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.undefined
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.undefined
}

object AddSuffixLocale {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[Boolean] = js.undefined,
    locale: typings.dateFns.Locale = null,
    roundingMethod: floor | ceil | round = null,
    unit: second | minute | hour | day | month | year = null
  ): AddSuffixLocale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (roundingMethod != null) __obj.updateDynamic("roundingMethod")(roundingMethod.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSuffixLocale]
  }
}

