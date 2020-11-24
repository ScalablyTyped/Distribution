package typings.awsSdk.servicecatalogappregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateAttributeGroupRequest extends js.Object {
  
  /**
    * The name or ID of the application.
    */
  var application: ApplicationSpecifier = js.native
  
  /**
    * The name or ID of the attribute group that holds the attributes to describe the application.
    */
  var attributeGroup: AttributeGroupSpecifier = js.native
}
object DisassociateAttributeGroupRequest {
  
  @scala.inline
  def apply(application: ApplicationSpecifier, attributeGroup: AttributeGroupSpecifier): DisassociateAttributeGroupRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], attributeGroup = attributeGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateAttributeGroupRequest]
  }
  
  @scala.inline
  implicit class DisassociateAttributeGroupRequestOps[Self <: DisassociateAttributeGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: ApplicationSpecifier): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeGroup(value: AttributeGroupSpecifier): Self = this.set("attributeGroup", value.asInstanceOf[js.Any])
  }
}
