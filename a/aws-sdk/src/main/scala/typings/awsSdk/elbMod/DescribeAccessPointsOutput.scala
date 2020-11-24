package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccessPointsOutput extends js.Object {
  
  /**
    * Information about the load balancers.
    */
  var LoadBalancerDescriptions: js.UndefOr[typings.awsSdk.elbMod.LoadBalancerDescriptions] = js.native
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}
object DescribeAccessPointsOutput {
  
  @scala.inline
  def apply(): DescribeAccessPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsOutput]
  }
  
  @scala.inline
  implicit class DescribeAccessPointsOutputOps[Self <: DescribeAccessPointsOutput] (val x: Self) extends AnyVal {
    
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
    def setLoadBalancerDescriptionsVarargs(value: LoadBalancerDescription*): Self = this.set("LoadBalancerDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerDescriptions(value: LoadBalancerDescriptions): Self = this.set("LoadBalancerDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerDescriptions: Self = this.set("LoadBalancerDescriptions", js.undefined)
    
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
