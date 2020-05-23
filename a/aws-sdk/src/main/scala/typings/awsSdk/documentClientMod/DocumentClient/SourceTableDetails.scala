package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceTableDetails extends js.Object {
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
    */
  var BillingMode: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BillingMode] = js.native
  /**
    * Number of items in the table. Note that this is an approximate value. 
    */
  var ItemCount: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ItemCount] = js.native
  /**
    * Schema of the table. 
    */
  var KeySchema: typings.awsSdk.documentClientMod.DocumentClient.KeySchema = js.native
  /**
    * Read IOPs and Write IOPS on the table when the backup was created.
    */
  var ProvisionedThroughput: typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput = js.native
  /**
    * ARN of the table for which backup was created. 
    */
  var TableArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableArn] = js.native
  /**
    * Time when the source table was created. 
    */
  var TableCreationDateTime: typings.awsSdk.documentClientMod.DocumentClient.TableCreationDateTime = js.native
  /**
    * Unique identifier for the table for which the backup was created. 
    */
  var TableId: typings.awsSdk.documentClientMod.DocumentClient.TableId = js.native
  /**
    * The name of the table for which the backup was created. 
    */
  var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  /**
    * Size of the table in bytes. Note that this is an approximate value.
    */
  var TableSizeBytes: js.UndefOr[Long] = js.native
}

object SourceTableDetails {
  @scala.inline
  def apply(
    KeySchema: KeySchema,
    ProvisionedThroughput: ProvisionedThroughput,
    TableCreationDateTime: TableCreationDateTime,
    TableId: TableId,
    TableName: TableName,
    BillingMode: BillingMode = null,
    ItemCount: js.UndefOr[ItemCount] = js.undefined,
    TableArn: TableArn = null,
    TableSizeBytes: js.UndefOr[Long] = js.undefined
  ): SourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (BillingMode != null) __obj.updateDynamic("BillingMode")(BillingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(ItemCount)) __obj.updateDynamic("ItemCount")(ItemCount.get.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn.asInstanceOf[js.Any])
    if (!js.isUndefined(TableSizeBytes)) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTableDetails]
  }
}

