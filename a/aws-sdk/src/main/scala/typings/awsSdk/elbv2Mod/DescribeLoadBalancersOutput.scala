package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoadBalancersOutput extends js.Object {
  
  /**
    * Information about the load balancers.
    */
  var LoadBalancers: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancers] = js.native
  
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}
object DescribeLoadBalancersOutput {
  
  @scala.inline
  def apply(): DescribeLoadBalancersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancersOutput]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancersOutputOps[Self <: DescribeLoadBalancersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadBalancersVarargs(value: LoadBalancer*): Self = this.set("LoadBalancers", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancers(value: LoadBalancers): Self = this.set("LoadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancers: Self = this.set("LoadBalancers", js.undefined)
    
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
