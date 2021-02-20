package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSmschannelrequestMod {
  
  @js.native
  trait SMSChannelRequest extends StObject {
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Sender identifier of your messages.
      */
    var SenderId: js.UndefOr[String] = js.native
    
    /**
      * ShortCode registered with phone provider.
      */
    var ShortCode: js.UndefOr[String] = js.native
  }
  object SMSChannelRequest {
    
    @scala.inline
    def apply(): SMSChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SMSChannelRequest]
    }
    
    @scala.inline
    implicit class SMSChannelRequestMutableBuilder[Self <: SMSChannelRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      @scala.inline
      def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
      
      @scala.inline
      def setShortCode(value: String): Self = StObject.set(x, "ShortCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortCodeUndefined: Self = StObject.set(x, "ShortCode", js.undefined)
    }
  }
  
  type UnmarshalledSMSChannelRequest = SMSChannelRequest
}
