package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod.CampaignEmailMessage
import typings.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod.UnmarshalledCampaignEmailMessage
import typings.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod.CampaignSmsMessage
import typings.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod.UnmarshalledCampaignSmsMessage
import typings.awsSdkClientPinpointBrowser.typesMessageMod.Message
import typings.awsSdkClientPinpointBrowser.typesMessageMod.UnmarshalledMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageConfigurationMod {
  
  trait MessageConfiguration extends StObject {
    
    /**
      * The message that the campaign delivers to ADM channels. Overrides the default message.
      */
    var ADMMessage: js.UndefOr[Message] = js.undefined
    
    /**
      * The message that the campaign delivers to APNS channels. Overrides the default message.
      */
    var APNSMessage: js.UndefOr[Message] = js.undefined
    
    /**
      * The message that the campaign delivers to Baidu channels. Overrides the default message.
      */
    var BaiduMessage: js.UndefOr[Message] = js.undefined
    
    /**
      * The default message for all channels.
      */
    var DefaultMessage: js.UndefOr[Message] = js.undefined
    
    /**
      * The email message configuration.
      */
    var EmailMessage: js.UndefOr[CampaignEmailMessage] = js.undefined
    
    /**
      * The message that the campaign delivers to GCM channels. Overrides the default message.
      */
    var GCMMessage: js.UndefOr[Message] = js.undefined
    
    /**
      * The SMS message configuration.
      */
    var SMSMessage: js.UndefOr[CampaignSmsMessage] = js.undefined
  }
  object MessageConfiguration {
    
    inline def apply(): MessageConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageConfiguration]
    }
    
    extension [Self <: MessageConfiguration](x: Self) {
      
      inline def setADMMessage(value: Message): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
      
      inline def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
      
      inline def setAPNSMessage(value: Message): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
      
      inline def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
      
      inline def setBaiduMessage(value: Message): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
      
      inline def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
      
      inline def setDefaultMessage(value: Message): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
      
      inline def setEmailMessage(value: CampaignEmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
      
      inline def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
      
      inline def setGCMMessage(value: Message): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
      
      inline def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
      
      inline def setSMSMessage(value: CampaignSmsMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
      
      inline def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
    }
  }
  
  trait UnmarshalledMessageConfiguration
    extends StObject
       with MessageConfiguration {
    
    /**
      * The message that the campaign delivers to ADM channels. Overrides the default message.
      */
    @JSName("ADMMessage")
    var ADMMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.undefined
    
    /**
      * The message that the campaign delivers to APNS channels. Overrides the default message.
      */
    @JSName("APNSMessage")
    var APNSMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.undefined
    
    /**
      * The message that the campaign delivers to Baidu channels. Overrides the default message.
      */
    @JSName("BaiduMessage")
    var BaiduMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.undefined
    
    /**
      * The default message for all channels.
      */
    @JSName("DefaultMessage")
    var DefaultMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.undefined
    
    /**
      * The email message configuration.
      */
    @JSName("EmailMessage")
    var EmailMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledCampaignEmailMessage] = js.undefined
    
    /**
      * The message that the campaign delivers to GCM channels. Overrides the default message.
      */
    @JSName("GCMMessage")
    var GCMMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.undefined
    
    /**
      * The SMS message configuration.
      */
    @JSName("SMSMessage")
    var SMSMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledCampaignSmsMessage] = js.undefined
  }
  object UnmarshalledMessageConfiguration {
    
    inline def apply(): UnmarshalledMessageConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMessageConfiguration]
    }
    
    extension [Self <: UnmarshalledMessageConfiguration](x: Self) {
      
      inline def setADMMessage(value: UnmarshalledMessage): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
      
      inline def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
      
      inline def setAPNSMessage(value: UnmarshalledMessage): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
      
      inline def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
      
      inline def setBaiduMessage(value: UnmarshalledMessage): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
      
      inline def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
      
      inline def setDefaultMessage(value: UnmarshalledMessage): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
      
      inline def setEmailMessage(value: UnmarshalledCampaignEmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
      
      inline def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
      
      inline def setGCMMessage(value: UnmarshalledMessage): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
      
      inline def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
      
      inline def setSMSMessage(value: UnmarshalledCampaignSmsMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
      
      inline def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
    }
  }
}
