package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod.AttributeDefinition
import typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexMod.GlobalSecondaryIndex
import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesLocalSecondaryIndexMod.LocalSecondaryIndex
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.awsSdkClientDynamodbBrowser.typesSsespecificationMod.SSESpecification
import typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateTableInputMod {
  
  trait CreateTableInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>An array of attributes that describe the key schema for the table and indexes.</p>
      */
    var AttributeDefinitions: js.Array[AttributeDefinition] | Iterable[AttributeDefinition]
    
    /**
      * <p>One or more global secondary indexes (the maximum is five) to be created on the table. Each global secondary index in the array includes the following:</p> <ul> <li> <p> <code>IndexName</code> - The name of the global secondary index. Must be unique only for this table.</p> <p/> </li> <li> <p> <code>KeySchema</code> - Specifies the key schema for the global secondary index.</p> </li> <li> <p> <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:</p> <ul> <li> <p> <code>ProjectionType</code> - One of the following:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul> </li> <li> <p> <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p> </li> </ul> </li> <li> <p> <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units.</p> </li> </ul>
      */
    var GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndex] | Iterable[GlobalSecondaryIndex]] = js.undefined
    
    /**
      * <p>Specifies the attributes that make up the primary key for a table or an index. The attributes in <code>KeySchema</code> must also be defined in the <code>AttributeDefinitions</code> array. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p> <p>Each <code>KeySchemaElement</code> in the array is composed of:</p> <ul> <li> <p> <code>AttributeName</code> - The name of this key attribute.</p> </li> <li> <p> <code>KeyType</code> - The role that the key attribute will assume:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note> <p>For a simple primary key (partition key), you must provide exactly one element with a <code>KeyType</code> of <code>HASH</code>.</p> <p>For a composite primary key (partition key and sort key), you must provide exactly two elements, in this order: The first element must have a <code>KeyType</code> of <code>HASH</code>, and the second element must have a <code>KeyType</code> of <code>RANGE</code>.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key">Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]
    
    /**
      * <p>One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped to a given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a local secondary index is unconstrained.</p> <p>Each local secondary index in the array includes the following:</p> <ul> <li> <p> <code>IndexName</code> - The name of the local secondary index. Must be unique only for this table.</p> <p/> </li> <li> <p> <code>KeySchema</code> - Specifies the key schema for the local secondary index. The key schema must begin with the same partition key as the table.</p> </li> <li> <p> <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:</p> <ul> <li> <p> <code>ProjectionType</code> - One of the following:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul> </li> <li> <p> <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p> </li> </ul> </li> </ul>
      */
    var LocalSecondaryIndexes: js.UndefOr[js.Array[LocalSecondaryIndex] | Iterable[LocalSecondaryIndex]] = js.undefined
    
    /**
      * <p>Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the <code>UpdateTable</code> operation.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ProvisionedThroughput: typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
    
    /**
      * <p>Represents the settings used to enable server-side encryption.</p>
      */
    var SSESpecification: js.UndefOr[typings.awsSdkClientDynamodbBrowser.typesSsespecificationMod.SSESpecification] = js.undefined
    
    /**
      * <p>The settings for DynamoDB Streams on the table. These settings consist of:</p> <ul> <li> <p> <code>StreamEnabled</code> - Indicates whether Streams is to be enabled (true) or disabled (false).</p> </li> <li> <p> <code>StreamViewType</code> - When an item in the table is modified, <code>StreamViewType</code> determines what information is written to the table's stream. Valid values for <code>StreamViewType</code> are:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the key attributes of the modified item are written to the stream.</p> </li> <li> <p> <code>NEW_IMAGE</code> - The entire item, as it appears after it was modified, is written to the stream.</p> </li> <li> <p> <code>OLD_IMAGE</code> - The entire item, as it appeared before it was modified, is written to the stream.</p> </li> <li> <p> <code>NEW_AND_OLD_IMAGES</code> - Both the new and the old item images of the item are written to the stream.</p> </li> </ul> </li> </ul>
      */
    var StreamSpecification: js.UndefOr[
        typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
      ] = js.undefined
    
    /**
      * <p>The name of the table to create.</p>
      */
    var TableName: String
  }
  object CreateTableInput {
    
    @scala.inline
    def apply(
      AttributeDefinitions: js.Array[AttributeDefinition] | Iterable[AttributeDefinition],
      KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
      ProvisionedThroughput: ProvisionedThroughput,
      TableName: String
    ): CreateTableInput = {
      val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTableInput]
    }
    
    @scala.inline
    implicit class CreateTableInputMutableBuilder[Self <: CreateTableInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setAttributeDefinitions(value: js.Array[AttributeDefinition] | Iterable[AttributeDefinition]): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndex] | Iterable[GlobalSecondaryIndex]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndex] | Iterable[LocalSecondaryIndex]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
      
      @scala.inline
      def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
}
