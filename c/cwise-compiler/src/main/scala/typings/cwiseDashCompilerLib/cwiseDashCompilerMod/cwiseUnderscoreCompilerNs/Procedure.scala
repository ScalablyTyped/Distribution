package typings
package cwiseDashCompilerLib.cwiseDashCompilerMod.cwiseUnderscoreCompilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Procedure extends js.Object {
  var argTypes: js.Array[ArgType]
  var arrayArgs: js.Array[scala.Double]
  var arrayBlockIndices: js.Array[scala.Double]
  var blockSize: js.UndefOr[scala.Double] = js.undefined
  var body: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine
  var debug: scala.Boolean
  var funcName: java.lang.String
  var indexArgs: js.Array[scala.Double]
  var offsetArgIndex: js.Array[scala.Double]
  var offsetArgs: js.Array[OffsetArg]
  var post: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine
  var pre: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine
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
    body: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine,
    debug: scala.Boolean,
    funcName: java.lang.String,
    indexArgs: js.Array[scala.Double],
    offsetArgIndex: js.Array[scala.Double],
    offsetArgs: js.Array[OffsetArg],
    post: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine,
    pre: cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs.CompiledRoutine,
    scalarArgs: js.Array[scala.Double],
    shapeArgs: js.Array[scala.Double],
    shimArgs: js.Array[java.lang.String],
    blockSize: scala.Int | scala.Double = null
  ): Procedure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argTypes")(argTypes)
    __obj.updateDynamic("arrayArgs")(arrayArgs)
    __obj.updateDynamic("arrayBlockIndices")(arrayBlockIndices)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("funcName")(funcName)
    __obj.updateDynamic("indexArgs")(indexArgs)
    __obj.updateDynamic("offsetArgIndex")(offsetArgIndex)
    __obj.updateDynamic("offsetArgs")(offsetArgs)
    __obj.updateDynamic("post")(post)
    __obj.updateDynamic("pre")(pre)
    __obj.updateDynamic("scalarArgs")(scalarArgs)
    __obj.updateDynamic("shapeArgs")(shapeArgs)
    __obj.updateDynamic("shimArgs")(shimArgs)
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
}

