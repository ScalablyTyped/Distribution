package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationTask extends js.Object {
  
  /**
    * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want the CDC operation to start. Specifying both values results in an error. The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
    */
  var CdcStartPosition: js.UndefOr[String] = js.native
  
  /**
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
    */
  var CdcStopPosition: js.UndefOr[String] = js.native
  
  /**
    * The last error (failure) message generated for the replication task.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  
  /**
    * The type of migration.
    */
  var MigrationType: js.UndefOr[MigrationTypeValue] = js.native
  
  /**
    * Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide this value to the CdcStartPosition parameter to start a CDC operation that begins at that checkpoint.
    */
  var RecoveryCheckpoint: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  
  /**
    * The date the replication task was created.
    */
  var ReplicationTaskCreationDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The user-assigned replication task identifier or name. Constraints:   Must contain 1-255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The settings for the replication task.
    */
  var ReplicationTaskSettings: js.UndefOr[String] = js.native
  
  /**
    * The date the replication task is scheduled to start.
    */
  var ReplicationTaskStartDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The statistics for the task, including elapsed time, tables loaded, and table errors.
    */
  var ReplicationTaskStats: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTaskStats] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the endpoint.
    */
  var SourceEndpointArn: js.UndefOr[String] = js.native
  
  /**
    * The status of the replication task. This response parameter can return one of the following values:    "moving" – The task is being moved in response to running the  MoveReplicationTask  operation.    "creating" – The task is being created in response to running the  CreateReplicationTask  operation.    "deleting" – The task is being deleted in response to running the  DeleteReplicationTask  operation.    "failed" – The task failed to successfully complete the database migration in response to running the  StartReplicationTask  operation.    "failed-move" – The task failed to move in response to running the  MoveReplicationTask  operation.    "modifying" – The task definition is being modified in response to running the  ModifyReplicationTask  operation.    "ready" – The task is in a ready state where it can respond to other task operations, such as  StartReplicationTask  or  DeleteReplicationTask .     "running" – The task is performing a database migration in response to running the  StartReplicationTask  operation.    "starting" – The task is preparing to perform a database migration in response to running the  StartReplicationTask  operation.    "stopped" – The task has stopped in response to running the  StopReplicationTask  operation.    "stopping" – The task is preparing to stop in response to running the  StopReplicationTask  operation.    "testing" – The database migration specified for this task is being tested in response to running either the  StartReplicationTaskAssessmentRun  or the  StartReplicationTaskAssessment  operation.    StartReplicationTaskAssessmentRun  is an improved premigration task assessment operation. The  StartReplicationTaskAssessment  operation assesses data type compatibility only between the source and target database of a given migration task. In contrast,  StartReplicationTaskAssessmentRun  enables you to specify a variety of premigration task assessments in addition to data type compatibility. These assessments include ones for the validity of primary key definitions and likely issues with database migration performance, among others.   
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The reason the replication task was stopped. This response parameter can return one of the following values:    "STOP_REASON_FULL_LOAD_COMPLETED" – Full-load migration completed.    "STOP_REASON_CACHED_CHANGES_APPLIED" – Change data capture (CDC) load completed.    "STOP_REASON_CACHED_CHANGES_NOT_APPLIED" – In a full-load and CDC migration, the full load stopped as specified before starting the CDC migration.    "STOP_REASON_SERVER_TIME" – The migration stopped at the specified server time.  
    */
  var StopReason: js.UndefOr[String] = js.native
  
  /**
    * Table mappings specified in the task.
    */
  var TableMappings: js.UndefOr[String] = js.native
  
  /**
    * The ARN that uniquely identifies the endpoint.
    */
  var TargetEndpointArn: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the replication instance to which this task is moved in response to running the  MoveReplicationTask  operation. Otherwise, this response parameter isn't a member of the ReplicationTask object.
    */
  var TargetReplicationInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For more information, see Specifying Supplemental Data for Task Settings in the AWS Database Migration Service User Guide. 
    */
  var TaskData: js.UndefOr[String] = js.native
}
object ReplicationTask {
  
  @scala.inline
  def apply(): ReplicationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTask]
  }
  
  @scala.inline
  implicit class ReplicationTaskOps[Self <: ReplicationTask] (val x: Self) extends AnyVal {
    
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
    def setCdcStartPosition(value: String): Self = this.set("CdcStartPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdcStartPosition: Self = this.set("CdcStartPosition", js.undefined)
    
    @scala.inline
    def setCdcStopPosition(value: String): Self = this.set("CdcStopPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdcStopPosition: Self = this.set("CdcStopPosition", js.undefined)
    
    @scala.inline
    def setLastFailureMessage(value: String): Self = this.set("LastFailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastFailureMessage: Self = this.set("LastFailureMessage", js.undefined)
    
    @scala.inline
    def setMigrationType(value: MigrationTypeValue): Self = this.set("MigrationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationType: Self = this.set("MigrationType", js.undefined)
    
    @scala.inline
    def setRecoveryCheckpoint(value: String): Self = this.set("RecoveryCheckpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecoveryCheckpoint: Self = this.set("RecoveryCheckpoint", js.undefined)
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = this.set("ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationInstanceArn: Self = this.set("ReplicationInstanceArn", js.undefined)
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = this.set("ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskArn: Self = this.set("ReplicationTaskArn", js.undefined)
    
    @scala.inline
    def setReplicationTaskCreationDate(value: TStamp): Self = this.set("ReplicationTaskCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskCreationDate: Self = this.set("ReplicationTaskCreationDate", js.undefined)
    
    @scala.inline
    def setReplicationTaskIdentifier(value: String): Self = this.set("ReplicationTaskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskIdentifier: Self = this.set("ReplicationTaskIdentifier", js.undefined)
    
    @scala.inline
    def setReplicationTaskSettings(value: String): Self = this.set("ReplicationTaskSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskSettings: Self = this.set("ReplicationTaskSettings", js.undefined)
    
    @scala.inline
    def setReplicationTaskStartDate(value: TStamp): Self = this.set("ReplicationTaskStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskStartDate: Self = this.set("ReplicationTaskStartDate", js.undefined)
    
    @scala.inline
    def setReplicationTaskStats(value: ReplicationTaskStats): Self = this.set("ReplicationTaskStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskStats: Self = this.set("ReplicationTaskStats", js.undefined)
    
    @scala.inline
    def setSourceEndpointArn(value: String): Self = this.set("SourceEndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceEndpointArn: Self = this.set("SourceEndpointArn", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStopReason(value: String): Self = this.set("StopReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopReason: Self = this.set("StopReason", js.undefined)
    
    @scala.inline
    def setTableMappings(value: String): Self = this.set("TableMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableMappings: Self = this.set("TableMappings", js.undefined)
    
    @scala.inline
    def setTargetEndpointArn(value: String): Self = this.set("TargetEndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetEndpointArn: Self = this.set("TargetEndpointArn", js.undefined)
    
    @scala.inline
    def setTargetReplicationInstanceArn(value: String): Self = this.set("TargetReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetReplicationInstanceArn: Self = this.set("TargetReplicationInstanceArn", js.undefined)
    
    @scala.inline
    def setTaskData(value: String): Self = this.set("TaskData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskData: Self = this.set("TaskData", js.undefined)
  }
}
