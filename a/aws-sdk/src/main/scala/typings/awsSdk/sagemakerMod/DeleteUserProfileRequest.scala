package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserProfileRequest extends StObject {
  
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId
  
  /**
    * The user profile name.
    */
  var UserProfileName: typings.awsSdk.sagemakerMod.UserProfileName
}
object DeleteUserProfileRequest {
  
  @scala.inline
  def apply(DomainId: DomainId, UserProfileName: UserProfileName): DeleteUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteUserProfileRequestMutableBuilder[Self <: DeleteUserProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
  }
}
