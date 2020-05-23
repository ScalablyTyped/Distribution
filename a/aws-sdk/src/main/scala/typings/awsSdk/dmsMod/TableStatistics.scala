package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The validation state of the table. This parameter can have the following values:   Not enabled - Validation isn't enabled for the table in the migration task.   Pending records - Some records in the table are waiting for validation.   Mismatched records - Some records in the table don't match between the source and target.   Suspended records - Some records in the table couldn't be validated.   No primary key - The table couldn't be validated because it has no primary key.   Table error - The table wasn't validated because it's in an error state and some data wasn't migrated.   Validated - All rows in the table are validated. If the table is updated, the status can change from Validated.   Error - The table couldn't be validated because of an unexpected error.  
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
  def apply(
    Ddls: js.UndefOr[Long] = js.undefined,
    Deletes: js.UndefOr[Long] = js.undefined,
    FullLoadCondtnlChkFailedRows: js.UndefOr[Long] = js.undefined,
    FullLoadEndTime: TStamp = null,
    FullLoadErrorRows: js.UndefOr[Long] = js.undefined,
    FullLoadReloaded: js.UndefOr[BooleanOptional] = js.undefined,
    FullLoadRows: js.UndefOr[Long] = js.undefined,
    FullLoadStartTime: TStamp = null,
    Inserts: js.UndefOr[Long] = js.undefined,
    LastUpdateTime: TStamp = null,
    SchemaName: String = null,
    TableName: String = null,
    TableState: String = null,
    Updates: js.UndefOr[Long] = js.undefined,
    ValidationFailedRecords: js.UndefOr[Long] = js.undefined,
    ValidationPendingRecords: js.UndefOr[Long] = js.undefined,
    ValidationState: String = null,
    ValidationStateDetails: String = null,
    ValidationSuspendedRecords: js.UndefOr[Long] = js.undefined
  ): TableStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Ddls)) __obj.updateDynamic("Ddls")(Ddls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Deletes)) __obj.updateDynamic("Deletes")(Deletes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FullLoadCondtnlChkFailedRows)) __obj.updateDynamic("FullLoadCondtnlChkFailedRows")(FullLoadCondtnlChkFailedRows.get.asInstanceOf[js.Any])
    if (FullLoadEndTime != null) __obj.updateDynamic("FullLoadEndTime")(FullLoadEndTime.asInstanceOf[js.Any])
    if (!js.isUndefined(FullLoadErrorRows)) __obj.updateDynamic("FullLoadErrorRows")(FullLoadErrorRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FullLoadReloaded)) __obj.updateDynamic("FullLoadReloaded")(FullLoadReloaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FullLoadRows)) __obj.updateDynamic("FullLoadRows")(FullLoadRows.get.asInstanceOf[js.Any])
    if (FullLoadStartTime != null) __obj.updateDynamic("FullLoadStartTime")(FullLoadStartTime.asInstanceOf[js.Any])
    if (!js.isUndefined(Inserts)) __obj.updateDynamic("Inserts")(Inserts.get.asInstanceOf[js.Any])
    if (LastUpdateTime != null) __obj.updateDynamic("LastUpdateTime")(LastUpdateTime.asInstanceOf[js.Any])
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    if (TableState != null) __obj.updateDynamic("TableState")(TableState.asInstanceOf[js.Any])
    if (!js.isUndefined(Updates)) __obj.updateDynamic("Updates")(Updates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ValidationFailedRecords)) __obj.updateDynamic("ValidationFailedRecords")(ValidationFailedRecords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ValidationPendingRecords)) __obj.updateDynamic("ValidationPendingRecords")(ValidationPendingRecords.get.asInstanceOf[js.Any])
    if (ValidationState != null) __obj.updateDynamic("ValidationState")(ValidationState.asInstanceOf[js.Any])
    if (ValidationStateDetails != null) __obj.updateDynamic("ValidationStateDetails")(ValidationStateDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(ValidationSuspendedRecords)) __obj.updateDynamic("ValidationSuspendedRecords")(ValidationSuspendedRecords.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStatistics]
  }
}

