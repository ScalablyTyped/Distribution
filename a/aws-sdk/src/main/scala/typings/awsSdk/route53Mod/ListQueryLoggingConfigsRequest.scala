package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueryLoggingConfigsRequest extends js.Object {
  /**
    * (Optional) If you want to list the query logging configuration that is associated with a hosted zone, specify the ID in HostedZoneId.  If you don't specify a hosted zone ID, ListQueryLoggingConfigs returns all of the configurations that are associated with the current AWS account.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.native
  /**
    * (Optional) The maximum number of query logging configurations that you want Amazon Route 53 to return in response to the current request. If the current AWS account has more than MaxResults configurations, use the value of NextToken in the response to get the next page of results. If you don't specify a value for MaxResults, Route 53 returns up to 100 configurations.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53Mod.MaxResults] = js.native
  /**
    * (Optional) If the current AWS account has more than MaxResults query logging configurations, use NextToken to get the second and subsequent pages of results. For the first ListQueryLoggingConfigs request, omit this value. For the second and subsequent requests, get the value of NextToken from the previous response and specify that value for NextToken in the request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListQueryLoggingConfigsRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId = null, MaxResults: MaxResults = null, NextToken: PaginationToken = null): ListQueryLoggingConfigsRequest = {
    val __obj = js.Dynamic.literal()
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueryLoggingConfigsRequest]
  }
}

