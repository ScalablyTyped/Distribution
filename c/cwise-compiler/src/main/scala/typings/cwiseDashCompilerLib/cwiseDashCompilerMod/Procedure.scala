package typings
package cwiseDashCompilerLib.cwiseDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Procedure extends js.Object {
  var argTypes: js.Array[ArgType]
  var arrayArgs: js.Array[scala.Double]
  var arrayBlockIndices: js.Array[scala.Double]
  var blockSize: js.UndefOr[scala.Double] = js.undefined
  var body: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine
  var debug: scala.Boolean
  var funcName: java.lang.String
  var indexArgs: js.Array[scala.Double]
  var offsetArgIndex: js.Array[scala.Double]
  var offsetArgs: js.Array[OffsetArg]
  var post: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine
  var pre: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine
  var scalarArgs: js.Array[scala.Double]
  var shapeArgs: js.Array[scala.Double]
  var shimArgs: js.Array[java.lang.String]
}

object Procedure {
  @scala.inline
  def apply(
    argTypes: js.Array[ArgType],
    arrayArgs: js.Array[scala.Double],
    arrayBlockIndices: js.Array[scala.Double],
    body: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine,
    debug: scala.Boolean,
    funcName: java.lang.String,
    indexArgs: js.Array[scala.Double],
    offsetArgIndex: js.Array[scala.Double],
    offsetArgs: js.Array[OffsetArg],
    post: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine,
    pre: cwiseDashParserLib.cwiseDashParserMod.CompiledRoutine,
    scalarArgs: js.Array[scala.Double],
    shapeArgs: js.Array[scala.Double],
    shimArgs: js.Array[java.lang.String],
    blockSize: scala.Int | scala.Double = null
  ): Procedure = {
    val __obj = js.Dynamic.literal(argTypes = argTypes, arrayArgs = arrayArgs, arrayBlockIndices = arrayBlockIndices, body = body, debug = debug, funcName = funcName, indexArgs = indexArgs, offsetArgIndex = offsetArgIndex, offsetArgs = offsetArgs, post = post, pre = pre, scalarArgs = scalarArgs, shapeArgs = shapeArgs, shimArgs = shimArgs)
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
}

