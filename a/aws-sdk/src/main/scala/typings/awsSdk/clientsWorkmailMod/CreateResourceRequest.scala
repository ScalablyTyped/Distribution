package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceRequest extends StObject {
  
  /**
    * The name of the new resource.
    */
  var Name: ResourceName
  
  /**
    * The identifier associated with the organization for which the resource is created.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The type of the new resource. The available types are equipment and room.
    */
  var Type: ResourceType
}
object CreateResourceRequest {
  
  inline def apply(Name: ResourceName, OrganizationId: OrganizationId, Type: ResourceType): CreateResourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceRequest]
  }
  
  extension [Self <: CreateResourceRequest](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
