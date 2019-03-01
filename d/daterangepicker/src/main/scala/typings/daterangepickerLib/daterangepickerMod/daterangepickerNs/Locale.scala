package typings
package daterangepickerLib.daterangepickerMod.daterangepickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  /**
    * Text for apply label.
    */
  var applyLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text for cancel label.
    */
  var cancelLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text for the custom range label.
    */
  var customRangeLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Weekday names displayed in the header of calendar.
    */
  var daysOfWeek: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The first day of the week (0-6, Sunday to Saturday).
    */
  var firstDay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Format of the date string. example: 'YYYY-MM-DD'
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text for fromLabel label.
    */
  var fromLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Month names used in the month select boxes.
    */
  var monthNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Separator between the startDate and endDate in the attached input element. Example: ' - '
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text for toLabel label.
    */
  var toLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text for the week label.
    */
  var weekLabel: js.UndefOr[java.lang.String] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    applyLabel: java.lang.String = null,
    cancelLabel: java.lang.String = null,
    customRangeLabel: java.lang.String = null,
    daysOfWeek: js.Array[java.lang.String] = null,
    firstDay: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    fromLabel: java.lang.String = null,
    monthNames: js.Array[java.lang.String] = null,
    separator: java.lang.String = null,
    toLabel: java.lang.String = null,
    weekLabel: java.lang.String = null
  ): Locale = {
    val __obj = js.Dynamic.literal()
    if (applyLabel != null) __obj.updateDynamic("applyLabel")(applyLabel)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (customRangeLabel != null) __obj.updateDynamic("customRangeLabel")(customRangeLabel)
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek)
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (fromLabel != null) __obj.updateDynamic("fromLabel")(fromLabel)
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (toLabel != null) __obj.updateDynamic("toLabel")(toLabel)
    if (weekLabel != null) __obj.updateDynamic("weekLabel")(weekLabel)
    __obj.asInstanceOf[Locale]
  }
}

