package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteJourneyRequest extends js.Object {
  
  /**
    * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity object, the key is the unique identifier (string) for an activity and the value is the settings for the activity. An activity identifier can contain a maximum of 100 characters. The characters must be alphanumeric characters.
    */
  var Activities: js.UndefOr[MapOfActivity] = js.native
  
  /**
    * The date, in ISO 8601 format, when the journey was created.
    */
  var CreationDate: js.UndefOr[string] = js.native
  
  /**
    * The date, in ISO 8601 format, when the journey was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  
  /**
    * The messaging and entry limits for the journey.
    */
  var Limits: js.UndefOr[JourneyLimits] = js.native
  
  /**
    * Specifies whether the journey's scheduled start and end times use each participant's local time. To base the schedule on each participant's local time, set this value to true.
    */
  var LocalTime: js.UndefOr[boolean] = js.native
  
  /**
    * The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain any spaces.
    */
  var Name: string = js.native
  
  /**
    * The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send messages to participants, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value. The current time in the participant's time zone is later than or equal to the time specified by the QuietTime.Start property for the journey. The current time in the participant's time zone is earlier than or equal to the time specified by the QuietTime.End property for the journey. If any of the preceding conditions isn't met, the participant will receive messages from the journey, even if quiet time is enabled.
    */
  var QuietTime: js.UndefOr[typings.awsSdk.pinpointMod.QuietTime] = js.native
  
  /**
    * The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration in ISO 8601 format.
    */
  var RefreshFrequency: js.UndefOr[string] = js.native
  
  /**
    * The schedule settings for the journey.
    */
  var Schedule: js.UndefOr[JourneySchedule] = js.native
  
  /**
    * The unique identifier for the first activity in the journey. The identifier for this activity can contain a maximum of 128 characters. The characters must be alphanumeric characters.
    */
  var StartActivity: js.UndefOr[string] = js.native
  
  /**
    * The segment that defines which users are participants in the journey.
    */
  var StartCondition: js.UndefOr[typings.awsSdk.pinpointMod.StartCondition] = js.native
  
  /**
    * The status of the journey. Valid values are: DRAFT - Saves the journey and doesn't publish it. ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or remove activities from it. The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey. To cancel a journey, use the Journey State resource.
    */
  var State: js.UndefOr[typings.awsSdk.pinpointMod.State] = js.native
}
object WriteJourneyRequest {
  
  @scala.inline
  def apply(Name: string): WriteJourneyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteJourneyRequest]
  }
  
  @scala.inline
  implicit class WriteJourneyRequestOps[Self <: WriteJourneyRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivities(value: MapOfActivity): Self = this.set("Activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivities: Self = this.set("Activities", js.undefined)
    
    @scala.inline
    def setCreationDate(value: string): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: string): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLimits(value: JourneyLimits): Self = this.set("Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("Limits", js.undefined)
    
    @scala.inline
    def setLocalTime(value: boolean): Self = this.set("LocalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalTime: Self = this.set("LocalTime", js.undefined)
    
    @scala.inline
    def setQuietTime(value: QuietTime): Self = this.set("QuietTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuietTime: Self = this.set("QuietTime", js.undefined)
    
    @scala.inline
    def setRefreshFrequency(value: string): Self = this.set("RefreshFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshFrequency: Self = this.set("RefreshFrequency", js.undefined)
    
    @scala.inline
    def setSchedule(value: JourneySchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    
    @scala.inline
    def setStartActivity(value: string): Self = this.set("StartActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartActivity: Self = this.set("StartActivity", js.undefined)
    
    @scala.inline
    def setStartCondition(value: StartCondition): Self = this.set("StartCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartCondition: Self = this.set("StartCondition", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
