package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClustersRequest extends js.Object {
  /**
    * One or more filters to limit the items returned in the response. Use the clusterIds filter to return only the specified clusters. Specify clusters by their cluster identifier (ID). Use the vpcIds filter to return only the clusters in the specified virtual private clouds (VPCs). Specify VPCs by their VPC identifier (ID). Use the states filter to return only clusters that match the specified state.
    */
  var Filters: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Filters] = js.native
  /**
    * The maximum number of clusters to return in the response. When there are more clusters than the number you specify, the response contains a NextToken value.
    */
  var MaxResults: js.UndefOr[MaxSize] = js.native
  /**
    * The NextToken value that you received in the previous response. Use this value to get more clusters.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.NextToken] = js.native
}

object DescribeClustersRequest {
  @scala.inline
  def apply(
    Filters: Filters = null,
    MaxResults: js.UndefOr[MaxSize] = js.undefined,
    NextToken: NextToken = null
  ): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClustersRequest]
  }
}

