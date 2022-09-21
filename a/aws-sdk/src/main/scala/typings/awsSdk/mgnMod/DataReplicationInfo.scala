package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReplicationInfo extends StObject {
  
  /**
    * Error in obtaining data replication info.
    */
  var dataReplicationError: js.UndefOr[DataReplicationError] = js.undefined
  
  /**
    * Request to query whether data replication has been initiated.
    */
  var dataReplicationInitiation: js.UndefOr[DataReplicationInitiation] = js.undefined
  
  /**
    * Request to query the data replication state.
    */
  var dataReplicationState: js.UndefOr[DataReplicationState] = js.undefined
  
  /**
    * Request to query the time when data replication will be complete.
    */
  var etaDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Request to query data replication lag duration.
    */
  var lagDuration: js.UndefOr[ISO8601DurationString] = js.undefined
  
  /**
    * Request to query data replication last snapshot time.
    */
  var lastSnapshotDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Request to query disks replicated.
    */
  var replicatedDisks: js.UndefOr[DataReplicationInfoReplicatedDisks] = js.undefined
}
object DataReplicationInfo {
  
  inline def apply(): DataReplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataReplicationInfo]
  }
  
  extension [Self <: DataReplicationInfo](x: Self) {
    
    inline def setDataReplicationError(value: DataReplicationError): Self = StObject.set(x, "dataReplicationError", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationErrorUndefined: Self = StObject.set(x, "dataReplicationError", js.undefined)
    
    inline def setDataReplicationInitiation(value: DataReplicationInitiation): Self = StObject.set(x, "dataReplicationInitiation", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationInitiationUndefined: Self = StObject.set(x, "dataReplicationInitiation", js.undefined)
    
    inline def setDataReplicationState(value: DataReplicationState): Self = StObject.set(x, "dataReplicationState", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationStateUndefined: Self = StObject.set(x, "dataReplicationState", js.undefined)
    
    inline def setEtaDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "etaDateTime", value.asInstanceOf[js.Any])
    
    inline def setEtaDateTimeUndefined: Self = StObject.set(x, "etaDateTime", js.undefined)
    
    inline def setLagDuration(value: ISO8601DurationString): Self = StObject.set(x, "lagDuration", value.asInstanceOf[js.Any])
    
    inline def setLagDurationUndefined: Self = StObject.set(x, "lagDuration", js.undefined)
    
    inline def setLastSnapshotDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "lastSnapshotDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSnapshotDateTimeUndefined: Self = StObject.set(x, "lastSnapshotDateTime", js.undefined)
    
    inline def setReplicatedDisks(value: DataReplicationInfoReplicatedDisks): Self = StObject.set(x, "replicatedDisks", value.asInstanceOf[js.Any])
    
    inline def setReplicatedDisksUndefined: Self = StObject.set(x, "replicatedDisks", js.undefined)
    
    inline def setReplicatedDisksVarargs(value: DataReplicationInfoReplicatedDisk*): Self = StObject.set(x, "replicatedDisks", js.Array(value*))
  }
}
