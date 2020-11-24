package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReplicationTaskMessage extends js.Object {
  
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
    * The migration type. Valid values: full-load | cdc | full-load-and-cdc 
    */
  var MigrationType: js.UndefOr[MigrationTypeValue] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: String = js.native
  
  /**
    * The replication task identifier. Constraints:   Must contain 1-255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.native
  
  /**
    * JSON file that contains settings for the task, such as task metadata settings.
    */
  var ReplicationTaskSettings: js.UndefOr[String] = js.native
  
  /**
    * When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings. Precede the path with file://. When working with the DMS API, provide the JSON as the parameter value, for example: --table-mappings file://mappingfile.json 
    */
  var TableMappings: js.UndefOr[String] = js.native
  
  /**
    * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For more information, see Specifying Supplemental Data for Task Settings in the AWS Database Migration Service User Guide. 
    */
  var TaskData: js.UndefOr[String] = js.native
}
object ModifyReplicationTaskMessage {
  
  @scala.inline
  def apply(ReplicationTaskArn: String): ModifyReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationTaskMessage]
  }
  
  @scala.inline
  implicit class ModifyReplicationTaskMessageOps[Self <: ModifyReplicationTaskMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = this.set("ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdcStartPosition(value: String): Self = this.set("CdcStartPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdcStartPosition: Self = this.set("CdcStartPosition", js.undefined)
    
    @scala.inline
    def setCdcStartTime(value: TStamp): Self = this.set("CdcStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdcStartTime: Self = this.set("CdcStartTime", js.undefined)
    
    @scala.inline
    def setCdcStopPosition(value: String): Self = this.set("CdcStopPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdcStopPosition: Self = this.set("CdcStopPosition", js.undefined)
    
    @scala.inline
    def setMigrationType(value: MigrationTypeValue): Self = this.set("MigrationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationType: Self = this.set("MigrationType", js.undefined)
    
    @scala.inline
    def setReplicationTaskIdentifier(value: String): Self = this.set("ReplicationTaskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskIdentifier: Self = this.set("ReplicationTaskIdentifier", js.undefined)
    
    @scala.inline
    def setReplicationTaskSettings(value: String): Self = this.set("ReplicationTaskSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskSettings: Self = this.set("ReplicationTaskSettings", js.undefined)
    
    @scala.inline
    def setTableMappings(value: String): Self = this.set("TableMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableMappings: Self = this.set("TableMappings", js.undefined)
    
    @scala.inline
    def setTaskData(value: String): Self = this.set("TaskData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskData: Self = this.set("TaskData", js.undefined)
  }
}
