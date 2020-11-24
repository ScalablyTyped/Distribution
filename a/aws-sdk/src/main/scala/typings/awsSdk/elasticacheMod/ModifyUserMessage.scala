package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyUserMessage extends js.Object {
  
  /**
    * Access permissions string used for this user account.
    */
  var AccessString: js.UndefOr[typings.awsSdk.elasticacheMod.AccessString] = js.native
  
  /**
    * Adds additional user permissions to the access string.
    */
  var AppendAccessString: js.UndefOr[AccessString] = js.native
  
  /**
    * Indicates no password is required for the user account.
    */
  var NoPasswordRequired: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The passwords belonging to the user account. You are allowed up to two.
    */
  var Passwords: js.UndefOr[PasswordListInput] = js.native
  
  /**
    * The ID of the user.
    */
  var UserId: typings.awsSdk.elasticacheMod.UserId = js.native
}
object ModifyUserMessage {
  
  @scala.inline
  def apply(UserId: UserId): ModifyUserMessage = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyUserMessage]
  }
  
  @scala.inline
  implicit class ModifyUserMessageOps[Self <: ModifyUserMessage] (val x: Self) extends AnyVal {
    
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
    def setUserId(value: UserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessString(value: AccessString): Self = this.set("AccessString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessString: Self = this.set("AccessString", js.undefined)
    
    @scala.inline
    def setAppendAccessString(value: AccessString): Self = this.set("AppendAccessString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendAccessString: Self = this.set("AppendAccessString", js.undefined)
    
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
