package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoadBalancerPoliciesOutput extends StObject {
  
  /**
    * Information about the policies.
    */
  var PolicyDescriptions: js.UndefOr[typings.awsSdk.elbMod.PolicyDescriptions] = js.native
}
object DescribeLoadBalancerPoliciesOutput {
  
  @scala.inline
  def apply(): DescribeLoadBalancerPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPoliciesOutput]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancerPoliciesOutputMutableBuilder[Self <: DescribeLoadBalancerPoliciesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyDescriptions(value: PolicyDescriptions): Self = StObject.set(x, "PolicyDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDescriptionsUndefined: Self = StObject.set(x, "PolicyDescriptions", js.undefined)
    
    @scala.inline
    def setPolicyDescriptionsVarargs(value: PolicyDescription*): Self = StObject.set(x, "PolicyDescriptions", js.Array(value :_*))
  }
}
