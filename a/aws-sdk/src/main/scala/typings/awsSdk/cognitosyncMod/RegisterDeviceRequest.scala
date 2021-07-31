package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDeviceRequest extends StObject {
  
  /**
    * The unique ID for this identity.
    */
  var IdentityId: typings.awsSdk.cognitosyncMod.IdentityId
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. Here, the ID of the pool that the identity belongs to.
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId
  
  /**
    * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
    */
  var Platform: typings.awsSdk.cognitosyncMod.Platform
  
  /**
    * The push token.
    */
  var Token: PushToken
}
object RegisterDeviceRequest {
  
  @scala.inline
  def apply(IdentityId: IdentityId, IdentityPoolId: IdentityPoolId, Platform: Platform, Token: PushToken): RegisterDeviceRequest = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDeviceRequest]
  }
  
  @scala.inline
  implicit class RegisterDeviceRequestMutableBuilder[Self <: RegisterDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: PushToken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
  }
}
