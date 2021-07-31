package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLoadBalancerRequest extends StObject {
  
  /**
    * The name of the load balancer you want to delete.
    */
  var loadBalancerName: ResourceName
}
object DeleteLoadBalancerRequest {
  
  @scala.inline
  def apply(loadBalancerName: ResourceName): DeleteLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerRequest]
  }
  
  @scala.inline
  implicit class DeleteLoadBalancerRequestMutableBuilder[Self <: DeleteLoadBalancerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
