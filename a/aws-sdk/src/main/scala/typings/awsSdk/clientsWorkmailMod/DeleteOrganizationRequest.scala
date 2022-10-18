package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOrganizationRequest extends StObject {
  
  /**
    * The idempotency token associated with the request.
    */
  var ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined
  
  /**
    * If true, deletes the AWS Directory Service directory associated with the organization.
    */
  var DeleteDirectory: Boolean
  
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object DeleteOrganizationRequest {
  
  inline def apply(DeleteDirectory: Boolean, OrganizationId: OrganizationId): DeleteOrganizationRequest = {
    val __obj = js.Dynamic.literal(DeleteDirectory = DeleteDirectory.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOrganizationRequest]
  }
  
  extension [Self <: DeleteOrganizationRequest](x: Self) {
    
    inline def setClientToken(value: IdempotencyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDeleteDirectory(value: Boolean): Self = StObject.set(x, "DeleteDirectory", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
