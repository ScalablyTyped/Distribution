package typings.awsSdkTypes.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(logLevel: LogLevel = null, logger: Logger = null): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

