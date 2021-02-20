package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLoadBalancerListenerInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  
  /**
    * The client port numbers of the listeners.
    */
  var LoadBalancerPorts: Ports = js.native
}
object DeleteLoadBalancerListenerInput {
  
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, LoadBalancerPorts: Ports): DeleteLoadBalancerListenerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], LoadBalancerPorts = LoadBalancerPorts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerListenerInput]
  }
  
  @scala.inline
  implicit class DeleteLoadBalancerListenerInputMutableBuilder[Self <: DeleteLoadBalancerListenerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerPorts(value: Ports): Self = StObject.set(x, "LoadBalancerPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerPortsVarargs(value: AccessPointPort*): Self = StObject.set(x, "LoadBalancerPorts", js.Array(value :_*))
  }
}
