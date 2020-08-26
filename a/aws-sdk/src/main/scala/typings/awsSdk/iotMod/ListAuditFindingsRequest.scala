package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditFindingsRequest extends js.Object {
  /**
    * A filter to limit results to the findings for the specified audit check.
    */
  var checkName: js.UndefOr[AuditCheckName] = js.native
  /**
    * A filter to limit results to those found before the specified time. You must specify either the startTime and endTime or the taskId, but not both.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Information identifying the noncompliant resource.
    */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.native
  /**
    * A filter to limit results to those found after the specified time. You must specify either the startTime and endTime or the taskId, but not both.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    * A filter to limit results to the audit with the specified ID. You must specify either the taskId or the startTime and endTime, but not both.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.native
}

object ListAuditFindingsRequest {
  @scala.inline
  def apply(): ListAuditFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditFindingsRequest]
  }
  @scala.inline
  implicit class ListAuditFindingsRequestOps[Self <: ListAuditFindingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckName(value: AuditCheckName): Self = this.set("checkName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckName: Self = this.set("checkName", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = this.set("resourceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdentifier: Self = this.set("resourceIdentifier", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setTaskId(value: AuditTaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
  }
  
}

