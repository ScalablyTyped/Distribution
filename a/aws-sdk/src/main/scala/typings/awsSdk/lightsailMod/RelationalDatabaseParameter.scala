package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalDatabaseParameter extends StObject {
  
  /**
    * Specifies the valid range of values for the parameter.
    */
  var allowedValues: js.UndefOr[String] = js.native
  
  /**
    * Indicates when parameter updates are applied. Can be immediate or pending-reboot.
    */
  var applyMethod: js.UndefOr[String] = js.native
  
  /**
    * Specifies the engine-specific parameter type.
    */
  var applyType: js.UndefOr[String] = js.native
  
  /**
    * Specifies the valid data type for the parameter.
    */
  var dataType: js.UndefOr[String] = js.native
  
  /**
    * Provides a description of the parameter.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value indicating whether the parameter can be modified.
    */
  var isModifiable: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the name of the parameter.
    */
  var parameterName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the value of the parameter.
    */
  var parameterValue: js.UndefOr[String] = js.native
}
object RelationalDatabaseParameter {
  
  @scala.inline
  def apply(): RelationalDatabaseParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseParameter]
  }
  
  @scala.inline
  implicit class RelationalDatabaseParameterMutableBuilder[Self <: RelationalDatabaseParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: String): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    @scala.inline
    def setApplyMethod(value: String): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
    
    @scala.inline
    def setApplyType(value: String): Self = StObject.set(x, "applyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyTypeUndefined: Self = StObject.set(x, "applyType", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIsModifiable(value: Boolean): Self = StObject.set(x, "isModifiable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModifiableUndefined: Self = StObject.set(x, "isModifiable", js.undefined)
    
    @scala.inline
    def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
    
    @scala.inline
    def setParameterValue(value: String): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValueUndefined: Self = StObject.set(x, "parameterValue", js.undefined)
  }
}
