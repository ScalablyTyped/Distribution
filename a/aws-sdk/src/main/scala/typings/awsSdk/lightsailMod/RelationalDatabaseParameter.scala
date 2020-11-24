package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalDatabaseParameter extends js.Object {
  
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
  implicit class RelationalDatabaseParameterOps[Self <: RelationalDatabaseParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowedValues(value: String): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedValues: Self = this.set("allowedValues", js.undefined)
    
    @scala.inline
    def setApplyMethod(value: String): Self = this.set("applyMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyMethod: Self = this.set("applyMethod", js.undefined)
    
    @scala.inline
    def setApplyType(value: String): Self = this.set("applyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyType: Self = this.set("applyType", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIsModifiable(value: Boolean): Self = this.set("isModifiable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsModifiable: Self = this.set("isModifiable", js.undefined)
    
    @scala.inline
    def setParameterName(value: String): Self = this.set("parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterName: Self = this.set("parameterName", js.undefined)
    
    @scala.inline
    def setParameterValue(value: String): Self = this.set("parameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterValue: Self = this.set("parameterValue", js.undefined)
  }
}
