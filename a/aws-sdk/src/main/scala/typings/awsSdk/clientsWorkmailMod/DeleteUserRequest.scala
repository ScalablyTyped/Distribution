package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserRequest extends StObject {
  
  /**
    * The organization that contains the user to be deleted.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The identifier of the user to be deleted.
    */
  var UserId: WorkMailIdentifier
}
object DeleteUserRequest {
  
  inline def apply(OrganizationId: OrganizationId, UserId: WorkMailIdentifier): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  
  extension [Self <: DeleteUserRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
