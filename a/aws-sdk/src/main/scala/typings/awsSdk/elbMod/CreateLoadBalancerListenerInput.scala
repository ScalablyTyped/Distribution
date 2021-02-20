package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLoadBalancerListenerInput extends StObject {
  
  /**
    * The listeners.
    */
  var Listeners: typings.awsSdk.elbMod.Listeners = js.native
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}
object CreateLoadBalancerListenerInput {
  
  @scala.inline
  def apply(Listeners: Listeners, LoadBalancerName: AccessPointName): CreateLoadBalancerListenerInput = {
    val __obj = js.Dynamic.literal(Listeners = Listeners.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerListenerInput]
  }
  
  @scala.inline
  implicit class CreateLoadBalancerListenerInputMutableBuilder[Self <: CreateLoadBalancerListenerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListeners(value: Listeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
