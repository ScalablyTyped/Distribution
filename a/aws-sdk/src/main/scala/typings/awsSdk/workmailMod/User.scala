package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
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
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setId(value: WorkMailIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setState(value: EntityState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setUserRole(value: UserRole): Self = StObject.set(x, "UserRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRoleUndefined: Self = StObject.set(x, "UserRole", js.undefined)
  }
}
