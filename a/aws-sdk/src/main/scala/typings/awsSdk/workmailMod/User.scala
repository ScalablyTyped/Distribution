package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  /**
    * The date indicating when the user was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The display name of the user.
    */
  var DisplayName: js.UndefOr[String] = js.native
  
  /**
    * The email of the user.
    */
  var Email: js.UndefOr[EmailAddress] = js.native
  
  /**
    * The date indicating when the user was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The identifier of the user.
    */
  var Id: js.UndefOr[WorkMailIdentifier] = js.native
  
  /**
    * The name of the user.
    */
  var Name: js.UndefOr[UserName] = js.native
  
  /**
    * The state of the user, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.native
  
  /**
    * The role of the user.
    */
  var UserRole: js.UndefOr[typings.awsSdk.workmailMod.UserRole] = js.native
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
    def setDisabledDate(value: Timestamp): Self = this.set("DisabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDate: Self = this.set("DisabledDate", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setEmail(value: EmailAddress): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setEnabledDate(value: Timestamp): Self = this.set("EnabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledDate: Self = this.set("EnabledDate", js.undefined)
    
    @scala.inline
    def setId(value: WorkMailIdentifier): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: UserName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setState(value: EntityState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setUserRole(value: UserRole): Self = this.set("UserRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRole: Self = this.set("UserRole", js.undefined)
  }
}
