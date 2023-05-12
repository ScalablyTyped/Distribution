package typings.csstoolsCssCalc

import typings.csstoolsCssCalc.csstoolsCssCalcInts.`-1`
import typings.csstoolsCssCalc.distCalculationMod.Calculation
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import typings.csstoolsCssParserAlgorithms.mod.TokenNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsSignMod {
  
  @JSImport("@csstools/css-calc/dist/functions/sign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def solveSign(signNode: FunctionNode, a: TokenNode): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("solveSign")(signNode.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
}
