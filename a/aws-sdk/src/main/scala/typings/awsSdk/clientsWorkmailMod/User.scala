package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * The date indicating when the user was disabled from WorkMail use.
    */
  var DisabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The display name of the user.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The email of the user.
    */
  var Email: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    * The date indicating when the user was enabled for WorkMail use.
    */
  var EnabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the user.
    */
  var Id: js.UndefOr[WorkMailIdentifier] = js.undefined
  
  /**
    * The name of the user.
    */
  var Name: js.UndefOr[UserName] = js.undefined
  
  /**
    * The state of the user, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.undefined
  
  /**
    * The role of the user.
    */
  var UserRole: js.UndefOr[typings.awsSdk.clientsWorkmailMod.UserRole] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setDisabledDate(value: js.Date): Self = StObject.set(x, "DisabledDate", value.asInstanceOf[js.Any])
    
    inline def setDisabledDateUndefined: Self = StObject.set(x, "DisabledDate", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setEnabledDate(value: js.Date): Self = StObject.set(x, "EnabledDate", value.asInstanceOf[js.Any])
    
    inline def setEnabledDateUndefined: Self = StObject.set(x, "EnabledDate", js.undefined)
    
    inline def setId(value: WorkMailIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: EntityState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setUserRole(value: UserRole): Self = StObject.set(x, "UserRole", value.asInstanceOf[js.Any])
    
    inline def setUserRoleUndefined: Self = StObject.set(x, "UserRole", js.undefined)
  }
}
