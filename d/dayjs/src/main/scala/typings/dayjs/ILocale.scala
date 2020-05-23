package typings.dayjs

import typings.dayjs.anon.PartialLTstringLTSstringL
import typings.dayjs.anon.Partialfuturestringpastst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocale extends js.Object {
  var formats: PartialLTstringLTSstringL
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var ordinal: js.UndefOr[js.Function1[/* n */ Double, Double | String]] = js.undefined
  var relativeTime: Partialfuturestringpastst
  var weekStart: js.UndefOr[Double] = js.undefined
  var weekdays: js.UndefOr[js.Array[String]] = js.undefined
  var weekdaysMin: js.UndefOr[js.Array[String]] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}

object ILocale {
  @scala.inline
  def apply(
    formats: PartialLTstringLTSstringL,
    name: String,
    relativeTime: Partialfuturestringpastst,
    months: js.Array[String] = null,
    monthsShort: js.Array[String] = null,
    ordinal: /* n */ Double => Double | String = null,
    weekStart: js.UndefOr[Double] = js.undefined,
    weekdays: js.Array[String] = null,
    weekdaysMin: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null
  ): ILocale = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (monthsShort != null) __obj.updateDynamic("monthsShort")(monthsShort.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(js.Any.fromFunction1(ordinal))
    if (!js.isUndefined(weekStart)) __obj.updateDynamic("weekStart")(weekStart.get.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (weekdaysMin != null) __obj.updateDynamic("weekdaysMin")(weekdaysMin.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocale]
  }
}

