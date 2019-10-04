package typings.dateDashFns

import typings.dateDashFns.dateDashFnsStrings.ceil
import typings.dateDashFns.dateDashFnsStrings.day
import typings.dateDashFns.dateDashFnsStrings.floor
import typings.dateDashFns.dateDashFnsStrings.hour
import typings.dateDashFns.dateDashFnsStrings.minute
import typings.dateDashFns.dateDashFnsStrings.month
import typings.dateDashFns.dateDashFnsStrings.round
import typings.dateDashFns.dateDashFnsStrings.second
import typings.dateDashFns.dateDashFnsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddSuffixCeilDay extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.undefined
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.undefined
}

object Anon_AddSuffixCeilDay {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    roundingMethod: floor | ceil | round = null,
    unit: second | minute | hour | day | month | year = null
  ): Anon_AddSuffixCeilDay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (roundingMethod != null) __obj.updateDynamic("roundingMethod")(roundingMethod.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddSuffixCeilDay]
  }
}

