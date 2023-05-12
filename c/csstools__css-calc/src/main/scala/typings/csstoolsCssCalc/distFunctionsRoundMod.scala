package typings.csstoolsCssCalc

import typings.csstoolsCssCalc.csstoolsCssCalcInts.`-1`
import typings.csstoolsCssCalc.distCalculationMod.Calculation
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import typings.csstoolsCssParserAlgorithms.mod.TokenNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsRoundMod {
  
  @JSImport("@csstools/css-calc/dist/functions/round", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def solveRound(roundNode: FunctionNode, roundingStrategy: String, a: TokenNode, b: TokenNode): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("solveRound")(roundNode.asInstanceOf[js.Any], roundingStrategy.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
}
