package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetPasswordRequest extends StObject {
  
  /**
    * The identifier of the organization that contains the user for which the password is reset.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
  
  /**
    * The new password for the user.
    */
  var Password: typings.awsSdk.workmailMod.Password
  
  /**
    * The identifier of the user for whom the password is reset.
    */
  var UserId: WorkMailIdentifier
}
object ResetPasswordRequest {
  
  @scala.inline
  def apply(OrganizationId: OrganizationId, Password: Password, UserId: WorkMailIdentifier): ResetPasswordRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetPasswordRequest]
  }
  
  @scala.inline
  implicit class ResetPasswordRequestMutableBuilder[Self <: ResetPasswordRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
