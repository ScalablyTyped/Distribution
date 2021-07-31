package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProvisioningParameter extends StObject {
  
  /**
    * The parameter key.
    */
  var Key: js.UndefOr[ParameterKey] = js.undefined
  
  /**
    * If set to true, Value is ignored and the previous parameter value is kept.
    */
  var UsePreviousValue: js.UndefOr[typings.awsSdk.servicecatalogMod.UsePreviousValue] = js.undefined
  
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[ParameterValue] = js.undefined
}
object UpdateProvisioningParameter {
  
  @scala.inline
  def apply(): UpdateProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisioningParameter]
  }
  
  @scala.inline
  implicit class UpdateProvisioningParameterMutableBuilder[Self <: UpdateProvisioningParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ParameterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setUsePreviousValue(value: UsePreviousValue): Self = StObject.set(x, "UsePreviousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePreviousValueUndefined: Self = StObject.set(x, "UsePreviousValue", js.undefined)
    
    @scala.inline
    def setValue(value: ParameterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
