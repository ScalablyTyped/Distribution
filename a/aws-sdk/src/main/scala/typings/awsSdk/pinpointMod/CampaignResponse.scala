package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignResponse extends StObject {
  
  /**
    * An array of responses, one for each treatment that you defined for the campaign, in addition to the default treatment.
    */
  var AdditionalTreatments: js.UndefOr[ListOfTreatmentResource] = js.undefined
  
  /**
    * The unique identifier for the application that the campaign applies to.
    */
  var ApplicationId: string
  
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var Arn: string
  
  /**
    * The date, in ISO 8601 format, when the campaign was created.
    */
  var CreationDate: string
  
  /**
    * The delivery configuration settings for sending the campaign through a custom channel.
    */
  var CustomDeliveryConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.CustomDeliveryConfiguration] = js.undefined
  
  /**
    * The current status of the campaign's default treatment. This value exists only for campaigns that have more than one treatment.
    */
  var DefaultState: js.UndefOr[CampaignState] = js.undefined
  
  /**
    * The custom description of the campaign.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
    */
  var HoldoutPercent: js.UndefOr[integer] = js.undefined
  
  /**
    * The settings for the AWS Lambda function to use as a code hook for the campaign. You can use this hook to customize the segment that's used by the campaign.
    */
  var Hook: js.UndefOr[CampaignHook] = js.undefined
  
  /**
    * The unique identifier for the campaign.
    */
  var Id: string
  
  /**
    * Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing this value to false.
    */
  var IsPaused: js.UndefOr[boolean] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the campaign was last modified.
    */
  var LastModifiedDate: string
  
  /**
    * The messaging limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  
  /**
    * The message configuration settings for the campaign.
    */
  var MessageConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.MessageConfiguration] = js.undefined
  
  /**
    * The name of the campaign.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The schedule settings for the campaign.
    */
  var Schedule: js.UndefOr[typings.awsSdk.pinpointMod.Schedule] = js.undefined
  
  /**
    * The unique identifier for the segment that's associated with the campaign.
    */
  var SegmentId: string
  
  /**
    * The version number of the segment that's associated with the campaign.
    */
  var SegmentVersion: integer
  
  /**
    * The current status of the campaign.
    */
  var State: js.UndefOr[CampaignState] = js.undefined
  
  /**
    * The message template that’s used for the campaign.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.TemplateConfiguration] = js.undefined
  
  /**
    * The custom description of the default treatment for the campaign.
    */
  var TreatmentDescription: js.UndefOr[string] = js.undefined
  
  /**
    * The custom name of the default treatment for the campaign, if the campaign has multiple treatments. A treatment is a variation of a campaign that's used for A/B testing.
    */
  var TreatmentName: js.UndefOr[string] = js.undefined
  
  /**
    * The version number of the campaign.
    */
  var Version: js.UndefOr[integer] = js.undefined
  
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.undefined
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
  implicit class CampaignResponseMutableBuilder[Self <: CampaignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalTreatments(value: ListOfTreatmentResource): Self = StObject.set(x, "AdditionalTreatments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTreatmentsUndefined: Self = StObject.set(x, "AdditionalTreatments", js.undefined)
    
    @scala.inline
    def setAdditionalTreatmentsVarargs(value: TreatmentResource*): Self = StObject.set(x, "AdditionalTreatments", js.Array(value :_*))
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDeliveryConfiguration(value: CustomDeliveryConfiguration): Self = StObject.set(x, "CustomDeliveryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDeliveryConfigurationUndefined: Self = StObject.set(x, "CustomDeliveryConfiguration", js.undefined)
    
    @scala.inline
    def setDefaultState(value: CampaignState): Self = StObject.set(x, "DefaultState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStateUndefined: Self = StObject.set(x, "DefaultState", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setHoldoutPercent(value: integer): Self = StObject.set(x, "HoldoutPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldoutPercentUndefined: Self = StObject.set(x, "HoldoutPercent", js.undefined)
    
    @scala.inline
    def setHook(value: CampaignHook): Self = StObject.set(x, "Hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHookUndefined: Self = StObject.set(x, "Hook", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaused(value: boolean): Self = StObject.set(x, "IsPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPausedUndefined: Self = StObject.set(x, "IsPaused", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimits(value: CampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
    
    @scala.inline
    def setMessageConfiguration(value: MessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSchedule(value: Schedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setSegmentId(value: string): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentVersion(value: integer): Self = StObject.set(x, "SegmentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: CampaignState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTemplateConfiguration(value: TemplateConfiguration): Self = StObject.set(x, "TemplateConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateConfigurationUndefined: Self = StObject.set(x, "TemplateConfiguration", js.undefined)
    
    @scala.inline
    def setTreatmentDescription(value: string): Self = StObject.set(x, "TreatmentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatmentDescriptionUndefined: Self = StObject.set(x, "TreatmentDescription", js.undefined)
    
    @scala.inline
    def setTreatmentName(value: string): Self = StObject.set(x, "TreatmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatmentNameUndefined: Self = StObject.set(x, "TreatmentName", js.undefined)
    
    @scala.inline
    def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
