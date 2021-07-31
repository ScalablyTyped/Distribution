package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachLoadBalancerToSubnetsOutput extends StObject {
  
  /**
    * The IDs of the subnets attached to the load balancer.
    */
  var Subnets: js.UndefOr[typings.awsSdk.elbMod.Subnets] = js.undefined
}
object AttachLoadBalancerToSubnetsOutput {
  
  @scala.inline
  def apply(): AttachLoadBalancerToSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachLoadBalancerToSubnetsOutput]
  }
  
  @scala.inline
  implicit class AttachLoadBalancerToSubnetsOutputMutableBuilder[Self <: AttachLoadBalancerToSubnetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
  }
}
