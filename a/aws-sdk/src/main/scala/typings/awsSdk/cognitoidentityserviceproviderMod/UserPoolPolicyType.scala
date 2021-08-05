package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolPolicyType extends StObject {
  
  /**
    * The password policy.
    */
  var PasswordPolicy: js.UndefOr[PasswordPolicyType] = js.undefined
}
object UserPoolPolicyType {
  
  inline def apply(): UserPoolPolicyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolPolicyType]
  }
  
  extension [Self <: UserPoolPolicyType](x: Self) {
    
    inline def setPasswordPolicy(value: PasswordPolicyType): Self = StObject.set(x, "PasswordPolicy", value.asInstanceOf[js.Any])
    
    inline def setPasswordPolicyUndefined: Self = StObject.set(x, "PasswordPolicy", js.undefined)
  }
}
