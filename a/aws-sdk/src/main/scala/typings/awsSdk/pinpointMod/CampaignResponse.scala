package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignResponse extends js.Object {
  
  /**
    * An array of responses, one for each treatment that you defined for the campaign, in addition to the default treatment.
    */
  var AdditionalTreatments: js.UndefOr[ListOfTreatmentResource] = js.native
  
  /**
    * The unique identifier for the application that the campaign applies to.
    */
  var ApplicationId: string = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var Arn: string = js.native
  
  /**
    * The date, in ISO 8601 format, when the campaign was created.
    */
  var CreationDate: string = js.native
  
  /**
    * The delivery configuration settings for sending the campaign through a custom channel.
    */
  var CustomDeliveryConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.CustomDeliveryConfiguration] = js.native
  
  /**
    * The current status of the campaign's default treatment. This value exists only for campaigns that have more than one treatment.
    */
  var DefaultState: js.UndefOr[CampaignState] = js.native
  
  /**
    * The custom description of the campaign.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
    */
  var HoldoutPercent: js.UndefOr[integer] = js.native
  
  /**
    * The settings for the AWS Lambda function to use as a code hook for the campaign. You can use this hook to customize the segment that's used by the campaign.
    */
  var Hook: js.UndefOr[CampaignHook] = js.native
  
  /**
    * The unique identifier for the campaign.
    */
  var Id: string = js.native
  
  /**
    * Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing this value to false.
    */
  var IsPaused: js.UndefOr[boolean] = js.native
  
  /**
    * The date, in ISO 8601 format, when the campaign was last modified.
    */
  var LastModifiedDate: string = js.native
  
  /**
    * The messaging limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  
  /**
    * The message configuration settings for the campaign.
    */
  var MessageConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.MessageConfiguration] = js.native
  
  /**
    * The name of the campaign.
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * The schedule settings for the campaign.
    */
  var Schedule: js.UndefOr[typings.awsSdk.pinpointMod.Schedule] = js.native
  
  /**
    * The unique identifier for the segment that's associated with the campaign.
    */
  var SegmentId: string = js.native
  
  /**
    * The version number of the segment that's associated with the campaign.
    */
  var SegmentVersion: integer = js.native
  
  /**
    * The current status of the campaign.
    */
  var State: js.UndefOr[CampaignState] = js.native
  
  /**
    * The message template that’s used for the campaign.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  
  /**
    * The custom description of the default treatment for the campaign.
    */
  var TreatmentDescription: js.UndefOr[string] = js.native
  
  /**
    * The custom name of the default treatment for the campaign, if the campaign has multiple treatments. A treatment is a variation of a campaign that's used for A/B testing.
    */
  var TreatmentName: js.UndefOr[string] = js.native
  
  /**
    * The version number of the campaign.
    */
  var Version: js.UndefOr[integer] = js.native
  
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}
object CampaignResponse {
  
  @scala.inline
  def apply(
    ApplicationId: string,
    Arn: string,
    CreationDate: string,
    Id: string,
    LastModifiedDate: string,
    SegmentId: string,
    SegmentVersion: integer
  ): CampaignResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], SegmentVersion = SegmentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignResponse]
  }
  
  @scala.inline
  implicit class CampaignResponseOps[Self <: CampaignResponse] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: string): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDate(value: string): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentId(value: string): Self = this.set("SegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentVersion(value: integer): Self = this.set("SegmentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTreatmentsVarargs(value: TreatmentResource*): Self = this.set("AdditionalTreatments", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalTreatments(value: ListOfTreatmentResource): Self = this.set("AdditionalTreatments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalTreatments: Self = this.set("AdditionalTreatments", js.undefined)
    
    @scala.inline
    def setCustomDeliveryConfiguration(value: CustomDeliveryConfiguration): Self = this.set("CustomDeliveryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDeliveryConfiguration: Self = this.set("CustomDeliveryConfiguration", js.undefined)
    
    @scala.inline
    def setDefaultState(value: CampaignState): Self = this.set("DefaultState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultState: Self = this.set("DefaultState", js.undefined)
    
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
    def setState(value: CampaignState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
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
    def setVersion(value: integer): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfString): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
