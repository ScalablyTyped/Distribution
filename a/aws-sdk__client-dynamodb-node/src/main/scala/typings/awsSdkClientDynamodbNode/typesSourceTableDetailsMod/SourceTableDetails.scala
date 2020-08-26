package typings.awsSdkClientDynamodbNode.typesSourceTableDetailsMod

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceTableDetails extends js.Object {
  /**
    * <p>Number of items in the table. Please note this is an approximate value. </p>
    */
  var ItemCount: js.UndefOr[Double] = js.native
  /**
    * <p>Schema of the table. </p>
    */
  var KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement] = js.native
  /**
    * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
    */
  var ProvisionedThroughput: typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput = js.native
  /**
    * <p>ARN of the table for which backup was created. </p>
    */
  var TableArn: js.UndefOr[String] = js.native
  /**
    * <p>Time when the source table was created. </p>
    */
  var TableCreationDateTime: Date | String | Double = js.native
  /**
    * <p>Unique identifier for the table for which the backup was created. </p>
    */
  var TableId: String = js.native
  /**
    * <p>The name of the table for which the backup was created. </p>
    */
  var TableName: String = js.native
  /**
    * <p>Size of the table in bytes. Please note this is an approximate value.</p>
    */
  var TableSizeBytes: js.UndefOr[Double] = js.native
}

object SourceTableDetails {
  @scala.inline
  def apply(
    KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
    ProvisionedThroughput: ProvisionedThroughput,
    TableCreationDateTime: Date | String | Double,
    TableId: String,
    TableName: String
  ): SourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTableDetails]
  }
  @scala.inline
  implicit class SourceTableDetailsOps[Self <: SourceTableDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    @scala.inline
    def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableCreationDateTime(value: Date | String | Double): Self = this.set("TableCreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableId(value: String): Self = this.set("TableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemCount(value: Double): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCount: Self = this.set("ItemCount", js.undefined)
    @scala.inline
    def setTableArn(value: String): Self = this.set("TableArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableArn: Self = this.set("TableArn", js.undefined)
    @scala.inline
    def setTableSizeBytes(value: Double): Self = this.set("TableSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableSizeBytes: Self = this.set("TableSizeBytes", js.undefined)
  }
  
}

