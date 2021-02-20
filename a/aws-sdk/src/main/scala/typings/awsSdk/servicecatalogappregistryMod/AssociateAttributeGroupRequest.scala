package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateAttributeGroupRequest extends StObject {
  
  /**
    * The name or ID of the application.
    */
  var application: ApplicationSpecifier = js.native
  
  /**
    * The name or ID of the attribute group that holds the attributes to describe the application.
    */
  var attributeGroup: AttributeGroupSpecifier = js.native
}
object AssociateAttributeGroupRequest {
  
  @scala.inline
  def apply(application: ApplicationSpecifier, attributeGroup: AttributeGroupSpecifier): AssociateAttributeGroupRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], attributeGroup = attributeGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateAttributeGroupRequest]
  }
  
  @scala.inline
  implicit class AssociateAttributeGroupRequestMutableBuilder[Self <: AssociateAttributeGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: ApplicationSpecifier): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeGroup(value: AttributeGroupSpecifier): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
  }
}
