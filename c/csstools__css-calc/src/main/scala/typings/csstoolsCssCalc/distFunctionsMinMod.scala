package typings.csstoolsCssCalc

import typings.csstoolsCssCalc.csstoolsCssCalcInts.`-1`
import typings.csstoolsCssCalc.distCalculationMod.Calculation
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsMinMod {
  
  @JSImport("@csstools/css-calc/dist/functions/min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def solveMin(minNode: FunctionNode, solvedNodes: js.Array[ComponentValue]): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("solveMin")(minNode.asInstanceOf[js.Any], solvedNodes.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
}
