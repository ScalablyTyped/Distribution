package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceConfigRequest extends StObject {
  
  /**
    * Unique identifier of the resource.
    */
  var ResourceId: typings.awsSdk.configserviceMod.ResourceId
  
  /**
    * The type of the resource.
    */
  var ResourceType: ResourceTypeString
}
object DeleteResourceConfigRequest {
  
  @scala.inline
  def apply(ResourceId: ResourceId, ResourceType: ResourceTypeString): DeleteResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceConfigRequest]
  }
  
  @scala.inline
  implicit class DeleteResourceConfigRequestMutableBuilder[Self <: DeleteResourceConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceTypeString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
