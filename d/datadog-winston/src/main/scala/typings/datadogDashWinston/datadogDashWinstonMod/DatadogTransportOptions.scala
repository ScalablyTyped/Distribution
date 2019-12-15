package typings.datadogDashWinston.datadogDashWinstonMod

import typings.logform.logformMod.Format
import typings.winstonDashTransport.winstonDashTransportMod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatadogTransportOptions extends TransportStreamOptions {
  var apiKey: String
  var ddsource: js.UndefOr[String] = js.undefined
  var ddtags: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var service: js.UndefOr[String] = js.undefined
}

object DatadogTransportOptions {
  @scala.inline
  def apply(
    apiKey: String,
    close: () => Unit = null,
    ddsource: String = null,
    ddtags: String = null,
    format: Format = null,
    handleExceptions: js.UndefOr[Boolean] = js.undefined,
    hostname: String = null,
    level: String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    service: String = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): DatadogTransportOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (ddsource != null) __obj.updateDynamic("ddsource")(ddsource.asInstanceOf[js.Any])
    if (ddtags != null) __obj.updateDynamic("ddtags")(ddtags.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogTransportOptions]
  }
}

