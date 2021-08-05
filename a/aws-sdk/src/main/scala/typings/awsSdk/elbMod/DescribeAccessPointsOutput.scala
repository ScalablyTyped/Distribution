package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccessPointsOutput extends StObject {
  
  /**
    * Information about the load balancers.
    */
  var LoadBalancerDescriptions: js.UndefOr[typings.awsSdk.elbMod.LoadBalancerDescriptions] = js.undefined
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}
object DescribeAccessPointsOutput {
  
  inline def apply(): DescribeAccessPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsOutput]
  }
  
  extension [Self <: DescribeAccessPointsOutput](x: Self) {
    
    inline def setLoadBalancerDescriptions(value: LoadBalancerDescriptions): Self = StObject.set(x, "LoadBalancerDescriptions", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerDescriptionsUndefined: Self = StObject.set(x, "LoadBalancerDescriptions", js.undefined)
    
    inline def setLoadBalancerDescriptionsVarargs(value: LoadBalancerDescription*): Self = StObject.set(x, "LoadBalancerDescriptions", js.Array(value :_*))
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
