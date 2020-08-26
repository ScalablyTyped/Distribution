package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyResponse extends js.Object {
  /**
    * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
    */
  var Activities: js.UndefOr[MapOfActivity] = js.native
  /**
    * The unique identifier for the application that the journey applies to.
    */
  var ApplicationId: string = js.native
  /**
    * The date, in ISO 8601 format, when the journey was created.
    */
  var CreationDate: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the journey.
    */
  var Id: string = js.native
  /**
    * The date, in ISO 8601 format, when the journey was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The messaging and entry limits for the journey.
    */
  var Limits: js.UndefOr[JourneyLimits] = js.native
  /**
    * Specifies whether the journey's scheduled start and end times use each participant's local time. If this value is true, the schedule uses each participant's local time.
    */
  var LocalTime: js.UndefOr[boolean] = js.native
  /**
    * The name of the journey.
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
    * The unique identifier for the first activity in the journey.
    */
  var StartActivity: js.UndefOr[string] = js.native
  /**
    * The segment that defines which users are participants in the journey.
    */
  var StartCondition: js.UndefOr[typings.awsSdk.pinpointMod.StartCondition] = js.native
  /**
    * The current status of the journey. Possible values are: DRAFT - The journey is being developed and hasn't been published yet. ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey may currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE, you can't add, change, or remove activities from it. COMPLETED - The journey has been published and has finished running. All participants have entered the journey and no participants are waiting to complete the journey or any activities in the journey. CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or remove activities or segment settings from the journey. CLOSED - The journey has been published and has started running. It may have also passed its scheduled end time, or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a journey's status is CLOSED, you can't add participants to it, and no existing participants can enter the journey for the first time. However, any existing participants who are currently waiting to start an activity may continue the journey.
    */
  var State: js.UndefOr[typings.awsSdk.pinpointMod.State] = js.native
  /**
    * This object is not used or supported.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object JourneyResponse {
  @scala.inline
  def apply(ApplicationId: string, Id: string, Name: string): JourneyResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyResponse]
  }
  @scala.inline
  implicit class JourneyResponseOps[Self <: JourneyResponse] (val x: Self) extends AnyVal {
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setTags(value: MapOfString): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

