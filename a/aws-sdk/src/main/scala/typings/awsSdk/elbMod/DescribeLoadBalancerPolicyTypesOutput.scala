package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerPolicyTypesOutput extends StObject {
  
  /**
    * Information about the policy types.
    */
  var PolicyTypeDescriptions: js.UndefOr[typings.awsSdk.elbMod.PolicyTypeDescriptions] = js.undefined
}
object DescribeLoadBalancerPolicyTypesOutput {
  
  inline def apply(): DescribeLoadBalancerPolicyTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesOutput]
  }
  
  extension [Self <: DescribeLoadBalancerPolicyTypesOutput](x: Self) {
    
    inline def setPolicyTypeDescriptions(value: PolicyTypeDescriptions): Self = StObject.set(x, "PolicyTypeDescriptions", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeDescriptionsUndefined: Self = StObject.set(x, "PolicyTypeDescriptions", js.undefined)
    
    inline def setPolicyTypeDescriptionsVarargs(value: PolicyTypeDescription*): Self = StObject.set(x, "PolicyTypeDescriptions", js.Array(value*))
  }
}
