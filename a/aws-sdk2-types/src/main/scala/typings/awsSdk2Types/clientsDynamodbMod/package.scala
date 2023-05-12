package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArchivalReason = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ADD
  - typings.awsSdk2Types.awsSdk2TypesStrings.PUT
  - typings.awsSdk2Types.awsSdk2TypesStrings.DELETE
  - java.lang.String
*/
type AttributeAction = _AttributeAction | java.lang.String

type AttributeDefinitions = js.Array[AttributeDefinition]

type AttributeMap = StringDictionary[AttributeValue]

type AttributeName = java.lang.String

type AttributeNameList = js.Array[AttributeName]

type AttributeUpdates = StringDictionary[AttributeValueUpdate]

type AttributeValueList = js.Array[AttributeValue]

type AutoScalingPolicyDescriptionList = js.Array[AutoScalingPolicyDescription]

type AutoScalingPolicyName = java.lang.String

type AutoScalingRoleArn = java.lang.String

type Backfilling = Boolean

type BackupArn = java.lang.String

type BackupCreationDateTime = js.Date

type BackupName = java.lang.String

type BackupSizeBytes = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CREATING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DELETED
  - typings.awsSdk2Types.awsSdk2TypesStrings.AVAILABLE
  - java.lang.String
*/
type BackupStatus = _BackupStatus | java.lang.String

