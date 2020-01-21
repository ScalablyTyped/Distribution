package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLoadBalancerPoliciesForBackendServerInput extends js.Object {
  /**
    * The port number associated with the EC2 instance.
    */
  var InstancePort: EndPointPort = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The names of the policies. If the list is empty, then all current polices are removed from the EC2 instance.
    */
  var PolicyNames: typings.awsSdk.elbMod.PolicyNames = js.native
}

object SetLoadBalancerPoliciesForBackendServerInput {
  @scala.inline
  def apply(InstancePort: EndPointPort, LoadBalancerName: AccessPointName, PolicyNames: PolicyNames): SetLoadBalancerPoliciesForBackendServerInput = {
    val __obj = js.Dynamic.literal(InstancePort = InstancePort.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyNames = PolicyNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetLoadBalancerPoliciesForBackendServerInput]
  }
}

