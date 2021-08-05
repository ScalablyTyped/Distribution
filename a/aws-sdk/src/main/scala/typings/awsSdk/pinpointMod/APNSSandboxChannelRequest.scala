package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APNSSandboxChannelRequest extends StObject {
  
  /**
    * The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
    */
  var BundleId: js.UndefOr[string] = js.undefined
  
  /**
    * The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with the APNs sandbox environment by using an APNs certificate.
    */
  var Certificate: js.UndefOr[string] = js.undefined
  
  /**
    * The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs sandbox environment, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether to enable the APNs sandbox channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with the APNs sandbox environment.
    */
  var PrivateKey: js.UndefOr[string] = js.undefined
  
  /**
    * The identifier that's assigned to your Apple developer account team. This identifier is used for APNs tokens.
    */
  var TeamId: js.UndefOr[string] = js.undefined
  
  /**
    * The authentication key to use for APNs tokens.
    */
  var TokenKey: js.UndefOr[string] = js.undefined
  
  /**
    * The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate with the APNs sandbox environment by using APNs tokens.
    */
  var TokenKeyId: js.UndefOr[string] = js.undefined
}
object APNSSandboxChannelRequest {
  
  inline def apply(): APNSSandboxChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APNSSandboxChannelRequest]
  }
  
  extension [Self <: APNSSandboxChannelRequest](x: Self) {
    
    inline def setBundleId(value: string): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
    
    inline def setCertificate(value: string): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    inline def setDefaultAuthenticationMethod(value: string): Self = StObject.set(x, "DefaultAuthenticationMethod", value.asInstanceOf[js.Any])
    
    inline def setDefaultAuthenticationMethodUndefined: Self = StObject.set(x, "DefaultAuthenticationMethod", js.undefined)
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setPrivateKey(value: string): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "PrivateKey", js.undefined)
    
    inline def setTeamId(value: string): Self = StObject.set(x, "TeamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "TeamId", js.undefined)
    
    inline def setTokenKey(value: string): Self = StObject.set(x, "TokenKey", value.asInstanceOf[js.Any])
    
    inline def setTokenKeyId(value: string): Self = StObject.set(x, "TokenKeyId", value.asInstanceOf[js.Any])
    
    inline def setTokenKeyIdUndefined: Self = StObject.set(x, "TokenKeyId", js.undefined)
    
    inline def setTokenKeyUndefined: Self = StObject.set(x, "TokenKey", js.undefined)
  }
}
