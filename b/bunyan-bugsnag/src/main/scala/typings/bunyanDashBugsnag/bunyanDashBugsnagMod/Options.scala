package typings.bunyanDashBugsnag.bunyanDashBugsnagMod

import typings.bunyan.bunyanMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errorLevel: js.UndefOr[LogLevel] = js.undefined
  var systemInfo: js.UndefOr[js.Array[String]] = js.undefined
  var warningLevel: js.UndefOr[LogLevel] = js.undefined
}

object Options {
  @scala.inline
  def apply(errorLevel: LogLevel = null, systemInfo: js.Array[String] = null, warningLevel: LogLevel = null): Options = {
    val __obj = js.Dynamic.literal()
    if (errorLevel != null) __obj.updateDynamic("errorLevel")(errorLevel.asInstanceOf[js.Any])
    if (systemInfo != null) __obj.updateDynamic("systemInfo")(systemInfo)
    if (warningLevel != null) __obj.updateDynamic("warningLevel")(warningLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

