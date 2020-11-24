package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRestoreStatus extends js.Object {
  
  /**
    * The identifier of the Amazon Redshift cluster that the table is being restored to.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A description of the status of the table restore request. Status values include SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * The name of the table to create as a result of the table restore request.
    */
  var NewTableName: js.UndefOr[String] = js.native
  
  /**
    * The amount of data restored to the new table so far, in megabytes (MB).
    */
  var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.native
  
  /**
    * The time that the table restore request was made, in Universal Coordinated Time (UTC).
    */
  var RequestTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The identifier of the snapshot that the table is being restored from.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The name of the source database that contains the table being restored.
    */
  var SourceDatabaseName: js.UndefOr[String] = js.native
  
  /**
    * The name of the source schema that contains the table being restored.
    */
  var SourceSchemaName: js.UndefOr[String] = js.native
  
  /**
    * The name of the source table being restored.
    */
  var SourceTableName: js.UndefOr[String] = js.native
  
  /**
    * A value that describes the current state of the table restore request. Valid Values: SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS 
    */
  var Status: js.UndefOr[TableRestoreStatusType] = js.native
  
  /**
    * The unique identifier for the table restore request.
    */
  var TableRestoreRequestId: js.UndefOr[String] = js.native
  
  /**
    * The name of the database to restore the table to.
    */
  var TargetDatabaseName: js.UndefOr[String] = js.native
  
  /**
    * The name of the schema to restore the table to.
    */
  var TargetSchemaName: js.UndefOr[String] = js.native
  
  /**
    * The total amount of data to restore to the new table, in megabytes (MB).
    */
  var TotalDataInMegaBytes: js.UndefOr[LongOptional] = js.native
}
object TableRestoreStatus {
  
  @scala.inline
  def apply(): TableRestoreStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRestoreStatus]
  }
  
  @scala.inline
  implicit class TableRestoreStatusOps[Self <: TableRestoreStatus] (val x: Self) extends AnyVal {
    
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setNewTableName(value: String): Self = this.set("NewTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewTableName: Self = this.set("NewTableName", js.undefined)
    
    @scala.inline
    def setProgressInMegaBytes(value: LongOptional): Self = this.set("ProgressInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressInMegaBytes: Self = this.set("ProgressInMegaBytes", js.undefined)
    
    @scala.inline
    def setRequestTime(value: TStamp): Self = this.set("RequestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTime: Self = this.set("RequestTime", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = this.set("SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotIdentifier: Self = this.set("SnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setSourceDatabaseName(value: String): Self = this.set("SourceDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDatabaseName: Self = this.set("SourceDatabaseName", js.undefined)
    
    @scala.inline
    def setSourceSchemaName(value: String): Self = this.set("SourceSchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSchemaName: Self = this.set("SourceSchemaName", js.undefined)
    
    @scala.inline
    def setSourceTableName(value: String): Self = this.set("SourceTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTableName: Self = this.set("SourceTableName", js.undefined)
    
    @scala.inline
    def setStatus(value: TableRestoreStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTableRestoreRequestId(value: String): Self = this.set("TableRestoreRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRestoreRequestId: Self = this.set("TableRestoreRequestId", js.undefined)
    
    @scala.inline
    def setTargetDatabaseName(value: String): Self = this.set("TargetDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDatabaseName: Self = this.set("TargetDatabaseName", js.undefined)
    
    @scala.inline
    def setTargetSchemaName(value: String): Self = this.set("TargetSchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSchemaName: Self = this.set("TargetSchemaName", js.undefined)
    
    @scala.inline
    def setTotalDataInMegaBytes(value: LongOptional): Self = this.set("TotalDataInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalDataInMegaBytes: Self = this.set("TotalDataInMegaBytes", js.undefined)
  }
}
