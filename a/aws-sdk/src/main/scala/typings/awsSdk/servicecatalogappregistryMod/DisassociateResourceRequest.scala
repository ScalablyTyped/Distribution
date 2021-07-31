package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResourceRequest extends StObject {
  
  /**
    * The name or ID of the application.
    */
  var application: ApplicationSpecifier
  
  /**
    * The name or ID of the resource.
    */
  var resource: ResourceSpecifier
  
  /**
    * The type of the resource that is being disassociated.
    */
  var resourceType: ResourceType
}
object DisassociateResourceRequest {
  
  @scala.inline
  def apply(application: ApplicationSpecifier, resource: ResourceSpecifier, resourceType: ResourceType): DisassociateResourceRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResourceRequest]
  }
  
  @scala.inline
  implicit class DisassociateResourceRequestMutableBuilder[Self <: DisassociateResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: ApplicationSpecifier): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: ResourceSpecifier): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
