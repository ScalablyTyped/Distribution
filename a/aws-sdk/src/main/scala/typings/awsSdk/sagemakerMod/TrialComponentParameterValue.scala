package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrialComponentParameterValue extends StObject {
  
  /**
    * The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't specify the StringValue parameter.
    */
  var NumberValue: js.UndefOr[DoubleParameterValue] = js.native
  
  /**
    * The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't specify the NumberValue parameter.
    */
  var StringValue: js.UndefOr[StringParameterValue] = js.native
}
object TrialComponentParameterValue {
  
  @scala.inline
  def apply(): TrialComponentParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentParameterValue]
  }
  
  @scala.inline
  implicit class TrialComponentParameterValueMutableBuilder[Self <: TrialComponentParameterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberValue(value: DoubleParameterValue): Self = StObject.set(x, "NumberValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberValueUndefined: Self = StObject.set(x, "NumberValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: StringParameterValue): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
