package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoadBalancerResult extends StObject {
  
  /**
    * An object containing information about your load balancer.
    */
  var loadBalancer: js.UndefOr[LoadBalancer] = js.undefined
}
object GetLoadBalancerResult {
  
  @scala.inline
  def apply(): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
  
  @scala.inline
  implicit class GetLoadBalancerResultMutableBuilder[Self <: GetLoadBalancerResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancer(value: LoadBalancer): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
  }
}
