package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableStatistics extends StObject {
  
  /**
    * The data definition language (DDL) used to build and modify the structure of your tables.
    */
  var Ddls: js.UndefOr[Long] = js.native
  
  /**
    * The number of delete actions performed on a table.
    */
  var Deletes: js.UndefOr[Long] = js.native
  
  /**
    * The number of rows that failed conditional checks during the full load operation (valid only for migrations where DynamoDB is the target).
    */
  var FullLoadCondtnlChkFailedRows: js.UndefOr[Long] = js.native
  
  /**
    * The time when the full load operation completed.
    */
  var FullLoadEndTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The number of rows that failed to load during the full load operation (valid only for migrations where DynamoDB is the target).
    */
  var FullLoadErrorRows: js.UndefOr[Long] = js.native
  
  /**
    * A value that indicates if the table was reloaded (true) or loaded as part of a new full load operation (false).
    */
  var FullLoadReloaded: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The number of rows added during the full load operation.
    */
  var FullLoadRows: js.UndefOr[Long] = js.native
  
  /**
    * The time when the full load operation started.
    */
  var FullLoadStartTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The number of insert actions performed on a table.
    */
  var Inserts: js.UndefOr[Long] = js.native
  
  /**
    * The last time a table was updated.
    */
  var LastUpdateTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The schema name.
    */
  var SchemaName: js.UndefOr[String] = js.native
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[String] = js.native
  
  /**
    * The state of the tables described. Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table error | Table all | Table updates | Table is being reloaded
    */
  var TableState: js.UndefOr[String] = js.native
  
  /**
    * The number of update actions performed on a table.
    */
  var Updates: js.UndefOr[Long] = js.native
  
  /**
    * The number of records that failed validation.
    */
  var ValidationFailedRecords: js.UndefOr[Long] = js.native
  
  /**
    * The number of records that have yet to be validated.
    */
  var ValidationPendingRecords: js.UndefOr[Long] = js.native
  
  /**
    * The validation state of the table. This parameter can have the following values:   Not enabled – Validation isn't enabled for the table in the migration task.   Pending records – Some records in the table are waiting for validation.   Mismatched records – Some records in the table don't match between the source and target.   Suspended records – Some records in the table couldn't be validated.   No primary key –The table couldn't be validated because it has no primary key.   Table error – The table wasn't validated because it's in an error state and some data wasn't migrated.   Validated – All rows in the table are validated. If the table is updated, the status can change from Validated.   Error – The table couldn't be validated because of an unexpected error.   Pending validation – The table is waiting validation.   Preparing table – Preparing the table enabled in the migration task for validation.   Pending revalidation – All rows in the table are pending validation after the table was updated.  
    */
  var ValidationState: js.UndefOr[String] = js.native
  
  /**
    * Additional details about the state of validation.
    */
  var ValidationStateDetails: js.UndefOr[String] = js.native
  
  /**
    * The number of records that couldn't be validated.
    */
  var ValidationSuspendedRecords: js.UndefOr[Long] = js.native
}
object TableStatistics {
  
  @scala.inline
  def apply(): TableStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStatistics]
  }
  
  @scala.inline
  implicit class TableStatisticsMutableBuilder[Self <: TableStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDdls(value: Long): Self = StObject.set(x, "Ddls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdlsUndefined: Self = StObject.set(x, "Ddls", js.undefined)
    
    @scala.inline
    def setDeletes(value: Long): Self = StObject.set(x, "Deletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletesUndefined: Self = StObject.set(x, "Deletes", js.undefined)
    
    @scala.inline
    def setFullLoadCondtnlChkFailedRows(value: Long): Self = StObject.set(x, "FullLoadCondtnlChkFailedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLoadCondtnlChkFailedRowsUndefined: Self = StObject.set(x, "FullLoadCondtnlChkFailedRows", js.undefined)
    
    @scala.inline
    def setFullLoadEndTime(value: TStamp): Self = StObject.set(x, "FullLoadEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLoadEndTimeUndefined: Self = StObject.set(x, "FullLoadEndTime", js.undefined)
    
    @scala.inline
    def setFullLoadErrorRows(value: Long): Self = StObject.set(x, "FullLoadErrorRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLoadErrorRowsUndefined: Self = StObject.set(x, "FullLoadErrorRows", js.undefined)
    
    @scala.inline
    def setFullLoadReloaded(value: BooleanOptional): Self = StObject.set(x, "FullLoadReloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLoadReloadedUndefined: Self = StObject.set(x, "FullLoadReloaded", js.undefined)
    
    @scala.inline
    def setFullLoadRows(value: Long): Self = StObject.set(x, "FullLoadRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLoadRowsUndefined: Self = StObject.set(x, "FullLoadRows", js.undefined)
    
    @scala.inline
    def setFullLoadStartTime(value: TStamp): Self = StObject.set(x, "FullLoadStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLoadStartTimeUndefined: Self = StObject.set(x, "FullLoadStartTime", js.undefined)
    
    @scala.inline
    def setInserts(value: Long): Self = StObject.set(x, "Inserts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertsUndefined: Self = StObject.set(x, "Inserts", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: TStamp): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    @scala.inline
    def setTableState(value: String): Self = StObject.set(x, "TableState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStateUndefined: Self = StObject.set(x, "TableState", js.undefined)
    
    @scala.inline
    def setUpdates(value: Long): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesUndefined: Self = StObject.set(x, "Updates", js.undefined)
    
    @scala.inline
    def setValidationFailedRecords(value: Long): Self = StObject.set(x, "ValidationFailedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationFailedRecordsUndefined: Self = StObject.set(x, "ValidationFailedRecords", js.undefined)
    
    @scala.inline
    def setValidationPendingRecords(value: Long): Self = StObject.set(x, "ValidationPendingRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationPendingRecordsUndefined: Self = StObject.set(x, "ValidationPendingRecords", js.undefined)
    
    @scala.inline
    def setValidationState(value: String): Self = StObject.set(x, "ValidationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStateDetails(value: String): Self = StObject.set(x, "ValidationStateDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStateDetailsUndefined: Self = StObject.set(x, "ValidationStateDetails", js.undefined)
    
    @scala.inline
    def setValidationStateUndefined: Self = StObject.set(x, "ValidationState", js.undefined)
    
    @scala.inline
    def setValidationSuspendedRecords(value: Long): Self = StObject.set(x, "ValidationSuspendedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSuspendedRecordsUndefined: Self = StObject.set(x, "ValidationSuspendedRecords", js.undefined)
  }
}
