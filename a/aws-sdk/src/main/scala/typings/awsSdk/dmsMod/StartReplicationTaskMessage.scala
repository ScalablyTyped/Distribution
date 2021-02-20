package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartReplicationTaskMessage extends StObject {
  
  /**
    * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”  When you use this task setting with a source PostgreSQL database, a logical replication slot should already be created and associated with the source endpoint. You can verify this by setting the slotName extra connection attribute to the name of this logical replication slot. For more information, see Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS. 
    */
  var CdcStartPosition: js.UndefOr[String] = js.native
  
  /**
    * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an error. Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
    */
  var CdcStartTime: js.UndefOr[TStamp] = js.native
  
  /**
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
    */
  var CdcStopPosition: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication task to be started.
    */
  var ReplicationTaskArn: String = js.native
  
  /**
    * A type of replication task.
    */
  var StartReplicationTaskType: StartReplicationTaskTypeValue = js.native
}
object StartReplicationTaskMessage {
  
  @scala.inline
  def apply(ReplicationTaskArn: String, StartReplicationTaskType: StartReplicationTaskTypeValue): StartReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any], StartReplicationTaskType = StartReplicationTaskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplicationTaskMessage]
  }
  
  @scala.inline
  implicit class StartReplicationTaskMessageMutableBuilder[Self <: StartReplicationTaskMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdcStartPosition(value: String): Self = StObject.set(x, "CdcStartPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdcStartPositionUndefined: Self = StObject.set(x, "CdcStartPosition", js.undefined)
    
    @scala.inline
    def setCdcStartTime(value: TStamp): Self = StObject.set(x, "CdcStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdcStartTimeUndefined: Self = StObject.set(x, "CdcStartTime", js.undefined)
    
    @scala.inline
    def setCdcStopPosition(value: String): Self = StObject.set(x, "CdcStopPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdcStopPositionUndefined: Self = StObject.set(x, "CdcStopPosition", js.undefined)
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartReplicationTaskType(value: StartReplicationTaskTypeValue): Self = StObject.set(x, "StartReplicationTaskType", value.asInstanceOf[js.Any])
  }
}
