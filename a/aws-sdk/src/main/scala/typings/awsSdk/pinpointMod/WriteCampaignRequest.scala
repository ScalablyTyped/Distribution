package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteCampaignRequest extends StObject {
  
  /**
    * An array of requests that defines additional treatments for the campaign, in addition to the default treatment for the campaign.
    */
  var AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource] = js.undefined
  
  /**
    * The delivery configuration settings for sending the campaign through a custom channel. This object is required if the MessageConfiguration object for the campaign specifies a CustomMessage object.
    */
  var CustomDeliveryConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.CustomDeliveryConfiguration] = js.undefined
  
  /**
    * A custom description of the campaign.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
    */
  var HoldoutPercent: js.UndefOr[integer] = js.undefined
  
  /**
    * The settings for the AWS Lambda function to invoke as a code hook for the campaign. You can use this hook to customize the segment that's used by the campaign.
    */
  var Hook: js.UndefOr[CampaignHook] = js.undefined
  
  /**
    * Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by changing this value to false.
    */
  var IsPaused: js.UndefOr[boolean] = js.undefined
  
  /**
    * The messaging limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  
  /**
    * The message configuration settings for the campaign.
    */
  var MessageConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.MessageConfiguration] = js.undefined
  
  /**
    * A custom name for the campaign.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The schedule settings for the campaign.
    */
  var Schedule: js.UndefOr[typings.awsSdk.pinpointMod.Schedule] = js.undefined
  
  /**
    * The unique identifier for the segment to associate with the campaign.
    */
  var SegmentId: js.UndefOr[string] = js.undefined
  
  /**
    * The version of the segment to associate with the campaign.
    */
  var SegmentVersion: js.UndefOr[integer] = js.undefined
  
  /**
    * The message template to use for the campaign.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.TemplateConfiguration] = js.undefined
  
  /**
    * A custom description of the default treatment for the campaign.
    */
  var TreatmentDescription: js.UndefOr[string] = js.undefined
  
  /**
    * A custom name of the default treatment for the campaign, if the campaign has multiple treatments. A treatment is a variation of a campaign that's used for A/B testing.
    */
  var TreatmentName: js.UndefOr[string] = js.undefined
  
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.undefined
}
object WriteCampaignRequest {
  
  @scala.inline
  def apply(): WriteCampaignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteCampaignRequest]
  }
  
  @scala.inline
  implicit class WriteCampaignRequestMutableBuilder[Self <: WriteCampaignRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalTreatments(value: ListOfWriteTreatmentResource): Self = StObject.set(x, "AdditionalTreatments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTreatmentsUndefined: Self = StObject.set(x, "AdditionalTreatments", js.undefined)
    
    @scala.inline
    def setAdditionalTreatmentsVarargs(value: WriteTreatmentResource*): Self = StObject.set(x, "AdditionalTreatments", js.Array(value :_*))
    
    @scala.inline
    def setCustomDeliveryConfiguration(value: CustomDeliveryConfiguration): Self = StObject.set(x, "CustomDeliveryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDeliveryConfigurationUndefined: Self = StObject.set(x, "CustomDeliveryConfiguration", js.undefined)
    
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
    def setIsPaused(value: boolean): Self = StObject.set(x, "IsPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPausedUndefined: Self = StObject.set(x, "IsPaused", js.undefined)
    
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
    def setSegmentIdUndefined: Self = StObject.set(x, "SegmentId", js.undefined)
    
    @scala.inline
    def setSegmentVersion(value: integer): Self = StObject.set(x, "SegmentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentVersionUndefined: Self = StObject.set(x, "SegmentVersion", js.undefined)
    
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
  }
}
