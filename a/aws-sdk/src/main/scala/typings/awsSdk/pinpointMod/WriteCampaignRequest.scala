package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteCampaignRequest extends js.Object {
  /**
    * An array of requests that defines additional treatments for the campaign, in addition to the default treatment for the campaign.
    */
  var AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource] = js.native
  /**
    * The delivery configuration settings for sending the campaign through a custom channel. This object is required if the MessageConfiguration object for the campaign specifies a CustomMessage object.
    */
  var CustomDeliveryConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.CustomDeliveryConfiguration] = js.native
  /**
    * A custom description of the campaign.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
    */
  var HoldoutPercent: js.UndefOr[integer] = js.native
  /**
    * The settings for the AWS Lambda function to invoke as a code hook for the campaign. You can use this hook to customize the segment that's used by the campaign.
    */
  var Hook: js.UndefOr[CampaignHook] = js.native
  /**
    * Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by changing this value to false.
    */
  var IsPaused: js.UndefOr[boolean] = js.native
  /**
    * The messaging limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The message configuration settings for the campaign.
    */
  var MessageConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.MessageConfiguration] = js.native
  /**
    * A custom name for the campaign.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The schedule settings for the campaign.
    */
  var Schedule: js.UndefOr[typings.awsSdk.pinpointMod.Schedule] = js.native
  /**
    * The unique identifier for the segment to associate with the campaign.
    */
  var SegmentId: js.UndefOr[string] = js.native
  /**
    * The version of the segment to associate with the campaign.
    */
  var SegmentVersion: js.UndefOr[integer] = js.native
  /**
    * The message template to use for the campaign.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  /**
    * A custom description of the default treatment for the campaign.
    */
  var TreatmentDescription: js.UndefOr[string] = js.native
  /**
    * A custom name of the default treatment for the campaign, if the campaign has multiple treatments. A treatment is a variation of a campaign that's used for A/B testing.
    */
  var TreatmentName: js.UndefOr[string] = js.native
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object WriteCampaignRequest {
  @scala.inline
  def apply(
    AdditionalTreatments: ListOfWriteTreatmentResource = null,
    CustomDeliveryConfiguration: CustomDeliveryConfiguration = null,
    Description: string = null,
    HoldoutPercent: js.UndefOr[integer] = js.undefined,
    Hook: CampaignHook = null,
    IsPaused: js.UndefOr[boolean] = js.undefined,
    Limits: CampaignLimits = null,
    MessageConfiguration: MessageConfiguration = null,
    Name: string = null,
    Schedule: Schedule = null,
    SegmentId: string = null,
    SegmentVersion: js.UndefOr[integer] = js.undefined,
    TemplateConfiguration: TemplateConfiguration = null,
    TreatmentDescription: string = null,
    TreatmentName: string = null,
    tags: MapOfString = null
  ): WriteCampaignRequest = {
    val __obj = js.Dynamic.literal()
    if (AdditionalTreatments != null) __obj.updateDynamic("AdditionalTreatments")(AdditionalTreatments.asInstanceOf[js.Any])
    if (CustomDeliveryConfiguration != null) __obj.updateDynamic("CustomDeliveryConfiguration")(CustomDeliveryConfiguration.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(HoldoutPercent)) __obj.updateDynamic("HoldoutPercent")(HoldoutPercent.get.asInstanceOf[js.Any])
    if (Hook != null) __obj.updateDynamic("Hook")(Hook.asInstanceOf[js.Any])
    if (!js.isUndefined(IsPaused)) __obj.updateDynamic("IsPaused")(IsPaused.get.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentVersion)) __obj.updateDynamic("SegmentVersion")(SegmentVersion.get.asInstanceOf[js.Any])
    if (TemplateConfiguration != null) __obj.updateDynamic("TemplateConfiguration")(TemplateConfiguration.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteCampaignRequest]
  }
}

