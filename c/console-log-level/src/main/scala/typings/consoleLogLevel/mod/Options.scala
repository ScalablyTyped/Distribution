package typings.consoleLogLevel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var level: js.UndefOr[LogLevelNames] = js.undefined
  var prefix: js.UndefOr[String | PrefixFunction] = js.undefined
  var stderr: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    level: LogLevelNames = null,
    prefix: String | PrefixFunction = null,
    stderr: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

