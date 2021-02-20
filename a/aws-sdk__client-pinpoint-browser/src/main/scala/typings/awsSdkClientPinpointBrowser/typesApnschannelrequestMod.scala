package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApnschannelrequestMod {
  
  @js.native
  trait APNSChannelRequest extends StObject {
    
    /**
      * The bundle id used for APNs Tokens.
      */
    var BundleId: js.UndefOr[String] = js.native
    
    /**
      * The distribution certificate from Apple.
      */
    var Certificate: js.UndefOr[String] = js.native
    
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[String] = js.native
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The certificate private key.
      */
    var PrivateKey: js.UndefOr[String] = js.native
    
    /**
      * The team id used for APNs Tokens.
      */
    var TeamId: js.UndefOr[String] = js.native
    
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKey: js.UndefOr[String] = js.native
    
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKeyId: js.UndefOr[String] = js.native
  }
  object APNSChannelRequest {
    
    @scala.inline
    def apply(): APNSChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APNSChannelRequest]
    }
    
    @scala.inline
    implicit class APNSChannelRequestMutableBuilder[Self <: APNSChannelRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundleId(value: String): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
      
      @scala.inline
      def setCertificate(value: String): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
      
      @scala.inline
      def setDefaultAuthenticationMethod(value: String): Self = StObject.set(x, "DefaultAuthenticationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAuthenticationMethodUndefined: Self = StObject.set(x, "DefaultAuthenticationMethod", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "PrivateKey", js.undefined)
      
      @scala.inline
      def setTeamId(value: String): Self = StObject.set(x, "TeamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamIdUndefined: Self = StObject.set(x, "TeamId", js.undefined)
      
      @scala.inline
      def setTokenKey(value: String): Self = StObject.set(x, "TokenKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenKeyId(value: String): Self = StObject.set(x, "TokenKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenKeyIdUndefined: Self = StObject.set(x, "TokenKeyId", js.undefined)
      
      @scala.inline
      def setTokenKeyUndefined: Self = StObject.set(x, "TokenKey", js.undefined)
    }
  }
  
  type UnmarshalledAPNSChannelRequest = APNSChannelRequest
}
