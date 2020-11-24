package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoadBalancerPolicyTypesInput extends js.Object {
  
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
  implicit class DescribeLoadBalancerPolicyTypesInputOps[Self <: DescribeLoadBalancerPolicyTypesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPolicyTypeNamesVarargs(value: PolicyTypeName*): Self = this.set("PolicyTypeNames", js.Array(value :_*))
    
    @scala.inline
    def setPolicyTypeNames(value: PolicyTypeNames): Self = this.set("PolicyTypeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTypeNames: Self = this.set("PolicyTypeNames", js.undefined)
  }
}
