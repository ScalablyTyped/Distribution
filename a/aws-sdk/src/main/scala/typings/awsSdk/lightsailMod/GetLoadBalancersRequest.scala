package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancersRequest extends js.Object {
  /**
    * A token used for paginating the results from your GetLoadBalancers request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetLoadBalancersRequest {
  @scala.inline
  def apply(pageToken: String = null): GetLoadBalancersRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancersRequest]
  }
}

