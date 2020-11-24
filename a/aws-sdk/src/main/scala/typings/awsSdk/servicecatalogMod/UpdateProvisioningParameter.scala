package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProvisioningParameter extends js.Object {
  
  /**
    * The parameter key.
    */
  var Key: js.UndefOr[ParameterKey] = js.native
  
  /**
    * If set to true, Value is ignored and the previous parameter value is kept.
    */
  var UsePreviousValue: js.UndefOr[typings.awsSdk.servicecatalogMod.UsePreviousValue] = js.native
  
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[ParameterValue] = js.native
}
object UpdateProvisioningParameter {
  
  @scala.inline
  def apply(): UpdateProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisioningParameter]
  }
  
  @scala.inline
  implicit class UpdateProvisioningParameterOps[Self <: UpdateProvisioningParameter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: ParameterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setUsePreviousValue(value: UsePreviousValue): Self = this.set("UsePreviousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePreviousValue: Self = this.set("UsePreviousValue", js.undefined)
    
    @scala.inline
    def setValue(value: ParameterValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