type BackupSummaries = js.Array[BackupSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.USER
  - typings.awsSdk2Types.awsSdk2TypesStrings.SYSTEM
  - typings.awsSdk2Types.awsSdk2TypesStrings.AWS_BACKUP
  - java.lang.String
*/
type BackupType = _BackupType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.USER
  - typings.awsSdk2Types.awsSdk2TypesStrings.SYSTEM
  - typings.awsSdk2Types.awsSdk2TypesStrings.AWS_BACKUP
  - typings.awsSdk2Types.awsSdk2TypesStrings.ALL
  - java.lang.String
*/
type BackupTypeFilter = _BackupTypeFilter | java.lang.String

type BackupsInputLimit = scala.Double

type BatchGetRequestMap = StringDictionary[KeysAndAttributes]

type BatchGetResponseMap = StringDictionary[ItemList]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ConditionalCheckFailed
  - typings.awsSdk2Types.awsSdk2TypesStrings.ItemCollectionSizeLimitExceeded
  - typings.awsSdk2Types.awsSdk2TypesStrings.RequestLimitExceeded
  - typings.awsSdk2Types.awsSdk2TypesStrings.ValidationError
  - typings.awsSdk2Types.awsSdk2TypesStrings.ProvisionedThroughputExceeded
  - typings.awsSdk2Types.awsSdk2TypesStrings.TransactionConflict
  - typings.awsSdk2Types.awsSdk2TypesStrings.ThrottlingError
  - typings.awsSdk2Types.awsSdk2TypesStrings.InternalServerError
  - typings.awsSdk2Types.awsSdk2TypesStrings.ResourceNotFound
  - typings.awsSdk2Types.awsSdk2TypesStrings.AccessDenied
  - typings.awsSdk2Types.awsSdk2TypesStrings.DuplicateItem
  - java.lang.String
*/
type BatchStatementErrorCodeEnum = _BatchStatementErrorCodeEnum | java.lang.String

type BatchWriteItemRequestMap = StringDictionary[WriteRequests]

type BilledSizeBytes = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.PROVISIONED
  - typings.awsSdk2Types.awsSdk2TypesStrings.PAY_PER_REQUEST
  - java.lang.String
*/
type BillingMode = _BillingMode | java.lang.String

type BinaryAttributeValue = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type BinarySetAttributeValue = js.Array[BinaryAttributeValue]

type BooleanAttributeValue = Boolean

type BooleanObject = Boolean

type ClientRequestToken = java.lang.String

type ClientToken = java.lang.String

type CloudWatchLogGroupArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.EQ
  - typings.awsSdk2Types.awsSdk2TypesStrings.NE
  - typings.awsSdk2Types.awsSdk2TypesStrings.IN
  - typings.awsSdk2Types.awsSdk2TypesStrings.LE
  - typings.awsSdk2Types.awsSdk2TypesStrings.LT
  - typings.awsSdk2Types.awsSdk2TypesStrings.GE
  - typings.awsSdk2Types.awsSdk2TypesStrings.GT
  - typings.awsSdk2Types.awsSdk2TypesStrings.BETWEEN
  - typings.awsSdk2Types.awsSdk2TypesStrings.NOT_NULL
  - typings.awsSdk2Types.awsSdk2TypesStrings.NULL
  - typings.awsSdk2Types.awsSdk2TypesStrings.CONTAINS
  - typings.awsSdk2Types.awsSdk2TypesStrings.NOT_CONTAINS
  - typings.awsSdk2Types.awsSdk2TypesStrings.BEGINS_WITH
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | java.lang.String

type ConditionExpression = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.AND
  - typings.awsSdk2Types.awsSdk2TypesStrings.OR
  - java.lang.String
*/
type ConditionalOperator = _ConditionalOperator | java.lang.String

type ConsistentRead = Boolean

type ConsumedCapacityMultiple = js.Array[ConsumedCapacity]

type ConsumedCapacityUnits = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLED
  - java.lang.String
*/
type ContinuousBackupsStatus = _ContinuousBackupsStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLE
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLE
  - java.lang.String
*/
type ContributorInsightsAction = _ContributorInsightsAction | java.lang.String

type ContributorInsightsRule = java.lang.String

type ContributorInsightsRuleList = js.Array[ContributorInsightsRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLING
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.FAILED
  - java.lang.String
*/
type ContributorInsightsStatus = _ContributorInsightsStatus | java.lang.String

type ContributorInsightsSummaries = js.Array[ContributorInsightsSummary]

type CsvDelimiter = java.lang.String

type CsvHeader = java.lang.String

type CsvHeaderList = js.Array[CsvHeader]

type Date = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLING
  - typings.awsSdk2Types.awsSdk2TypesStrings.ACTIVE
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLE_FAILED
  - java.lang.String
*/
type DestinationStatus = _DestinationStatus | java.lang.String

type Double = scala.Double

type Endpoints = js.Array[Endpoint]

type ErrorCount = scala.Double

type ExceptionDescription = java.lang.String

type ExceptionName = java.lang.String

type ExpectedAttributeMap = StringDictionary[ExpectedAttributeValue]

type ExportArn = java.lang.String

type ExportEndTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.DYNAMODB_JSON
  - typings.awsSdk2Types.awsSdk2TypesStrings.ION
  - java.lang.String
*/
type ExportFormat = _ExportFormat | java.lang.String

type ExportManifest = java.lang.String

type ExportNextToken = java.lang.String

type ExportStartTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.IN_PROGRESS
  - typings.awsSdk2Types.awsSdk2TypesStrings.COMPLETED
  - typings.awsSdk2Types.awsSdk2TypesStrings.FAILED
  - java.lang.String
*/
type ExportStatus = _ExportStatus | java.lang.String

type ExportSummaries = js.Array[ExportSummary]

type ExportTime = js.Date

type ExpressionAttributeNameMap = StringDictionary[AttributeName]

type ExpressionAttributeNameVariable = java.lang.String

type ExpressionAttributeValueMap = StringDictionary[AttributeValue]

type ExpressionAttributeValueVariable = java.lang.String

type FailureCode = java.lang.String

type FailureMessage = java.lang.String

type FilterConditionMap = StringDictionary[Condition]

type GlobalSecondaryIndexAutoScalingUpdateList = js.Array[GlobalSecondaryIndexAutoScalingUpdate]

type GlobalSecondaryIndexDescriptionList = js.Array[GlobalSecondaryIndexDescription]

type GlobalSecondaryIndexList = js.Array[GlobalSecondaryIndex]

type GlobalSecondaryIndexUpdateList = js.Array[GlobalSecondaryIndexUpdate]

type GlobalSecondaryIndexes = js.Array[GlobalSecondaryIndexInfo]

type GlobalTableArnString = java.lang.String

type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate]

type GlobalTableList = js.Array[GlobalTable]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CREATING
  - typings.awsSdk2Types.awsSdk2TypesStrings.ACTIVE
  - typings.awsSdk2Types.awsSdk2TypesStrings.DELETING
  - typings.awsSdk2Types.awsSdk2TypesStrings.UPDATING
  - java.lang.String
*/
type GlobalTableStatus = _GlobalTableStatus | java.lang.String

type ImportArn = java.lang.String

type ImportEndTime = js.Date

type ImportNextToken = java.lang.String

type ImportStartTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.IN_PROGRESS
  - typings.awsSdk2Types.awsSdk2TypesStrings.COMPLETED
  - typings.awsSdk2Types.awsSdk2TypesStrings.CANCELLING
  - typings.awsSdk2Types.awsSdk2TypesStrings.CANCELLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.FAILED
  - java.lang.String
*/
type ImportStatus = _ImportStatus | java.lang.String

type ImportSummaryList = js.Array[ImportSummary]

type ImportedItemCount = scala.Double

type IndexName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CREATING
  - typings.awsSdk2Types.awsSdk2TypesStrings.UPDATING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DELETING
  - typings.awsSdk2Types.awsSdk2TypesStrings.ACTIVE
  - java.lang.String
*/
type IndexStatus = _IndexStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.GZIP
  - typings.awsSdk2Types.awsSdk2TypesStrings.ZSTD
  - typings.awsSdk2Types.awsSdk2TypesStrings.NONE
  - java.lang.String
*/
type InputCompressionType = _InputCompressionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.DYNAMODB_JSON
  - typings.awsSdk2Types.awsSdk2TypesStrings.ION
  - typings.awsSdk2Types.awsSdk2TypesStrings.CSV
  - java.lang.String
*/
type InputFormat = _InputFormat | java.lang.String

type Integer = scala.Double

type IntegerObject = scala.Double

type ItemCollectionKeyAttributeMap = StringDictionary[AttributeValue]

type ItemCollectionMetricsMultiple = js.Array[ItemCollectionMetrics]

type ItemCollectionMetricsPerTable = StringDictionary[ItemCollectionMetricsMultiple]

type ItemCollectionSizeEstimateBound = scala.Double

type ItemCollectionSizeEstimateRange = js.Array[ItemCollectionSizeEstimateBound]

type ItemCount = scala.Double

type ItemList = js.Array[AttributeMap]

type ItemResponseList = js.Array[ItemResponse]

type KMSMasterKeyArn = java.lang.String

type KMSMasterKeyId = java.lang.String

type Key = StringDictionary[AttributeValue]

type KeyConditions = StringDictionary[Condition]

type KeyExpression = java.lang.String

type KeyList = js.Array[Key]

type KeySchema = js.Array[KeySchemaElement]

type KeySchemaAttributeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.HASH
  - typings.awsSdk2Types.awsSdk2TypesStrings.RANGE
  - java.lang.String
*/
type KeyType = _KeyType | java.lang.String

type KinesisDataStreamDestinations = js.Array[KinesisDataStreamDestination]

type LastUpdateDateTime = js.Date

type ListAttributeValue = js.Array[AttributeValue]

type ListContributorInsightsLimit = scala.Double

type ListExportsMaxLimit = scala.Double

type ListImportsMaxLimit = scala.Double

type ListTablesInputLimit = scala.Double

type LocalSecondaryIndexDescriptionList = js.Array[LocalSecondaryIndexDescription]

type LocalSecondaryIndexList = js.Array[LocalSecondaryIndex]

type LocalSecondaryIndexes = js.Array[LocalSecondaryIndexInfo]

type Long = scala.Double

type MapAttributeValue = StringDictionary[AttributeValue]

type NextTokenString = java.lang.String

type NonKeyAttributeName = java.lang.String

type NonKeyAttributeNameList = js.Array[NonKeyAttributeName]

type NonNegativeLongObject = scala.Double

type NullAttributeValue = Boolean

type NumberAttributeValue = java.lang.String

type NumberSetAttributeValue = js.Array[NumberAttributeValue]

type ParameterizedStatements = js.Array[ParameterizedStatement]

type PartiQLBatchRequest = js.Array[BatchStatementRequest]

type PartiQLBatchResponse = js.Array[BatchStatementResponse]

type PartiQLNextToken = java.lang.String

type PartiQLStatement = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLED
  - java.lang.String
*/
type PointInTimeRecoveryStatus = _PointInTimeRecoveryStatus | java.lang.String

type PositiveIntegerObject = scala.Double

type PositiveLongObject = scala.Double

type PreparedStatementParameters = js.Array[AttributeValue]

type ProcessedItemCount = scala.Double

type ProjectionExpression = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ALL
  - typings.awsSdk2Types.awsSdk2TypesStrings.KEYS_ONLY
  - typings.awsSdk2Types.awsSdk2TypesStrings.INCLUDE
  - java.lang.String
*/
type ProjectionType = _ProjectionType | java.lang.String

type PutItemInputAttributeMap = StringDictionary[AttributeValue]

type RegionName = java.lang.String

type ReplicaAutoScalingDescriptionList = js.Array[ReplicaAutoScalingDescription]

type ReplicaAutoScalingUpdateList = js.Array[ReplicaAutoScalingUpdate]

type ReplicaDescriptionList = js.Array[ReplicaDescription]

type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = js.Array[ReplicaGlobalSecondaryIndexAutoScalingDescription]

type ReplicaGlobalSecondaryIndexAutoScalingUpdateList = js.Array[ReplicaGlobalSecondaryIndexAutoScalingUpdate]

type ReplicaGlobalSecondaryIndexDescriptionList = js.Array[ReplicaGlobalSecondaryIndexDescription]

type ReplicaGlobalSecondaryIndexList = js.Array[ReplicaGlobalSecondaryIndex]

type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]

