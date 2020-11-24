package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserResponse extends js.Object {
  
  /**
    * The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
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
    * The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name for the user.
    */
  var Name: js.UndefOr[UserName] = js.native
  
  /**
    * The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to WorkMail).
    */
  var State: js.UndefOr[EntityState] = js.native
  
  /**
    * The identifier for the described user.
    */
  var UserId: js.UndefOr[WorkMailIdentifier] = js.native
  
  /**
    * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported into Amazon WorkMail as users. Because different WorkMail organizations rely on different directory types, administrators can distinguish between an unregistered user (account is disabled and has a user role) and the directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
    */
  var UserRole: js.UndefOr[typings.awsSdk.workmailMod.UserRole] = js.native
}
object DescribeUserResponse {
  
  @scala.inline
  def apply(): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserResponse]
  }
  
  @scala.inline
  implicit class DescribeUserResponseOps[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
    
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
    def setName(value: UserName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setState(value: EntityState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setUserId(value: WorkMailIdentifier): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
    
    @scala.inline
    def setUserRole(value: UserRole): Self = this.set("UserRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRole: Self = this.set("UserRole", js.undefined)
  }
}
