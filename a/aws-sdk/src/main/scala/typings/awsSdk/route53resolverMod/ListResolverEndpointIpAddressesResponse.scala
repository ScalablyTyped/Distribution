package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolverEndpointIpAddressesResponse extends js.Object {
  /**
    * The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the way to Resolver (inbound endpoint).
    */
  var IpAddresses: js.UndefOr[IpAddressesResponse] = js.native
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53resolverMod.MaxResults] = js.native
  /**
    * If the specified endpoint has more than MaxResults IP addresses, you can submit another ListResolverEndpointIpAddresses request to get the next group of IP addresses. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.native
}

object ListResolverEndpointIpAddressesResponse {
  @scala.inline
  def apply(
    IpAddresses: IpAddressesResponse = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListResolverEndpointIpAddressesResponse = {
    val __obj = js.Dynamic.literal()
    if (IpAddresses != null) __obj.updateDynamic("IpAddresses")(IpAddresses.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResolverEndpointIpAddressesResponse]
  }
}

