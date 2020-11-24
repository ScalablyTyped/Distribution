package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserMessage extends js.Object {
  
  /**
    * Access permissions string used for this user account.
    */
  var AccessString: typings.awsSdk.elasticacheMod.AccessString = js.native
  
  /**
    * Must be Redis. 
    */
  var Engine: EngineType = js.native
  
  /**
    * Indicates a password is not required for this user account.
    */
  var NoPasswordRequired: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Passwords used for this user account. You can create up to two passwords for each user.
    */
  var Passwords: js.UndefOr[PasswordListInput] = js.native
  
  /**
    * The ID of the user.
    */
  var UserId: typings.awsSdk.elasticacheMod.UserId = js.native
  
  /**
    * The username of the user.
    */
  var UserName: typings.awsSdk.elasticacheMod.UserName = js.native
}
object CreateUserMessage {
  
  @scala.inline
  def apply(AccessString: AccessString, Engine: EngineType, UserId: UserId, UserName: UserName): CreateUserMessage = {
    val __obj = js.Dynamic.literal(AccessString = AccessString.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserMessage]
  }
  
  @scala.inline
  implicit class CreateUserMessageOps[Self <: CreateUserMessage] (val x: Self) extends AnyVal {
    
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
    def setAccessString(value: AccessString): Self = this.set("AccessString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: EngineType): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: UserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoPasswordRequired(value: BooleanOptional): Self = this.set("NoPasswordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoPasswordRequired: Self = this.set("NoPasswordRequired", js.undefined)
    
    @scala.inline
    def setPasswordsVarargs(value: String*): Self = this.set("Passwords", js.Array(value :_*))
    
    @scala.inline
    def setPasswords(value: PasswordListInput): Self = this.set("Passwords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswords: Self = this.set("Passwords", js.undefined)
  }
}
