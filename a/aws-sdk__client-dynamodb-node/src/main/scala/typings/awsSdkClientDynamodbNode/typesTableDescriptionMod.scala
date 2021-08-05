package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ACTIVE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import typings.awsSdkClientDynamodbNode.typesAttributeDefinitionMod.AttributeDefinition
import typings.awsSdkClientDynamodbNode.typesAttributeDefinitionMod.UnmarshalledAttributeDefinition
import typings.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexDescriptionMod.GlobalSecondaryIndexDescription
import typings.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexDescriptionMod.UnmarshalledGlobalSecondaryIndexDescription
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesLocalSecondaryIndexDescriptionMod.LocalSecondaryIndexDescription
import typings.awsSdkClientDynamodbNode.typesLocalSecondaryIndexDescriptionMod.UnmarshalledLocalSecondaryIndexDescription
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputDescriptionMod.ProvisionedThroughputDescription
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputDescriptionMod.UnmarshalledProvisionedThroughputDescription
import typings.awsSdkClientDynamodbNode.typesRestoreSummaryMod.RestoreSummary
import typings.awsSdkClientDynamodbNode.typesRestoreSummaryMod.UnmarshalledRestoreSummary
import typings.awsSdkClientDynamodbNode.typesSsedescriptionMod.SSEDescription
import typings.awsSdkClientDynamodbNode.typesSsedescriptionMod.UnmarshalledSSEDescription
import typings.awsSdkClientDynamodbNode.typesStreamSpecificationMod.StreamSpecification
import typings.awsSdkClientDynamodbNode.typesStreamSpecificationMod.UnmarshalledStreamSpecification
import typings.std.Date
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTableDescriptionMod {
  
  trait TableDescription extends StObject {
    
    /**
      * <p>An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the table and index key schema.</p> <p>Each <code>AttributeDefinition</code> object in this array is composed of:</p> <ul> <li> <p> <code>AttributeName</code> - The name of the attribute.</p> </li> <li> <p> <code>AttributeType</code> - The data type for the attribute.</p> </li> </ul>
      */
    var AttributeDefinitions: js.UndefOr[js.Array[AttributeDefinition] | Iterable[AttributeDefinition]] = js.undefined
    
    /**
      * <p>The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch time</a> format.</p>
      */
    var CreationDateTime: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p>The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:</p> <ul> <li> <p> <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a <code>CreateTable</code> operation.)</p> </li> <li> <p> <code>IndexName</code> - The name of the global secondary index.</p> </li> <li> <p> <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value. </p> </li> <li> <p> <code>IndexStatus</code> - The current status of the global secondary index:</p> <ul> <li> <p> <code>CREATING</code> - The index is being created.</p> </li> <li> <p> <code>UPDATING</code> - The index is being updated.</p> </li> <li> <p> <code>DELETING</code> - The index is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The index is ready for use.</p> </li> </ul> </li> <li> <p> <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value. </p> </li> <li> <p> <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.</p> </li> <li> <p> <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:</p> <ul> <li> <p> <code>ProjectionType</code> - One of the following:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul> </li> <li> <p> <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p> </li> </ul> </li> <li> <p> <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases. </p> </li> </ul> <p>If the table is in the <code>DELETING</code> state, no information about indexes will be returned.</p>
      */
    var GlobalSecondaryIndexes: js.UndefOr[
        js.Array[GlobalSecondaryIndexDescription] | Iterable[GlobalSecondaryIndexDescription]
      ] = js.undefined
    
    /**
      * <p>The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
      */
    var ItemCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:</p> <ul> <li> <p> <code>AttributeName</code> - The name of the attribute.</p> </li> <li> <p> <code>KeyType</code> - The role of the attribute:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note> </li> </ul> <p>For more information about primary keys, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var KeySchema: js.UndefOr[js.Array[KeySchemaElement] | Iterable[KeySchemaElement]] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.</p>
      */
    var LatestStreamArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A timestamp, in ISO 8601 format, for this stream.</p> <p>Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:</p> <ul> <li> <p>the AWS customer ID.</p> </li> <li> <p>the table name.</p> </li> <li> <p>the <code>StreamLabel</code>.</p> </li> </ul>
      */
    var LatestStreamLabel: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:</p> <ul> <li> <p> <code>IndexName</code> - The name of the local secondary index.</p> </li> <li> <p> <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.</p> </li> <li> <p> <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:</p> <ul> <li> <p> <code>ProjectionType</code> - One of the following:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul> </li> <li> <p> <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p> </li> </ul> </li> <li> <p> <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p> </li> <li> <p> <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p> </li> </ul> <p>If the table is in the <code>DELETING</code> state, no information about indexes will be returned.</p>
      */
    var LocalSecondaryIndexes: js.UndefOr[
        js.Array[LocalSecondaryIndexDescription] | Iterable[LocalSecondaryIndexDescription]
      ] = js.undefined
    
    /**
      * <p>The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.</p>
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined
    
    /**
      * <p>Contains details for the restore.</p>
      */
    var RestoreSummary: js.UndefOr[typings.awsSdkClientDynamodbNode.typesRestoreSummaryMod.RestoreSummary] = js.undefined
    
    /**
      * <p>The description of the server-side encryption status on the specified table.</p>
      */
    var SSEDescription: js.UndefOr[typings.awsSdkClientDynamodbNode.typesSsedescriptionMod.SSEDescription] = js.undefined
    
    /**
      * <p>The current DynamoDB Streams configuration for the table.</p>
      */
    var StreamSpecification: js.UndefOr[typings.awsSdkClientDynamodbNode.typesStreamSpecificationMod.StreamSpecification] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) that uniquely identifies the table.</p>
      */
    var TableArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Unique identifier for the table for which the backup was created. </p>
      */
    var TableId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the table.</p>
      */
    var TableName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
      */
    var TableSizeBytes: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The current state of the table:</p> <ul> <li> <p> <code>CREATING</code> - The table is being created.</p> </li> <li> <p> <code>UPDATING</code> - The table is being updated.</p> </li> <li> <p> <code>DELETING</code> - The table is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The table is ready for use.</p> </li> </ul>
      */
    var TableStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.undefined
  }
  object TableDescription {
    
    inline def apply(): TableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableDescription]
    }
    
    extension [Self <: TableDescription](x: Self) {
      
      inline def setAttributeDefinitions(value: js.Array[AttributeDefinition] | Iterable[AttributeDefinition]): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      inline def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
      
      inline def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
      
      inline def setCreationDateTime(value: Date | String | Double): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      inline def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndexDescription] | Iterable[GlobalSecondaryIndexDescription]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      inline def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      inline def setLatestStreamArn(value: String): Self = StObject.set(x, "LatestStreamArn", value.asInstanceOf[js.Any])
      
      inline def setLatestStreamArnUndefined: Self = StObject.set(x, "LatestStreamArn", js.undefined)
      
      inline def setLatestStreamLabel(value: String): Self = StObject.set(x, "LatestStreamLabel", value.asInstanceOf[js.Any])
      
      inline def setLatestStreamLabelUndefined: Self = StObject.set(x, "LatestStreamLabel", js.undefined)
      
      inline def setLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndexDescription] | Iterable[LocalSecondaryIndexDescription]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexDescription*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      inline def setProvisionedThroughput(value: ProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      inline def setRestoreSummary(value: RestoreSummary): Self = StObject.set(x, "RestoreSummary", value.asInstanceOf[js.Any])
      
      inline def setRestoreSummaryUndefined: Self = StObject.set(x, "RestoreSummary", js.undefined)
      
      inline def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      inline def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      inline def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      inline def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
      
      inline def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      inline def setTableId(value: String): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      inline def setTableSizeBytes(value: Double): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
      
      inline def setTableStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
      
      inline def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
    }
  }
  
  trait UnmarshalledTableDescription
    extends StObject
       with TableDescription {
    
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
    
    inline def apply(): UnmarshalledTableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTableDescription]
    }
    
    extension [Self <: UnmarshalledTableDescription](x: Self) {
      
      inline def setAttributeDefinitions(value: js.Array[UnmarshalledAttributeDefinition]): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      inline def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
      
      inline def setAttributeDefinitionsVarargs(value: UnmarshalledAttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
      
      inline def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      inline def setGlobalSecondaryIndexes(value: js.Array[UnmarshalledGlobalSecondaryIndexDescription]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: UnmarshalledGlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      inline def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      inline def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      inline def setLocalSecondaryIndexes(value: js.Array[UnmarshalledLocalSecondaryIndexDescription]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexesVarargs(value: UnmarshalledLocalSecondaryIndexDescription*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      inline def setProvisionedThroughput(value: UnmarshalledProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      inline def setRestoreSummary(value: UnmarshalledRestoreSummary): Self = StObject.set(x, "RestoreSummary", value.asInstanceOf[js.Any])
      
      inline def setRestoreSummaryUndefined: Self = StObject.set(x, "RestoreSummary", js.undefined)
      
      inline def setSSEDescription(value: UnmarshalledSSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      inline def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      inline def setStreamSpecification(value: UnmarshalledStreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      inline def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
    }
  }
}
