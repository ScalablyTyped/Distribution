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
  def apply(
    HITId: EntityId,
    AssignmentStatuses: AssignmentStatusList = null,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null
  ): ListAssignmentsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    if (AssignmentStatuses != null) __obj.updateDynamic("AssignmentStatuses")(AssignmentStatuses.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssignmentsForHITRequest]
  }
}

