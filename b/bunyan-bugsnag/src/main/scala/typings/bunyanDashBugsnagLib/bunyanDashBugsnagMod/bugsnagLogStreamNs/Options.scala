package typings
package bunyanDashBugsnagLib.bunyanDashBugsnagMod.bugsnagLogStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errorLevel: js.UndefOr[bunyanLib.bunyanMod.LoggerNs.LogLevel] = js.undefined
  var systemInfo: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var warningLevel: js.UndefOr[bunyanLib.bunyanMod.LoggerNs.LogLevel] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    errorLevel: bunyanLib.bunyanMod.LoggerNs.LogLevel = null,
    systemInfo: js.Array[java.lang.String] = null,
    warningLevel: bunyanLib.bunyanMod.LoggerNs.LogLevel = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (errorLevel != null) __obj.updateDynamic("errorLevel")(errorLevel.asInstanceOf[js.Any])
    if (systemInfo != null) __obj.updateDynamic("systemInfo")(systemInfo)
    if (warningLevel != null) __obj.updateDynamic("warningLevel")(warningLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

