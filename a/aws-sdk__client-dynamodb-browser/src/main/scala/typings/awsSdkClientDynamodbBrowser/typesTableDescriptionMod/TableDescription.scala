package typings.awsSdkClientDynamodbBrowser.typesTableDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod.AttributeDefinition
import typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexDescriptionMod.GlobalSecondaryIndexDescription
import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesLocalSecondaryIndexDescriptionMod.LocalSecondaryIndexDescription
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputDescriptionMod.ProvisionedThroughputDescription
import typings.awsSdkClientDynamodbBrowser.typesRestoreSummaryMod.RestoreSummary
import typings.awsSdkClientDynamodbBrowser.typesSsedescriptionMod.SSEDescription
import typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDescription extends js.Object {
  
  /**
    * <p>An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the table and index key schema.</p> <p>Each <code>AttributeDefinition</code> object in this array is composed of:</p> <ul> <li> <p> <code>AttributeName</code> - The name of the attribute.</p> </li> <li> <p> <code>AttributeType</code> - The data type for the attribute.</p> </li> </ul>
    */
  var AttributeDefinitions: js.UndefOr[js.Array[AttributeDefinition] | Iterable[AttributeDefinition]] = js.native
  
  /**
    * <p>The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch time</a> format.</p>
    */
  var CreationDateTime: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:</p> <ul> <li> <p> <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a <code>CreateTable</code> operation.)</p> </li> <li> <p> <code>IndexName</code> - The name of the global secondary index.</p> </li> <li> <p> <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value. </p> </li> <li> <p> <code>IndexStatus</code> - The current status of the global secondary index:</p> <ul> <li> <p> <code>CREATING</code> - The index is being created.</p> </li> <li> <p> <code>UPDATING</code> - The index is being updated.</p> </li> <li> <p> <code>DELETING</code> - The index is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The index is ready for use.</p> </li> </ul> </li> <li> <p> <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value. </p> </li> <li> <p> <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.</p> </li> <li> <p> <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:</p> <ul> <li> <p> <code>ProjectionType</code> - One of the following:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul> </li> <li> <p> <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p> </li> </ul> </li> <li> <p> <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases. </p> </li> </ul> <p>If the table is in the <code>DELETING</code> state, no information about indexes will be returned.</p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[
    js.Array[GlobalSecondaryIndexDescription] | Iterable[GlobalSecondaryIndexDescription]
  ] = js.native
  
  /**
    * <p>The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
    */
  var ItemCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:</p> <ul> <li> <p> <code>AttributeName</code> - The name of the attribute.</p> </li> <li> <p> <code>KeyType</code> - The role of the attribute:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note> </li> </ul> <p>For more information about primary keys, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var KeySchema: js.UndefOr[js.Array[KeySchemaElement] | Iterable[KeySchemaElement]] = js.native
  
  /**
    * <p>The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.</p>
    */
  var LatestStreamArn: js.UndefOr[String] = js.native
  
  /**
    * <p>A timestamp, in ISO 8601 format, for this stream.</p> <p>Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:</p> <ul> <li> <p>the AWS customer ID.</p> </li> <li> <p>the table name.</p> </li> <li> <p>the <code>StreamLabel</code>.</p> </li> </ul>
    */
  var LatestStreamLabel: js.UndefOr[String] = js.native
  
  /**
    * <p>Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:</p> <ul> <li> <p> <code>IndexName</code> - The name of the local secondary index.</p> </li> <li> <p> <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.</p> </li> <li> <p> <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:</p> <ul> <li> <p> <code>ProjectionType</code> - One of the following:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul> </li> <li> <p> <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p> </li> </ul> </li> <li> <p> <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p> </li> <li> <p> <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p> </li> </ul> <p>If the table is in the <code>DELETING</code> state, no information about indexes will be returned.</p>
    */
  var LocalSecondaryIndexes: js.UndefOr[
    js.Array[LocalSecondaryIndexDescription] | Iterable[LocalSecondaryIndexDescription]
  ] = js.native
  
  /**
    * <p>The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.</p>
    */
  var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.native
  
  /**
    * <p>Contains details for the restore.</p>
    */
  var RestoreSummary: js.UndefOr[typings.awsSdkClientDynamodbBrowser.typesRestoreSummaryMod.RestoreSummary] = js.native
  
  /**
    * <p>The description of the server-side encryption status on the specified table.</p>
    */
  var SSEDescription: js.UndefOr[typings.awsSdkClientDynamodbBrowser.typesSsedescriptionMod.SSEDescription] = js.native
  
  /**
    * <p>The current DynamoDB Streams configuration for the table.</p>
    */
  var StreamSpecification: js.UndefOr[
    typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
  ] = js.native
  
  /**
    * <p>The Amazon Resource Name (ARN) that uniquely identifies the table.</p>
    */
  var TableArn: js.UndefOr[String] = js.native
  
  /**
    * <p>Unique identifier for the table for which the backup was created. </p>
    */
  var TableId: js.UndefOr[String] = js.native
  
  /**
    * <p>The name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.native
  
  /**
    * <p>The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
    */
  var TableSizeBytes: js.UndefOr[Double] = js.native
  
  /**
    * <p>The current state of the table:</p> <ul> <li> <p> <code>CREATING</code> - The table is being created.</p> </li> <li> <p> <code>UPDATING</code> - The table is being updated.</p> </li> <li> <p> <code>DELETING</code> - The table is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The table is ready for use.</p> </li> </ul>
    */
  var TableStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.native
}
object TableDescription {
  
