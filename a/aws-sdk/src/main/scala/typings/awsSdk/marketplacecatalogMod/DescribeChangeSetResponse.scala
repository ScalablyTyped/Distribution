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
  def apply(): DescribeChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChangeSetResponse]
  }
  @scala.inline
  implicit class DescribeChangeSetResponseOps[Self <: DescribeChangeSetResponse] (val x: Self) extends AnyVal {
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
    def setChangeSetVarargs(value: ChangeSummary*): Self = this.set("ChangeSet", js.Array(value :_*))
    @scala.inline
    def setChangeSet(value: ChangeSetDescription): Self = this.set("ChangeSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSet: Self = this.set("ChangeSet", js.undefined)
    @scala.inline
    def setChangeSetArn(value: ARN): Self = this.set("ChangeSetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSetArn: Self = this.set("ChangeSetArn", js.undefined)
    @scala.inline
    def setChangeSetId(value: ResourceId): Self = this.set("ChangeSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSetId: Self = this.set("ChangeSetId", js.undefined)
    @scala.inline
    def setChangeSetName(value: ChangeSetName): Self = this.set("ChangeSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSetName: Self = this.set("ChangeSetName", js.undefined)
    @scala.inline
    def setEndTime(value: DateTimeISO8601): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setFailureDescription(value: StringValue): Self = this.set("FailureDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureDescription: Self = this.set("FailureDescription", js.undefined)
    @scala.inline
    def setStartTime(value: DateTimeISO8601): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: ChangeStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

