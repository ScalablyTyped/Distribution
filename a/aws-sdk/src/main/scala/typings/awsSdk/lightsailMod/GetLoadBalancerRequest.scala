package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoadBalancerRequest extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var loadBalancerName: ResourceName
}
object GetLoadBalancerRequest {
  
  @scala.inline
  def apply(loadBalancerName: ResourceName): GetLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerRequest]
  }
  
  @scala.inline
  implicit class GetLoadBalancerRequestMutableBuilder[Self <: GetLoadBalancerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
