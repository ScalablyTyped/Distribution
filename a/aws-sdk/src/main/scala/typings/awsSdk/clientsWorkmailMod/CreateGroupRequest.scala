package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupRequest extends StObject {
  
  /**
    * The name of the group.
    */
  var Name: GroupName
  
  /**
    * The organization under which the group is to be created.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object CreateGroupRequest {
  
  inline def apply(Name: GroupName, OrganizationId: OrganizationId): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
  
  extension [Self <: CreateGroupRequest](x: Self) {
    
    inline def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
