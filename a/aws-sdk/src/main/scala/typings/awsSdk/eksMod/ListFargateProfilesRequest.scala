package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFargateProfilesRequest extends js.Object {
  /**
    * The name of the Amazon EKS cluster that you would like to listFargate profiles in.
    */
  var clusterName: String = js.native
  /**
    * The maximum number of Fargate profile results returned by ListFargateProfiles in paginated output. When you use this parameter, ListFargateProfiles returns only maxResults results in a single page along with a nextToken response element. You can see the remaining results of the initial request by sending another ListFargateProfiles request with the returned nextToken value. This value can be between 1 and 100. If you don't use this parameter, ListFargateProfiles returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[FargateProfilesRequestMaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated ListFargateProfiles request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListFargateProfilesRequest {
  @scala.inline
  def apply(
    clusterName: String,
    maxResults: js.UndefOr[FargateProfilesRequestMaxResults] = js.undefined,
    nextToken: String = null
  ): ListFargateProfilesRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFargateProfilesRequest]
  }
}

