package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGcmchannelrequestMod {
  
  @js.native
  trait GCMChannelRequest extends StObject {
    
    /**
      * Platform credential API key from Google.
      */
    var ApiKey: js.UndefOr[String] = js.native
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.native
  }
  object GCMChannelRequest {
    
    @scala.inline
    def apply(): GCMChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GCMChannelRequest]
    }
    
    @scala.inline
    implicit class GCMChannelRequestMutableBuilder[Self <: GCMChannelRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "ApiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "ApiKey", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    }
  }
  
  type UnmarshalledGCMChannelRequest = GCMChannelRequest
}
