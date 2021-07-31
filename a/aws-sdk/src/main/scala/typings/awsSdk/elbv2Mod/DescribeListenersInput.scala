package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeListenersInput extends StObject {
  
  /**
    * The Amazon Resource Names (ARN) of the listeners.
    */
  var ListenerArns: js.UndefOr[typings.awsSdk.elbv2Mod.ListenerArns] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArn] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.undefined
  
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.undefined
}
object DescribeListenersInput {
  
  @scala.inline
  def apply(): DescribeListenersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeListenersInput]
  }
  
  @scala.inline
  implicit class DescribeListenersInputMutableBuilder[Self <: DescribeListenersInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListenerArns(value: ListenerArns): Self = StObject.set(x, "ListenerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerArnsUndefined: Self = StObject.set(x, "ListenerArns", js.undefined)
    
    @scala.inline
    def setListenerArnsVarargs(value: ListenerArn*): Self = StObject.set(x, "ListenerArns", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerArnUndefined: Self = StObject.set(x, "LoadBalancerArn", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
