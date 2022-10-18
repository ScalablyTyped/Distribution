package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateDelegateFromResourceRequest extends StObject {
  
  /**
    * The identifier for the member (user, group) to be removed from the resource's delegates.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The identifier for the organization under which the resource exists.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The identifier of the resource from which delegates' set members are removed. 
    */
  var ResourceId: typings.awsSdk.clientsWorkmailMod.ResourceId
}
object DisassociateDelegateFromResourceRequest {
  
  inline def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId, ResourceId: ResourceId): DisassociateDelegateFromResourceRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDelegateFromResourceRequest]
  }
  
  extension [Self <: DisassociateDelegateFromResourceRequest](x: Self) {
    
    inline def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
