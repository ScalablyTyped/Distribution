package typings
package cwiseDashCompilerLib.cwiseDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserArgs extends js.Object {
  var args: js.Array[ArgType]
  var blockSize: scala.Double
  var body: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine
  var debug: scala.Boolean
  var funcName: java.lang.String
  var post: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine
  var pre: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine
  var printCode: js.UndefOr[scala.Boolean] = js.undefined
}

object UserArgs {
  @scala.inline
  def apply(
    args: js.Array[ArgType],
    blockSize: scala.Double,
    body: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine,
    debug: scala.Boolean,
    funcName: java.lang.String,
    post: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine,
    pre: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine,
    printCode: js.UndefOr[scala.Boolean] = js.undefined
  ): UserArgs = {
    val __obj = js.Dynamic.literal(args = args, blockSize = blockSize, body = body, debug = debug, funcName = funcName, post = post, pre = pre)
    if (!js.isUndefined(printCode)) __obj.updateDynamic("printCode")(printCode)
    __obj.asInstanceOf[UserArgs]
  }
}