type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate]

type ReplicaList = js.Array[Replica]

type ReplicaSettingsDescriptionList = js.Array[ReplicaSettingsDescription]

type ReplicaSettingsUpdateList = js.Array[ReplicaSettingsUpdate]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CREATING
  - typings.awsSdk2Types.awsSdk2TypesStrings.CREATION_FAILED
  - typings.awsSdk2Types.awsSdk2TypesStrings.UPDATING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DELETING
  - typings.awsSdk2Types.awsSdk2TypesStrings.ACTIVE
  - typings.awsSdk2Types.awsSdk2TypesStrings.REGION_DISABLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
  - java.lang.String
*/
type ReplicaStatus = _ReplicaStatus | java.lang.String

type ReplicaStatusDescription = java.lang.String

type ReplicaStatusPercentProgress = java.lang.String

type ReplicaUpdateList = js.Array[ReplicaUpdate]

type ReplicationGroupUpdateList = js.Array[ReplicationGroupUpdate]

type ResourceArnString = java.lang.String

type RestoreInProgress = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.INDEXES
  - typings.awsSdk2Types.awsSdk2TypesStrings.TOTAL
  - typings.awsSdk2Types.awsSdk2TypesStrings.NONE
  - java.lang.String
*/
type ReturnConsumedCapacity = _ReturnConsumedCapacity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.SIZE
  - typings.awsSdk2Types.awsSdk2TypesStrings.NONE
  - java.lang.String
