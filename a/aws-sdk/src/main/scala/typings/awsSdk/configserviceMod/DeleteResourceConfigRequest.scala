package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteResourceConfigRequest extends js.Object {
  
  /**
    * Unique identifier of the resource.
    */
  var ResourceId: typings.awsSdk.configserviceMod.ResourceId = js.native
  
  /**
    * The type of the resource.
    */
  var ResourceType: ResourceTypeString = js.native
}
object DeleteResourceConfigRequest {
  
  @scala.inline
  def apply(ResourceId: ResourceId, ResourceType: ResourceTypeString): DeleteResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceConfigRequest]
  }
  
  @scala.inline
  implicit class DeleteResourceConfigRequestOps[Self <: DeleteResourceConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceTypeString): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
  }
}
