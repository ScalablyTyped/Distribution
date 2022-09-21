package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleRuleEvaluation extends StObject {
  
  /**
    * The value of the input property, on the left side of the comparison operator.
    */
  var inputPropertyValue: js.UndefOr[InputPropertyValue] = js.undefined
  
  /**
    * The comparison operator.
    */
  var operator: js.UndefOr[ComparisonOperator] = js.undefined
  
  /**
    * The threshold value, on the right side of the comparison operator.
    */
  var thresholdValue: js.UndefOr[ThresholdValue] = js.undefined
}
object SimpleRuleEvaluation {
  
  inline def apply(): SimpleRuleEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleRuleEvaluation]
  }
  
  extension [Self <: SimpleRuleEvaluation](x: Self) {
    
    inline def setInputPropertyValue(value: InputPropertyValue): Self = StObject.set(x, "inputPropertyValue", value.asInstanceOf[js.Any])
    
    inline def setInputPropertyValueUndefined: Self = StObject.set(x, "inputPropertyValue", js.undefined)
    
    inline def setOperator(value: ComparisonOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setThresholdValue(value: ThresholdValue): Self = StObject.set(x, "thresholdValue", value.asInstanceOf[js.Any])
    
    inline def setThresholdValueUndefined: Self = StObject.set(x, "thresholdValue", js.undefined)
  }
}
