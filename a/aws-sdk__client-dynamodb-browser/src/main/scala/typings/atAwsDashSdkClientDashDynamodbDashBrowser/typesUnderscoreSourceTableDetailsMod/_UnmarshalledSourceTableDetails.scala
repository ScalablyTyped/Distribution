package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreSourceTableDetailsMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreKeySchemaElementMod._UnmarshalledKeySchemaElement
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreProvisionedThroughputMod._UnmarshalledProvisionedThroughput
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSourceTableDetails extends _SourceTableDetails {
  /**
    * <p>Schema of the table. </p>
    */
  @JSName("KeySchema")
  var KeySchema__UnmarshalledSourceTableDetails: js.Array[_UnmarshalledKeySchemaElement]
  /**
    * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput__UnmarshalledSourceTableDetails: _UnmarshalledProvisionedThroughput
  /**
    * <p>Time when the source table was created. </p>
    */
  @JSName("TableCreationDateTime")
  var TableCreationDateTime__UnmarshalledSourceTableDetails: Date
}

object _UnmarshalledSourceTableDetails {
  @scala.inline
  def apply(
    KeySchema: js.Array[_UnmarshalledKeySchemaElement],
    ProvisionedThroughput: _UnmarshalledProvisionedThroughput,
    TableCreationDateTime: Date,
    TableId: String,
    TableName: String,
    ItemCount: Int | Double = null,
    TableArn: String = null,
    TableSizeBytes: Int | Double = null
  ): _UnmarshalledSourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema, ProvisionedThroughput = ProvisionedThroughput, TableCreationDateTime = TableCreationDateTime, TableId = TableId, TableName = TableName)
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn)
    if (TableSizeBytes != null) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSourceTableDetails]
  }
}

