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
  def apply(ApplicationId: string, CampaignId: string, Id: string): ActivityResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCampaignId(value: string): Self = this.set("CampaignId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: string): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    @scala.inline
    def setResult(value: string): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
    @scala.inline
    def setScheduledStart(value: string): Self = this.set("ScheduledStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledStart: Self = this.set("ScheduledStart", js.undefined)
    @scala.inline
    def setStart(value: string): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
    @scala.inline
    def setState(value: string): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setSuccessfulEndpointCount(value: integer): Self = this.set("SuccessfulEndpointCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessfulEndpointCount: Self = this.set("SuccessfulEndpointCount", js.undefined)
    @scala.inline
    def setTimezonesCompletedCount(value: integer): Self = this.set("TimezonesCompletedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezonesCompletedCount: Self = this.set("TimezonesCompletedCount", js.undefined)
    @scala.inline
    def setTimezonesTotalCount(value: integer): Self = this.set("TimezonesTotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezonesTotalCount: Self = this.set("TimezonesTotalCount", js.undefined)
    @scala.inline
    def setTotalEndpointCount(value: integer): Self = this.set("TotalEndpointCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalEndpointCount: Self = this.set("TotalEndpointCount", js.undefined)
    @scala.inline
    def setTreatmentId(value: string): Self = this.set("TreatmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatmentId: Self = this.set("TreatmentId", js.undefined)
  }
  
}

