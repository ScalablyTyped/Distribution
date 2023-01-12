package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetPasswordRequest extends StObject {
  
  /**
    * The identifier of the organization that contains the user for which the password is reset.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The new password for the user.
    */
  var Password: typings.awsSdk.clientsWorkmailMod.Password
  
  /**
    * The identifier of the user for whom the password is reset.
    */
  var UserId: WorkMailIdentifier
}
object ResetPasswordRequest {
  
  inline def apply(OrganizationId: OrganizationId, Password: Password, UserId: WorkMailIdentifier): ResetPasswordRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetPasswordRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetPasswordRequest] (val x: Self) extends AnyVal {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
