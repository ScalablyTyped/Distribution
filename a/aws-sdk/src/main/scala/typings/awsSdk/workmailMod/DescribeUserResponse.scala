package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserResponse extends StObject {
  
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
  implicit class DescribeUserResponseMutableBuilder[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabledDate(value: Timestamp): Self = StObject.set(x, "DisabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledDateUndefined: Self = StObject.set(x, "DisabledDate", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setEnabledDate(value: Timestamp): Self = StObject.set(x, "EnabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledDateUndefined: Self = StObject.set(x, "EnabledDate", js.undefined)
    
    @scala.inline
    def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setState(value: EntityState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    @scala.inline
    def setUserRole(value: UserRole): Self = StObject.set(x, "UserRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRoleUndefined: Self = StObject.set(x, "UserRole", js.undefined)
  }
}
