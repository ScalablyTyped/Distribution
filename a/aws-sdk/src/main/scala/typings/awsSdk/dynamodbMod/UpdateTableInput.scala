package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableInput extends js.Object {
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
  def apply(
    TableName: TableName,
    AttributeDefinitions: AttributeDefinitions = null,
    BillingMode: BillingMode = null,
    GlobalSecondaryIndexUpdates: GlobalSecondaryIndexUpdateList = null,
    ProvisionedThroughput: ProvisionedThroughput = null,
    ReplicaUpdates: ReplicationGroupUpdateList = null,
    SSESpecification: SSESpecification = null,
    StreamSpecification: StreamSpecification = null
  ): UpdateTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    if (AttributeDefinitions != null) __obj.updateDynamic("AttributeDefinitions")(AttributeDefinitions.asInstanceOf[js.Any])
    if (BillingMode != null) __obj.updateDynamic("BillingMode")(BillingMode.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexUpdates != null) __obj.updateDynamic("GlobalSecondaryIndexUpdates")(GlobalSecondaryIndexUpdates.asInstanceOf[js.Any])
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput.asInstanceOf[js.Any])
    if (ReplicaUpdates != null) __obj.updateDynamic("ReplicaUpdates")(ReplicaUpdates.asInstanceOf[js.Any])
    if (SSESpecification != null) __obj.updateDynamic("SSESpecification")(SSESpecification.asInstanceOf[js.Any])
    if (StreamSpecification != null) __obj.updateDynamic("StreamSpecification")(StreamSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableInput]
  }
}

