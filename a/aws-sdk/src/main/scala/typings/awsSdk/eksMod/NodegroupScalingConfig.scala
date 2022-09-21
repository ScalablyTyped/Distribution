package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodegroupScalingConfig extends StObject {
  
  /**
    * The current number of nodes that the managed node group should maintain.  If you use Cluster Autoscaler, you shouldn't change the desiredSize value directly, as this can cause the Cluster Autoscaler to suddenly scale up or scale down.  Whenever this parameter changes, the number of worker nodes in the node group is updated to the specified size. If this parameter is given a value that is smaller than the current number of running worker nodes, the necessary number of worker nodes are terminated to match the given value. When using CloudFormation, no action occurs if you remove this parameter from your CFN template. This parameter can be different from minSize in some cases, such as when starting with extra hosts for testing. This parameter can also be different when you want to start with an estimated number of needed hosts, but let Cluster Autoscaler reduce the number if there are too many. When Cluster Autoscaler is used, the desiredSize parameter is altered by Cluster Autoscaler (but can be out-of-date for short periods of time). Cluster Autoscaler doesn't scale a managed node group lower than minSize or higher than maxSize.
    */
  var desiredSize: js.UndefOr[ZeroCapacity] = js.undefined
  
  /**
    * The maximum number of nodes that the managed node group can scale out to. For information about the maximum number that you can specify, see Amazon EKS service quotas in the Amazon EKS User Guide.
    */
  var maxSize: js.UndefOr[Capacity] = js.undefined
  
  /**
    * The minimum number of nodes that the managed node group can scale in to.
    */
  var minSize: js.UndefOr[ZeroCapacity] = js.undefined
}
object NodegroupScalingConfig {
  
  inline def apply(): NodegroupScalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodegroupScalingConfig]
  }
  
  extension [Self <: NodegroupScalingConfig](x: Self) {
    
    inline def setDesiredSize(value: ZeroCapacity): Self = StObject.set(x, "desiredSize", value.asInstanceOf[js.Any])
    
    inline def setDesiredSizeUndefined: Self = StObject.set(x, "desiredSize", js.undefined)
    
    inline def setMaxSize(value: Capacity): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: ZeroCapacity): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
