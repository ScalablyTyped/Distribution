package typings.cronConverter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Changes the * to H on the `toString()`.
    * Default: `false`.
    */
  var outputHashes: js.UndefOr[Boolean] = js.undefined
  /**
    * Changes the numbers to 3 letter month names on the `toString()`.
    * Default: `false`.
    */
  var outputMonthNames: js.UndefOr[Boolean] = js.undefined
  /**
    * Changes the numbers to 3 letter weekday names on the `toString()`.
    * Default: `false`.
    */
  var outputWeekdayNames: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines a timezone to the cron instance.
    * Default: `Local timezone`.
    */
  var timezone: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    outputHashes: js.UndefOr[Boolean] = js.undefined,
    outputMonthNames: js.UndefOr[Boolean] = js.undefined,
    outputWeekdayNames: js.UndefOr[Boolean] = js.undefined,
    timezone: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(outputHashes)) __obj.updateDynamic("outputHashes")(outputHashes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outputMonthNames)) __obj.updateDynamic("outputMonthNames")(outputMonthNames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outputWeekdayNames)) __obj.updateDynamic("outputWeekdayNames")(outputWeekdayNames.get.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

