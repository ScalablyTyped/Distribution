package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolPolicyType extends StObject {
  
  /**
    * The password policy.
    */
  var PasswordPolicy: js.UndefOr[PasswordPolicyType] = js.native
}
object UserPoolPolicyType {
  
  @scala.inline
  def apply(): UserPoolPolicyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolPolicyType]
  }
  
  @scala.inline
  implicit class UserPoolPolicyTypeMutableBuilder[Self <: UserPoolPolicyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPasswordPolicy(value: PasswordPolicyType): Self = StObject.set(x, "PasswordPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordPolicyUndefined: Self = StObject.set(x, "PasswordPolicy", js.undefined)
  }
}
