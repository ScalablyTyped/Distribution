package typings.cronDashParser.cronDashParserMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var currentDate: js.UndefOr[String | Double | Date] = js.undefined
  var endDate: js.UndefOr[String | Double | Date] = js.undefined
  var iterator: js.UndefOr[Boolean] = js.undefined
  var startDate: js.UndefOr[String | Double | Date] = js.undefined
  var tz: js.UndefOr[String] = js.undefined
  var utc: js.UndefOr[Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    currentDate: String | Double | Date = null,
    endDate: String | Double | Date = null,
    iterator: js.UndefOr[Boolean] = js.undefined,
    startDate: String | Double | Date = null,
    tz: String = null,
    utc: js.UndefOr[Boolean] = js.undefined
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(iterator)) __obj.updateDynamic("iterator")(iterator.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz.asInstanceOf[js.Any])
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

