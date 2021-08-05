package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialComponentParameterValue extends StObject {
  
  /**
    * The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't specify the StringValue parameter.
    */
  var NumberValue: js.UndefOr[DoubleParameterValue] = js.undefined
  
  /**
    * The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't specify the NumberValue parameter.
    */
  var StringValue: js.UndefOr[StringParameterValue] = js.undefined
}
object TrialComponentParameterValue {
  
  inline def apply(): TrialComponentParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentParameterValue]
  }
  
  extension [Self <: TrialComponentParameterValue](x: Self) {
    
    inline def setNumberValue(value: DoubleParameterValue): Self = StObject.set(x, "NumberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "NumberValue", js.undefined)
    
    inline def setStringValue(value: StringParameterValue): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
