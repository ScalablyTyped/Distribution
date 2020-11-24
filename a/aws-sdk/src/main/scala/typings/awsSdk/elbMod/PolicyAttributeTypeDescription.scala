package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyAttributeTypeDescription extends js.Object {
  
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[typings.awsSdk.elbMod.AttributeName] = js.native
  
  /**
    * The type of the attribute. For example, Boolean or Integer.
    */
  var AttributeType: js.UndefOr[typings.awsSdk.elbMod.AttributeType] = js.native
  
  /**
    * The cardinality of the attribute. Valid values:   ONE(1) : Single value required   ZERO_OR_ONE(0..1) : Up to one value is allowed   ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed   ONE_OR_MORE(1..*0) : Required. Multiple values are allowed  
    */
  var Cardinality: js.UndefOr[typings.awsSdk.elbMod.Cardinality] = js.native
  
  /**
    * The default value of the attribute, if applicable.
    */
  var DefaultValue: js.UndefOr[typings.awsSdk.elbMod.DefaultValue] = js.native
  
  /**
    * A description of the attribute.
    */
  var Description: js.UndefOr[typings.awsSdk.elbMod.Description] = js.native
}
object PolicyAttributeTypeDescription {
  
  @scala.inline
  def apply(): PolicyAttributeTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttributeTypeDescription]
  }
  
  @scala.inline
  implicit class PolicyAttributeTypeDescriptionOps[Self <: PolicyAttributeTypeDescription] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: AttributeName): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
    
    @scala.inline
    def setAttributeType(value: AttributeType): Self = this.set("AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeType: Self = this.set("AttributeType", js.undefined)
    
    @scala.inline
    def setCardinality(value: Cardinality): Self = this.set("Cardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardinality: Self = this.set("Cardinality", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: DefaultValue): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
}
