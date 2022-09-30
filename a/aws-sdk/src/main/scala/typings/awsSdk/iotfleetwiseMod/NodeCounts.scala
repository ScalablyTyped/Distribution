package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeCounts extends StObject {
  
  /**
    * The total number of nodes in a vehicle network that represent actuators.
    */
  var totalActuators: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of nodes in a vehicle network that represent attributes.
    */
  var totalAttributes: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of nodes in a vehicle network that represent branches.
    */
  var totalBranches: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of nodes in a vehicle network.
    */
  var totalNodes: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of nodes in a vehicle network that represent sensors.
    */
  var totalSensors: js.UndefOr[Double] = js.undefined
}
object NodeCounts {
  
  inline def apply(): NodeCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCounts]
  }
  
  extension [Self <: NodeCounts](x: Self) {
    
    inline def setTotalActuators(value: Double): Self = StObject.set(x, "totalActuators", value.asInstanceOf[js.Any])
    
    inline def setTotalActuatorsUndefined: Self = StObject.set(x, "totalActuators", js.undefined)
    
    inline def setTotalAttributes(value: Double): Self = StObject.set(x, "totalAttributes", value.asInstanceOf[js.Any])
    
    inline def setTotalAttributesUndefined: Self = StObject.set(x, "totalAttributes", js.undefined)
    
    inline def setTotalBranches(value: Double): Self = StObject.set(x, "totalBranches", value.asInstanceOf[js.Any])
    
    inline def setTotalBranchesUndefined: Self = StObject.set(x, "totalBranches", js.undefined)
    
    inline def setTotalNodes(value: Double): Self = StObject.set(x, "totalNodes", value.asInstanceOf[js.Any])
    
    inline def setTotalNodesUndefined: Self = StObject.set(x, "totalNodes", js.undefined)
    
    inline def setTotalSensors(value: Double): Self = StObject.set(x, "totalSensors", value.asInstanceOf[js.Any])
    
    inline def setTotalSensorsUndefined: Self = StObject.set(x, "totalSensors", js.undefined)
  }
}
