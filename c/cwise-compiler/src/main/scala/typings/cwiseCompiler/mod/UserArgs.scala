package typings.cwiseCompiler.mod

import typings.cwiseParser.mod.CompiledRoutine
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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], blockSize = blockSize.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], funcName = funcName.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any])
    if (!js.isUndefined(printCode)) __obj.updateDynamic("printCode")(printCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserArgs]
  }
}

