package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDeliverabilityCampaign extends StObject {
  
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
  implicit class DomainDeliverabilityCampaignMutableBuilder[Self <: DomainDeliverabilityCampaign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignId(value: CampaignId): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdUndefined: Self = StObject.set(x, "CampaignId", js.undefined)
    
    @scala.inline
    def setDeleteRate(value: Percentage): Self = StObject.set(x, "DeleteRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRateUndefined: Self = StObject.set(x, "DeleteRate", js.undefined)
    
    @scala.inline
    def setEsps(value: Esps): Self = StObject.set(x, "Esps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEspsUndefined: Self = StObject.set(x, "Esps", js.undefined)
    
    @scala.inline
    def setEspsVarargs(value: Esp*): Self = StObject.set(x, "Esps", js.Array(value :_*))
    
    @scala.inline
    def setFirstSeenDateTime(value: Timestamp): Self = StObject.set(x, "FirstSeenDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSeenDateTimeUndefined: Self = StObject.set(x, "FirstSeenDateTime", js.undefined)
    
    @scala.inline
    def setFromAddress(value: Identity): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
    
    @scala.inline
    def setImageUrl(value: ImageUrl): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
    
    @scala.inline
    def setInboxCount(value: Volume): Self = StObject.set(x, "InboxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboxCountUndefined: Self = StObject.set(x, "InboxCount", js.undefined)
    
    @scala.inline
    def setLastSeenDateTime(value: Timestamp): Self = StObject.set(x, "LastSeenDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSeenDateTimeUndefined: Self = StObject.set(x, "LastSeenDateTime", js.undefined)
    
    @scala.inline
    def setProjectedVolume(value: Volume): Self = StObject.set(x, "ProjectedVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectedVolumeUndefined: Self = StObject.set(x, "ProjectedVolume", js.undefined)
    
    @scala.inline
    def setReadDeleteRate(value: Percentage): Self = StObject.set(x, "ReadDeleteRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadDeleteRateUndefined: Self = StObject.set(x, "ReadDeleteRate", js.undefined)
    
    @scala.inline
    def setReadRate(value: Percentage): Self = StObject.set(x, "ReadRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadRateUndefined: Self = StObject.set(x, "ReadRate", js.undefined)
    
    @scala.inline
    def setSendingIps(value: IpList): Self = StObject.set(x, "SendingIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendingIpsUndefined: Self = StObject.set(x, "SendingIps", js.undefined)
    
    @scala.inline
    def setSendingIpsVarargs(value: Ip*): Self = StObject.set(x, "SendingIps", js.Array(value :_*))
    
    @scala.inline
    def setSpamCount(value: Volume): Self = StObject.set(x, "SpamCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpamCountUndefined: Self = StObject.set(x, "SpamCount", js.undefined)
    
    @scala.inline
    def setSubject(value: Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
  }
}