*/
type ReturnItemCollectionMetrics = _ReturnItemCollectionMetrics | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.NONE
  - typings.awsSdk2Types.awsSdk2TypesStrings.ALL_OLD
  - typings.awsSdk2Types.awsSdk2TypesStrings.UPDATED_OLD
  - typings.awsSdk2Types.awsSdk2TypesStrings.ALL_NEW
  - typings.awsSdk2Types.awsSdk2TypesStrings.UPDATED_NEW
  - java.lang.String
*/
type ReturnValue = _ReturnValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ALL_OLD
  - typings.awsSdk2Types.awsSdk2TypesStrings.NONE
  - java.lang.String
*/
type ReturnValuesOnConditionCheckFailure = _ReturnValuesOnConditionCheckFailure | java.lang.String

type S3Bucket = java.lang.String

type S3BucketOwner = java.lang.String

type S3Prefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.AES256
  - typings.awsSdk2Types.awsSdk2TypesStrings.KMS
  - java.lang.String
*/
type S3SseAlgorithm = _S3SseAlgorithm | java.lang.String

type S3SseKmsKeyId = java.lang.String

type SSEEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLING
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.UPDATING
  - java.lang.String
*/
type SSEStatus = _SSEStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.AES256
  - typings.awsSdk2Types.awsSdk2TypesStrings.KMS
  - java.lang.String
