package typings.cwiseDashCompiler.cwiseDashCompilerMod

import typings.cwiseDashParser.cwiseDashParserMod.CompiledRoutine
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
    blockSize: Int | Double = null
  ): Procedure = {
    val __obj = js.Dynamic.literal(argTypes = argTypes, arrayArgs = arrayArgs, arrayBlockIndices = arrayBlockIndices, body = body, debug = debug, funcName = funcName, indexArgs = indexArgs, offsetArgIndex = offsetArgIndex, offsetArgs = offsetArgs, post = post, pre = pre, scalarArgs = scalarArgs, shapeArgs = shapeArgs, shimArgs = shimArgs)
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
}

