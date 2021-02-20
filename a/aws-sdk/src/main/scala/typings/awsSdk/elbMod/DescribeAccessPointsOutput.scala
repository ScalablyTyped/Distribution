package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccessPointsOutput extends StObject {
  
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
  implicit class DescribeAccessPointsOutputMutableBuilder[Self <: DescribeAccessPointsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerDescriptions(value: LoadBalancerDescriptions): Self = StObject.set(x, "LoadBalancerDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerDescriptionsUndefined: Self = StObject.set(x, "LoadBalancerDescriptions", js.undefined)
    
    @scala.inline
    def setLoadBalancerDescriptionsVarargs(value: LoadBalancerDescription*): Self = StObject.set(x, "LoadBalancerDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
