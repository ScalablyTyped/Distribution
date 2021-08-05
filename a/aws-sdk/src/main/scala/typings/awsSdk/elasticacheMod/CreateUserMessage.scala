package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserMessage extends StObject {
  
  /**
    * Access permissions string used for this user account.
    */
  var AccessString: typings.awsSdk.elasticacheMod.AccessString
  
  /**
    * Must be Redis. 
    */
  var Engine: EngineType
  
  /**
    * Indicates a password is not required for this user account.
    */
  var NoPasswordRequired: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Passwords used for this user account. You can create up to two passwords for each user.
    */
  var Passwords: js.UndefOr[PasswordListInput] = js.undefined
  
  /**
    * The ID of the user.
    */
  var UserId: typings.awsSdk.elasticacheMod.UserId
  
  /**
    * The username of the user.
    */
  var UserName: typings.awsSdk.elasticacheMod.UserName
}
object CreateUserMessage {
  
  inline def apply(AccessString: AccessString, Engine: EngineType, UserId: UserId, UserName: UserName): CreateUserMessage = {
    val __obj = js.Dynamic.literal(AccessString = AccessString.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserMessage]
  }
  
  extension [Self <: CreateUserMessage](x: Self) {
    
    inline def setAccessString(value: AccessString): Self = StObject.set(x, "AccessString", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: EngineType): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setNoPasswordRequired(value: BooleanOptional): Self = StObject.set(x, "NoPasswordRequired", value.asInstanceOf[js.Any])
    
    inline def setNoPasswordRequiredUndefined: Self = StObject.set(x, "NoPasswordRequired", js.undefined)
    
    inline def setPasswords(value: PasswordListInput): Self = StObject.set(x, "Passwords", value.asInstanceOf[js.Any])
    
    inline def setPasswordsUndefined: Self = StObject.set(x, "Passwords", js.undefined)
    
    inline def setPasswordsVarargs(value: String*): Self = StObject.set(x, "Passwords", js.Array(value :_*))
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
