package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateAttributeGroupRequest extends StObject {
  
  /**
    * The name or ID of the application.
    */
  var application: ApplicationSpecifier
  
  /**
    * The name or ID of the attribute group that holds the attributes to describe the application.
    */
  var attributeGroup: AttributeGroupSpecifier
}
object DisassociateAttributeGroupRequest {
  
  inline def apply(application: ApplicationSpecifier, attributeGroup: AttributeGroupSpecifier): DisassociateAttributeGroupRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], attributeGroup = attributeGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateAttributeGroupRequest]
  }
  
  extension [Self <: DisassociateAttributeGroupRequest](x: Self) {
    
    inline def setApplication(value: ApplicationSpecifier): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setAttributeGroup(value: AttributeGroupSpecifier): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
  }
}
