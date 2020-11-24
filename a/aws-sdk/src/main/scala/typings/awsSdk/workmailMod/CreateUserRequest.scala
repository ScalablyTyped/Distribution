package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserRequest extends js.Object {
  
  /**
    * The display name for the new user.
    */
  var DisplayName: String = js.native
  
  /**
    * The name for the new user. WorkMail directory user names have a maximum length of 64. All others have a maximum length of 20.
    */
  var Name: UserName = js.native
  
  /**
    * The identifier of the organization for which the user is created.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The password for the new user.
    */
  var Password: typings.awsSdk.workmailMod.Password = js.native
}
object CreateUserRequest {
  
  @scala.inline
  def apply(DisplayName: String, Name: UserName, OrganizationId: OrganizationId, Password: Password): CreateUserRequest = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  
  @scala.inline
  implicit class CreateUserRequestOps[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: UserName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Password): Self = this.set("Password", value.asInstanceOf[js.Any])
  }
}
