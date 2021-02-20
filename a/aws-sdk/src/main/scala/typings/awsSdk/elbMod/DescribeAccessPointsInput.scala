package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccessPointsInput extends StObject {
  
  /**
    * The names of the load balancers.
    */
  var LoadBalancerNames: js.UndefOr[typings.awsSdk.elbMod.LoadBalancerNames] = js.native
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbMod.Marker] = js.native
  
  /**
    * The maximum number of results to return with this call (a number from 1 to 400). The default is 400.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbMod.PageSize] = js.native
}
object DescribeAccessPointsInput {
  
  @scala.inline
  def apply(): DescribeAccessPointsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsInput]
  }
  
  @scala.inline
  implicit class DescribeAccessPointsInputMutableBuilder[Self <: DescribeAccessPointsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerNames(value: LoadBalancerNames): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNamesUndefined: Self = StObject.set(x, "LoadBalancerNames", js.undefined)
    
    @scala.inline
    def setLoadBalancerNamesVarargs(value: AccessPointName*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value :_*))
    
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
