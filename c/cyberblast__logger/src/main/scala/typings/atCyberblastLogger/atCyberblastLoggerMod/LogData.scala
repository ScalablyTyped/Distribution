package typings.atCyberblastLogger.atCyberblastLoggerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogData extends js.Object {
  var category: String
  var data: js.UndefOr[js.Any] = js.undefined
  var message: String
  var severity: Severity
  var time: js.UndefOr[Date] = js.undefined
}

object LogData {
  @scala.inline
  def apply(category: String, message: String, severity: Severity, data: js.Any = null, time: Date = null): LogData = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogData]
  }
}

