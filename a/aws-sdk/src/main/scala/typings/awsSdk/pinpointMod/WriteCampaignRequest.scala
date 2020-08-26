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
  def apply(): WriteCampaignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteCampaignRequest]
  }
  @scala.inline
  implicit class WriteCampaignRequestOps[Self <: WriteCampaignRequest] (val x: Self) extends AnyVal {
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
    def setAdditionalTreatmentsVarargs(value: WriteTreatmentResource*): Self = this.set("AdditionalTreatments", js.Array(value :_*))
    @scala.inline
    def setAdditionalTreatments(value: ListOfWriteTreatmentResource): Self = this.set("AdditionalTreatments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalTreatments: Self = this.set("AdditionalTreatments", js.undefined)
    @scala.inline
    def setCustomDeliveryConfiguration(value: CustomDeliveryConfiguration): Self = this.set("CustomDeliveryConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDeliveryConfiguration: Self = this.set("CustomDeliveryConfiguration", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setHoldoutPercent(value: integer): Self = this.set("HoldoutPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoldoutPercent: Self = this.set("HoldoutPercent", js.undefined)
    @scala.inline
    def setHook(value: CampaignHook): Self = this.set("Hook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHook: Self = this.set("Hook", js.undefined)
    @scala.inline
    def setIsPaused(value: boolean): Self = this.set("IsPaused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPaused: Self = this.set("IsPaused", js.undefined)
    @scala.inline
    def setLimits(value: CampaignLimits): Self = this.set("Limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("Limits", js.undefined)
    @scala.inline
    def setMessageConfiguration(value: MessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageConfiguration: Self = this.set("MessageConfiguration", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSchedule(value: Schedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    @scala.inline
    def setSegmentId(value: string): Self = this.set("SegmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentId: Self = this.set("SegmentId", js.undefined)
    @scala.inline
    def setSegmentVersion(value: integer): Self = this.set("SegmentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentVersion: Self = this.set("SegmentVersion", js.undefined)
    @scala.inline
    def setTemplateConfiguration(value: TemplateConfiguration): Self = this.set("TemplateConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateConfiguration: Self = this.set("TemplateConfiguration", js.undefined)
    @scala.inline
    def setTreatmentDescription(value: string): Self = this.set("TreatmentDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatmentDescription: Self = this.set("TreatmentDescription", js.undefined)
    @scala.inline
    def setTreatmentName(value: string): Self = this.set("TreatmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatmentName: Self = this.set("TreatmentName", js.undefined)
    @scala.inline
    def setTags(value: MapOfString): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

