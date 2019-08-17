package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreSourceTableDetailsMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreKeySchemaElementMod._KeySchemaElement
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreProvisionedThroughputMod._ProvisionedThroughput
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SourceTableDetails extends js.Object {
  /**
    * <p>Number of items in the table. Please note this is an approximate value. </p>
    */
  var ItemCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>Schema of the table. </p>
    */
  var KeySchema: js.Array[_KeySchemaElement] | Iterable[_KeySchemaElement]
  /**
    * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
    */
  var ProvisionedThroughput: _ProvisionedThroughput
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

object _SourceTableDetails {
  @scala.inline
  def apply(
    KeySchema: js.Array[_KeySchemaElement] | Iterable[_KeySchemaElement],
    ProvisionedThroughput: _ProvisionedThroughput,
    TableCreationDateTime: Date | String | Double,
    TableId: String,
    TableName: String,
    ItemCount: Int | Double = null,
    TableArn: String = null,
    TableSizeBytes: Int | Double = null
  ): _SourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput, TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId, TableName = TableName)
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn)
    if (TableSizeBytes != null) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SourceTableDetails]
  }
}

