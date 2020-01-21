package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChangeSetResponse extends js.Object {
  /**
    * An array of ChangeSummary objects.
    */
  var ChangeSet: js.UndefOr[ChangeSetDescription] = js.native
  /**
    * The ARN associated with the unique identifier for the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  /**
    * Required. The unique identifier for the change set referenced in this request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
  /**
    * The optional name provided in the StartChangeSet request. If you do not provide a name, one is set by default.
    */
  var ChangeSetName: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeSetName] = js.native
  /**
    * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The change cannot transition to a different state. Null if the request is not in a terminal state. 
    */
  var EndTime: js.UndefOr[DateTimeISO8601] = js.native
  /**
    * Returned if there is a failure on the change set, but that failure is not related to any of the changes in the request.
    */
  var FailureDescription: js.UndefOr[StringValue] = js.native
  /**
    * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started. 
    */
  var StartTime: js.UndefOr[DateTimeISO8601] = js.native
  /**
    * The status of the change request.
    */
  var Status: js.UndefOr[ChangeStatus] = js.native
}

object DescribeChangeSetResponse {
  @scala.inline
  def apply(
    ChangeSet: ChangeSetDescription = null,
    ChangeSetArn: ARN = null,
    ChangeSetId: ResourceId = null,
    ChangeSetName: ChangeSetName = null,
    EndTime: DateTimeISO8601 = null,
    FailureDescription: StringValue = null,
    StartTime: DateTimeISO8601 = null,
    Status: ChangeStatus = null
  ): DescribeChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeSet != null) __obj.updateDynamic("ChangeSet")(ChangeSet.asInstanceOf[js.Any])
    if (ChangeSetArn != null) __obj.updateDynamic("ChangeSetArn")(ChangeSetArn.asInstanceOf[js.Any])
    if (ChangeSetId != null) __obj.updateDynamic("ChangeSetId")(ChangeSetId.asInstanceOf[js.Any])
    if (ChangeSetName != null) __obj.updateDynamic("ChangeSetName")(ChangeSetName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (FailureDescription != null) __obj.updateDynamic("FailureDescription")(FailureDescription.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChangeSetResponse]
  }
}

