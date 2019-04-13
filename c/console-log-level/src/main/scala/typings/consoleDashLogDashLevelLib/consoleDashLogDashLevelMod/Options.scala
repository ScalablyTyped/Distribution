package typings
package consoleDashLogDashLevelLib.consoleDashLogDashLevelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var level: js.UndefOr[LogLevelNames] = js.undefined
  var prefix: js.UndefOr[java.lang.String | consoleDashLogDashLevelLib.PrefixFunction] = js.undefined
  var stderr: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    level: LogLevelNames = null,
    prefix: java.lang.String | consoleDashLogDashLevelLib.PrefixFunction = null,
    stderr: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr)
    __obj.asInstanceOf[Options]
  }
}

