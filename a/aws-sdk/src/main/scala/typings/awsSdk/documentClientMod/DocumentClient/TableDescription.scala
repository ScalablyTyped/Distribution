package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDescription extends js.Object {
  /**
    * Contains information about the table archive.
    */
  var ArchivalSummary: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ArchivalSummary] = js.native
  /**
    * An array of AttributeDefinition objects. Each of these objects describes one attribute in the table and index key schema. Each AttributeDefinition object in this array is composed of:    AttributeName - The name of the attribute.    AttributeType - The data type for the attribute.  
    */
  var AttributeDefinitions: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.AttributeDefinitions] = js.native
  /**
    * Contains the details for the read/write capacity mode.
    */
  var BillingModeSummary: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BillingModeSummary] = js.native
  /**
    * The date and time when the table was created, in UNIX epoch time format.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  /**
    * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:    Backfilling - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table. It is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a CreateTable operation.)   You can delete an index that is being created during the Backfilling phase when IndexStatus is set to CREATING and Backfilling is true. You can't delete the index that is being created when IndexStatus is set to CREATING and Backfilling is false. (This attribute does not appear for indexes that were created during a CreateTable operation.)    IndexName - The name of the global secondary index.    IndexSizeBytes - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     IndexStatus - The current status of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.      ItemCount - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases.    If the table is in the DELETING state, no information about indexes will be returned.
    */
  var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList] = js.native
  /**
    * Represents the version of global tables in use, if the table is replicated across AWS Regions.
    */
  var GlobalTableVersion: js.UndefOr[String] = js.native
  /**
    * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var ItemCount: js.UndefOr[Long] = js.native
  /**
    * The primary key structure for the table. Each KeySchemaElement consists of:    AttributeName - The name of the attribute.    KeyType - The role of the attribute:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.    For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
    */
  var KeySchema: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KeySchema] = js.native
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
    */
  var LatestStreamArn: js.UndefOr[StreamArn] = js.native
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   AWS customer ID   Table name    StreamLabel   
    */
  var LatestStreamLabel: js.UndefOr[String] = js.native
  /**
    * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:    IndexName - The name of the local secondary index.    KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      IndexSizeBytes - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.    ItemCount - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.   If the table is in the DELETING state, no information about indexes will be returned.
    */
  var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList] = js.native
  /**
    * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.
    */
  var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.native
  /**
    * Represents replicas of the table.
    */
  var Replicas: js.UndefOr[ReplicaDescriptionList] = js.native
  /**
    * Contains details for the restore.
    */
  var RestoreSummary: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.RestoreSummary] = js.native
  /**
    * The description of the server-side encryption status on the specified table.
    */
  var SSEDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.SSEDescription] = js.native
  /**
    * The current DynamoDB Streams configuration for the table.
    */
  var StreamSpecification: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.StreamSpecification] = js.native
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the table.
    */
  var TableArn: js.UndefOr[String] = js.native
  /**
    * Unique identifier for the table for which the backup was created. 
    */
  var TableId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableId] = js.native
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  /**
    * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var TableSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.    INACCESSIBLE_ENCRYPTION_CREDENTIALS - The AWS KMS key used to encrypt the table in inaccessible. Table operations may fail due to failure to use the AWS KMS key. DynamoDB will initiate the table archival process when a table's AWS KMS key remains inaccessible for more than seven days.     ARCHIVING - The table is being archived. Operations are not allowed until archival is complete.     ARCHIVED - The table has been archived. See the ArchivalReason for more information.   
    */
  var TableStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableStatus] = js.native
}

object TableDescription {
  @scala.inline
  def apply(
    ArchivalSummary: ArchivalSummary = null,
    AttributeDefinitions: AttributeDefinitions = null,
    BillingModeSummary: BillingModeSummary = null,
    CreationDateTime: Date = null,
    GlobalSecondaryIndexes: GlobalSecondaryIndexDescriptionList = null,
    GlobalTableVersion: String = null,
    ItemCount: js.UndefOr[Long] = js.undefined,
    KeySchema: KeySchema = null,
    LatestStreamArn: StreamArn = null,
    LatestStreamLabel: String = null,
    LocalSecondaryIndexes: LocalSecondaryIndexDescriptionList = null,
    ProvisionedThroughput: ProvisionedThroughputDescription = null,
    Replicas: ReplicaDescriptionList = null,
    RestoreSummary: RestoreSummary = null,
    SSEDescription: SSEDescription = null,
    StreamSpecification: StreamSpecification = null,
    TableArn: String = null,
    TableId: TableId = null,
    TableName: TableName = null,
    TableSizeBytes: js.UndefOr[Long] = js.undefined,
    TableStatus: TableStatus = null
  ): TableDescription = {
    val __obj = js.Dynamic.literal()
    if (ArchivalSummary != null) __obj.updateDynamic("ArchivalSummary")(ArchivalSummary.asInstanceOf[js.Any])
    if (AttributeDefinitions != null) __obj.updateDynamic("AttributeDefinitions")(AttributeDefinitions.asInstanceOf[js.Any])
    if (BillingModeSummary != null) __obj.updateDynamic("BillingModeSummary")(BillingModeSummary.asInstanceOf[js.Any])
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (GlobalTableVersion != null) __obj.updateDynamic("GlobalTableVersion")(GlobalTableVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(ItemCount)) __obj.updateDynamic("ItemCount")(ItemCount.get.asInstanceOf[js.Any])
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema.asInstanceOf[js.Any])
    if (LatestStreamArn != null) __obj.updateDynamic("LatestStreamArn")(LatestStreamArn.asInstanceOf[js.Any])
    if (LatestStreamLabel != null) __obj.updateDynamic("LatestStreamLabel")(LatestStreamLabel.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput.asInstanceOf[js.Any])
    if (Replicas != null) __obj.updateDynamic("Replicas")(Replicas.asInstanceOf[js.Any])
    if (RestoreSummary != null) __obj.updateDynamic("RestoreSummary")(RestoreSummary.asInstanceOf[js.Any])
    if (SSEDescription != null) __obj.updateDynamic("SSEDescription")(SSEDescription.asInstanceOf[js.Any])
    if (StreamSpecification != null) __obj.updateDynamic("StreamSpecification")(StreamSpecification.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn.asInstanceOf[js.Any])
    if (TableId != null) __obj.updateDynamic("TableId")(TableId.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    if (!js.isUndefined(TableSizeBytes)) __obj.updateDynamic("TableSizeBytes")(TableSizeBytes.get.asInstanceOf[js.Any])
    if (TableStatus != null) __obj.updateDynamic("TableStatus")(TableStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDescription]
  }
}

