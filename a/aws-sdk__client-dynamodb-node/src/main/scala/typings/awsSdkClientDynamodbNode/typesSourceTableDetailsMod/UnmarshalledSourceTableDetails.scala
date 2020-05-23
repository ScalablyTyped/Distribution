package typings.awsSdkClientDynamodbNode.typesSourceTableDetailsMod

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
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
    ItemCount: js.UndefOr[Double] = js.undefined,
    TableArn: String = null,
    TableSizeBytes: js.UndefOr[Double] = js.undefined
  ): UnmarshalledSourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (!js.isUndefined(ItemCount)) __obj.updateDynamic("ItemCount")(ItemCount.get.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn.asInstanceOf[js.Any])
    if (!js.isUndefined(TableSizeBytes)) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSourceTableDetails]
  }
}

