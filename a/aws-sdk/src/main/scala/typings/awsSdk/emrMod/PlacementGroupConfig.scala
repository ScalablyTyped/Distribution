package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementGroupConfig extends StObject {
  
  /**
    * Role of the instance in the cluster. Starting with Amazon EMR version 5.23.0, the only supported instance role is MASTER.
    */
  var InstanceRole: InstanceRoleType
  
  /**
    * EC2 Placement Group strategy associated with instance role. Starting with Amazon EMR version 5.23.0, the only supported placement strategy is SPREAD for the MASTER instance role.
    */
  var PlacementStrategy: js.UndefOr[PlacementGroupStrategy] = js.undefined
}
object PlacementGroupConfig {
  
  inline def apply(InstanceRole: InstanceRoleType): PlacementGroupConfig = {
    val __obj = js.Dynamic.literal(InstanceRole = InstanceRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroupConfig]
  }
  
  extension [Self <: PlacementGroupConfig](x: Self) {
    
    inline def setInstanceRole(value: InstanceRoleType): Self = StObject.set(x, "InstanceRole", value.asInstanceOf[js.Any])
    
    inline def setPlacementStrategy(value: PlacementGroupStrategy): Self = StObject.set(x, "PlacementStrategy", value.asInstanceOf[js.Any])
    
    inline def setPlacementStrategyUndefined: Self = StObject.set(x, "PlacementStrategy", js.undefined)
  }
}
