package typings.awsSdkClientPinpointBrowser.typesActivityResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityResponse extends js.Object {
  /**
    * The ID of the application to which the campaign applies.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the campaign to which the activity applies.
    */
  var CampaignId: js.UndefOr[String] = js.undefined
  /**
    * The actual time the activity was marked CANCELLED or COMPLETED. Provided in ISO 8601 format.
    */
  var End: js.UndefOr[String] = js.undefined
  /**
    * The unique activity ID.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the activity succeeded.
    *
    * Valid values: SUCCESS, FAIL
    */
  var Result: js.UndefOr[String] = js.undefined
  /**
    * The scheduled start time for the activity in ISO 8601 format.
    */
  var ScheduledStart: js.UndefOr[String] = js.undefined
  /**
    * The actual start time of the activity in ISO 8601 format.
    */
  var Start: js.UndefOr[String] = js.undefined
  /**
    * The state of the activity.
    *
    * Valid values: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, COMPLETED
    */
  var State: js.UndefOr[String] = js.undefined
  /**
    * The total number of endpoints to which the campaign successfully delivered messages.
    */
  var SuccessfulEndpointCount: js.UndefOr[Double] = js.undefined
  /**
    * The total number of timezones completed.
    */
  var TimezonesCompletedCount: js.UndefOr[Double] = js.undefined
  /**
    * The total number of unique timezones present in the segment.
    */
  var TimezonesTotalCount: js.UndefOr[Double] = js.undefined
  /**
    * The total number of endpoints to which the campaign attempts to deliver messages.
    */
  var TotalEndpointCount: js.UndefOr[Double] = js.undefined
  /**
    * The ID of a variation of the campaign used for A/B testing.
    */
  var TreatmentId: js.UndefOr[String] = js.undefined
}

object ActivityResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CampaignId: String = null,
    End: String = null,
    Id: String = null,
    Result: String = null,
    ScheduledStart: String = null,
    Start: String = null,
    State: String = null,
    SuccessfulEndpointCount: js.UndefOr[Double] = js.undefined,
    TimezonesCompletedCount: js.UndefOr[Double] = js.undefined,
    TimezonesTotalCount: js.UndefOr[Double] = js.undefined,
    TotalEndpointCount: js.UndefOr[Double] = js.undefined,
    TreatmentId: String = null
  ): ActivityResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CampaignId != null) __obj.updateDynamic("CampaignId")(CampaignId.asInstanceOf[js.Any])
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
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

