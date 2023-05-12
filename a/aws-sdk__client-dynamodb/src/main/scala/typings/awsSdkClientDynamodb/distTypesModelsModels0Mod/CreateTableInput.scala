package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableInput extends StObject {
  
  /**
    * <p>An array of attributes that describe the key schema for the table and indexes.</p>
    */
  var AttributeDefinitions: js.UndefOr[js.Array[AttributeDefinition]] = js.undefined
  
  /**
    * <p>Controls how you are charged for read and write throughput and how you manage
    *             capacity. This setting can be changed later.</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>PROVISIONED</code> - We recommend using <code>PROVISIONED</code> for
    *                     predictable workloads. <code>PROVISIONED</code> sets the billing mode to <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.ProvisionedThroughput.Manual">Provisioned Mode</a>.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>PAY_PER_REQUEST</code> - We recommend using <code>PAY_PER_REQUEST</code>
    *                     for unpredictable workloads. <code>PAY_PER_REQUEST</code> sets the billing mode
    *                     to <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.OnDemand">On-Demand Mode</a>. </p>
    *             </li>
    *          </ul>
    */
  var BillingMode: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BillingMode | String] = js.undefined
  
  /**
    * <p>Indicates whether deletion protection is to be enabled (true) or disabled (false) on the table.</p>
    */
  var DeletionProtectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * <p>One or more global secondary indexes (the maximum is 20) to be created on the table.
    *             Each global secondary index in the array includes the following:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>IndexName</code> - The name of the global secondary index. Must be unique
    *                     only for this table.</p>
    *                <p></p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>KeySchema</code> - Specifies the key schema for the global secondary
    *                     index.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>Projection</code> - Specifies attributes that are copied (projected) from
    *                     the table into the index. These are in addition to the primary key attributes
    *                     and index key attributes, which are automatically projected. Each attribute
    *                     specification is composed of:</p>
    *                <ul>
    *                   <li>
    *                      <p>
    *                         <code>ProjectionType</code> - One of the following:</p>
    *                      <ul>
    *                         <li>
    *                            <p>
    *                               <code>KEYS_ONLY</code> - Only the index and primary keys are
    *                                     projected into the index.</p>
    *                         </li>
    *                         <li>
    *                            <p>
    *                               <code>INCLUDE</code> - Only the specified table attributes are
    *                                     projected into the index. The list of projected attributes is in
    *                                         <code>NonKeyAttributes</code>.</p>
    *                         </li>
    *                         <li>
    *                            <p>
    *                               <code>ALL</code> - All of the table attributes are projected
    *                                     into the index.</p>
    *                         </li>
    *                      </ul>
    *                   </li>
    *                   <li>
    *                      <p>
    *                         <code>NonKeyAttributes</code> - A list of one or more non-key attribute
    *                             names that are projected into the secondary index. The total count of
    *                             attributes provided in <code>NonKeyAttributes</code>, summed across all
    *                             of the secondary indexes, must not exceed 100. If you project the same
    *                             attribute into two different indexes, this counts as two distinct
    *                             attributes when determining the total.</p>
    *                   </li>
    *                </ul>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ProvisionedThroughput</code> - The provisioned throughput settings for the
    *                     global secondary index, consisting of read and write capacity units.</p>
    *             </li>
    *          </ul>
    */
  var GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndex]] = js.undefined
  
  /**
    * <p>Specifies the attributes that make up the primary key for a table or an index. The
    *             attributes in <code>KeySchema</code> must also be defined in the
    *                 <code>AttributeDefinitions</code> array. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
    *                 Model</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    *          <p>Each <code>KeySchemaElement</code> in the array is composed of:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>AttributeName</code> - The name of this key attribute.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>KeyType</code> - The role that the key attribute will assume:</p>
    *                <ul>
    *                   <li>
    *                      <p>
    *                         <code>HASH</code> - partition key</p>
    *                   </li>
    *                   <li>
    *                      <p>
    *                         <code>RANGE</code> - sort key</p>
    *                   </li>
    *                </ul>
    *             </li>
    *          </ul>
    *          <note>
    *             <p>The partition key of an item is also known as its <i>hash
    *                     attribute</i>. The term "hash attribute" derives from the DynamoDB usage
    *                 of an internal hash function to evenly distribute data items across partitions,
    *                 based on their partition key values.</p>
    *             <p>The sort key of an item is also known as its <i>range attribute</i>.
    *                 The term "range attribute" derives from the way DynamoDB stores items with the same
    *                 partition key physically close together, in sorted order by the sort key
    *                 value.</p>
    *          </note>
    *          <p>For a simple primary key (partition key), you must provide exactly one element with a
    *                 <code>KeyType</code> of <code>HASH</code>.</p>
    *          <p>For a composite primary key (partition key and sort key), you must provide exactly two
    *             elements, in this order: The first element must have a <code>KeyType</code> of
    *                 <code>HASH</code>, and the second element must have a <code>KeyType</code> of
    *                 <code>RANGE</code>.</p>
    *          <p>For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key">Working with Tables</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var KeySchema: js.UndefOr[js.Array[KeySchemaElement]] = js.undefined
  
  /**
    * <p>One or more local secondary indexes (the maximum is 5) to be created on the table.
    *             Each index is scoped to a given partition key value. There is a 10 GB size limit per
    *             partition key value; otherwise, the size of a local secondary index is
    *             unconstrained.</p>
    *          <p>Each local secondary index in the array includes the following:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>IndexName</code> - The name of the local secondary index. Must be unique
    *                     only for this table.</p>
    *                <p></p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>KeySchema</code> - Specifies the key schema for the local secondary index.
    *                     The key schema must begin with the same partition key as the table.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>Projection</code> - Specifies attributes that are copied (projected) from
    *                     the table into the index. These are in addition to the primary key attributes
    *                     and index key attributes, which are automatically projected. Each attribute
    *                     specification is composed of:</p>
    *                <ul>
    *                   <li>
    *                      <p>
    *                         <code>ProjectionType</code> - One of the following:</p>
    *                      <ul>
    *                         <li>
    *                            <p>
    *                               <code>KEYS_ONLY</code> - Only the index and primary keys are
    *                                     projected into the index.</p>
    *                         </li>
    *                         <li>
    *                            <p>
    *                               <code>INCLUDE</code> - Only the specified table attributes are
    *                                     projected into the index. The list of projected attributes is in
    *                                         <code>NonKeyAttributes</code>.</p>
    *                         </li>
    *                         <li>
    *                            <p>
    *                               <code>ALL</code> - All of the table attributes are projected
    *                                     into the index.</p>
    *                         </li>
    *                      </ul>
    *                   </li>
    *                   <li>
    *                      <p>
    *                         <code>NonKeyAttributes</code> - A list of one or more non-key attribute
    *                             names that are projected into the secondary index. The total count of
    *                             attributes provided in <code>NonKeyAttributes</code>, summed across all
    *                             of the secondary indexes, must not exceed 100. If you project the same
    *                             attribute into two different indexes, this counts as two distinct
    *                             attributes when determining the total.</p>
    *                   </li>
    *                </ul>
    *             </li>
    *          </ul>
    */
  var LocalSecondaryIndexes: js.UndefOr[js.Array[LocalSecondaryIndex]] = js.undefined
  
  /**
    * <p>Represents the provisioned throughput settings for a specified table or index. The
    *             settings can be modified using the <code>UpdateTable</code> operation.</p>
    *          <p> If you set BillingMode as <code>PROVISIONED</code>, you must specify this property.
    *             If you set BillingMode as <code>PAY_PER_REQUEST</code>, you cannot specify this
    *             property.</p>
    *          <p>For current minimum and maximum provisioned throughput values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Service,
    *                 Account, and Table Quotas</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProvisionedThroughput] = js.undefined
  
  /**
    * <p>Represents the settings used to enable server-side encryption.</p>
    */
  var SSESpecification: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.SSESpecification] = js.undefined
  
  /**
    * <p>The settings for DynamoDB Streams on the table. These settings consist of:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>StreamEnabled</code> - Indicates whether DynamoDB Streams is to be enabled
    *                     (true) or disabled (false).</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>StreamViewType</code> - When an item in the table is modified,
    *                         <code>StreamViewType</code> determines what information is written to the
    *                     table's stream. Valid values for <code>StreamViewType</code> are:</p>
    *                <ul>
    *                   <li>
    *                      <p>
    *                         <code>KEYS_ONLY</code> - Only the key attributes of the modified item
    *                             are written to the stream.</p>
    *                   </li>
    *                   <li>
    *                      <p>
    *                         <code>NEW_IMAGE</code> - The entire item, as it appears after it was
    *                             modified, is written to the stream.</p>
    *                   </li>
    *                   <li>
    *                      <p>
    *                         <code>OLD_IMAGE</code> - The entire item, as it appeared before it was
    *                             modified, is written to the stream.</p>
    *                   </li>
    *                   <li>
    *                      <p>
    *                         <code>NEW_AND_OLD_IMAGES</code> - Both the new and the old item images
    *                             of the item are written to the stream.</p>
    *                   </li>
    *                </ul>
    *             </li>
    *          </ul>
    */
  var StreamSpecification: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.StreamSpecification] = js.undefined
  
  /**
    * <p>The table class of the new table. Valid values are <code>STANDARD</code> and
    *                 <code>STANDARD_INFREQUENT_ACCESS</code>.</p>
    */
  var TableClass: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableClass | String] = js.undefined
  
  /**
    * <p>The name of the table to create.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A list of key-value pairs to label the table. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging
    *                 for DynamoDB</a>.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object CreateTableInput {
  
  inline def apply(): CreateTableInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTableInput] (val x: Self) extends AnyVal {
    
    inline def setAttributeDefinitions(value: js.Array[AttributeDefinition]): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
    
    inline def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
    
    inline def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value*))
    
    inline def setBillingMode(value: BillingMode | String): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
    
    inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
    
    inline def setDeletionProtectionEnabled(value: Boolean): Self = StObject.set(x, "DeletionProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionEnabledUndefined: Self = StObject.set(x, "DeletionProtectionEnabled", js.undefined)
    
    inline def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndex]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setKeySchema(value: js.Array[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndex]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
    
    inline def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value*))
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    inline def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
    
    inline def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
    
    inline def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
    
    inline def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
    
    inline def setTableClass(value: TableClass | String): Self = StObject.set(x, "TableClass", value.asInstanceOf[js.Any])
    
    inline def setTableClassUndefined: Self = StObject.set(x, "TableClass", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
