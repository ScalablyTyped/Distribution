package typings.awsSdkClientDynamodbNode.typesTableDescriptionMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ACTIVE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import typings.awsSdkClientDynamodbNode.typesAttributeDefinitionMod.UnmarshalledAttributeDefinition
import typings.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexDescriptionMod.UnmarshalledGlobalSecondaryIndexDescription
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesLocalSecondaryIndexDescriptionMod.UnmarshalledLocalSecondaryIndexDescription
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputDescriptionMod.UnmarshalledProvisionedThroughputDescription
import typings.awsSdkClientDynamodbNode.typesRestoreSummaryMod.UnmarshalledRestoreSummary
import typings.awsSdkClientDynamodbNode.typesSsedescriptionMod.UnmarshalledSSEDescription
import typings.awsSdkClientDynamodbNode.typesStreamSpecificationMod.UnmarshalledStreamSpecification
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTableDescription extends TableDescription {
  /**
    * <p>An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the table and index key schema.</p> <p>Each <code>AttributeDefinition</code> object in this array is composed of:</p> <ul> <li> <p> <code>AttributeName</code> - The name of the attribute.</p> </li> <li> <p> <code>AttributeType</code> - The data type for the attribute.</p> </li> </ul>
    */
  @JSName("AttributeDefinitions")
  var AttributeDefinitions_UnmarshalledTableDescription: js.UndefOr[js.Array[UnmarshalledAttributeDefinition]] = js.undefined
  /**
    * <p>The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch time</a> format.</p>
    */
  @JSName("CreationDateTime")
  var CreationDateTime_UnmarshalledTableDescription: js.UndefOr[Date] = js.undefined
  /**
    * <p>The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:</p> <ul> <li> <p> <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a <code>CreateTable</code> operation.)</p> </li> <li> <p> <code>IndexName</code> - The name of the global secondary index.</p> </li> <li> <p> <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value. </p> </li> <li> <p> <code>IndexStatus</code> - The current status of the global secondary index:</p> <ul> <li> <p> <code>CREATING</code> - The index is being created.</p> </li> <li> <p> <code>UPDATING</code> - The index is being updated.</p> </li> <li> <p> <code>DELETING</code> - The index is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The index is ready for use.</p> </li> </ul> </li> <li> <p> <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value. </p> </li> <li> <p> <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.</p> </li> <li> <p> <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:</p> <ul> <li> <p> <code>ProjectionType</code> - One of the following:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul> </li> <li> <p> <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p> </li> </ul> </li> <li> <p> <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases. </p> </li> </ul> <p>If the table is in the <code>DELETING</code> state, no information about indexes will be returned.</p>
    */
  @JSName("GlobalSecondaryIndexes")
  var GlobalSecondaryIndexes_UnmarshalledTableDescription: js.UndefOr[js.Array[UnmarshalledGlobalSecondaryIndexDescription]] = js.undefined
  /**
    * <p>The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:</p> <ul> <li> <p> <code>AttributeName</code> - The name of the attribute.</p> </li> <li> <p> <code>KeyType</code> - The role of the attribute:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note> </li> </ul> <p>For more information about primary keys, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("KeySchema")
  var KeySchema_UnmarshalledTableDescription: js.UndefOr[js.Array[UnmarshalledKeySchemaElement]] = js.undefined
  /**
    * <p>Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:</p> <ul> <li> <p> <code>IndexName</code> - The name of the local secondary index.</p> </li> <li> <p> <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.</p> </li> <li> <p> <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:</p> <ul> <li> <p> <code>ProjectionType</code> - One of the following:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul> </li> <li> <p> <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p> </li> </ul> </li> <li> <p> <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p> </li> <li> <p> <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p> </li> </ul> <p>If the table is in the <code>DELETING</code> state, no information about indexes will be returned.</p>
    */
  @JSName("LocalSecondaryIndexes")
  var LocalSecondaryIndexes_UnmarshalledTableDescription: js.UndefOr[js.Array[UnmarshalledLocalSecondaryIndexDescription]] = js.undefined
  /**
    * <p>The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput_UnmarshalledTableDescription: js.UndefOr[UnmarshalledProvisionedThroughputDescription] = js.undefined
  /**
    * <p>Contains details for the restore.</p>
    */
  @JSName("RestoreSummary")
  var RestoreSummary_UnmarshalledTableDescription: js.UndefOr[UnmarshalledRestoreSummary] = js.undefined
  /**
    * <p>The description of the server-side encryption status on the specified table.</p>
    */
  @JSName("SSEDescription")
  var SSEDescription_UnmarshalledTableDescription: js.UndefOr[UnmarshalledSSEDescription] = js.undefined
  /**
    * <p>The current DynamoDB Streams configuration for the table.</p>
    */
  @JSName("StreamSpecification")
  var StreamSpecification_UnmarshalledTableDescription: js.UndefOr[UnmarshalledStreamSpecification] = js.undefined
}

object UnmarshalledTableDescription {
  @scala.inline
  def apply(
    AttributeDefinitions: js.Array[UnmarshalledAttributeDefinition] = null,
    CreationDateTime: Date = null,
    GlobalSecondaryIndexes: js.Array[UnmarshalledGlobalSecondaryIndexDescription] = null,
    ItemCount: js.UndefOr[Double] = js.undefined,
    KeySchema: js.Array[UnmarshalledKeySchemaElement] = null,
    LatestStreamArn: String = null,
    LatestStreamLabel: String = null,
    LocalSecondaryIndexes: js.Array[UnmarshalledLocalSecondaryIndexDescription] = null,
    ProvisionedThroughput: UnmarshalledProvisionedThroughputDescription = null,
    RestoreSummary: UnmarshalledRestoreSummary = null,
    SSEDescription: UnmarshalledSSEDescription = null,
    StreamSpecification: UnmarshalledStreamSpecification = null,
    TableArn: String = null,
    TableId: String = null,
    TableName: String = null,
    TableSizeBytes: js.UndefOr[Double] = js.undefined,
    TableStatus: CREATING | UPDATING | DELETING | ACTIVE | String = null
  ): UnmarshalledTableDescription = {
    val __obj = js.Dynamic.literal()
    if (AttributeDefinitions != null) __obj.updateDynamic("AttributeDefinitions")(AttributeDefinitions.asInstanceOf[js.Any])
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (!js.isUndefined(ItemCount)) __obj.updateDynamic("ItemCount")(ItemCount.get.asInstanceOf[js.Any])
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema.asInstanceOf[js.Any])
    if (LatestStreamArn != null) __obj.updateDynamic("LatestStreamArn")(LatestStreamArn.asInstanceOf[js.Any])
    if (LatestStreamLabel != null) __obj.updateDynamic("LatestStreamLabel")(LatestStreamLabel.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput.asInstanceOf[js.Any])
    if (RestoreSummary != null) __obj.updateDynamic("RestoreSummary")(RestoreSummary.asInstanceOf[js.Any])
    if (SSEDescription != null) __obj.updateDynamic("SSEDescription")(SSEDescription.asInstanceOf[js.Any])
    if (StreamSpecification != null) __obj.updateDynamic("StreamSpecification")(StreamSpecification.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn.asInstanceOf[js.Any])
    if (TableId != null) __obj.updateDynamic("TableId")(TableId.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    if (!js.isUndefined(TableSizeBytes)) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes.get.asInstanceOf[js.Any])
    if (TableStatus != null) __obj.updateDynamic("TableStatus")(TableStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTableDescription]
  }
}

