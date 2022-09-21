package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerPoliciesOutput extends StObject {
  
  /**
    * Information about the policies.
    */
  var PolicyDescriptions: js.UndefOr[typings.awsSdk.elbMod.PolicyDescriptions] = js.undefined
}
object DescribeLoadBalancerPoliciesOutput {
  
  inline def apply(): DescribeLoadBalancerPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPoliciesOutput]
  }
  
  extension [Self <: DescribeLoadBalancerPoliciesOutput](x: Self) {
    
    inline def setPolicyDescriptions(value: PolicyDescriptions): Self = StObject.set(x, "PolicyDescriptions", value.asInstanceOf[js.Any])
    
    inline def setPolicyDescriptionsUndefined: Self = StObject.set(x, "PolicyDescriptions", js.undefined)
    
    inline def setPolicyDescriptionsVarargs(value: PolicyDescription*): Self = StObject.set(x, "PolicyDescriptions", js.Array(value*))
  }
}
