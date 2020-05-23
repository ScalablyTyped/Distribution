package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    CampaignId: CampaignId = null,
    DeleteRate: js.UndefOr[Percentage] = js.undefined,
    Esps: Esps = null,
    FirstSeenDateTime: Timestamp = null,
    FromAddress: Identity = null,
    ImageUrl: ImageUrl = null,
    InboxCount: js.UndefOr[Volume] = js.undefined,
    LastSeenDateTime: Timestamp = null,
    ProjectedVolume: js.UndefOr[Volume] = js.undefined,
    ReadDeleteRate: js.UndefOr[Percentage] = js.undefined,
    ReadRate: js.UndefOr[Percentage] = js.undefined,
    SendingIps: IpList = null,
    SpamCount: js.UndefOr[Volume] = js.undefined,
    Subject: Subject = null
  ): DomainDeliverabilityCampaign = {
    val __obj = js.Dynamic.literal()
    if (CampaignId != null) __obj.updateDynamic("CampaignId")(CampaignId.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteRate)) __obj.updateDynamic("DeleteRate")(DeleteRate.get.asInstanceOf[js.Any])
    if (Esps != null) __obj.updateDynamic("Esps")(Esps.asInstanceOf[js.Any])
    if (FirstSeenDateTime != null) __obj.updateDynamic("FirstSeenDateTime")(FirstSeenDateTime.asInstanceOf[js.Any])
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress.asInstanceOf[js.Any])
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(InboxCount)) __obj.updateDynamic("InboxCount")(InboxCount.get.asInstanceOf[js.Any])
    if (LastSeenDateTime != null) __obj.updateDynamic("LastSeenDateTime")(LastSeenDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(ProjectedVolume)) __obj.updateDynamic("ProjectedVolume")(ProjectedVolume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadDeleteRate)) __obj.updateDynamic("ReadDeleteRate")(ReadDeleteRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadRate)) __obj.updateDynamic("ReadRate")(ReadRate.get.asInstanceOf[js.Any])
    if (SendingIps != null) __obj.updateDynamic("SendingIps")(SendingIps.asInstanceOf[js.Any])
    if (!js.isUndefined(SpamCount)) __obj.updateDynamic("SpamCount")(SpamCount.get.asInstanceOf[js.Any])
    if (Subject != null) __obj.updateDynamic("Subject")(Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDeliverabilityCampaign]
  }
}