*/
type SSEType = _SSEType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.S
  - typings.awsSdk2Types.awsSdk2TypesStrings.N
  - typings.awsSdk2Types.awsSdk2TypesStrings.B
  - java.lang.String
*/
type ScalarAttributeType = _ScalarAttributeType | java.lang.String

type ScanSegment = scala.Double

type ScanTotalSegments = scala.Double

type SecondaryIndexesCapacityMap = StringDictionary[Capacity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ALL_ATTRIBUTES
  - typings.awsSdk2Types.awsSdk2TypesStrings.ALL_PROJECTED_ATTRIBUTES
  - typings.awsSdk2Types.awsSdk2TypesStrings.SPECIFIC_ATTRIBUTES
  - typings.awsSdk2Types.awsSdk2TypesStrings.COUNT
  - java.lang.String
*/
type Select = _Select | java.lang.String

type StreamArn = java.lang.String

type StreamEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.NEW_IMAGE
  - typings.awsSdk2Types.awsSdk2TypesStrings.OLD_IMAGE
  - typings.awsSdk2Types.awsSdk2TypesStrings.NEW_AND_OLD_IMAGES
  - typings.awsSdk2Types.awsSdk2TypesStrings.KEYS_ONLY
  - java.lang.String
*/
type StreamViewType = _StreamViewType | java.lang.String

type String = java.lang.String

type StringAttributeValue = java.lang.String

type StringSetAttributeValue = js.Array[StringAttributeValue]

type TableArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.STANDARD
  - typings.awsSdk2Types.awsSdk2TypesStrings.STANDARD_INFREQUENT_ACCESS
  - java.lang.String
*/
type TableClass = _TableClass | java.lang.String

type TableCreationDateTime = js.Date

type TableId = java.lang.String

type TableName = java.lang.String

type TableNameList = js.Array[TableName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CREATING
  - typings.awsSdk2Types.awsSdk2TypesStrings.UPDATING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DELETING
  - typings.awsSdk2Types.awsSdk2TypesStrings.ACTIVE
  - typings.awsSdk2Types.awsSdk2TypesStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
  - typings.awsSdk2Types.awsSdk2TypesStrings.ARCHIVING
  - typings.awsSdk2Types.awsSdk2TypesStrings.ARCHIVED
  - java.lang.String
*/
type TableStatus = _TableStatus | java.lang.String

type TagKeyList = js.Array[TagKeyString]

type TagKeyString = java.lang.String

type TagList = js.Array[Tag]

type TagValueString = java.lang.String

type TimeRangeLowerBound = js.Date

type TimeRangeUpperBound = js.Date

type TimeToLiveAttributeName = java.lang.String

type TimeToLiveEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLING
  - typings.awsSdk2Types.awsSdk2TypesStrings.ENABLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.DISABLED
  - java.lang.String
*/
type TimeToLiveStatus = _TimeToLiveStatus | java.lang.String

type TransactGetItemList = js.Array[TransactGetItem]

type TransactWriteItemList = js.Array[TransactWriteItem]

type UpdateExpression = java.lang.String

type WriteRequests = js.Array[WriteRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.`2011-12-05`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`2012-08-10`
  - typings.awsSdk2Types.awsSdk2TypesStrings.latest
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
