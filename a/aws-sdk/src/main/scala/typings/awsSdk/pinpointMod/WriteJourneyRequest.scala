package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteJourneyRequest extends js.Object {
  /**
    * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity object, the key is the unique identifier (string) for an activity and the value is the settings for the activity. An activity identifier can contain a maximum of 128 characters. The characters must be alphanumeric characters.
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
    * The unique identifier for the first activity in the journey. An activity identifier can contain a maximum of 128 characters. The characters must be alphanumeric characters.
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
  def apply(
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
    State: State = null
  ): WriteJourneyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[WriteJourneyRequest]
  }
}

