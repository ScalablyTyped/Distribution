package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApnssandboxchannelrequestMod {
  
  trait APNSSandboxChannelRequest extends StObject {
    
    /**
      * The bundle id used for APNs Tokens.
      */
    var BundleId: js.UndefOr[String] = js.undefined
    
    /**
      * The distribution certificate from Apple.
      */
    var Certificate: js.UndefOr[String] = js.undefined
    
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[String] = js.undefined
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The certificate private key.
      */
    var PrivateKey: js.UndefOr[String] = js.undefined
    
    /**
      * The team id used for APNs Tokens.
      */
    var TeamId: js.UndefOr[String] = js.undefined
    
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKey: js.UndefOr[String] = js.undefined
    
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKeyId: js.UndefOr[String] = js.undefined
  }
  object APNSSandboxChannelRequest {
    
    inline def apply(): APNSSandboxChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APNSSandboxChannelRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: APNSSandboxChannelRequest] (val x: Self) extends AnyVal {
      
      inline def setBundleId(value: String): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
      
      inline def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
      
      inline def setCertificate(value: String): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
      
      inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
      
      inline def setDefaultAuthenticationMethod(value: String): Self = StObject.set(x, "DefaultAuthenticationMethod", value.asInstanceOf[js.Any])
      
      inline def setDefaultAuthenticationMethodUndefined: Self = StObject.set(x, "DefaultAuthenticationMethod", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "PrivateKey", js.undefined)
      
      inline def setTeamId(value: String): Self = StObject.set(x, "TeamId", value.asInstanceOf[js.Any])
      
      inline def setTeamIdUndefined: Self = StObject.set(x, "TeamId", js.undefined)
      
      inline def setTokenKey(value: String): Self = StObject.set(x, "TokenKey", value.asInstanceOf[js.Any])
      
      inline def setTokenKeyId(value: String): Self = StObject.set(x, "TokenKeyId", value.asInstanceOf[js.Any])
      
      inline def setTokenKeyIdUndefined: Self = StObject.set(x, "TokenKeyId", js.undefined)
      
      inline def setTokenKeyUndefined: Self = StObject.set(x, "TokenKey", js.undefined)
    }
  }
  
  type UnmarshalledAPNSSandboxChannelRequest = APNSSandboxChannelRequest
}
