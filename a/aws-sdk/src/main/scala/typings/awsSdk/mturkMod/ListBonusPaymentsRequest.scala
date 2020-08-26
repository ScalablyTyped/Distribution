package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBonusPaymentsRequest extends js.Object {
  /**
    * The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments for the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be specified
    */
  var AssignmentId: js.UndefOr[EntityId] = js.native
  /**
    * The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for all assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter must be specified
    */
  var HITId: js.UndefOr[EntityId] = js.native
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListBonusPaymentsRequest {
  @scala.inline
  def apply(): ListBonusPaymentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBonusPaymentsRequest]
  }
  @scala.inline
  implicit class ListBonusPaymentsRequestOps[Self <: ListBonusPaymentsRequest] (val x: Self) extends AnyVal {
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
    def setAssignmentId(value: EntityId): Self = this.set("AssignmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentId: Self = this.set("AssignmentId", js.undefined)
    @scala.inline
    def setHITId(value: EntityId): Self = this.set("HITId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHITId: Self = this.set("HITId", js.undefined)
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

