package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplicationTaskMessage extends StObject {
  
  /**
    * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”  When you use this task setting with a source PostgreSQL database, a logical replication slot should already be created and associated with the source endpoint. You can verify this by setting the slotName extra connection attribute to the name of this logical replication slot. For more information, see Extra Connection Attributes When Using PostgreSQL as a Source for DMS. 
    */
  var CdcStartPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an error. Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
    */
  var CdcStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
    */
  var CdcStopPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the replication task to be started.
    */
  var ReplicationTaskArn: String
  
  /**
    * The type of replication task to start. When the migration type is full-load or full-load-and-cdc, the only valid value for the first run of the task is start-replication. You use reload-target to restart the task and resume-processing to resume the task. When the migration type is cdc, you use start-replication to start or restart the task, and resume-processing to resume the task. reload-target is not a valid value for a task with migration type of cdc.
    */
  var StartReplicationTaskType: StartReplicationTaskTypeValue
}
object StartReplicationTaskMessage {
  
  inline def apply(ReplicationTaskArn: String, StartReplicationTaskType: StartReplicationTaskTypeValue): StartReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any], StartReplicationTaskType = StartReplicationTaskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplicationTaskMessage]
  }
  
  extension [Self <: StartReplicationTaskMessage](x: Self) {
    
    inline def setCdcStartPosition(value: String): Self = StObject.set(x, "CdcStartPosition", value.asInstanceOf[js.Any])
    
    inline def setCdcStartPositionUndefined: Self = StObject.set(x, "CdcStartPosition", js.undefined)
    
    inline def setCdcStartTime(value: js.Date): Self = StObject.set(x, "CdcStartTime", value.asInstanceOf[js.Any])
    
    inline def setCdcStartTimeUndefined: Self = StObject.set(x, "CdcStartTime", js.undefined)
    
    inline def setCdcStopPosition(value: String): Self = StObject.set(x, "CdcStopPosition", value.asInstanceOf[js.Any])
    
    inline def setCdcStopPositionUndefined: Self = StObject.set(x, "CdcStopPosition", js.undefined)
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    inline def setStartReplicationTaskType(value: StartReplicationTaskTypeValue): Self = StObject.set(x, "StartReplicationTaskType", value.asInstanceOf[js.Any])
  }
}
