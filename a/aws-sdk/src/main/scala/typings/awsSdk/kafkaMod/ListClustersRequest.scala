package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClustersRequest extends js.Object {
  /**
    * 
    Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters whose names start with this prefix.
    
    */
  var ClusterNameFilter: js.UndefOr[string] = js.native
  /**
    * 
    The maximum number of results to return in the response. If there are more results, the response includes a NextToken parameter.
    
    */
  var MaxResults: js.UndefOr[typings.awsSdk.kafkaMod.MaxResults] = js.native
  /**
    * 
    The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the response. 
    To get the next batch, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListClustersRequest {
  @scala.inline
  def apply(
    ClusterNameFilter: string = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: string = null
  ): ListClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (ClusterNameFilter != null) __obj.updateDynamic("ClusterNameFilter")(ClusterNameFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClustersRequest]
  }
}

