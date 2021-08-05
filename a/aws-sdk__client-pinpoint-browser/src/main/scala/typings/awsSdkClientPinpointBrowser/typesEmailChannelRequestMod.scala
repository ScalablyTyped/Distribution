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
    
    inline def apply(): EmailChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailChannelRequest]
    }
    
    extension [Self <: EmailChannelRequest](x: Self) {
      
      inline def setConfigurationSet(value: String): Self = StObject.set(x, "ConfigurationSet", value.asInstanceOf[js.Any])
      
      inline def setConfigurationSetUndefined: Self = StObject.set(x, "ConfigurationSet", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      inline def setFromAddress(value: String): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
      
      inline def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "Identity", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    }
  }
  
  type UnmarshalledEmailChannelRequest = EmailChannelRequest
}
