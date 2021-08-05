package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterMaintenanceResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.redshiftMod.Cluster] = js.undefined
}
object ModifyClusterMaintenanceResult {
  
  inline def apply(): ModifyClusterMaintenanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterMaintenanceResult]
  }
  
  extension [Self <: ModifyClusterMaintenanceResult](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
