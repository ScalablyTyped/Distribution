package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaSettings extends StObject {
  
  /**
    * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form  broker-hostname-or-ip:port . For example, "ec2-12-345-678-901.compute-1.amazonaws.com:2345".
    */
  var Broker: js.UndefOr[String] = js.undefined
  
  /**
    * Shows detailed control information for table definition, column definition, and table and column changes in the Kafka message output. The default is false.
    */
  var IncludeControlDetails: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Include NULL and empty columns for records migrated to the endpoint. The default is false.
    */
  var IncludeNullAndEmpty: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Shows the partition value within the Kafka message output, unless the partition type is schema-table-type. The default is false.
    */
  var IncludePartitionValue: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Includes any data definition language (DDL) operations that change the table in the control data, such as rename-table, drop-table, add-column, drop-column, and rename-column. The default is false.
    */
  var IncludeTableAlterOperations: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Provides detailed transaction information from the source database. This information includes a commit timestamp, a log position, and values for transaction_id, previous transaction_id, and transaction_record_id (the record offset within a transaction). The default is false.
    */
  var IncludeTransactionDetails: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The output format for the records created on the endpoint. The message format is JSON (default) or JSON_UNFORMATTED (a single line with no tab).
    */
  var MessageFormat: js.UndefOr[MessageFormatValue] = js.undefined
  
  /**
    * The maximum size in bytes for records created on the endpoint The default is 1,000,000.
    */
  var MessageMaxBytes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Prefixes schema and table names to partition values, when the partition type is primary-key-type. Doing this increases data distribution among Kafka partitions. For example, suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary key. In this case, the same primary key is sent from thousands of tables to the same partition, which causes throttling. The default is false.
    */
  var PartitionIncludeSchemaTable: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies "kafka-default-topic" as the migration topic.
    */
  var Topic: js.UndefOr[String] = js.undefined
}
object KafkaSettings {
  
  @scala.inline
  def apply(): KafkaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaSettings]
  }
  
  @scala.inline
  implicit class KafkaSettingsMutableBuilder[Self <: KafkaSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroker(value: String): Self = StObject.set(x, "Broker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerUndefined: Self = StObject.set(x, "Broker", js.undefined)
    
    @scala.inline
    def setIncludeControlDetails(value: BooleanOptional): Self = StObject.set(x, "IncludeControlDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeControlDetailsUndefined: Self = StObject.set(x, "IncludeControlDetails", js.undefined)
    
    @scala.inline
    def setIncludeNullAndEmpty(value: BooleanOptional): Self = StObject.set(x, "IncludeNullAndEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNullAndEmptyUndefined: Self = StObject.set(x, "IncludeNullAndEmpty", js.undefined)
    
    @scala.inline
    def setIncludePartitionValue(value: BooleanOptional): Self = StObject.set(x, "IncludePartitionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePartitionValueUndefined: Self = StObject.set(x, "IncludePartitionValue", js.undefined)
    
    @scala.inline
    def setIncludeTableAlterOperations(value: BooleanOptional): Self = StObject.set(x, "IncludeTableAlterOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTableAlterOperationsUndefined: Self = StObject.set(x, "IncludeTableAlterOperations", js.undefined)
    
    @scala.inline
    def setIncludeTransactionDetails(value: BooleanOptional): Self = StObject.set(x, "IncludeTransactionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTransactionDetailsUndefined: Self = StObject.set(x, "IncludeTransactionDetails", js.undefined)
    
    @scala.inline
    def setMessageFormat(value: MessageFormatValue): Self = StObject.set(x, "MessageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFormatUndefined: Self = StObject.set(x, "MessageFormat", js.undefined)
    
    @scala.inline
    def setMessageMaxBytes(value: IntegerOptional): Self = StObject.set(x, "MessageMaxBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageMaxBytesUndefined: Self = StObject.set(x, "MessageMaxBytes", js.undefined)
    
    @scala.inline
    def setPartitionIncludeSchemaTable(value: BooleanOptional): Self = StObject.set(x, "PartitionIncludeSchemaTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionIncludeSchemaTableUndefined: Self = StObject.set(x, "PartitionIncludeSchemaTable", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "Topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "Topic", js.undefined)
  }
}
