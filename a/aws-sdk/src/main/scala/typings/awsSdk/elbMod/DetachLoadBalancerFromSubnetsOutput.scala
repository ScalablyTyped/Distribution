package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachLoadBalancerFromSubnetsOutput extends StObject {
  
  /**
    * The IDs of the remaining subnets for the load balancer.
    */
  var Subnets: js.UndefOr[typings.awsSdk.elbMod.Subnets] = js.undefined
}
object DetachLoadBalancerFromSubnetsOutput {
  
  inline def apply(): DetachLoadBalancerFromSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachLoadBalancerFromSubnetsOutput]
  }
  
  extension [Self <: DetachLoadBalancerFromSubnetsOutput](x: Self) {
    
    inline def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
