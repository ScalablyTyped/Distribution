package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArchivalReason = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADD
  - typings.awsSdk.awsSdkStrings.PUT
  - typings.awsSdk.awsSdkStrings.DELETE
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
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - java.lang.String
*/
type BackupStatus = _BackupStatus | java.lang.String

type BackupSummaries = js.Array[BackupSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.SYSTEM
  - typings.awsSdk.awsSdkStrings.AWS_BACKUP
  - java.lang.String
*/
type BackupType = _BackupType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.SYSTEM
  - typings.awsSdk.awsSdkStrings.AWS_BACKUP
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type BackupTypeFilter = _BackupTypeFilter | java.lang.String

type BackupsInputLimit = scala.Double

type BatchGetRequestMap = StringDictionary[KeysAndAttributes]

type BatchGetResponseMap = StringDictionary[ItemList]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ConditionalCheckFailed
  - typings.awsSdk.awsSdkStrings.ItemCollectionSizeLimitExceeded
  - typings.awsSdk.awsSdkStrings.RequestLimitExceeded
  - typings.awsSdk.awsSdkStrings.ValidationError
  - typings.awsSdk.awsSdkStrings.ProvisionedThroughputExceeded
  - typings.awsSdk.awsSdkStrings.TransactionConflict
  - typings.awsSdk.awsSdkStrings.ThrottlingError
  - typings.awsSdk.awsSdkStrings.InternalServerError
  - typings.awsSdk.awsSdkStrings.ResourceNotFound
  - typings.awsSdk.awsSdkStrings.AccessDenied
  - typings.awsSdk.awsSdkStrings.DuplicateItem
  - java.lang.String
*/
type BatchStatementErrorCodeEnum = _BatchStatementErrorCodeEnum | java.lang.String

type BatchWriteItemRequestMap = StringDictionary[WriteRequests]

type BilledSizeBytes = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROVISIONED
  - typings.awsSdk.awsSdkStrings.PAY_PER_REQUEST
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
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.NE
  - typings.awsSdk.awsSdkStrings.IN
  - typings.awsSdk.awsSdkStrings.LE
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.GE
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.NOT_NULL
  - typings.awsSdk.awsSdkStrings.NULL
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.NOT_CONTAINS
  - typings.awsSdk.awsSdkStrings.BEGINS_WITH
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | java.lang.String

type ConditionExpression = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AND
  - typings.awsSdk.awsSdkStrings.OR
  - java.lang.String
*/
type ConditionalOperator = _ConditionalOperator | java.lang.String

type ConsistentRead = Boolean

type ConsumedCapacityMultiple = js.Array[ConsumedCapacity]

type ConsumedCapacityUnits = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ContinuousBackupsStatus = _ContinuousBackupsStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLE
  - typings.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type ContributorInsightsAction = _ContributorInsightsAction | java.lang.String

type ContributorInsightsRule = java.lang.String

type ContributorInsightsRuleList = js.Array[ContributorInsightsRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ContributorInsightsStatus = _ContributorInsightsStatus | java.lang.String

type ContributorInsightsSummaries = js.Array[ContributorInsightsSummary]

type CsvDelimiter = java.lang.String

type CsvHeader = java.lang.String

type CsvHeaderList = js.Array[CsvHeader]

type Date = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.ENABLE_FAILED
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
  - typings.awsSdk.awsSdkStrings.DYNAMODB_JSON
  - typings.awsSdk.awsSdkStrings.ION
  - java.lang.String
*/
type ExportFormat = _ExportFormat | java.lang.String

type ExportManifest = java.lang.String

type ExportNextToken = java.lang.String

type ExportStartTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
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
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type GlobalTableStatus = _GlobalTableStatus | java.lang.String

type ImportArn = java.lang.String

type ImportEndTime = js.Date

type ImportNextToken = java.lang.String

type ImportStartTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ImportStatus = _ImportStatus | java.lang.String

type ImportSummaryList = js.Array[ImportSummary]

type ImportedItemCount = scala.Double

type IndexName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type IndexStatus = _IndexStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GZIP
  - typings.awsSdk.awsSdkStrings.ZSTD
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type InputCompressionType = _InputCompressionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DYNAMODB_JSON
  - typings.awsSdk.awsSdkStrings.ION
  - typings.awsSdk.awsSdkStrings.CSV
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
  - typings.awsSdk.awsSdkStrings.HASH
  - typings.awsSdk.awsSdkStrings.RANGE
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
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type PointInTimeRecoveryStatus = _PointInTimeRecoveryStatus | java.lang.String

type PositiveIntegerObject = scala.Double

type PositiveLongObject = scala.Double

type PreparedStatementParameters = js.Array[AttributeValue]

type ProcessedItemCount = scala.Double

type ProjectionExpression = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.KEYS_ONLY
  - typings.awsSdk.awsSdkStrings.INCLUDE
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
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATION_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.REGION_DISABLED
  - typings.awsSdk.awsSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
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
  - typings.awsSdk.awsSdkStrings.INDEXES
  - typings.awsSdk.awsSdkStrings.TOTAL
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ReturnConsumedCapacity = _ReturnConsumedCapacity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SIZE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ReturnItemCollectionMetrics = _ReturnItemCollectionMetrics | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.ALL_OLD
  - typings.awsSdk.awsSdkStrings.UPDATED_OLD
  - typings.awsSdk.awsSdkStrings.ALL_NEW
  - typings.awsSdk.awsSdkStrings.UPDATED_NEW
  - java.lang.String
*/
type ReturnValue = _ReturnValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_OLD
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ReturnValuesOnConditionCheckFailure = _ReturnValuesOnConditionCheckFailure | java.lang.String

type S3Bucket = java.lang.String

type S3BucketOwner = java.lang.String

type S3Prefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES256
  - typings.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
type S3SseAlgorithm = _S3SseAlgorithm | java.lang.String

type S3SseKmsKeyId = java.lang.String

type SSEEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type SSEStatus = _SSEStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES256
  - typings.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
type SSEType = _SSEType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S
  - typings.awsSdk.awsSdkStrings.N
  - typings.awsSdk.awsSdkStrings.B
  - java.lang.String
*/
type ScalarAttributeType = _ScalarAttributeType | java.lang.String

type ScanSegment = scala.Double

type ScanTotalSegments = scala.Double

type SecondaryIndexesCapacityMap = StringDictionary[Capacity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_ATTRIBUTES
  - typings.awsSdk.awsSdkStrings.ALL_PROJECTED_ATTRIBUTES
  - typings.awsSdk.awsSdkStrings.SPECIFIC_ATTRIBUTES
  - typings.awsSdk.awsSdkStrings.COUNT
  - java.lang.String
*/
type Select = _Select | java.lang.String

type StreamArn = java.lang.String

type StreamEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEW_IMAGE
  - typings.awsSdk.awsSdkStrings.OLD_IMAGE
  - typings.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
  - typings.awsSdk.awsSdkStrings.KEYS_ONLY
  - java.lang.String
*/
type StreamViewType = _StreamViewType | java.lang.String

type String = java.lang.String

type StringAttributeValue = java.lang.String

type StringSetAttributeValue = js.Array[StringAttributeValue]

type TableArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.STANDARD_INFREQUENT_ACCESS
  - java.lang.String
*/
type TableClass = _TableClass | java.lang.String

type TableCreationDateTime = js.Date

type TableId = java.lang.String

type TableName = java.lang.String

type TableNameList = js.Array[TableName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
  - typings.awsSdk.awsSdkStrings.ARCHIVING
  - typings.awsSdk.awsSdkStrings.ARCHIVED
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
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type TimeToLiveStatus = _TimeToLiveStatus | java.lang.String

type TransactGetItemList = js.Array[TransactGetItem]

type TransactWriteItemList = js.Array[TransactWriteItem]

type UpdateExpression = java.lang.String

type WriteRequests = js.Array[WriteRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2011-12-05`
  - typings.awsSdk.awsSdkStrings.`2012-08-10`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
