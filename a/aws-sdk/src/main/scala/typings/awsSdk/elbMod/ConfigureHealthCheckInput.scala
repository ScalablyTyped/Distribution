package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureHealthCheckInput extends js.Object {
  /**
    * The configuration information.
    */
  var HealthCheck: typings.awsSdk.elbMod.HealthCheck = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

object ConfigureHealthCheckInput {
  @scala.inline
  def apply(HealthCheck: HealthCheck, LoadBalancerName: AccessPointName): ConfigureHealthCheckInput = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureHealthCheckInput]
  }
}

