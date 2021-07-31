package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTargetGroupsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArn] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.undefined
  
  /**
    * The names of the target groups.
    */
  var Names: js.UndefOr[TargetGroupNames] = js.undefined
  
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the target groups.
    */
  var TargetGroupArns: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroupArns] = js.undefined
}
object DescribeTargetGroupsInput {
  
  @scala.inline
  def apply(): DescribeTargetGroupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTargetGroupsInput]
  }
  
  @scala.inline
  implicit class DescribeTargetGroupsInputMutableBuilder[Self <: DescribeTargetGroupsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerArnUndefined: Self = StObject.set(x, "LoadBalancerArn", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setNames(value: TargetGroupNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: TargetGroupName*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setTargetGroupArns(value: TargetGroupArns): Self = StObject.set(x, "TargetGroupArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupArnsUndefined: Self = StObject.set(x, "TargetGroupArns", js.undefined)
    
    @scala.inline
    def setTargetGroupArnsVarargs(value: TargetGroupArn*): Self = StObject.set(x, "TargetGroupArns", js.Array(value :_*))
  }
}
