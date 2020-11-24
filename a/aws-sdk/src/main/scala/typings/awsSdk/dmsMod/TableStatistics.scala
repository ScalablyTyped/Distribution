package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableStatistics extends js.Object {
  
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
  implicit class TableStatisticsOps[Self <: TableStatistics] (val x: Self) extends AnyVal {
    
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
    def setDdls(value: Long): Self = this.set("Ddls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdls: Self = this.set("Ddls", js.undefined)
    
    @scala.inline
    def setDeletes(value: Long): Self = this.set("Deletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletes: Self = this.set("Deletes", js.undefined)
    
    @scala.inline
    def setFullLoadCondtnlChkFailedRows(value: Long): Self = this.set("FullLoadCondtnlChkFailedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullLoadCondtnlChkFailedRows: Self = this.set("FullLoadCondtnlChkFailedRows", js.undefined)
    
    @scala.inline
    def setFullLoadEndTime(value: TStamp): Self = this.set("FullLoadEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullLoadEndTime: Self = this.set("FullLoadEndTime", js.undefined)
    
    @scala.inline
    def setFullLoadErrorRows(value: Long): Self = this.set("FullLoadErrorRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullLoadErrorRows: Self = this.set("FullLoadErrorRows", js.undefined)
    
    @scala.inline
    def setFullLoadReloaded(value: BooleanOptional): Self = this.set("FullLoadReloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullLoadReloaded: Self = this.set("FullLoadReloaded", js.undefined)
    
    @scala.inline
    def setFullLoadRows(value: Long): Self = this.set("FullLoadRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullLoadRows: Self = this.set("FullLoadRows", js.undefined)
    
    @scala.inline
    def setFullLoadStartTime(value: TStamp): Self = this.set("FullLoadStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullLoadStartTime: Self = this.set("FullLoadStartTime", js.undefined)
    
    @scala.inline
    def setInserts(value: Long): Self = this.set("Inserts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInserts: Self = this.set("Inserts", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: TStamp): Self = this.set("LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("LastUpdateTime", js.undefined)
    
    @scala.inline
    def setSchemaName(value: String): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaName: Self = this.set("SchemaName", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
    
    @scala.inline
    def setTableState(value: String): Self = this.set("TableState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableState: Self = this.set("TableState", js.undefined)
    
    @scala.inline
    def setUpdates(value: Long): Self = this.set("Updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdates: Self = this.set("Updates", js.undefined)
    
    @scala.inline
    def setValidationFailedRecords(value: Long): Self = this.set("ValidationFailedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationFailedRecords: Self = this.set("ValidationFailedRecords", js.undefined)
    
    @scala.inline
    def setValidationPendingRecords(value: Long): Self = this.set("ValidationPendingRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationPendingRecords: Self = this.set("ValidationPendingRecords", js.undefined)
    
    @scala.inline
    def setValidationState(value: String): Self = this.set("ValidationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationState: Self = this.set("ValidationState", js.undefined)
    
    @scala.inline
    def setValidationStateDetails(value: String): Self = this.set("ValidationStateDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationStateDetails: Self = this.set("ValidationStateDetails", js.undefined)
    
    @scala.inline
    def setValidationSuspendedRecords(value: Long): Self = this.set("ValidationSuspendedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationSuspendedRecords: Self = this.set("ValidationSuspendedRecords", js.undefined)
  }
}
