package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
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
    * The replication task identifier. Constraints:   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
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
    * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For more information, see Specifying Supplemental Data for Task Settings in the AWS Database Migration User Guide. 
    */
  var TaskData: js.UndefOr[String] = js.native
}

object ModifyReplicationTaskMessage {
  @scala.inline
  def apply(
    ReplicationTaskArn: String,
    CdcStartPosition: String = null,
    CdcStartTime: TStamp = null,
    CdcStopPosition: String = null,
    MigrationType: MigrationTypeValue = null,
    ReplicationTaskIdentifier: String = null,
    ReplicationTaskSettings: String = null,
    TableMappings: String = null,
    TaskData: String = null
  ): ModifyReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    if (CdcStartPosition != null) __obj.updateDynamic("CdcStartPosition")(CdcStartPosition.asInstanceOf[js.Any])
    if (CdcStartTime != null) __obj.updateDynamic("CdcStartTime")(CdcStartTime.asInstanceOf[js.Any])
    if (CdcStopPosition != null) __obj.updateDynamic("CdcStopPosition")(CdcStopPosition.asInstanceOf[js.Any])
    if (MigrationType != null) __obj.updateDynamic("MigrationType")(MigrationType.asInstanceOf[js.Any])
    if (ReplicationTaskIdentifier != null) __obj.updateDynamic("ReplicationTaskIdentifier")(ReplicationTaskIdentifier.asInstanceOf[js.Any])
    if (ReplicationTaskSettings != null) __obj.updateDynamic("ReplicationTaskSettings")(ReplicationTaskSettings.asInstanceOf[js.Any])
    if (TableMappings != null) __obj.updateDynamic("TableMappings")(TableMappings.asInstanceOf[js.Any])
    if (TaskData != null) __obj.updateDynamic("TaskData")(TaskData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationTaskMessage]
  }
}

