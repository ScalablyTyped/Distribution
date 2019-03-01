package typings
package colorDashSupportLib.colorDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSupportOptions extends js.Object {
  var alwaysReturn: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[nodeLib.NodeJSNs.ProcessEnv] = js.undefined
  var ignoreCI: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreDumb: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreTTY: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[colorDashSupportLib.ColorSupportLevel] = js.undefined
  var stream: js.UndefOr[nodeLib.NodeJSNs.WriteStream] = js.undefined
  var term: js.UndefOr[java.lang.String] = js.undefined
}

object ColorSupportOptions {
  @scala.inline
  def apply(
    alwaysReturn: js.UndefOr[scala.Boolean] = js.undefined,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    ignoreCI: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDumb: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreTTY: js.UndefOr[scala.Boolean] = js.undefined,
    level: colorDashSupportLib.ColorSupportLevel = null,
    stream: nodeLib.NodeJSNs.WriteStream = null,
    term: java.lang.String = null
  ): ColorSupportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysReturn)) __obj.updateDynamic("alwaysReturn")(alwaysReturn)
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(ignoreCI)) __obj.updateDynamic("ignoreCI")(ignoreCI)
    if (!js.isUndefined(ignoreDumb)) __obj.updateDynamic("ignoreDumb")(ignoreDumb)
    if (!js.isUndefined(ignoreTTY)) __obj.updateDynamic("ignoreTTY")(ignoreTTY)
    if (level != null) __obj.updateDynamic("level")(level)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (term != null) __obj.updateDynamic("term")(term)
    __obj.asInstanceOf[ColorSupportOptions]
  }
}

