package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancersInput extends StObject {
  
  /**
    * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
    */
  var LoadBalancerArns: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArns] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.undefined
  
  /**
    * The names of the load balancers.
    */
  var Names: js.UndefOr[LoadBalancerNames] = js.undefined
  
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.undefined
}
object DescribeLoadBalancersInput {
  
  @scala.inline
  def apply(): DescribeLoadBalancersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancersInput]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancersInputMutableBuilder[Self <: DescribeLoadBalancersInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerArns(value: LoadBalancerArns): Self = StObject.set(x, "LoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerArnsUndefined: Self = StObject.set(x, "LoadBalancerArns", js.undefined)
    
    @scala.inline
    def setLoadBalancerArnsVarargs(value: LoadBalancerArn*): Self = StObject.set(x, "LoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setNames(value: LoadBalancerNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: LoadBalancerName*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
