package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDeliverabilityCampaign extends js.Object {
  
  /**
    * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
    */
  var CampaignId: js.UndefOr[typings.awsSdk.pinpointemailMod.CampaignId] = js.native
  
  /**
    * The percentage of email messages that were deleted by recipients, without being opened first. Due to technical limitations, this value only includes recipients who opened the message by using an email client that supports images.
    */
  var DeleteRate: js.UndefOr[Percentage] = js.native
  
  /**
    * The major email providers who handled the email message.
    */
  var Esps: js.UndefOr[typings.awsSdk.pinpointemailMod.Esps] = js.native
  
  /**
    * The first time, in Unix time format, when the email message was delivered to any recipient's inbox. This value can help you determine how long it took for a campaign to deliver an email message.
    */
  var FirstSeenDateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The verified email address that the email message was sent from.
    */
  var FromAddress: js.UndefOr[Identity] = js.native
  
  /**
    * The URL of an image that contains a snapshot of the email message that was sent.
    */
  var ImageUrl: js.UndefOr[typings.awsSdk.pinpointemailMod.ImageUrl] = js.native
  
  /**
    * The number of email messages that were delivered to recipients’ inboxes.
    */
  var InboxCount: js.UndefOr[Volume] = js.native
  
  /**
    * The last time, in Unix time format, when the email message was delivered to any recipient's inbox. This value can help you determine how long it took for a campaign to deliver an email message.
    */
  var LastSeenDateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The projected number of recipients that the email message was sent to.
    */
  var ProjectedVolume: js.UndefOr[Volume] = js.native
  
  /**
    * The percentage of email messages that were opened and then deleted by recipients. Due to technical limitations, this value only includes recipients who opened the message by using an email client that supports images.
    */
  var ReadDeleteRate: js.UndefOr[Percentage] = js.native
  
  /**
    * The percentage of email messages that were opened by recipients. Due to technical limitations, this value only includes recipients who opened the message by using an email client that supports images.
    */
  var ReadRate: js.UndefOr[Percentage] = js.native
  
  /**
    * The IP addresses that were used to send the email message.
    */
  var SendingIps: js.UndefOr[IpList] = js.native
  
  /**
    * The number of email messages that were delivered to recipients' spam or junk mail folders.
    */
  var SpamCount: js.UndefOr[Volume] = js.native
  
  /**
    * The subject line, or title, of the email message.
    */
  var Subject: js.UndefOr[typings.awsSdk.pinpointemailMod.Subject] = js.native
}
object DomainDeliverabilityCampaign {
  
  @scala.inline
  def apply(): DomainDeliverabilityCampaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDeliverabilityCampaign]
  }
  
  @scala.inline
  implicit class DomainDeliverabilityCampaignOps[Self <: DomainDeliverabilityCampaign] (val x: Self) extends AnyVal {
    
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
    def setCampaignId(value: CampaignId): Self = this.set("CampaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("CampaignId", js.undefined)
    
    @scala.inline
    def setDeleteRate(value: Percentage): Self = this.set("DeleteRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteRate: Self = this.set("DeleteRate", js.undefined)
    
    @scala.inline
    def setEspsVarargs(value: Esp*): Self = this.set("Esps", js.Array(value :_*))
    
    @scala.inline
    def setEsps(value: Esps): Self = this.set("Esps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsps: Self = this.set("Esps", js.undefined)
    
    @scala.inline
    def setFirstSeenDateTime(value: Timestamp): Self = this.set("FirstSeenDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstSeenDateTime: Self = this.set("FirstSeenDateTime", js.undefined)
    
    @scala.inline
    def setFromAddress(value: Identity): Self = this.set("FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddress: Self = this.set("FromAddress", js.undefined)
    
    @scala.inline
    def setImageUrl(value: ImageUrl): Self = this.set("ImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("ImageUrl", js.undefined)
    
    @scala.inline
    def setInboxCount(value: Volume): Self = this.set("InboxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboxCount: Self = this.set("InboxCount", js.undefined)
    
    @scala.inline
    def setLastSeenDateTime(value: Timestamp): Self = this.set("LastSeenDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSeenDateTime: Self = this.set("LastSeenDateTime", js.undefined)
    
    @scala.inline
    def setProjectedVolume(value: Volume): Self = this.set("ProjectedVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectedVolume: Self = this.set("ProjectedVolume", js.undefined)
    
    @scala.inline
    def setReadDeleteRate(value: Percentage): Self = this.set("ReadDeleteRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadDeleteRate: Self = this.set("ReadDeleteRate", js.undefined)
    
    @scala.inline
    def setReadRate(value: Percentage): Self = this.set("ReadRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadRate: Self = this.set("ReadRate", js.undefined)
    
    @scala.inline
    def setSendingIpsVarargs(value: Ip*): Self = this.set("SendingIps", js.Array(value :_*))
    
    @scala.inline
    def setSendingIps(value: IpList): Self = this.set("SendingIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendingIps: Self = this.set("SendingIps", js.undefined)
    
    @scala.inline
    def setSpamCount(value: Volume): Self = this.set("SpamCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpamCount: Self = this.set("SpamCount", js.undefined)
    
    @scala.inline
    def setSubject(value: Subject): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("Subject", js.undefined)
  }
}
