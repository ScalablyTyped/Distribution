package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetLoadBalancerPoliciesForBackendServerInput extends StObject {
  
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
  
  @scala.inline
  implicit class SetLoadBalancerPoliciesForBackendServerInputMutableBuilder[Self <: SetLoadBalancerPoliciesForBackendServerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstancePort(value: EndPointPort): Self = StObject.set(x, "InstancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNames(value: PolicyNames): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNamesVarargs(value: PolicyName*): Self = StObject.set(x, "PolicyNames", js.Array(value :_*))
  }
}
