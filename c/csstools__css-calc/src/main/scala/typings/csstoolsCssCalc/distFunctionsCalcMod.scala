package typings.csstoolsCssCalc

import typings.csstoolsCssCalc.csstoolsCssCalcInts.`-1`
import typings.csstoolsCssCalc.distCalculationMod.Calculation
import typings.csstoolsCssCalc.distUtilGlobalsMod.Globals
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import typings.csstoolsCssParserAlgorithms.mod.SimpleBlockNode
import typings.csstoolsCssParserAlgorithms.mod.TokenNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsCalcMod {
  
  @JSImport("@csstools/css-calc/dist/functions/calc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abs(absNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(absNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def acos(acosNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("acos")(acosNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def asin(asinNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("asin")(asinNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def atan(atanNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("atan")(atanNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def atan2(atan2Node: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(atan2Node.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def calc(calcNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(calcNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  inline def calc(calcNode: SimpleBlockNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(calcNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def clamp(clampNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(clampNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def cos(codNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("cos")(codNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def exp(expNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("exp")(expNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def hypot(hypotNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("hypot")(hypotNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def log(logNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(logNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  @JSImport("@csstools/css-calc/dist/functions/calc", "mathFunctions")
  @js.native
  val mathFunctions: Map[
    String, 
    js.Function2[/* absNode */ FunctionNode, /* globals */ Globals, Calculation | `-1`]
  ] = js.native
  
  inline def max(maxNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(maxNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def min(minNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(minNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def mod(modNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(modNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def pow(powNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(powNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def rem(remNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rem")(remNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def round(roundNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(roundNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def sign(signNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(signNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def sin(sinNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("sin")(sinNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def singleNodeSolver_1(
    fnNode: FunctionNode,
    globals: Globals,
    solveFn: js.Function2[/* node */ FunctionNode, /* a */ TokenNode, Calculation | `-1`]
  ): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("singleNodeSolver")(fnNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any], solveFn.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def sqrt(sqrtNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(sqrtNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def tan(tanNode: FunctionNode, globals: Globals): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("tan")(tanNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def twoCommaSeparatedNodesSolver_1(
    fnNode: FunctionNode,
    globals: Globals,
    solveFn: js.Function3[/* node */ FunctionNode, /* a */ TokenNode, /* b */ TokenNode, Calculation | `-1`]
  ): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("twoCommaSeparatedNodesSolver")(fnNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any], solveFn.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
  
  inline def variadicNodesSolver_1(
    fnNode: FunctionNode,
    globals: Globals,
    solveFn: js.Function2[/* node */ FunctionNode, /* x */ js.Array[ComponentValue], Calculation | `-1`]
  ): Calculation | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("variadicNodesSolver")(fnNode.asInstanceOf[js.Any], globals.asInstanceOf[js.Any], solveFn.asInstanceOf[js.Any])).asInstanceOf[Calculation | `-1`]
}
