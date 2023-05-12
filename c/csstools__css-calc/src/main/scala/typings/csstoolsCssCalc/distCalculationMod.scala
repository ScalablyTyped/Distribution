package typings.csstoolsCssCalc

import typings.csstoolsCssCalc.csstoolsCssCalcInts.`-1`
import typings.csstoolsCssCalc.distOperationOperationMod.Operation
import typings.csstoolsCssParserAlgorithms.mod.TokenNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalculationMod {
  
  @JSImport("@csstools/css-calc/dist/calculation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCalculation(x: Any): /* is @csstools/css-calc.@csstools/css-calc/dist/calculation.Calculation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCalculation")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-calc.@csstools/css-calc/dist/calculation.Calculation */ Boolean]
  
  inline def solve(calculation: Calculation): TokenNode | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("solve")(calculation.asInstanceOf[js.Any]).asInstanceOf[TokenNode | `-1`]
  
  inline def solve_1(calculation: `-1`): TokenNode | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("solve")(calculation.asInstanceOf[js.Any]).asInstanceOf[TokenNode | `-1`]
  
  trait Calculation extends StObject {
    
    var inputs: js.Array[Calculation | TokenNode]
    
    def operation(inputs: js.Array[TokenNode]): TokenNode | `-1`
    @JSName("operation")
    var operation_Original: Operation
  }
  object Calculation {
    
    inline def apply(
      inputs: js.Array[Calculation | TokenNode],
      operation: /* inputs */ js.Array[TokenNode] => TokenNode | `-1`
    ): Calculation = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], operation = js.Any.fromFunction1(operation))
      __obj.asInstanceOf[Calculation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Calculation] (val x: Self) extends AnyVal {
      
      inline def setInputs(value: js.Array[Calculation | TokenNode]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: (Calculation | TokenNode)*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setOperation(value: /* inputs */ js.Array[TokenNode] => TokenNode | `-1`): Self = StObject.set(x, "operation", js.Any.fromFunction1(value))
    }
  }
}
