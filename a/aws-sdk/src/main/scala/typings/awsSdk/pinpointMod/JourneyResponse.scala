package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyResponse extends StObject {
  
  /**
    * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
    */
  var Activities: js.UndefOr[MapOfActivity] = js.undefined
  
  /**
    * The unique identifier for the application that the journey applies to.
    */
  var ApplicationId: string
  
  /**
    * The date, in ISO 8601 format, when the journey was created.
    */
  var CreationDate: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the journey.
    */
  var Id: string
  
  /**
    * The date, in ISO 8601 format, when the journey was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.undefined
  
  /**
    * The messaging and entry limits for the journey.
    */
  var Limits: js.UndefOr[JourneyLimits] = js.undefined
  
  /**
    * Specifies whether the journey's scheduled start and end times use each participant's local time. If this value is true, the schedule uses each participant's local time.
    */
  var LocalTime: js.UndefOr[boolean] = js.undefined
  
  /**
    * The name of the journey.
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
    * The unique identifier for the first activity in the journey.
    */
  var StartActivity: js.UndefOr[string] = js.undefined
  
  /**
    * The segment that defines which users are participants in the journey.
    */
  var StartCondition: js.UndefOr[typings.awsSdk.pinpointMod.StartCondition] = js.undefined
  
  /**
    * The current status of the journey. Possible values are: DRAFT - The journey is being developed and hasn't been published yet. ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey may currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE, you can't add, change, or remove activities from it. COMPLETED - The journey has been published and has finished running. All participants have entered the journey and no participants are waiting to complete the journey or any activities in the journey. CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or remove activities or segment settings from the journey. CLOSED - The journey has been published and has started running. It may have also passed its scheduled end time, or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a journey's status is CLOSED, you can't add participants to it, and no existing participants can enter the journey for the first time. However, any existing participants who are currently waiting to start an activity may continue the journey.
    */
  var State: js.UndefOr[typings.awsSdk.pinpointMod.State] = js.undefined
  
  /**
    * This object is not used or supported.
    */
  var tags: js.UndefOr[MapOfString] = js.undefined
}
object JourneyResponse {
  
  inline def apply(ApplicationId: string, Id: string, Name: string): JourneyResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyResponse]
  }
  
  extension [Self <: JourneyResponse](x: Self) {
    
    inline def setActivities(value: MapOfActivity): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setLimits(value: JourneyLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
    
    inline def setLocalTime(value: boolean): Self = StObject.set(x, "LocalTime", value.asInstanceOf[js.Any])
    
    inline def setLocalTimeUndefined: Self = StObject.set(x, "LocalTime", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuietTime(value: QuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
    
    inline def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    
    inline def setRefreshFrequency(value: string): Self = StObject.set(x, "RefreshFrequency", value.asInstanceOf[js.Any])
    
    inline def setRefreshFrequencyUndefined: Self = StObject.set(x, "RefreshFrequency", js.undefined)
    
    inline def setSchedule(value: JourneySchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setStartActivity(value: string): Self = StObject.set(x, "StartActivity", value.asInstanceOf[js.Any])
    
    inline def setStartActivityUndefined: Self = StObject.set(x, "StartActivity", js.undefined)
    
    inline def setStartCondition(value: StartCondition): Self = StObject.set(x, "StartCondition", value.asInstanceOf[js.Any])
    
    inline def setStartConditionUndefined: Self = StObject.set(x, "StartCondition", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: MapOfString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
