package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identity extends js.Object {
  
  /**
    * An AWS SSO group identity.
    */
  var group: js.UndefOr[GroupIdentity] = js.native
  
  /**
    * An IAM user identity.
    */
  var iamUser: js.UndefOr[IAMUserIdentity] = js.native
  
  /**
    * An AWS SSO user identity.
    */
  var user: js.UndefOr[UserIdentity] = js.native
}
object Identity {
  
  @scala.inline
  def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit class IdentityOps[Self <: Identity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroup(value: GroupIdentity): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setIamUser(value: IAMUserIdentity): Self = this.set("iamUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamUser: Self = this.set("iamUser", js.undefined)
    
    @scala.inline
    def setUser(value: UserIdentity): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
