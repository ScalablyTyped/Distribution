package typings.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod

import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSourceTableDetails extends SourceTableDetails {
  /**
    * <p>Schema of the table. </p>
    */
  @JSName("KeySchema")
  var KeySchema_UnmarshalledSourceTableDetails: js.Array[UnmarshalledKeySchemaElement] = js.native
  /**
    * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput_UnmarshalledSourceTableDetails: UnmarshalledProvisionedThroughput = js.native
  /**
    * <p>Time when the source table was created. </p>
    */
  @JSName("TableCreationDateTime")
  var TableCreationDateTime_UnmarshalledSourceTableDetails: Date = js.native
}

object UnmarshalledSourceTableDetails {
  @scala.inline
  def apply(
    KeySchema: js.Array[UnmarshalledKeySchemaElement],
    ProvisionedThroughput: UnmarshalledProvisionedThroughput,
    TableCreationDateTime: Date,
    TableId: String,
    TableName: String
  ): UnmarshalledSourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSourceTableDetails]
  }
  @scala.inline
  implicit class UnmarshalledSourceTableDetailsOps[Self <: UnmarshalledSourceTableDetails] (val x: Self) extends AnyVal {
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
    def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    @scala.inline
    def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionedThroughput(value: UnmarshalledProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableCreationDateTime(value: Date): Self = this.set("TableCreationDateTime", value.asInstanceOf[js.Any])
  }
  
}

