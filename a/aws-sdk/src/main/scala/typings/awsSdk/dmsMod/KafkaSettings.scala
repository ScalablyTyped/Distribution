package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KafkaSettings extends js.Object {
  /**
    * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form  broker-hostname-or-ip:port . For example, "ec2-12-345-678-901.compute-1.amazonaws.com:2345".
    */
  var Broker: js.UndefOr[String] = js.native
  /**
    * Shows detailed control information for table definition, column definition, and table and column changes in the Kafka message output. The default is False.
    */
  var IncludeControlDetails: js.UndefOr[BooleanOptional] = js.native
  /**
    * Shows the partition value within the Kafka message output, unless the partition type is schema-table-type. The default is False.
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
    * Prefixes schema and table names to partition values, when the partition type is primary-key-type. Doing this increases data distribution among Kafka partitions. For example, suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary key. In this case, the same primary key is sent from thousands of tables to the same partition, which causes throttling. The default is False.
    */
  var PartitionIncludeSchemaTable: js.UndefOr[BooleanOptional] = js.native
  /**
    * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies "kafka-default-topic" as the migration topic.
    */
  var Topic: js.UndefOr[String] = js.native
}

object KafkaSettings {
  @scala.inline
  def apply(): KafkaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaSettings]
  }
  @scala.inline
  implicit class KafkaSettingsOps[Self <: KafkaSettings] (val x: Self) extends AnyVal {
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
    def setBroker(value: String): Self = this.set("Broker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBroker: Self = this.set("Broker", js.undefined)
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
    def setTopic(value: String): Self = this.set("Topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("Topic", js.undefined)
  }
  
}

