package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUserSettingsRequest extends StObject {
  
  /**
    * A valid access token that Amazon Cognito issued to the user whose user settings you want to configure.
    */
  var AccessToken: TokenModelType
  
  /**
    * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
    */
  var MFAOptions: MFAOptionListType
}
object SetUserSettingsRequest {
  
  inline def apply(AccessToken: TokenModelType, MFAOptions: MFAOptionListType): SetUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], MFAOptions = MFAOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserSettingsRequest]
  }
  
  extension [Self <: SetUserSettingsRequest](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setMFAOptions(value: MFAOptionListType): Self = StObject.set(x, "MFAOptions", value.asInstanceOf[js.Any])
    
    inline def setMFAOptionsVarargs(value: MFAOptionType*): Self = StObject.set(x, "MFAOptions", js.Array(value*))
  }
}
