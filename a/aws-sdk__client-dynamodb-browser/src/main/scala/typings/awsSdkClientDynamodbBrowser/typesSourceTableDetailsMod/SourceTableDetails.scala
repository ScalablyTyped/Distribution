package typings.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod

import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceTableDetails extends js.Object {
  /**
    * <p>Number of items in the table. Please note this is an approximate value. </p>
    */
  var ItemCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>Schema of the table. </p>
    */
  var KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]
  /**
    * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
    */
  var ProvisionedThroughput: typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
  /**
    * <p>ARN of the table for which backup was created. </p>
    */
  var TableArn: js.UndefOr[String] = js.undefined
  /**
    * <p>Time when the source table was created. </p>
    */
  var TableCreationDateTime: Date | String | Double
  /**
    * <p>Unique identifier for the table for which the backup was created. </p>
    */
  var TableId: String
  /**
    * <p>The name of the table for which the backup was created. </p>
    */
  var TableName: String
  /**
    * <p>Size of the table in bytes. Please note this is an approximate value.</p>
    */
  var TableSizeBytes: js.UndefOr[Double] = js.undefined
}

object SourceTableDetails {
  @scala.inline
  def apply(
    KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
    ProvisionedThroughput: ProvisionedThroughput,
    TableCreationDateTime: Date | String | Double,
    TableId: String,
    TableName: String,
    ItemCount: Int | Double = null,
    TableArn: String = null,
    TableSizeBytes: Int | Double = null
  ): SourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn.asInstanceOf[js.Any])
    if (TableSizeBytes != null) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTableDetails]
  }
}

