package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableDetails extends js.Object {
  
  /**
    * A list of attribute definitions for the table.
    */
  var AttributeDefinitions: js.UndefOr[AwsDynamoDbTableAttributeDefinitionList] = js.native
  
  /**
    * Information about the billing for read/write capacity on the table.
    */
  var BillingModeSummary: js.UndefOr[AwsDynamoDbTableBillingModeSummary] = js.native
  
  /**
    * Indicates when the table was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreationDateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * List of global secondary indexes for the table.
    */
  var GlobalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableGlobalSecondaryIndexList] = js.native
  
  /**
    * The version of global tables being used.
    */
  var GlobalTableVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The number of items in the table.
    */
  var ItemCount: js.UndefOr[Integer] = js.native
  
  /**
    * The primary key structure for the table.
    */
  var KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList] = js.native
  
  /**
    * The ARN of the latest stream for the table.
    */
  var LatestStreamArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The label of the latest stream. The label is not a unique identifier.
    */
  var LatestStreamLabel: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The list of local secondary indexes for the table.
    */
  var LocalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableLocalSecondaryIndexList] = js.native
  
  /**
    * Information about the provisioned throughput for the table.
    */
  var ProvisionedThroughput: js.UndefOr[AwsDynamoDbTableProvisionedThroughput] = js.native
  
  /**
    * The list of replicas of this table.
    */
  var Replicas: js.UndefOr[AwsDynamoDbTableReplicaList] = js.native
  
  /**
    * Information about the restore for the table.
    */
  var RestoreSummary: js.UndefOr[AwsDynamoDbTableRestoreSummary] = js.native
  
  /**
    * Information about the server-side encryption for the table.
    */
  var SseDescription: js.UndefOr[AwsDynamoDbTableSseDescription] = js.native
  
  /**
    * The current DynamoDB Streams configuration for the table.
    */
  var StreamSpecification: js.UndefOr[AwsDynamoDbTableStreamSpecification] = js.native
  
  /**
    * The identifier of the table.
    */
  var TableId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The total size of the table in bytes.
    */
  var TableSizeBytes: js.UndefOr[SizeBytes] = js.native
  
  /**
    * The current status of the table.
    */
  var TableStatus: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableDetails {
  
  @scala.inline
  def apply(): AwsDynamoDbTableDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableDetails]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableDetailsOps[Self <: AwsDynamoDbTableDetails] (val x: Self) extends AnyVal {
    
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
    def setAttributeDefinitionsVarargs(value: AwsDynamoDbTableAttributeDefinition*): Self = this.set("AttributeDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setAttributeDefinitions(value: AwsDynamoDbTableAttributeDefinitionList): Self = this.set("AttributeDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeDefinitions: Self = this.set("AttributeDefinitions", js.undefined)
    
    @scala.inline
    def setBillingModeSummary(value: AwsDynamoDbTableBillingModeSummary): Self = this.set("BillingModeSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingModeSummary: Self = this.set("BillingModeSummary", js.undefined)
    
    @scala.inline
    def setCreationDateTime(value: NonEmptyString): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("CreationDateTime", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: AwsDynamoDbTableGlobalSecondaryIndex*): Self = this.set("GlobalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: AwsDynamoDbTableGlobalSecondaryIndexList): Self = this.set("GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSecondaryIndexes: Self = this.set("GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setGlobalTableVersion(value: NonEmptyString): Self = this.set("GlobalTableVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTableVersion: Self = this.set("GlobalTableVersion", js.undefined)
    
    @scala.inline
    def setItemCount(value: Integer): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("ItemCount", js.undefined)
    
    @scala.inline
    def setKeySchemaVarargs(value: AwsDynamoDbTableKeySchema*): Self = this.set("KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setKeySchema(value: AwsDynamoDbTableKeySchemaList): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySchema: Self = this.set("KeySchema", js.undefined)
    
    @scala.inline
    def setLatestStreamArn(value: NonEmptyString): Self = this.set("LatestStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestStreamArn: Self = this.set("LatestStreamArn", js.undefined)
    
    @scala.inline
    def setLatestStreamLabel(value: NonEmptyString): Self = this.set("LatestStreamLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestStreamLabel: Self = this.set("LatestStreamLabel", js.undefined)
    
    @scala.inline
    def setLocalSecondaryIndexesVarargs(value: AwsDynamoDbTableLocalSecondaryIndex*): Self = this.set("LocalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setLocalSecondaryIndexes(value: AwsDynamoDbTableLocalSecondaryIndexList): Self = this.set("LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSecondaryIndexes: Self = this.set("LocalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setProvisionedThroughput(value: AwsDynamoDbTableProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedThroughput: Self = this.set("ProvisionedThroughput", js.undefined)
    
    @scala.inline
    def setReplicasVarargs(value: AwsDynamoDbTableReplica*): Self = this.set("Replicas", js.Array(value :_*))
    
    @scala.inline
    def setReplicas(value: AwsDynamoDbTableReplicaList): Self = this.set("Replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicas: Self = this.set("Replicas", js.undefined)
    
    @scala.inline
    def setRestoreSummary(value: AwsDynamoDbTableRestoreSummary): Self = this.set("RestoreSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreSummary: Self = this.set("RestoreSummary", js.undefined)
    
    @scala.inline
    def setSseDescription(value: AwsDynamoDbTableSseDescription): Self = this.set("SseDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSseDescription: Self = this.set("SseDescription", js.undefined)
    
    @scala.inline
    def setStreamSpecification(value: AwsDynamoDbTableStreamSpecification): Self = this.set("StreamSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamSpecification: Self = this.set("StreamSpecification", js.undefined)
    
    @scala.inline
    def setTableId(value: NonEmptyString): Self = this.set("TableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableId: Self = this.set("TableId", js.undefined)
    
    @scala.inline
    def setTableName(value: NonEmptyString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
    
    @scala.inline
    def setTableSizeBytes(value: SizeBytes): Self = this.set("TableSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableSizeBytes: Self = this.set("TableSizeBytes", js.undefined)
    
    @scala.inline
    def setTableStatus(value: NonEmptyString): Self = this.set("TableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStatus: Self = this.set("TableStatus", js.undefined)
  }
}
