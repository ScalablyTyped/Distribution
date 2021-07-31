package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserProfileResponse extends StObject {
  
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileArn] = js.undefined
}
object UpdateUserProfileResponse {
  
  @scala.inline
  def apply(): UpdateUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserProfileResponse]
  }
  
  @scala.inline
  implicit class UpdateUserProfileResponseMutableBuilder[Self <: UpdateUserProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProfileArn(value: UserProfileArn): Self = StObject.set(x, "UserProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileArnUndefined: Self = StObject.set(x, "UserProfileArn", js.undefined)
  }
}
