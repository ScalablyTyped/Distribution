package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyUserMessage extends StObject {
  
  /**
    * Access permissions string used for this user account.
    */
  var AccessString: js.UndefOr[typings.awsSdk.elasticacheMod.AccessString] = js.undefined
  
  /**
    * Adds additional user permissions to the access string.
    */
  var AppendAccessString: js.UndefOr[AccessString] = js.undefined
  
  /**
    * Indicates no password is required for the user account.
    */
  var NoPasswordRequired: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The passwords belonging to the user account. You are allowed up to two.
    */
  var Passwords: js.UndefOr[PasswordListInput] = js.undefined
  
  /**
    * The ID of the user.
    */
  var UserId: typings.awsSdk.elasticacheMod.UserId
}
object ModifyUserMessage {
  
  @scala.inline
  def apply(UserId: UserId): ModifyUserMessage = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyUserMessage]
  }
  
  @scala.inline
  implicit class ModifyUserMessageMutableBuilder[Self <: ModifyUserMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessString(value: AccessString): Self = StObject.set(x, "AccessString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessStringUndefined: Self = StObject.set(x, "AccessString", js.undefined)
    
    @scala.inline
    def setAppendAccessString(value: AccessString): Self = StObject.set(x, "AppendAccessString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendAccessStringUndefined: Self = StObject.set(x, "AppendAccessString", js.undefined)
    
    @scala.inline
    def setNoPasswordRequired(value: BooleanOptional): Self = StObject.set(x, "NoPasswordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoPasswordRequiredUndefined: Self = StObject.set(x, "NoPasswordRequired", js.undefined)
    
    @scala.inline
    def setPasswords(value: PasswordListInput): Self = StObject.set(x, "Passwords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordsUndefined: Self = StObject.set(x, "Passwords", js.undefined)
    
    @scala.inline
    def setPasswordsVarargs(value: String*): Self = StObject.set(x, "Passwords", js.Array(value :_*))
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
