package typings.awsSdk.servicecatalogappregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateResourceRequest extends js.Object {
  
  /**
    * The name or ID of the application.
    */
  var application: ApplicationSpecifier = js.native
  
  /**
    * The name or ID of the resource of which the application will be associated.
    */
  var resource: ResourceSpecifier = js.native
  
  /**
    * The type of resource of which the application will be associated.
    */
  var resourceType: ResourceType = js.native
}
object AssociateResourceRequest {
  
  @scala.inline
  def apply(application: ApplicationSpecifier, resource: ResourceSpecifier, resourceType: ResourceType): AssociateResourceRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceRequest]
  }
  
  @scala.inline
  implicit class AssociateResourceRequestOps[Self <: AssociateResourceRequest] (val x: Self) extends AnyVal {
    
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
    def setResource(value: ResourceSpecifier): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
  }
}
