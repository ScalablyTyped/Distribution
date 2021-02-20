package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoadBalancersOutput extends StObject {
  
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
  implicit class DescribeLoadBalancersOutputMutableBuilder[Self <: DescribeLoadBalancersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancers(value: LoadBalancers): Self = StObject.set(x, "LoadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancersUndefined: Self = StObject.set(x, "LoadBalancers", js.undefined)
    
    @scala.inline
    def setLoadBalancersVarargs(value: LoadBalancer*): Self = StObject.set(x, "LoadBalancers", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
