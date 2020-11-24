package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordPolicyType extends js.Object {
  
  /**
    * The minimum length of the password policy that you have set. Cannot be less than 6.
    */
  var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.native
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one lowercase letter in their password.
    */
  var RequireLowercase: js.UndefOr[BooleanType] = js.native
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one number in their password.
    */
  var RequireNumbers: js.UndefOr[BooleanType] = js.native
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one symbol in their password.
    */
  var RequireSymbols: js.UndefOr[BooleanType] = js.native
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one uppercase letter in their password.
    */
  var RequireUppercase: js.UndefOr[BooleanType] = js.native
  
  /**
    * In the password policy you have set, refers to the number of days a temporary password is valid. If the user does not sign-in during this time, their password will need to be reset by an administrator.  When you set TemporaryPasswordValidityDays for a user pool, you will no longer be able to set the deprecated UnusedAccountValidityDays value for that user pool. 
    */
  var TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType] = js.native
}
object PasswordPolicyType {
  
  @scala.inline
  def apply(): PasswordPolicyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordPolicyType]
  }
  
  @scala.inline
  implicit class PasswordPolicyTypeOps[Self <: PasswordPolicyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMinimumLength(value: PasswordPolicyMinLengthType): Self = this.set("MinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumLength: Self = this.set("MinimumLength", js.undefined)
    
    @scala.inline
    def setRequireLowercase(value: BooleanType): Self = this.set("RequireLowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireLowercase: Self = this.set("RequireLowercase", js.undefined)
    
    @scala.inline
    def setRequireNumbers(value: BooleanType): Self = this.set("RequireNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireNumbers: Self = this.set("RequireNumbers", js.undefined)
    
    @scala.inline
    def setRequireSymbols(value: BooleanType): Self = this.set("RequireSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireSymbols: Self = this.set("RequireSymbols", js.undefined)
    
    @scala.inline
    def setRequireUppercase(value: BooleanType): Self = this.set("RequireUppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireUppercase: Self = this.set("RequireUppercase", js.undefined)
    
    @scala.inline
    def setTemporaryPasswordValidityDays(value: TemporaryPasswordValidityDaysType): Self = this.set("TemporaryPasswordValidityDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporaryPasswordValidityDays: Self = this.set("TemporaryPasswordValidityDays", js.undefined)
  }
}
