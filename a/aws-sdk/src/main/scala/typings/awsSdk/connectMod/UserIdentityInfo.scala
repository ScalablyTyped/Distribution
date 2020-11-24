package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserIdentityInfo extends js.Object {
  
  /**
    * The email address. If you are using SAML for identity management and include this parameter, an error is returned.
    */
  var Email: js.UndefOr[typings.awsSdk.connectMod.Email] = js.native
  
  /**
    * The first name. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var FirstName: js.UndefOr[AgentFirstName] = js.native
  
  /**
    * The last name. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var LastName: js.UndefOr[AgentLastName] = js.native
}
object UserIdentityInfo {
  
  @scala.inline
  def apply(): UserIdentityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentityInfo]
  }
  
  @scala.inline
  implicit class UserIdentityInfoOps[Self <: UserIdentityInfo] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: Email): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setFirstName(value: AgentFirstName): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("FirstName", js.undefined)
    
    @scala.inline
    def setLastName(value: AgentLastName): Self = this.set("LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("LastName", js.undefined)
  }
}
