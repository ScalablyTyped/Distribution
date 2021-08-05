package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterSnapshotScheduleMessage extends StObject {
  
  /**
    * A unique identifier for the cluster whose snapshot schedule you want to modify. 
    */
  var ClusterIdentifier: String
  
  /**
    * A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
    */
  var DisassociateSchedule: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.undefined
}
object ModifyClusterSnapshotScheduleMessage {
  
  inline def apply(ClusterIdentifier: String): ModifyClusterSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSnapshotScheduleMessage]
  }
  
  extension [Self <: ModifyClusterSnapshotScheduleMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDisassociateSchedule(value: BooleanOptional): Self = StObject.set(x, "DisassociateSchedule", value.asInstanceOf[js.Any])
    
    inline def setDisassociateScheduleUndefined: Self = StObject.set(x, "DisassociateSchedule", js.undefined)
    
    inline def setScheduleIdentifier(value: String): Self = StObject.set(x, "ScheduleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setScheduleIdentifierUndefined: Self = StObject.set(x, "ScheduleIdentifier", js.undefined)
  }
}
