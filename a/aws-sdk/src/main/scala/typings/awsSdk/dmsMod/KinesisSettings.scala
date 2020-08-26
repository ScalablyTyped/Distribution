package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisSettings extends js.Object {
  /**
    * Shows detailed control information for table definition, column definition, and table and column changes in the Kinesis message output. The default is False.
    */
  var IncludeControlDetails: js.UndefOr[BooleanOptional] = js.native
  /**
    * Shows the partition value within the Kinesis message output, unless the partition type is schema-table-type. The default is False.
    */
  var IncludePartitionValue: js.UndefOr[BooleanOptional] = js.native
  /**
    * Includes any data definition language (DDL) operations that change the table in the control data, such as rename-table, drop-table, add-column, drop-column, and rename-column. The default is False.
    */
  var IncludeTableAlterOperations: js.UndefOr[BooleanOptional] = js.native
  /**
    * Provides detailed transaction information from the source database. This information includes a commit timestamp, a log position, and values for transaction_id, previous transaction_id, and transaction_record_id (the record offset within a transaction). The default is False.
    */
  var IncludeTransactionDetails: js.UndefOr[BooleanOptional] = js.native
  /**
    * The output format for the records created on the endpoint. The message format is JSON (default) or JSON_UNFORMATTED (a single line with no tab).
    */
  var MessageFormat: js.UndefOr[MessageFormatValue] = js.native
  /**
    * Prefixes schema and table names to partition values, when the partition type is primary-key-type. Doing this increases data distribution among Kinesis shards. For example, suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary key. In this case, the same primary key is sent from thousands of tables to the same shard, which causes throttling. The default is False.
    */
  var PartitionIncludeSchemaTable: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that AWS DMS uses to write to the Kinesis data stream.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
    */
  var StreamArn: js.UndefOr[String] = js.native
}

object KinesisSettings {
  @scala.inline
  def apply(): KinesisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisSettings]
  }
  @scala.inline
  implicit class KinesisSettingsOps[Self <: KinesisSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIncludeControlDetails(value: BooleanOptional): Self = this.set("IncludeControlDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeControlDetails: Self = this.set("IncludeControlDetails", js.undefined)
    @scala.inline
    def setIncludePartitionValue(value: BooleanOptional): Self = this.set("IncludePartitionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePartitionValue: Self = this.set("IncludePartitionValue", js.undefined)
    @scala.inline
    def setIncludeTableAlterOperations(value: BooleanOptional): Self = this.set("IncludeTableAlterOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeTableAlterOperations: Self = this.set("IncludeTableAlterOperations", js.undefined)
    @scala.inline
    def setIncludeTransactionDetails(value: BooleanOptional): Self = this.set("IncludeTransactionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeTransactionDetails: Self = this.set("IncludeTransactionDetails", js.undefined)
    @scala.inline
    def setMessageFormat(value: MessageFormatValue): Self = this.set("MessageFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageFormat: Self = this.set("MessageFormat", js.undefined)
    @scala.inline
    def setPartitionIncludeSchemaTable(value: BooleanOptional): Self = this.set("PartitionIncludeSchemaTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionIncludeSchemaTable: Self = this.set("PartitionIncludeSchemaTable", js.undefined)
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = this.set("ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccessRoleArn: Self = this.set("ServiceAccessRoleArn", js.undefined)
    @scala.inline
    def setStreamArn(value: String): Self = this.set("StreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamArn: Self = this.set("StreamArn", js.undefined)
  }
  
}

