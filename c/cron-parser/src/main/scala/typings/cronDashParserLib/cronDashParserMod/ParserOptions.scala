package typings
package cronDashParserLib.cronDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var currentDate: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  var endDate: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  var iterator: js.UndefOr[scala.Boolean] = js.undefined
  var startDate: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  var tz: js.UndefOr[java.lang.String] = js.undefined
  var utc: js.UndefOr[scala.Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    currentDate: java.lang.String | scala.Double | stdLib.Date = null,
    endDate: java.lang.String | scala.Double | stdLib.Date = null,
    iterator: js.UndefOr[scala.Boolean] = js.undefined,
    startDate: java.lang.String | scala.Double | stdLib.Date = null,
    tz: java.lang.String = null,
    utc: js.UndefOr[scala.Boolean] = js.undefined
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(iterator)) __obj.updateDynamic("iterator")(iterator)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz)
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc)
    __obj.asInstanceOf[ParserOptions]
  }
}

