package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTagsInput extends js.Object {
  
  /**
    * The names of the load balancers.
    */
  var LoadBalancerNames: LoadBalancerNamesMax20 = js.native
}
object DescribeTagsInput {
  
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNamesMax20): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsInput]
  }
  
  @scala.inline
  implicit class DescribeTagsInputOps[Self <: DescribeTagsInput] (val x: Self) extends AnyVal {
    
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
    def setLoadBalancerNamesVarargs(value: AccessPointName*): Self = this.set("LoadBalancerNames", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerNames(value: LoadBalancerNamesMax20): Self = this.set("LoadBalancerNames", value.asInstanceOf[js.Any])
  }
}
