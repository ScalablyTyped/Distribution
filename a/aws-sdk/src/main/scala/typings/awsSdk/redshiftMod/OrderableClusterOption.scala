package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderableClusterOption extends StObject {
  
  /**
    * A list of availability zones for the orderable cluster.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  
  /**
    * The cluster type, for example multi-node. 
    */
  var ClusterType: js.UndefOr[String] = js.native
  
  /**
    * The version of the orderable cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  
  /**
    * The node type for the orderable cluster.
    */
  var NodeType: js.UndefOr[String] = js.native
}
object OrderableClusterOption {
  
  @scala.inline
  def apply(): OrderableClusterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableClusterOption]
  }
  
  @scala.inline
  implicit class OrderableClusterOptionMutableBuilder[Self <: OrderableClusterOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setClusterType(value: String): Self = StObject.set(x, "ClusterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterTypeUndefined: Self = StObject.set(x, "ClusterType", js.undefined)
    
    @scala.inline
    def setClusterVersion(value: String): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
  }
}
