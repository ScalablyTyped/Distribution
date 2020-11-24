package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * Access permissions string used for this user account.
    */
  var AccessString: js.UndefOr[String] = js.native
  
  /**
    * Denotes whether the user requires a password to authenticate.
    */
  var Authentication: js.UndefOr[typings.awsSdk.elasticacheMod.Authentication] = js.native
  
  /**
    * Must be Redis. 
    */
  var Engine: js.UndefOr[EngineType] = js.native
  
  /**
    * Indicates the user status. Can be "active", "modifying" or "deleting".
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * Returns a list of the user group IDs the user belongs to.
    */
  var UserGroupIds: js.UndefOr[UserGroupIdList] = js.native
  
  /**
    * The ID of the user.
    */
  var UserId: js.UndefOr[String] = js.native
  
  /**
    * The username of the user.
    */
  var UserName: js.UndefOr[String] = js.native
}
object User {
  
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setAccessString(value: String): Self = this.set("AccessString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessString: Self = this.set("AccessString", js.undefined)
    
    @scala.inline
    def setAuthentication(value: Authentication): Self = this.set("Authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthentication: Self = this.set("Authentication", js.undefined)
    
    @scala.inline
    def setEngine(value: EngineType): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setUserGroupIdsVarargs(value: UserGroupId*): Self = this.set("UserGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setUserGroupIds(value: UserGroupIdList): Self = this.set("UserGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserGroupIds: Self = this.set("UserGroupIds", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
}
