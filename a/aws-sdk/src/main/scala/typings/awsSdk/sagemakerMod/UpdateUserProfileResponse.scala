package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserProfileResponse extends js.Object {
  
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileArn] = js.native
}
object UpdateUserProfileResponse {
  
  @scala.inline
  def apply(): UpdateUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserProfileResponse]
  }
  
  @scala.inline
  implicit class UpdateUserProfileResponseOps[Self <: UpdateUserProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUserProfileArn(value: UserProfileArn): Self = this.set("UserProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProfileArn: Self = this.set("UserProfileArn", js.undefined)
  }
}
