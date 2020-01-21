package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssociationExecutionTargetsRequest extends js.Object {
  /**
    * The association ID that includes the execution for which you want to view details.
    */
  var AssociationId: typings.awsSdk.ssmMod.AssociationId = js.native
  /**
    * The execution ID for which you want to view details.
    */
  var ExecutionId: AssociationExecutionId = js.native
  /**
    * Filters for the request. You can specify the following filters and values. Status (EQUAL) ResourceId (EQUAL) ResourceType (EQUAL)
    */
  var Filters: js.UndefOr[AssociationExecutionTargetsFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeAssociationExecutionTargetsRequest {
  @scala.inline
  def apply(
    AssociationId: AssociationId,
    ExecutionId: AssociationExecutionId,
    Filters: AssociationExecutionTargetsFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeAssociationExecutionTargetsRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], ExecutionId = ExecutionId.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssociationExecutionTargetsRequest]
  }
}

