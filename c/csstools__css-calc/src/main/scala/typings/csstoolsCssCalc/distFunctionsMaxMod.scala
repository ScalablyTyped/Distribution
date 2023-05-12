package typings.csstoolsCssCalc

import typings.csstoolsCssCalc.csstoolsCssCalcInts.`-1`
import typings.csstoolsCssCalc.distCalculationMod.Calculation
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsMaxMod {
  
  @JSImport("@csstools/css-calc/dist/functions/max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def solveMax(maxNode: FunctionNode, solvedNodes: js.Array[ComponentValue]): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("solveMax")(maxNode.asInstanceOf[js.Any], solvedNodes.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
}
