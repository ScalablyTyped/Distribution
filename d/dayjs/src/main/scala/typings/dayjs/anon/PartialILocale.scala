package typings.dayjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<dayjs.ILocale> */
trait PartialILocale extends js.Object {
  var formats: js.UndefOr[PartialLTstringLTSstringL] = js.undefined
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var ordinal: js.UndefOr[js.Function1[/* n */ Double, Double | String]] = js.undefined
  var relativeTime: js.UndefOr[Partialfuturestringpastst] = js.undefined
  var weekStart: js.UndefOr[Double] = js.undefined
  var weekdays: js.UndefOr[js.Array[String]] = js.undefined
  var weekdaysMin: js.UndefOr[js.Array[String]] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialILocale {
  @scala.inline
  def apply(
    formats: PartialLTstringLTSstringL = null,
    months: js.Array[String] = null,
    monthsShort: js.Array[String] = null,
    name: String = null,
    ordinal: /* n */ Double => Double | String = null,
    relativeTime: Partialfuturestringpastst = null,
    weekStart: js.UndefOr[Double] = js.undefined,
    weekdays: js.Array[String] = null,
    weekdaysMin: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null
  ): PartialILocale = {
    val __obj = js.Dynamic.literal()
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (monthsShort != null) __obj.updateDynamic("monthsShort")(monthsShort.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(js.Any.fromFunction1(ordinal))
    if (relativeTime != null) __obj.updateDynamic("relativeTime")(relativeTime.asInstanceOf[js.Any])
    if (!js.isUndefined(weekStart)) __obj.updateDynamic("weekStart")(weekStart.get.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (weekdaysMin != null) __obj.updateDynamic("weekdaysMin")(weekdaysMin.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialILocale]
  }
}

