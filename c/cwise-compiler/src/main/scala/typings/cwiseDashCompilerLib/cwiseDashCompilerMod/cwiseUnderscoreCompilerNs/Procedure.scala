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

