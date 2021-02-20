package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRestoreStatus extends StObject {
  
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
  implicit class TableRestoreStatusMutableBuilder[Self <: TableRestoreStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setNewTableName(value: String): Self = StObject.set(x, "NewTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTableNameUndefined: Self = StObject.set(x, "NewTableName", js.undefined)
    
    @scala.inline
    def setProgressInMegaBytes(value: LongOptional): Self = StObject.set(x, "ProgressInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressInMegaBytesUndefined: Self = StObject.set(x, "ProgressInMegaBytes", js.undefined)
    
    @scala.inline
    def setRequestTime(value: TStamp): Self = StObject.set(x, "RequestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeUndefined: Self = StObject.set(x, "RequestTime", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdentifierUndefined: Self = StObject.set(x, "SnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setSourceDatabaseName(value: String): Self = StObject.set(x, "SourceDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDatabaseNameUndefined: Self = StObject.set(x, "SourceDatabaseName", js.undefined)
    
    @scala.inline
    def setSourceSchemaName(value: String): Self = StObject.set(x, "SourceSchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSchemaNameUndefined: Self = StObject.set(x, "SourceSchemaName", js.undefined)
    
    @scala.inline
    def setSourceTableName(value: String): Self = StObject.set(x, "SourceTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableNameUndefined: Self = StObject.set(x, "SourceTableName", js.undefined)
    
    @scala.inline
    def setStatus(value: TableRestoreStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTableRestoreRequestId(value: String): Self = StObject.set(x, "TableRestoreRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRestoreRequestIdUndefined: Self = StObject.set(x, "TableRestoreRequestId", js.undefined)
    
    @scala.inline
    def setTargetDatabaseName(value: String): Self = StObject.set(x, "TargetDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDatabaseNameUndefined: Self = StObject.set(x, "TargetDatabaseName", js.undefined)
    
    @scala.inline
    def setTargetSchemaName(value: String): Self = StObject.set(x, "TargetSchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSchemaNameUndefined: Self = StObject.set(x, "TargetSchemaName", js.undefined)
    
    @scala.inline
    def setTotalDataInMegaBytes(value: LongOptional): Self = StObject.set(x, "TotalDataInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDataInMegaBytesUndefined: Self = StObject.set(x, "TotalDataInMegaBytes", js.undefined)
  }
}
