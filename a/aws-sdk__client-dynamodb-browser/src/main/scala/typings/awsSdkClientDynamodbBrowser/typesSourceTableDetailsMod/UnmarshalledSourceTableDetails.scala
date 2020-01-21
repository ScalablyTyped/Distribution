package typings.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod

import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSourceTableDetails extends SourceTableDetails {
  /**
    * <p>Schema of the table. </p>
    */
  @JSName("KeySchema")
  var KeySchema_UnmarshalledSourceTableDetails: js.Array[UnmarshalledKeySchemaElement]
  /**
    * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput_UnmarshalledSourceTableDetails: UnmarshalledProvisionedThroughput
  /**
    * <p>Time when the source table was created. </p>
    */
  @JSName("TableCreationDateTime")
  var TableCreationDateTime_UnmarshalledSourceTableDetails: Date
}

object UnmarshalledSourceTableDetails {
  @scala.inline
  def apply(
    KeySchema: js.Array[UnmarshalledKeySchemaElement],
    ProvisionedThroughput: UnmarshalledProvisionedThroughput,
    TableCreationDateTime: Date,
    TableId: String,
    TableName: String,
    ItemCount: Int | Double = null,
    TableArn: String = null,
    TableSizeBytes: Int | Double = null
  ): UnmarshalledSourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn.asInstanceOf[js.Any])
    if (TableSizeBytes != null) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSourceTableDetails]
  }
}

