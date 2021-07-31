package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteJourneyRequest extends StObject {
  
  /**
    * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity object, the key is the unique identifier (string) for an activity and the value is the settings for the activity. An activity identifier can contain a maximum of 100 characters. The characters must be alphanumeric characters.
    */
  var Activities: js.UndefOr[MapOfActivity] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the journey was created.
    */
  var CreationDate: js.UndefOr[string] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the journey was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.undefined
  
  /**
    * The messaging and entry limits for the journey.
    */
  var Limits: js.UndefOr[JourneyLimits] = js.undefined
  
  /**
    * Specifies whether the journey's scheduled start and end times use each participant's local time. To base the schedule on each participant's local time, set this value to true.
    */
  var LocalTime: js.UndefOr[boolean] = js.undefined
  
  /**
    * The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain any spaces.
    */
  var Name: string
  
  /**
    * The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send messages to participants, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value. The current time in the participant's time zone is later than or equal to the time specified by the QuietTime.Start property for the journey. The current time in the participant's time zone is earlier than or equal to the time specified by the QuietTime.End property for the journey. If any of the preceding conditions isn't met, the participant will receive messages from the journey, even if quiet time is enabled.
    */
  var QuietTime: js.UndefOr[typings.awsSdk.pinpointMod.QuietTime] = js.undefined
  
  /**
    * The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration in ISO 8601 format.
    */
  var RefreshFrequency: js.UndefOr[string] = js.undefined
  
  /**
    * The schedule settings for the journey.
    */
  var Schedule: js.UndefOr[JourneySchedule] = js.undefined
  
  /**
    * The unique identifier for the first activity in the journey. The identifier for this activity can contain a maximum of 128 characters. The characters must be alphanumeric characters.
    */
  var StartActivity: js.UndefOr[string] = js.undefined
  
  /**
    * The segment that defines which users are participants in the journey.
    */
  var StartCondition: js.UndefOr[typings.awsSdk.pinpointMod.StartCondition] = js.undefined
  
  /**
    * The status of the journey. Valid values are: DRAFT - Saves the journey and doesn't publish it. ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or remove activities from it. The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey. To cancel a journey, use the Journey State resource.
    */
  var State: js.UndefOr[typings.awsSdk.pinpointMod.State] = js.undefined
}
object WriteJourneyRequest {
  
  @scala.inline
  def apply(Name: string): WriteJourneyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteJourneyRequest]
  }
  
  @scala.inline
  implicit class WriteJourneyRequestMutableBuilder[Self <: WriteJourneyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: MapOfActivity): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    @scala.inline
    def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLimits(value: JourneyLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
    
    @scala.inline
    def setLocalTime(value: boolean): Self = StObject.set(x, "LocalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalTimeUndefined: Self = StObject.set(x, "LocalTime", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuietTime(value: QuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    
    @scala.inline
    def setRefreshFrequency(value: string): Self = StObject.set(x, "RefreshFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshFrequencyUndefined: Self = StObject.set(x, "RefreshFrequency", js.undefined)
    
    @scala.inline
    def setSchedule(value: JourneySchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setStartActivity(value: string): Self = StObject.set(x, "StartActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartActivityUndefined: Self = StObject.set(x, "StartActivity", js.undefined)
    
    @scala.inline
    def setStartCondition(value: StartCondition): Self = StObject.set(x, "StartCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartConditionUndefined: Self = StObject.set(x, "StartCondition", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
