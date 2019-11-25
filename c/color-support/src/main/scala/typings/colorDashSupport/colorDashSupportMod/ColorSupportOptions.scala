package typings.colorDashSupport.colorDashSupportMod

import typings.node.NodeJS.ProcessEnv
import typings.node.processMod._Global_.NodeJS.WriteStream
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
    if (!js.isUndefined(alwaysReturn)) __obj.updateDynamic("alwaysReturn")(alwaysReturn.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCI)) __obj.updateDynamic("ignoreCI")(ignoreCI.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDumb)) __obj.updateDynamic("ignoreDumb")(ignoreDumb.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTTY)) __obj.updateDynamic("ignoreTTY")(ignoreTTY.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSupportOptions]
  }
}

