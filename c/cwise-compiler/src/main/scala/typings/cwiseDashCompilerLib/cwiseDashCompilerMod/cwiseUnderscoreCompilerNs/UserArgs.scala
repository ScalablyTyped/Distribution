package typings
package cwiseDashCompilerLib.cwiseDashCompilerMod.cwiseUnderscoreCompilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserArgs extends js.Object {
  var args: js.Array[ArgType]
  var blockSize: scala.Double
  var body: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine
  var debug: scala.Boolean
  var funcName: java.lang.String
  var post: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine
  var pre: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine
  var printCode: js.UndefOr[scala.Boolean] = js.undefined
}

object UserArgs {
  @scala.inline
  def apply(
    args: js.Array[ArgType],
    blockSize: scala.Double,
    body: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine,
    debug: scala.Boolean,
    funcName: java.lang.String,
    post: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine,
    pre: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine,
    printCode: js.UndefOr[scala.Boolean] = js.undefined
  ): UserArgs = {
    val __obj = js.Dynamic.literal(args = args, blockSize = blockSize, body = body, debug = debug, funcName = funcName, post = post, pre = pre)
    if (!js.isUndefined(printCode)) __obj.updateDynamic("printCode")(printCode)
    __obj.asInstanceOf[UserArgs]
  }
}

