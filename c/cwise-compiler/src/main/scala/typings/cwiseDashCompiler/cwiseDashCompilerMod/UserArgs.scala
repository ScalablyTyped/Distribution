package typings.cwiseDashCompiler.cwiseDashCompilerMod

import typings.cwiseDashParser.cwiseDashParserMod.CompiledRoutine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserArgs extends js.Object {
  var args: js.Array[ArgType]
  var blockSize: Double
  var body: CompiledRoutine
  var debug: Boolean
  var funcName: String
  var post: CompiledRoutine
  var pre: CompiledRoutine
  var printCode: js.UndefOr[Boolean] = js.undefined
}

object UserArgs {
  @scala.inline
  def apply(
    args: js.Array[ArgType],
    blockSize: Double,
    body: CompiledRoutine,
    debug: Boolean,
    funcName: String,
    post: CompiledRoutine,
    pre: CompiledRoutine,
    printCode: js.UndefOr[Boolean] = js.undefined
  ): UserArgs = {
    val __obj = js.Dynamic.literal(args = args, blockSize = blockSize, body = body, debug = debug, funcName = funcName, post = post, pre = pre)
    if (!js.isUndefined(printCode)) __obj.updateDynamic("printCode")(printCode)
    __obj.asInstanceOf[UserArgs]
  }
}

