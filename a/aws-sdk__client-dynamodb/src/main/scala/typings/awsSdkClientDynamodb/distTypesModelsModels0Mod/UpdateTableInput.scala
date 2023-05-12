package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableInput extends StObject {
  
  /**
    * <p>An array of attributes that describe the key schema for the table and indexes. If you
    *             are adding a new global secondary index to the table, <code>AttributeDefinitions</code>
    *             must include the key element(s) of the new index.</p>
    */
  var AttributeDefinitions: js.UndefOr[js.Array[AttributeDefinition]] = js.undefined
  
  /**
    * <p>Controls how you are charged for read and write throughput and how you manage
    *             capacity. When switching from pay-per-request to provisioned capacity, initial
    *             provisioned capacity values must be set. The initial provisioned capacity values are
    *             estimated based on the consumed read and write capacity of your table and global
    *             secondary indexes over the past 30 minutes.</p>
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
    * <p>An array of one or more global secondary indexes for the table. For each index in the
    *             array, you can request one action:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>Create</code> - add a new global secondary index to the table.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>Update</code> - modify the provisioned throughput settings of an existing
    *                     global secondary index.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>Delete</code> - remove a global secondary index from the table.</p>
    *             </li>
    *          </ul>
    *          <p>You can create or delete only one global secondary index per <code>UpdateTable</code>
    *             operation.</p>
    *          <p>For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
    *                 Secondary Indexes</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>. </p>
    */
  var GlobalSecondaryIndexUpdates: js.UndefOr[js.Array[GlobalSecondaryIndexUpdate]] = js.undefined
  
  /**
    * <p>The new provisioned throughput settings for the specified table or index.</p>
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProvisionedThroughput] = js.undefined
  
  /**
    * <p>A list of replica update actions (create, delete, or update) for the table.</p>
    *          <note>
    *             <p>This property only applies to <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html">Version 2019.11.21 (Current)</a>
    *                 of global tables.
    *             </p>
    *          </note>
    */
  var ReplicaUpdates: js.UndefOr[js.Array[ReplicationGroupUpdate]] = js.undefined
  
  /**
    * <p>The new server-side encryption settings for the specified table.</p>
    */
  var SSESpecification: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.SSESpecification] = js.undefined
  
  /**
    * <p>Represents the DynamoDB Streams configuration for the table.</p>
    *          <note>
    *             <p>You receive a <code>ResourceInUseException</code> if you try to enable a stream on
    *                 a table that already has a stream, or if you try to disable a stream on a table that
    *                 doesn't have a stream.</p>
    *          </note>
    */
  var StreamSpecification: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.StreamSpecification] = js.undefined
  
  /**
    * <p>The table class of the table to be updated. Valid values are <code>STANDARD</code> and
    *                 <code>STANDARD_INFREQUENT_ACCESS</code>.</p>
    */
  var TableClass: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableClass | String] = js.undefined
  
  /**
    * <p>The name of the table to be updated.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object UpdateTableInput {
  
  inline def apply(): UpdateTableInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTableInput] (val x: Self) extends AnyVal {
    
    inline def setAttributeDefinitions(value: js.Array[AttributeDefinition]): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
    
    inline def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
    
    inline def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value*))
    
    inline def setBillingMode(value: BillingMode | String): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
    
    inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
    
    inline def setDeletionProtectionEnabled(value: Boolean): Self = StObject.set(x, "DeletionProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionEnabledUndefined: Self = StObject.set(x, "DeletionProtectionEnabled", js.undefined)
    
    inline def setGlobalSecondaryIndexUpdates(value: js.Array[GlobalSecondaryIndexUpdate]): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.undefined)
    
    inline def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexUpdate*): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.Array(value*))
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    inline def setReplicaUpdates(value: js.Array[ReplicationGroupUpdate]): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
    
    inline def setReplicaUpdatesUndefined: Self = StObject.set(x, "ReplicaUpdates", js.undefined)
    
    inline def setReplicaUpdatesVarargs(value: ReplicationGroupUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value*))
    
    inline def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
    
    inline def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
    
    inline def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
    
    inline def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
    
    inline def setTableClass(value: TableClass | String): Self = StObject.set(x, "TableClass", value.asInstanceOf[js.Any])
    
    inline def setTableClassUndefined: Self = StObject.set(x, "TableClass", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
