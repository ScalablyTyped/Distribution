package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsInput extends js.Object {
  /**
    * The names of the load balancers.
    */
  var LoadBalancerNames: LoadBalancerNamesMax20 = js.native
}

object DescribeTagsInput {
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNamesMax20): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsInput]
  }
}

