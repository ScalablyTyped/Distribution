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
  def apply(
    IncludeControlDetails: js.UndefOr[BooleanOptional] = js.undefined,
    IncludePartitionValue: js.UndefOr[BooleanOptional] = js.undefined,
    IncludeTableAlterOperations: js.UndefOr[BooleanOptional] = js.undefined,
    IncludeTransactionDetails: js.UndefOr[BooleanOptional] = js.undefined,
    MessageFormat: MessageFormatValue = null,
    PartitionIncludeSchemaTable: js.UndefOr[BooleanOptional] = js.undefined,
    ServiceAccessRoleArn: String = null,
    StreamArn: String = null
  ): KinesisSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IncludeControlDetails)) __obj.updateDynamic("IncludeControlDetails")(IncludeControlDetails.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludePartitionValue)) __obj.updateDynamic("IncludePartitionValue")(IncludePartitionValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeTableAlterOperations)) __obj.updateDynamic("IncludeTableAlterOperations")(IncludeTableAlterOperations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeTransactionDetails)) __obj.updateDynamic("IncludeTransactionDetails")(IncludeTransactionDetails.get.asInstanceOf[js.Any])
    if (MessageFormat != null) __obj.updateDynamic("MessageFormat")(MessageFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(PartitionIncludeSchemaTable)) __obj.updateDynamic("PartitionIncludeSchemaTable")(PartitionIncludeSchemaTable.get.asInstanceOf[js.Any])
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn.asInstanceOf[js.Any])
    if (StreamArn != null) __obj.updateDynamic("StreamArn")(StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisSettings]
  }
}

