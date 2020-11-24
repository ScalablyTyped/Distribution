package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationTaskMessage extends js.Object {
  
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
  var MigrationType: MigrationTypeValue = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a replication instance.
    */
  var ReplicationInstanceArn: String = js.native
  
  /**
    * An identifier for the replication task. Constraints:   Must contain 1-255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationTaskIdentifier: String = js.native
  
  /**
    * Overall settings for the task, in JSON format. For more information, see Specifying Task Settings for AWS Database Migration Service Tasks in the AWS Database Migration User Guide. 
    */
  var ReplicationTaskSettings: js.UndefOr[String] = js.native
  
  /**
    * A friendly name for the resource identifier at the end of the EndpointArn response parameter that is returned in the created Endpoint object. The value for this parameter can have up to 31 characters. It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens, and can only begin with a letter, such as Example-App-ARN1. For example, this value might result in the EndpointArn value arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1. If you don't specify a ResourceIdentifier value, AWS DMS generates a default identifier value for the end of EndpointArn.
    */
  var ResourceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
    */
  var SourceEndpointArn: String = js.native
  
  /**
    * The table mappings for the task, in JSON format. For more information, see Using Table Mapping to Specify Task Settings in the AWS Database Migration Service User Guide. 
    */
  var TableMappings: String = js.native
  
  /**
    * One or more tags to be assigned to the replication task.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
    */
  var TargetEndpointArn: String = js.native
  
  /**
    * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For more information, see Specifying Supplemental Data for Task Settings in the AWS Database Migration Service User Guide. 
    */
  var TaskData: js.UndefOr[String] = js.native
}
object CreateReplicationTaskMessage {
  
  @scala.inline
  def apply(
    MigrationType: MigrationTypeValue,
    ReplicationInstanceArn: String,
    ReplicationTaskIdentifier: String,
    SourceEndpointArn: String,
    TableMappings: String,
    TargetEndpointArn: String
  ): CreateReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(MigrationType = MigrationType.asInstanceOf[js.Any], ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any], ReplicationTaskIdentifier = ReplicationTaskIdentifier.asInstanceOf[js.Any], SourceEndpointArn = SourceEndpointArn.asInstanceOf[js.Any], TableMappings = TableMappings.asInstanceOf[js.Any], TargetEndpointArn = TargetEndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationTaskMessage]
  }
  
  @scala.inline
  implicit class CreateReplicationTaskMessageOps[Self <: CreateReplicationTaskMessage] (val x: Self) extends AnyVal {
    
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
    def setMigrationType(value: MigrationTypeValue): Self = this.set("MigrationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = this.set("ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskIdentifier(value: String): Self = this.set("ReplicationTaskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEndpointArn(value: String): Self = this.set("SourceEndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableMappings(value: String): Self = this.set("TableMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEndpointArn(value: String): Self = this.set("TargetEndpointArn", value.asInstanceOf[js.Any])
    
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
    def setReplicationTaskSettings(value: String): Self = this.set("ReplicationTaskSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskSettings: Self = this.set("ReplicationTaskSettings", js.undefined)
    
    @scala.inline
    def setResourceIdentifier(value: String): Self = this.set("ResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIdentifier: Self = this.set("ResourceIdentifier", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTaskData(value: String): Self = this.set("TaskData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskData: Self = this.set("TaskData", js.undefined)
  }
}
