package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTracker extends js.Object {
  /**
    * The Amazon AWS account that owns the event tracker.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * The date and time (in Unix format) that the event tracker was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group that receives the event data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the event tracker.
    */
  var eventTrackerArn: js.UndefOr[Arn] = js.native
  /**
    * The date and time (in Unix time) that the event tracker was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * The name of the event tracker.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The status of the event tracker. An event tracker can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The ID of the event tracker. Include this ID in requests to the PutEvents API.
    */
  var trackingId: js.UndefOr[TrackingId] = js.native
}

object EventTracker {
  @scala.inline
  def apply(): EventTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTracker]
  }
  @scala.inline
  implicit class EventTrackerOps[Self <: EventTracker] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = this.set("datasetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetGroupArn: Self = this.set("datasetGroupArn", js.undefined)
    @scala.inline
    def setEventTrackerArn(value: Arn): Self = this.set("eventTrackerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTrackerArn: Self = this.set("eventTrackerArn", js.undefined)
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTrackingId(value: TrackingId): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingId: Self = this.set("trackingId", js.undefined)
  }
  
}

