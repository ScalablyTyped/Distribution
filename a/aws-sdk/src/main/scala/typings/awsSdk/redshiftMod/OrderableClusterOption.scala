package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderableClusterOption extends StObject {
  
  /**
    * A list of availability zones for the orderable cluster.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  
  /**
    * The cluster type, for example multi-node. 
    */
  var ClusterType: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the orderable cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The node type for the orderable cluster.
    */
  var NodeType: js.UndefOr[String] = js.undefined
}
object OrderableClusterOption {
  
  inline def apply(): OrderableClusterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableClusterOption]
  }
  
  extension [Self <: OrderableClusterOption](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    inline def setClusterType(value: String): Self = StObject.set(x, "ClusterType", value.asInstanceOf[js.Any])
    
    inline def setClusterTypeUndefined: Self = StObject.set(x, "ClusterType", js.undefined)
    
    inline def setClusterVersion(value: String): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
  }
}
