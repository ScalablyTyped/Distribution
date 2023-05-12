package typings.csstoolsCssCalc

import typings.csstoolsCssCalc.csstoolsCssCalcInts.`-1`
import typings.csstoolsCssCalc.distCalculationMod.Calculation
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsLogMod {
  
  @JSImport("@csstools/css-calc/dist/functions/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def solveLog(logNode: FunctionNode, solvedNodes: js.Array[ComponentValue]): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("solveLog")(logNode.asInstanceOf[js.Any], solvedNodes.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
}
