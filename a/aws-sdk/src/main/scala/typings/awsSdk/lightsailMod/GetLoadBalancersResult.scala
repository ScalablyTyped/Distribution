package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancersResult extends js.Object {
  /**
    * An array of LoadBalancer objects describing your load balancers.
    */
  var loadBalancers: js.UndefOr[LoadBalancerList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetLoadBalancers request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetLoadBalancersResult {
  @scala.inline
  def apply(loadBalancers: LoadBalancerList = null, nextPageToken: String = null): GetLoadBalancersResult = {
    val __obj = js.Dynamic.literal()
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancersResult]
  }
}

