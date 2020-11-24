package typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod

import typings.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod.UnmarshalledCampaignEmailMessage
import typings.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod.UnmarshalledCampaignSmsMessage
import typings.awsSdkClientPinpointBrowser.typesMessageMod.UnmarshalledMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledMessageConfiguration extends MessageConfiguration {
  
  /**
    * The message that the campaign delivers to ADM channels. Overrides the default message.
    */
  @JSName("ADMMessage")
  var ADMMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.native
  
  /**
    * The message that the campaign delivers to APNS channels. Overrides the default message.
    */
  @JSName("APNSMessage")
  var APNSMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.native
  
  /**
    * The message that the campaign delivers to Baidu channels. Overrides the default message.
    */
  @JSName("BaiduMessage")
  var BaiduMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.native
  
  /**
    * The default message for all channels.
    */
  @JSName("DefaultMessage")
  var DefaultMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.native
  
  /**
    * The email message configuration.
    */
  @JSName("EmailMessage")
  var EmailMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledCampaignEmailMessage] = js.native
  
  /**
    * The message that the campaign delivers to GCM channels. Overrides the default message.
    */
  @JSName("GCMMessage")
  var GCMMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.native
  
  /**
    * The SMS message configuration.
    */
  @JSName("SMSMessage")
  var SMSMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledCampaignSmsMessage] = js.native
}
object UnmarshalledMessageConfiguration {
  
  @scala.inline
  def apply(): UnmarshalledMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledMessageConfiguration]
  }
  
  @scala.inline
  implicit class UnmarshalledMessageConfigurationOps[Self <: UnmarshalledMessageConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setADMMessage(value: UnmarshalledMessage): Self = this.set("ADMMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteADMMessage: Self = this.set("ADMMessage", js.undefined)
    
    @scala.inline
    def setAPNSMessage(value: UnmarshalledMessage): Self = this.set("APNSMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAPNSMessage: Self = this.set("APNSMessage", js.undefined)
    
    @scala.inline
    def setBaiduMessage(value: UnmarshalledMessage): Self = this.set("BaiduMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaiduMessage: Self = this.set("BaiduMessage", js.undefined)
    
    @scala.inline
    def setDefaultMessage(value: UnmarshalledMessage): Self = this.set("DefaultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMessage: Self = this.set("DefaultMessage", js.undefined)
    
    @scala.inline
    def setEmailMessage(value: UnmarshalledCampaignEmailMessage): Self = this.set("EmailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailMessage: Self = this.set("EmailMessage", js.undefined)
    
    @scala.inline
    def setGCMMessage(value: UnmarshalledMessage): Self = this.set("GCMMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGCMMessage: Self = this.set("GCMMessage", js.undefined)
    
    @scala.inline
    def setSMSMessage(value: UnmarshalledCampaignSmsMessage): Self = this.set("SMSMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSMSMessage: Self = this.set("SMSMessage", js.undefined)
  }
}
