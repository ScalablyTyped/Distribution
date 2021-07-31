package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReshardingConfiguration extends StObject {
  
  /**
    * Either the ElastiCache for Redis supplied 4-digit id or a user supplied id for the node group these configuration values apply to.
    */
  var NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined
  
  /**
    * A list of preferred availability zones for the nodes in this cluster.
    */
  var PreferredAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined
}
object ReshardingConfiguration {
  
  @scala.inline
  def apply(): ReshardingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReshardingConfiguration]
  }
  
  @scala.inline
  implicit class ReshardingConfigurationMutableBuilder[Self <: ReshardingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeGroupId(value: AllowedNodeGroupId): Self = StObject.set(x, "NodeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupIdUndefined: Self = StObject.set(x, "NodeGroupId", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZones(value: AvailabilityZonesList): Self = StObject.set(x, "PreferredAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredAvailabilityZonesUndefined: Self = StObject.set(x, "PreferredAvailabilityZones", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "PreferredAvailabilityZones", js.Array(value :_*))
  }
}
