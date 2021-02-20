package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachLoadBalancerFromSubnetsOutput extends StObject {
  
  /**
    * The IDs of the remaining subnets for the load balancer.
    */
  var Subnets: js.UndefOr[typings.awsSdk.elbMod.Subnets] = js.native
}
object DetachLoadBalancerFromSubnetsOutput {
  
  @scala.inline
  def apply(): DetachLoadBalancerFromSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachLoadBalancerFromSubnetsOutput]
  }
  
  @scala.inline
  implicit class DetachLoadBalancerFromSubnetsOutputMutableBuilder[Self <: DetachLoadBalancerFromSubnetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
  }
}