  @scala.inline
  def apply(): TableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDescription]
  }
  
  @scala.inline
  implicit class TableDescriptionOps[Self <: TableDescription] (val x: Self) extends AnyVal {
    
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
    def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = this.set("AttributeDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setAttributeDefinitions(value: js.Array[AttributeDefinition] | Iterable[AttributeDefinition]): Self = this.set("AttributeDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeDefinitions: Self = this.set("AttributeDefinitions", js.undefined)
    
    @scala.inline
    def setCreationDateTime(value: Date | String | Double): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("CreationDateTime", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexDescription*): Self = this.set("GlobalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndexDescription] | Iterable[GlobalSecondaryIndexDescription]): Self = this.set("GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSecondaryIndexes: Self = this.set("GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setItemCount(value: Double): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("ItemCount", js.undefined)
    
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySchema: Self = this.set("KeySchema", js.undefined)
    
    @scala.inline
    def setLatestStreamArn(value: String): Self = this.set("LatestStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestStreamArn: Self = this.set("LatestStreamArn", js.undefined)
    
    @scala.inline
    def setLatestStreamLabel(value: String): Self = this.set("LatestStreamLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestStreamLabel: Self = this.set("LatestStreamLabel", js.undefined)
    
    @scala.inline
    def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexDescription*): Self = this.set("LocalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndexDescription] | Iterable[LocalSecondaryIndexDescription]): Self = this.set("LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSecondaryIndexes: Self = this.set("LocalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughputDescription): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedThroughput: Self = this.set("ProvisionedThroughput", js.undefined)
    
    @scala.inline
    def setRestoreSummary(value: RestoreSummary): Self = this.set("RestoreSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreSummary: Self = this.set("RestoreSummary", js.undefined)
    
    @scala.inline
    def setSSEDescription(value: SSEDescription): Self = this.set("SSEDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSEDescription: Self = this.set("SSEDescription", js.undefined)
    
    @scala.inline
    def setStreamSpecification(value: StreamSpecification): Self = this.set("StreamSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamSpecification: Self = this.set("StreamSpecification", js.undefined)
    
    @scala.inline
    def setTableArn(value: String): Self = this.set("TableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableArn: Self = this.set("TableArn", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = this.set("TableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableId: Self = this.set("TableId", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
    
    @scala.inline
    def setTableSizeBytes(value: Double): Self = this.set("TableSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableSizeBytes: Self = this.set("TableSizeBytes", js.undefined)
    
    @scala.inline
    def setTableStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = this.set("TableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStatus: Self = this.set("TableStatus", js.undefined)
  }
}
