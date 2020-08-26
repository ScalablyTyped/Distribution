package typings.awsSdkClientPinpointBrowser.typesActivityResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityResponse extends js.Object {
  /**
    * The ID of the application to which the campaign applies.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The ID of the campaign to which the activity applies.
    */
  var CampaignId: js.UndefOr[String] = js.native
  /**
    * The actual time the activity was marked CANCELLED or COMPLETED. Provided in ISO 8601 format.
    */
  var End: js.UndefOr[String] = js.native
  /**
    * The unique activity ID.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * Indicates whether the activity succeeded.
    *
    * Valid values: SUCCESS, FAIL
    */
  var Result: js.UndefOr[String] = js.native
  /**
    * The scheduled start time for the activity in ISO 8601 format.
    */
  var ScheduledStart: js.UndefOr[String] = js.native
  /**
    * The actual start time of the activity in ISO 8601 format.
    */
  var Start: js.UndefOr[String] = js.native
  /**
    * The state of the activity.
    *
    * Valid values: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, COMPLETED
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The total number of endpoints to which the campaign successfully delivered messages.
    */
  var SuccessfulEndpointCount: js.UndefOr[Double] = js.native
  /**
    * The total number of timezones completed.
    */
  var TimezonesCompletedCount: js.UndefOr[Double] = js.native
  /**
    * The total number of unique timezones present in the segment.
    */
  var TimezonesTotalCount: js.UndefOr[Double] = js.native
  /**
    * The total number of endpoints to which the campaign attempts to deliver messages.
    */
  var TotalEndpointCount: js.UndefOr[Double] = js.native
  /**
    * The ID of a variation of the campaign used for A/B testing.
    */
  var TreatmentId: js.UndefOr[String] = js.native
}

object ActivityResponse {
  @scala.inline
  def apply(): ActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityResponse]
  }
  @scala.inline
  implicit class ActivityResponseOps[Self <: ActivityResponse] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setCampaignId(value: String): Self = this.set("CampaignId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignId: Self = this.set("CampaignId", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setResult(value: String): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
    @scala.inline
    def setScheduledStart(value: String): Self = this.set("ScheduledStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledStart: Self = this.set("ScheduledStart", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setSuccessfulEndpointCount(value: Double): Self = this.set("SuccessfulEndpointCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessfulEndpointCount: Self = this.set("SuccessfulEndpointCount", js.undefined)
    @scala.inline
    def setTimezonesCompletedCount(value: Double): Self = this.set("TimezonesCompletedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezonesCompletedCount: Self = this.set("TimezonesCompletedCount", js.undefined)
    @scala.inline
    def setTimezonesTotalCount(value: Double): Self = this.set("TimezonesTotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezonesTotalCount: Self = this.set("TimezonesTotalCount", js.undefined)
    @scala.inline
    def setTotalEndpointCount(value: Double): Self = this.set("TotalEndpointCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalEndpointCount: Self = this.set("TotalEndpointCount", js.undefined)
    @scala.inline
    def setTreatmentId(value: String): Self = this.set("TreatmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatmentId: Self = this.set("TreatmentId", js.undefined)
  }
  
}

