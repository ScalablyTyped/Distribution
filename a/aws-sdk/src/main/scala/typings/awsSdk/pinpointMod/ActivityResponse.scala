package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityResponse extends js.Object {
  /**
    * The unique identifier for the application that the campaign applies to.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the campaign that the activity applies to.
    */
  var CampaignId: string = js.native
  /**
    * The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
    */
  var End: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the activity.
    */
  var Id: string = js.native
  /**
    * Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
    */
  var Result: js.UndefOr[string] = js.native
  /**
    * The scheduled start time, in ISO 8601 format, for the activity.
    */
  var ScheduledStart: js.UndefOr[string] = js.native
  /**
    * The actual start time, in ISO 8601 format, of the activity.
    */
  var Start: js.UndefOr[string] = js.native
  /**
    * The current status of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, and COMPLETED.
    */
  var State: js.UndefOr[string] = js.native
  /**
    * The total number of endpoints that the campaign successfully delivered messages to.
    */
  var SuccessfulEndpointCount: js.UndefOr[integer] = js.native
  /**
    * The total number of time zones that were completed.
    */
  var TimezonesCompletedCount: js.UndefOr[integer] = js.native
  /**
    * The total number of unique time zones that are in the segment for the campaign.
    */
  var TimezonesTotalCount: js.UndefOr[integer] = js.native
  /**
    * The total number of endpoints that the campaign attempted to deliver messages to.
    */
  var TotalEndpointCount: js.UndefOr[integer] = js.native
  /**
    * The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  var TreatmentId: js.UndefOr[string] = js.native
}

object ActivityResponse {
  @scala.inline
  def apply(
    ApplicationId: string,
    CampaignId: string,
    Id: string,
    End: string = null,
    Result: string = null,
    ScheduledStart: string = null,
    Start: string = null,
    State: string = null,
    SuccessfulEndpointCount: js.UndefOr[integer] = js.undefined,
    TimezonesCompletedCount: js.UndefOr[integer] = js.undefined,
    TimezonesTotalCount: js.UndefOr[integer] = js.undefined,
    TotalEndpointCount: js.UndefOr[integer] = js.undefined,
    TreatmentId: string = null
  ): ActivityResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Result != null) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    if (ScheduledStart != null) __obj.updateDynamic("ScheduledStart")(ScheduledStart.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (!js.isUndefined(SuccessfulEndpointCount)) __obj.updateDynamic("SuccessfulEndpointCount")(SuccessfulEndpointCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TimezonesCompletedCount)) __obj.updateDynamic("TimezonesCompletedCount")(TimezonesCompletedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TimezonesTotalCount)) __obj.updateDynamic("TimezonesTotalCount")(TimezonesTotalCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalEndpointCount)) __obj.updateDynamic("TotalEndpointCount")(TotalEndpointCount.get.asInstanceOf[js.Any])
    if (TreatmentId != null) __obj.updateDynamic("TreatmentId")(TreatmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityResponse]
  }
}

