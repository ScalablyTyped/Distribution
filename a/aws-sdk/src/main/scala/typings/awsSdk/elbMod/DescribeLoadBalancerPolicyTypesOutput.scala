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
  
  @scala.inline
  def apply(): DescribeLoadBalancerPolicyTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesOutput]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancerPolicyTypesOutputMutableBuilder[Self <: DescribeLoadBalancerPolicyTypesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyTypeDescriptions(value: PolicyTypeDescriptions): Self = StObject.set(x, "PolicyTypeDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeDescriptionsUndefined: Self = StObject.set(x, "PolicyTypeDescriptions", js.undefined)
    
    @scala.inline
    def setPolicyTypeDescriptionsVarargs(value: PolicyTypeDescription*): Self = StObject.set(x, "PolicyTypeDescriptions", js.Array(value :_*))
  }
}
