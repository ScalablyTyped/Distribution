package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod.AttributeDefinition
import typings.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod.UnmarshalledAttributeDefinition
import typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexDescriptionMod.GlobalSecondaryIndexDescription
import typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexDescriptionMod.UnmarshalledGlobalSecondaryIndexDescription
import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesLocalSecondaryIndexDescriptionMod.LocalSecondaryIndexDescription
import typings.awsSdkClientDynamodbBrowser.typesLocalSecondaryIndexDescriptionMod.UnmarshalledLocalSecondaryIndexDescription
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputDescriptionMod.ProvisionedThroughputDescription
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputDescriptionMod.UnmarshalledProvisionedThroughputDescription
import typings.awsSdkClientDynamodbBrowser.typesRestoreSummaryMod.RestoreSummary
import typings.awsSdkClientDynamodbBrowser.typesRestoreSummaryMod.UnmarshalledRestoreSummary
import typings.awsSdkClientDynamodbBrowser.typesSsedescriptionMod.SSEDescription
import typings.awsSdkClientDynamodbBrowser.typesSsedescriptionMod.UnmarshalledSSEDescription
import typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
import typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.UnmarshalledStreamSpecification
import typings.std.Date
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTableDescriptionMod {
  
  @js.native
  trait TableDescription extends StObject {
    
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
    implicit class TableDescriptionMutableBuilder[Self <: TableDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeDefinitions(value: js.Array[AttributeDefinition] | Iterable[AttributeDefinition]): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
      
      @scala.inline
      def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setCreationDateTime(value: Date | String | Double): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndexDescription] | Iterable[GlobalSecondaryIndexDescription]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      @scala.inline
      def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setLatestStreamArn(value: String): Self = StObject.set(x, "LatestStreamArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestStreamArnUndefined: Self = StObject.set(x, "LatestStreamArn", js.undefined)
      
      @scala.inline
      def setLatestStreamLabel(value: String): Self = StObject.set(x, "LatestStreamLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestStreamLabelUndefined: Self = StObject.set(x, "LatestStreamLabel", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndexDescription] | Iterable[LocalSecondaryIndexDescription]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexDescription*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      @scala.inline
      def setRestoreSummary(value: RestoreSummary): Self = StObject.set(x, "RestoreSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreSummaryUndefined: Self = StObject.set(x, "RestoreSummary", js.undefined)
      
      @scala.inline
      def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      @scala.inline
      def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
      
      @scala.inline
      def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      @scala.inline
      def setTableId(value: String): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      @scala.inline
      def setTableSizeBytes(value: Double): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
      
      @scala.inline
      def setTableStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledTableDescription extends TableDescription {
    
    /**
      * <p>An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the table and index key schema.</p> <p>Each <code>AttributeDefinition</code> object in this array is composed of:</p> <ul> <li> <p> <code>AttributeName</code> - The name of the attribute.</p> </li> <li> <p> <code>AttributeType</code> - The data type for the attribute.</p> </li> </ul>
      */
    @JSName("AttributeDefinitions")
    var AttributeDefinitions_UnmarshalledTableDescription: js.UndefOr[js.Array[UnmarshalledAttributeDefinition]] = js.native
    
    /**
      * <p>The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch time</a> format.</p>
      */
    @JSName("CreationDateTime")
    var CreationDateTime_UnmarshalledTableDescription: js.UndefOr[Date] = js.native
    
    /**
      * <p>The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:</p> <ul> <li> <p> <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a <code>CreateTable</code> operation.)</p> </li> <li> <p> <code>IndexName</code> - The name of the global secondary index.</p> </li> <li> <p> <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value. </p> </li> <li> <p> <code>IndexStatus</code> - The current status of the global secondary index:</p> <ul> <li> <p> <code>CREATING</code> - The index is being created.</p> </li> <li> <p> <code>UPDATING</code> - The index is being updated.</p> </li> <li> <p> <code>DELETING</code> - The index is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The index is ready for use.</p> </li> </ul> </li> <li> <p> <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value. </p> </li> <li> <p> <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.</p> </li> <li> <p> <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:</p> <ul> <li> <p> <code>ProjectionType</code> - One of the following:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul> </li> <li> <p> <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p> </li> </ul> </li> <li> <p> <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases. </p> </li> </ul> <p>If the table is in the <code>DELETING</code> state, no information about indexes will be returned.</p>
      */
    @JSName("GlobalSecondaryIndexes")
    var GlobalSecondaryIndexes_UnmarshalledTableDescription: js.UndefOr[js.Array[UnmarshalledGlobalSecondaryIndexDescription]] = js.native
    
    /**
      * <p>The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:</p> <ul> <li> <p> <code>AttributeName</code> - The name of the attribute.</p> </li> <li> <p> <code>KeyType</code> - The role of the attribute:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note> </li> </ul> <p>For more information about primary keys, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    @JSName("KeySchema")
    var KeySchema_UnmarshalledTableDescription: js.UndefOr[js.Array[UnmarshalledKeySchemaElement]] = js.native
    
    /**
      * <p>Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:</p> <ul> <li> <p> <code>IndexName</code> - The name of the local secondary index.</p> </li> <li> <p> <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.</p> </li> <li> <p> <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:</p> <ul> <li> <p> <code>ProjectionType</code> - One of the following:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul> </li> <li> <p> <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p> </li> </ul> </li> <li> <p> <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p> </li> <li> <p> <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p> </li> </ul> <p>If the table is in the <code>DELETING</code> state, no information about indexes will be returned.</p>
      */
    @JSName("LocalSecondaryIndexes")
    var LocalSecondaryIndexes_UnmarshalledTableDescription: js.UndefOr[js.Array[UnmarshalledLocalSecondaryIndexDescription]] = js.native
    
    /**
      * <p>The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.</p>
      */
    @JSName("ProvisionedThroughput")
    var ProvisionedThroughput_UnmarshalledTableDescription: js.UndefOr[UnmarshalledProvisionedThroughputDescription] = js.native
    
    /**
      * <p>Contains details for the restore.</p>
      */
    @JSName("RestoreSummary")
    var RestoreSummary_UnmarshalledTableDescription: js.UndefOr[UnmarshalledRestoreSummary] = js.native
    
    /**
      * <p>The description of the server-side encryption status on the specified table.</p>
      */
    @JSName("SSEDescription")
    var SSEDescription_UnmarshalledTableDescription: js.UndefOr[UnmarshalledSSEDescription] = js.native
    
    /**
      * <p>The current DynamoDB Streams configuration for the table.</p>
      */
    @JSName("StreamSpecification")
    var StreamSpecification_UnmarshalledTableDescription: js.UndefOr[UnmarshalledStreamSpecification] = js.native
  }
  object UnmarshalledTableDescription {
    
    @scala.inline
    def apply(): UnmarshalledTableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTableDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledTableDescriptionMutableBuilder[Self <: UnmarshalledTableDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeDefinitions(value: js.Array[UnmarshalledAttributeDefinition]): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
      
      @scala.inline
      def setAttributeDefinitionsVarargs(value: UnmarshalledAttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: js.Array[UnmarshalledGlobalSecondaryIndexDescription]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: UnmarshalledGlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      @scala.inline
      def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setLocalSecondaryIndexes(value: js.Array[UnmarshalledLocalSecondaryIndexDescription]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: UnmarshalledLocalSecondaryIndexDescription*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughput(value: UnmarshalledProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      @scala.inline
      def setRestoreSummary(value: UnmarshalledRestoreSummary): Self = StObject.set(x, "RestoreSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreSummaryUndefined: Self = StObject.set(x, "RestoreSummary", js.undefined)
      
      @scala.inline
      def setSSEDescription(value: UnmarshalledSSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      @scala.inline
      def setStreamSpecification(value: UnmarshalledStreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
    }
  }
}
