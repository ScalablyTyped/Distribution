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
  def apply(
    accountId: AccountId = null,
    creationDateTime: Date = null,
    datasetGroupArn: Arn = null,
    eventTrackerArn: Arn = null,
    lastUpdatedDateTime: Date = null,
    name: Name = null,
    status: Status = null,
    trackingId: TrackingId = null
  ): EventTracker = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn.asInstanceOf[js.Any])
    if (eventTrackerArn != null) __obj.updateDynamic("eventTrackerArn")(eventTrackerArn.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTracker]
  }
}

