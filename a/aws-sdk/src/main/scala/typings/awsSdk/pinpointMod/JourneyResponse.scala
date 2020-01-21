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
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the journey. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object JourneyResponse {
  @scala.inline
  def apply(
    ApplicationId: string,
    Id: string,
    Name: string,
    Activities: MapOfActivity = null,
    CreationDate: string = null,
    LastModifiedDate: string = null,
    Limits: JourneyLimits = null,
    LocalTime: js.UndefOr[Boolean] = js.undefined,
    QuietTime: QuietTime = null,
    RefreshFrequency: string = null,
    Schedule: JourneySchedule = null,
    StartActivity: string = null,
    StartCondition: StartCondition = null,
    State: State = null,
    tags: MapOfString = null
  ): JourneyResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Activities != null) __obj.updateDynamic("Activities")(Activities.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (!js.isUndefined(LocalTime)) __obj.updateDynamic("LocalTime")(LocalTime.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    if (RefreshFrequency != null) __obj.updateDynamic("RefreshFrequency")(RefreshFrequency.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (StartActivity != null) __obj.updateDynamic("StartActivity")(StartActivity.asInstanceOf[js.Any])
    if (StartCondition != null) __obj.updateDynamic("StartCondition")(StartCondition.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyResponse]
  }
}

