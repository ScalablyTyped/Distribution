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
  def apply(AssociationId: AssociationId, ExecutionId: AssociationExecutionId): DescribeAssociationExecutionTargetsRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], ExecutionId = ExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssociationExecutionTargetsRequest]
  }
  @scala.inline
  implicit class DescribeAssociationExecutionTargetsRequestOps[Self <: DescribeAssociationExecutionTargetsRequest] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: AssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionId(value: AssociationExecutionId): Self = this.set("ExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: AssociationExecutionTargetsFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: AssociationExecutionTargetsFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

