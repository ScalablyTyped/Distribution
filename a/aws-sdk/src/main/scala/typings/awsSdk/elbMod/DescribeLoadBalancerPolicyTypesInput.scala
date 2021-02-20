package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoadBalancerPolicyTypesInput extends StObject {
  
  /**
    * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load Balancing.
    */
  var PolicyTypeNames: js.UndefOr[typings.awsSdk.elbMod.PolicyTypeNames] = js.native
}
object DescribeLoadBalancerPolicyTypesInput {
  
  @scala.inline
  def apply(): DescribeLoadBalancerPolicyTypesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesInput]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancerPolicyTypesInputMutableBuilder[Self <: DescribeLoadBalancerPolicyTypesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyTypeNames(value: PolicyTypeNames): Self = StObject.set(x, "PolicyTypeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeNamesUndefined: Self = StObject.set(x, "PolicyTypeNames", js.undefined)
    
    @scala.inline
    def setPolicyTypeNamesVarargs(value: PolicyTypeName*): Self = StObject.set(x, "PolicyTypeNames", js.Array(value :_*))
  }
}
