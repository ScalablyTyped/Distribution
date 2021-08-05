package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterMaintenanceMessage extends StObject {
  
  /**
    * A unique identifier for the cluster.
    */
  var ClusterIdentifier: String
  
  /**
    * A boolean indicating whether to enable the deferred maintenance window. 
    */
  var DeferMaintenance: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't specify an end time. The duration must be 45 days or less.
    */
  var DeferMaintenanceDuration: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't specify a duration.
    */
  var DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * A unique identifier for the deferred maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A timestamp indicating the start time for the deferred maintenance window.
    */
  var DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.undefined
}
object ModifyClusterMaintenanceMessage {
  
  inline def apply(ClusterIdentifier: String): ModifyClusterMaintenanceMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterMaintenanceMessage]
  }
  
  extension [Self <: ModifyClusterMaintenanceMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenance(value: BooleanOptional): Self = StObject.set(x, "DeferMaintenance", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceDuration(value: IntegerOptional): Self = StObject.set(x, "DeferMaintenanceDuration", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceDurationUndefined: Self = StObject.set(x, "DeferMaintenanceDuration", js.undefined)
    
    inline def setDeferMaintenanceEndTime(value: TStamp): Self = StObject.set(x, "DeferMaintenanceEndTime", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceEndTimeUndefined: Self = StObject.set(x, "DeferMaintenanceEndTime", js.undefined)
    
    inline def setDeferMaintenanceIdentifier(value: String): Self = StObject.set(x, "DeferMaintenanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceIdentifierUndefined: Self = StObject.set(x, "DeferMaintenanceIdentifier", js.undefined)
    
    inline def setDeferMaintenanceStartTime(value: TStamp): Self = StObject.set(x, "DeferMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceStartTimeUndefined: Self = StObject.set(x, "DeferMaintenanceStartTime", js.undefined)
    
    inline def setDeferMaintenanceUndefined: Self = StObject.set(x, "DeferMaintenance", js.undefined)
  }
}
