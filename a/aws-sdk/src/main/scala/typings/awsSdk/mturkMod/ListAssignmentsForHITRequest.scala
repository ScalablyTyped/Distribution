package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssignmentsForHITRequest extends js.Object {
  /**
    * The status of the assignments to return: Submitted | Approved | Rejected
    */
  var AssignmentStatuses: js.UndefOr[AssignmentStatusList] = js.native
  /**
    * The ID of the HIT.
    */
  var HITId: EntityId = js.native
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListAssignmentsForHITRequest {
  @scala.inline
  def apply(HITId: EntityId): ListAssignmentsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssignmentsForHITRequest]
  }
  @scala.inline
  implicit class ListAssignmentsForHITRequestOps[Self <: ListAssignmentsForHITRequest] (val x: Self) extends AnyVal {
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
    def setHITId(value: EntityId): Self = this.set("HITId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignmentStatusesVarargs(value: AssignmentStatus*): Self = this.set("AssignmentStatuses", js.Array(value :_*))
    @scala.inline
    def setAssignmentStatuses(value: AssignmentStatusList): Self = this.set("AssignmentStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentStatuses: Self = this.set("AssignmentStatuses", js.undefined)
    @scala.inline
    def setMaxResults(value: ResultSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

