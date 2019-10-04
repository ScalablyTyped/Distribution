package typings.colorDashSupport.colorDashSupportMod

import typings.node.NodeJSNs.ProcessEnv
import typings.node.processMod.Global.NodeJSNs.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSupportOptions extends js.Object {
  var alwaysReturn: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
  var ignoreCI: js.UndefOr[Boolean] = js.undefined
  var ignoreDumb: js.UndefOr[Boolean] = js.undefined
  var ignoreTTY: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[ColorSupportLevel] = js.undefined
  var stream: js.UndefOr[WriteStream] = js.undefined
  var term: js.UndefOr[String] = js.undefined
}

object ColorSupportOptions {
  @scala.inline
  def apply(
    alwaysReturn: js.UndefOr[Boolean] = js.undefined,
    env: ProcessEnv = null,
    ignoreCI: js.UndefOr[Boolean] = js.undefined,
    ignoreDumb: js.UndefOr[Boolean] = js.undefined,
    ignoreTTY: js.UndefOr[Boolean] = js.undefined,
    level: ColorSupportLevel = null,
    stream: WriteStream = null,
    term: String = null
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

