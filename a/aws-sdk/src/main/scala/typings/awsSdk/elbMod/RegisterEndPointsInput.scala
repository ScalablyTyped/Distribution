package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterEndPointsInput extends js.Object {
  /**
    * The IDs of the instances.
    */
  var Instances: typings.awsSdk.elbMod.Instances = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

object RegisterEndPointsInput {
  @scala.inline
  def apply(Instances: Instances, LoadBalancerName: AccessPointName): RegisterEndPointsInput = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegisterEndPointsInput]
  }
}

