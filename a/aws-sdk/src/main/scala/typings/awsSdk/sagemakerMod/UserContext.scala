package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserContext extends js.Object {
  
  /**
    * The domain associated with the user.
    */
  var DomainId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the user's profile.
    */
  var UserProfileArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the user's profile.
    */
  var UserProfileName: js.UndefOr[String] = js.native
}
object UserContext {
  
  @scala.inline
  def apply(): UserContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContext]
  }
  
  @scala.inline
  implicit class UserContextOps[Self <: UserContext] (val x: Self) extends AnyVal {
    
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
    def setDomainId(value: String): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainId: Self = this.set("DomainId", js.undefined)
    
    @scala.inline
    def setUserProfileArn(value: String): Self = this.set("UserProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProfileArn: Self = this.set("UserProfileArn", js.undefined)
    
    @scala.inline
    def setUserProfileName(value: String): Self = this.set("UserProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProfileName: Self = this.set("UserProfileName", js.undefined)
  }
}
