package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEmailChannelRequestMod {
  
  trait EmailChannelRequest extends StObject {
    
    /**
      * The configuration set that you want to use when you send email using the Pinpoint Email API.
      */
    var ConfigurationSet: js.UndefOr[String] = js.undefined
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The email address used to send emails from.
      */
    var FromAddress: js.UndefOr[String] = js.undefined
    
    /**
      * The ARN of an identity verified with SES.
      */
    var Identity: js.UndefOr[String] = js.undefined
    
    /**
      * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
      */
    var RoleArn: js.UndefOr[String] = js.undefined
  }
  object EmailChannelRequest {
    
    @scala.inline
    def apply(): EmailChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailChannelRequest]
    }
    
    @scala.inline
    implicit class EmailChannelRequestMutableBuilder[Self <: EmailChannelRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigurationSet(value: String): Self = StObject.set(x, "ConfigurationSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationSetUndefined: Self = StObject.set(x, "ConfigurationSet", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      @scala.inline
      def setFromAddress(value: String): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
      
      @scala.inline
      def setIdentity(value: String): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityUndefined: Self = StObject.set(x, "Identity", js.undefined)
      
      @scala.inline
      def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    }
  }
  
  type UnmarshalledEmailChannelRequest = EmailChannelRequest
}
