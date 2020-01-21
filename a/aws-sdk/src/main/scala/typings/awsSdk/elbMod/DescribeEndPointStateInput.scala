package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndPointStateInput extends js.Object {
  /**
    * The IDs of the instances.
    */
  var Instances: js.UndefOr[typings.awsSdk.elbMod.Instances] = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

object DescribeEndPointStateInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, Instances: Instances = null): DescribeEndPointStateInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndPointStateInput]
  }
}

