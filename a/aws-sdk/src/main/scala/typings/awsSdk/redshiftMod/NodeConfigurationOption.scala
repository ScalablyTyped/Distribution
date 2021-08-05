package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeConfigurationOption extends StObject {
  
  /**
    * The estimated disk utilizaton percentage.
    */
  var EstimatedDiskUtilizationPercent: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * The category of the node configuration recommendation.
    */
  var Mode: js.UndefOr[typings.awsSdk.redshiftMod.Mode] = js.undefined
  
  /**
    * The node type, such as, "ds2.8xlarge".
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of nodes.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.undefined
}
object NodeConfigurationOption {
  
  inline def apply(): NodeConfigurationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfigurationOption]
  }
  
  extension [Self <: NodeConfigurationOption](x: Self) {
    
    inline def setEstimatedDiskUtilizationPercent(value: DoubleOptional): Self = StObject.set(x, "EstimatedDiskUtilizationPercent", value.asInstanceOf[js.Any])
    
    inline def setEstimatedDiskUtilizationPercentUndefined: Self = StObject.set(x, "EstimatedDiskUtilizationPercent", js.undefined)
    
    inline def setMode(value: Mode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setNumberOfNodes(value: Integer): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
  }
}
