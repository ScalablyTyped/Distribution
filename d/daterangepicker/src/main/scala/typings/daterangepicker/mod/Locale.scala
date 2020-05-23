package typings.daterangepicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  /**
    * Text for apply label.
    */
  var applyLabel: js.UndefOr[String] = js.undefined
  /**
    * Text for cancel label.
    */
  var cancelLabel: js.UndefOr[String] = js.undefined
  /**
    * Text for the custom range label.
    */
  var customRangeLabel: js.UndefOr[String] = js.undefined
  /**
    * Weekday names displayed in the header of calendar.
    */
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The first day of the week (0-6, Sunday to Saturday).
    */
  var firstDay: js.UndefOr[Double] = js.undefined
  /**
    * Format of the date string. example: 'YYYY-MM-DD'
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Text for fromLabel label.
    */
  var fromLabel: js.UndefOr[String] = js.undefined
  /**
    * Month names used in the month select boxes.
    */
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Separator between the startDate and endDate in the attached input element. Example: ' - '
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Text for toLabel label.
    */
  var toLabel: js.UndefOr[String] = js.undefined
  /**
    * Text for the week label.
    */
  var weekLabel: js.UndefOr[String] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    applyLabel: String = null,
    cancelLabel: String = null,
    customRangeLabel: String = null,
    daysOfWeek: js.Array[String] = null,
    firstDay: js.UndefOr[Double] = js.undefined,
    format: String = null,
    fromLabel: String = null,
    monthNames: js.Array[String] = null,
    separator: String = null,
    toLabel: String = null,
    weekLabel: String = null
  ): Locale = {
    val __obj = js.Dynamic.literal()
    if (applyLabel != null) __obj.updateDynamic("applyLabel")(applyLabel.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (customRangeLabel != null) __obj.updateDynamic("customRangeLabel")(customRangeLabel.asInstanceOf[js.Any])
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(firstDay)) __obj.updateDynamic("firstDay")(firstDay.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (fromLabel != null) __obj.updateDynamic("fromLabel")(fromLabel.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (toLabel != null) __obj.updateDynamic("toLabel")(toLabel.asInstanceOf[js.Any])
    if (weekLabel != null) __obj.updateDynamic("weekLabel")(weekLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

