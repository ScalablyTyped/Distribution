package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterExpression extends StObject {
  
  /**
    * Whether the expression is to be negated.
    */
  var Negated: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The type of operation to perform in the expression.
    */
  var Operation: FilterOperation
  
  /**
    * A list of filter values.
    */
  var Values: FilterValues
}
object FilterExpression {
  
  inline def apply(Operation: FilterOperation, Values: FilterValues): FilterExpression = {
    val __obj = js.Dynamic.literal(Operation = Operation.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterExpression]
  }
  
  extension [Self <: FilterExpression](x: Self) {
    
    inline def setNegated(value: BoxedBoolean): Self = StObject.set(x, "Negated", value.asInstanceOf[js.Any])
    
    inline def setNegatedUndefined: Self = StObject.set(x, "Negated", js.undefined)
    
    inline def setOperation(value: FilterOperation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
