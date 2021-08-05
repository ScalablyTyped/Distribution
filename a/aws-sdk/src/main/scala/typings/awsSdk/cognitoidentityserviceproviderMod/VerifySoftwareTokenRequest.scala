package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifySoftwareTokenRequest extends StObject {
  
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.undefined
  
  /**
    * The friendly device name.
    */
  var FriendlyDeviceName: js.UndefOr[StringType] = js.undefined
  
  /**
    * The session which should be passed both ways in challenge-response calls to the service.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
  
  /**
    * The one time password computed using the secret code returned by AssociateSoftwareToken".
    */
  var UserCode: SoftwareTokenMFAUserCodeType
}
object VerifySoftwareTokenRequest {
  
  inline def apply(UserCode: SoftwareTokenMFAUserCodeType): VerifySoftwareTokenRequest = {
    val __obj = js.Dynamic.literal(UserCode = UserCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifySoftwareTokenRequest]
  }
  
  extension [Self <: VerifySoftwareTokenRequest](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    inline def setFriendlyDeviceName(value: StringType): Self = StObject.set(x, "FriendlyDeviceName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyDeviceNameUndefined: Self = StObject.set(x, "FriendlyDeviceName", js.undefined)
    
    inline def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    inline def setUserCode(value: SoftwareTokenMFAUserCodeType): Self = StObject.set(x, "UserCode", value.asInstanceOf[js.Any])
  }
}
