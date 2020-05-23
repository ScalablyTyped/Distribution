package typings.cwiseCompiler.mod

import typings.cwiseParser.mod.CompiledRoutine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Procedure extends js.Object {
  var argTypes: js.Array[ArgType]
  var arrayArgs: js.Array[Double]
  var arrayBlockIndices: js.Array[Double]
  var blockSize: js.UndefOr[Double] = js.undefined
  var body: CompiledRoutine
  var debug: Boolean
  var funcName: String
  var indexArgs: js.Array[Double]
  var offsetArgIndex: js.Array[Double]
  var offsetArgs: js.Array[OffsetArg]
  var post: CompiledRoutine
  var pre: CompiledRoutine
  var scalarArgs: js.Array[Double]
  var shapeArgs: js.Array[Double]
  var shimArgs: js.Array[String]
}

object Procedure {
  @scala.inline
  def apply(
    argTypes: js.Array[ArgType],
    arrayArgs: js.Array[Double],
    arrayBlockIndices: js.Array[Double],
    body: CompiledRoutine,
    debug: Boolean,
    funcName: String,
    indexArgs: js.Array[Double],
    offsetArgIndex: js.Array[Double],
    offsetArgs: js.Array[OffsetArg],
    post: CompiledRoutine,
    pre: CompiledRoutine,
    scalarArgs: js.Array[Double],
    shapeArgs: js.Array[Double],
    shimArgs: js.Array[String],
    blockSize: js.UndefOr[Double] = js.undefined
  ): Procedure = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], arrayArgs = arrayArgs.asInstanceOf[js.Any], arrayBlockIndices = arrayBlockIndices.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], funcName = funcName.asInstanceOf[js.Any], indexArgs = indexArgs.asInstanceOf[js.Any], offsetArgIndex = offsetArgIndex.asInstanceOf[js.Any], offsetArgs = offsetArgs.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], scalarArgs = scalarArgs.asInstanceOf[js.Any], shapeArgs = shapeArgs.asInstanceOf[js.Any], shimArgs = shimArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(blockSize)) __obj.updateDynamic("blockSize")(blockSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
}

