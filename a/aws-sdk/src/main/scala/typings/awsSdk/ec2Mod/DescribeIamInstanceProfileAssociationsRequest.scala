package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIamInstanceProfileAssociationsRequest extends js.Object {
  /**
    * The IAM instance profile associations.
    */
  var AssociationIds: js.UndefOr[AssociationIdList] = js.native
  /**
    * The filters.    instance-id - The ID of the instance.    state - The state of the association (associating | associated | disassociating).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[DescribeIamInstanceProfileAssociationsMaxResults] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeIamInstanceProfileAssociationsRequest {
  @scala.inline
  def apply(
    AssociationIds: AssociationIdList = null,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[DescribeIamInstanceProfileAssociationsMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeIamInstanceProfileAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    if (AssociationIds != null) __obj.updateDynamic("AssociationIds")(AssociationIds.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIamInstanceProfileAssociationsRequest]
  }
}

