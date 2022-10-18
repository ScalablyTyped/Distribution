package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDelegateToResourceRequest extends StObject {
  
  /**
    * The member (user or group) to associate to the resource.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The organization under which the resource exists.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The resource for which members (users or groups) are associated.
    */
  var ResourceId: typings.awsSdk.clientsWorkmailMod.ResourceId
}
object AssociateDelegateToResourceRequest {
  
  inline def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId, ResourceId: ResourceId): AssociateDelegateToResourceRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDelegateToResourceRequest]
  }
  
  extension [Self <: AssociateDelegateToResourceRequest](x: Self) {
    
    inline def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
