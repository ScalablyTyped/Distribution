package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolverEndpointsResponse extends js.Object {
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53resolverMod.MaxResults] = js.native
  /**
    * If more than MaxResults IP addresses match the specified criteria, you can submit another ListResolverEndpoint request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.native
  /**
    * The resolver endpoints that were created by using the current AWS account, and that match the specified filters, if any.
    */
  var ResolverEndpoints: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverEndpoints] = js.native
}

object ListResolverEndpointsResponse {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ResolverEndpoints: ResolverEndpoints = null
  ): ListResolverEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResolverEndpoints != null) __obj.updateDynamic("ResolverEndpoints")(ResolverEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResolverEndpointsResponse]
  }
}

