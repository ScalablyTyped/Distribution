package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableInput extends StObject {
  
  /**
    * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, AttributeDefinitions must include the key element(s) of the new index.
    */
  var AttributeDefinitions: js.UndefOr[typings.awsSdk.dynamodbMod.AttributeDefinitions] = js.native
  
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. When switching from pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned capacity values are estimated based on the consumed read and write capacity of your table and global secondary indexes over the past 30 minutes.    PROVISIONED - We recommend using PROVISIONED for predictable workloads. PROVISIONED sets the billing mode to Provisioned Mode.    PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads. PAY_PER_REQUEST sets the billing mode to On-Demand Mode.   
    */
  var BillingMode: js.UndefOr[typings.awsSdk.dynamodbMod.BillingMode] = js.native
  
  /**
    * An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:    Create - add a new global secondary index to the table.    Update - modify the provisioned throughput settings of an existing global secondary index.    Delete - remove a global secondary index from the table.   You can create or delete only one global secondary index per UpdateTable operation. For more information, see Managing Global Secondary Indexes in the Amazon DynamoDB Developer Guide. 
    */
  var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList] = js.native
  
  /**
    * The new provisioned throughput settings for the specified table or index.
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk.dynamodbMod.ProvisionedThroughput] = js.native
  
  /**
    * A list of replica update actions (create, delete, or update) for the table.  This property only applies to Version 2019.11.21 of global tables. 
    */
  var ReplicaUpdates: js.UndefOr[ReplicationGroupUpdateList] = js.native
  
  /**
    * The new server-side encryption settings for the specified table.
    */
  var SSESpecification: js.UndefOr[typings.awsSdk.dynamodbMod.SSESpecification] = js.native
  
  /**
    * Represents the DynamoDB Streams configuration for the table.  You receive a ResourceInUseException if you try to enable a stream on a table that already has a stream, or if you try to disable a stream on a table that doesn't have a stream. 
    */
  var StreamSpecification: js.UndefOr[typings.awsSdk.dynamodbMod.StreamSpecification] = js.native
  
  /**
    * The name of the table to be updated.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}
object UpdateTableInput {
  
  @scala.inline
  def apply(TableName: TableName): UpdateTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableInput]
  }
  
  @scala.inline
  implicit class UpdateTableInputMutableBuilder[Self <: UpdateTableInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeDefinitions(value: AttributeDefinitions): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
    
    @scala.inline
    def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexUpdates(value: GlobalSecondaryIndexUpdateList): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexUpdate*): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.Array(value :_*))
    
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    @scala.inline
    def setReplicaUpdates(value: ReplicationGroupUpdateList): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaUpdatesUndefined: Self = StObject.set(x, "ReplicaUpdates", js.undefined)
    
    @scala.inline
    def setReplicaUpdatesVarargs(value: ReplicationGroupUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value :_*))
    
    @scala.inline
    def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
    
    @scala.inline
    def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
