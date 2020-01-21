package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableInput extends js.Object {
  /**
    * A description of the table.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The last time that the table was accessed.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.native
  /**
    * The last time that column statistics were computed for this table.
    */
  var LastAnalyzedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The table name. For Hive compatibility, this is folded to lowercase when it is stored.
    */
  var Name: NameString = js.native
  /**
    * The table owner.
    */
  var Owner: js.UndefOr[NameString] = js.native
  /**
    * These key-value pairs define properties associated with the table.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. When you create a table used by Amazon Athena, and you do not specify any partitionKeys, you must at least set the value of partitionKeys to an empty list. For example:  "PartitionKeys": [] 
    */
  var PartitionKeys: js.UndefOr[ColumnList] = js.native
  /**
    * The retention time for this table.
    */
  var Retention: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * A storage descriptor containing information about the physical storage of this table.
    */
  var StorageDescriptor: js.UndefOr[typings.awsSdk.glueMod.StorageDescriptor] = js.native
  /**
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
    */
  var TableType: js.UndefOr[TableTypeString] = js.native
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  var ViewExpandedText: js.UndefOr[ViewTextString] = js.native
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  var ViewOriginalText: js.UndefOr[ViewTextString] = js.native
}

object TableInput {
  @scala.inline
  def apply(
    Name: NameString,
    Description: DescriptionString = null,
    LastAccessTime: Timestamp = null,
    LastAnalyzedTime: Timestamp = null,
    Owner: NameString = null,
    Parameters: ParametersMap = null,
    PartitionKeys: ColumnList = null,
    Retention: Int | Double = null,
    StorageDescriptor: StorageDescriptor = null,
    TableType: TableTypeString = null,
    ViewExpandedText: ViewTextString = null,
    ViewOriginalText: ViewTextString = null
  ): TableInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastAccessTime != null) __obj.updateDynamic("LastAccessTime")(LastAccessTime.asInstanceOf[js.Any])
    if (LastAnalyzedTime != null) __obj.updateDynamic("LastAnalyzedTime")(LastAnalyzedTime.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (PartitionKeys != null) __obj.updateDynamic("PartitionKeys")(PartitionKeys.asInstanceOf[js.Any])
    if (Retention != null) __obj.updateDynamic("Retention")(Retention.asInstanceOf[js.Any])
    if (StorageDescriptor != null) __obj.updateDynamic("StorageDescriptor")(StorageDescriptor.asInstanceOf[js.Any])
    if (TableType != null) __obj.updateDynamic("TableType")(TableType.asInstanceOf[js.Any])
    if (ViewExpandedText != null) __obj.updateDynamic("ViewExpandedText")(ViewExpandedText.asInstanceOf[js.Any])
    if (ViewOriginalText != null) __obj.updateDynamic("ViewOriginalText")(ViewOriginalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableInput]
  }
}

