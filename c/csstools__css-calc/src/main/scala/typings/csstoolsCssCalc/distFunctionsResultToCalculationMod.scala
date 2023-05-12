package typings.csstoolsCssCalc

import typings.csstoolsCssCalc.csstoolsCssCalcInts.`-1`
import typings.csstoolsCssCalc.distCalculationMod.Calculation
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsResultToCalculationMod {
  
  @JSImport("@csstools/css-calc/dist/functions/result-to-calculation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dimensionToCalculation(node: FunctionNode, unit: String, result: Double): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("dimensionToCalculation")(node.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def numberToCalculation(node: FunctionNode, result: Double): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("numberToCalculation")(node.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def percentageToCalculation(node: FunctionNode, result: Double): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("percentageToCalculation")(node.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def resultToCalculation(node: FunctionNode, aToken: CSSToken, result: Double): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("resultToCalculation")(node.asInstanceOf[js.Any], aToken.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
}
