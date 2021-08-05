package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminSetUserSettingsRequest extends StObject {
  
  /**
    * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
    */
  var MFAOptions: MFAOptionListType
  
  /**
    * The ID of the user pool that contains the user that you are setting options for.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user name of the user that you are setting options for.
    */
  var Username: UsernameType
}
object AdminSetUserSettingsRequest {
  
  inline def apply(MFAOptions: MFAOptionListType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminSetUserSettingsRequest = {
    val __obj = js.Dynamic.literal(MFAOptions = MFAOptions.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminSetUserSettingsRequest]
  }
  
  extension [Self <: AdminSetUserSettingsRequest](x: Self) {
    
    inline def setMFAOptions(value: MFAOptionListType): Self = StObject.set(x, "MFAOptions", value.asInstanceOf[js.Any])
    
    inline def setMFAOptionsVarargs(value: MFAOptionType*): Self = StObject.set(x, "MFAOptions", js.Array(value :_*))
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
