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
    * A token used for advancing to the next page of results from your GetLoadBalancers request.
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

