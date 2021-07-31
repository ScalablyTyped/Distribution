package typings.awsSdk.dynamodbMod

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
type AttributeAction = typings.awsSdk.dynamodbMod._AttributeAction | java.lang.String

type AttributeDefinitions = js.Array[typings.awsSdk.dynamodbMod.AttributeDefinition]

type AttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.AttributeValue]

type AttributeName = java.lang.String

type AttributeNameList = js.Array[typings.awsSdk.dynamodbMod.AttributeName]

type AttributeUpdates = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.AttributeValueUpdate]

type AttributeValueList = js.Array[typings.awsSdk.dynamodbMod.AttributeValue]

type AutoScalingPolicyDescriptionList = js.Array[typings.awsSdk.dynamodbMod.AutoScalingPolicyDescription]

type AutoScalingPolicyName = java.lang.String

type AutoScalingRoleArn = java.lang.String

type Backfilling = scala.Boolean

type BackupArn = java.lang.String

type BackupCreationDateTime = typings.std.Date

type BackupName = java.lang.String

type BackupSizeBytes = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - java.lang.String
*/
type BackupStatus = typings.awsSdk.dynamodbMod._BackupStatus | java.lang.String

type BackupSummaries = js.Array[typings.awsSdk.dynamodbMod.BackupSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.SYSTEM
  - typings.awsSdk.awsSdkStrings.AWS_BACKUP
  - java.lang.String
*/
type BackupType = typings.awsSdk.dynamodbMod._BackupType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.SYSTEM
  - typings.awsSdk.awsSdkStrings.AWS_BACKUP
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type BackupTypeFilter = typings.awsSdk.dynamodbMod._BackupTypeFilter | java.lang.String

type BackupsInputLimit = scala.Double

type BatchGetRequestMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.KeysAndAttributes]

type BatchGetResponseMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.ItemList]

type BatchWriteItemRequestMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.WriteRequests]

type BilledSizeBytes = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROVISIONED
  - typings.awsSdk.awsSdkStrings.PAY_PER_REQUEST
  - java.lang.String
*/
type BillingMode = typings.awsSdk.dynamodbMod._BillingMode | java.lang.String

type BinaryAttributeValue = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.dynamodbMod.Blob | java.lang.String

type BinarySetAttributeValue = js.Array[typings.awsSdk.dynamodbMod.BinaryAttributeValue]

type BooleanAttributeValue = scala.Boolean

type BooleanObject = scala.Boolean

type ClientRequestToken = java.lang.String

type ClientToken = java.lang.String

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
type ComparisonOperator = typings.awsSdk.dynamodbMod._ComparisonOperator | java.lang.String

type ConditionExpression = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AND
  - typings.awsSdk.awsSdkStrings.OR
  - java.lang.String
*/
type ConditionalOperator = typings.awsSdk.dynamodbMod._ConditionalOperator | java.lang.String

type ConsistentRead = scala.Boolean

type ConsumedCapacityMultiple = js.Array[typings.awsSdk.dynamodbMod.ConsumedCapacity]

type ConsumedCapacityUnits = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ContinuousBackupsStatus = typings.awsSdk.dynamodbMod._ContinuousBackupsStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLE
  - typings.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type ContributorInsightsAction = typings.awsSdk.dynamodbMod._ContributorInsightsAction | java.lang.String

type ContributorInsightsRule = java.lang.String

type ContributorInsightsRuleList = js.Array[typings.awsSdk.dynamodbMod.ContributorInsightsRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ContributorInsightsStatus = typings.awsSdk.dynamodbMod._ContributorInsightsStatus | java.lang.String

type ContributorInsightsSummaries = js.Array[typings.awsSdk.dynamodbMod.ContributorInsightsSummary]

type Date = typings.std.Date

type Double = scala.Double

type Endpoints = js.Array[typings.awsSdk.dynamodbMod.Endpoint]

type ExceptionDescription = java.lang.String

type ExceptionName = java.lang.String

type ExpectedAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.ExpectedAttributeValue]

type ExportArn = java.lang.String

type ExportEndTime = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DYNAMODB_JSON
  - typings.awsSdk.awsSdkStrings.ION
  - java.lang.String
*/
type ExportFormat = typings.awsSdk.dynamodbMod._ExportFormat | java.lang.String

type ExportManifest = java.lang.String

type ExportNextToken = java.lang.String

type ExportStartTime = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ExportStatus = typings.awsSdk.dynamodbMod._ExportStatus | java.lang.String

type ExportSummaries = js.Array[typings.awsSdk.dynamodbMod.ExportSummary]

type ExportTime = typings.std.Date

type ExpressionAttributeNameMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.AttributeName]

type ExpressionAttributeNameVariable = java.lang.String

type ExpressionAttributeValueMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.AttributeValue]

type ExpressionAttributeValueVariable = java.lang.String

type FailureCode = java.lang.String

type FailureMessage = java.lang.String

type FilterConditionMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.Condition]

type GlobalSecondaryIndexAutoScalingUpdateList = js.Array[typings.awsSdk.dynamodbMod.GlobalSecondaryIndexAutoScalingUpdate]

type GlobalSecondaryIndexDescriptionList = js.Array[typings.awsSdk.dynamodbMod.GlobalSecondaryIndexDescription]

type GlobalSecondaryIndexList = js.Array[typings.awsSdk.dynamodbMod.GlobalSecondaryIndex]

type GlobalSecondaryIndexUpdateList = js.Array[typings.awsSdk.dynamodbMod.GlobalSecondaryIndexUpdate]

type GlobalSecondaryIndexes = js.Array[typings.awsSdk.dynamodbMod.GlobalSecondaryIndexInfo]

type GlobalTableArnString = java.lang.String

type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[typings.awsSdk.dynamodbMod.GlobalTableGlobalSecondaryIndexSettingsUpdate]

type GlobalTableList = js.Array[typings.awsSdk.dynamodbMod.GlobalTable]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type GlobalTableStatus = typings.awsSdk.dynamodbMod._GlobalTableStatus | java.lang.String

type IndexName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type IndexStatus = typings.awsSdk.dynamodbMod._IndexStatus | java.lang.String

type Integer = scala.Double

type IntegerObject = scala.Double

type ItemCollectionKeyAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.AttributeValue]

type ItemCollectionMetricsMultiple = js.Array[typings.awsSdk.dynamodbMod.ItemCollectionMetrics]

type ItemCollectionMetricsPerTable = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.ItemCollectionMetricsMultiple]

type ItemCollectionSizeEstimateBound = scala.Double

type ItemCollectionSizeEstimateRange = js.Array[typings.awsSdk.dynamodbMod.ItemCollectionSizeEstimateBound]

type ItemCount = scala.Double

type ItemList = js.Array[typings.awsSdk.dynamodbMod.AttributeMap]

type ItemResponseList = js.Array[typings.awsSdk.dynamodbMod.ItemResponse]

type KMSMasterKeyArn = java.lang.String

type KMSMasterKeyId = java.lang.String

type Key = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.AttributeValue]

type KeyConditions = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.Condition]

type KeyExpression = java.lang.String

type KeyList = js.Array[typings.awsSdk.dynamodbMod.Key]

type KeySchema = js.Array[typings.awsSdk.dynamodbMod.KeySchemaElement]

type KeySchemaAttributeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HASH
  - typings.awsSdk.awsSdkStrings.RANGE
  - java.lang.String
*/
type KeyType = typings.awsSdk.dynamodbMod._KeyType | java.lang.String

type LastUpdateDateTime = typings.std.Date

type ListAttributeValue = js.Array[typings.awsSdk.dynamodbMod.AttributeValue]

type ListContributorInsightsLimit = scala.Double

type ListExportsMaxLimit = scala.Double

type ListTablesInputLimit = scala.Double

type LocalSecondaryIndexDescriptionList = js.Array[typings.awsSdk.dynamodbMod.LocalSecondaryIndexDescription]

type LocalSecondaryIndexList = js.Array[typings.awsSdk.dynamodbMod.LocalSecondaryIndex]

type LocalSecondaryIndexes = js.Array[typings.awsSdk.dynamodbMod.LocalSecondaryIndexInfo]

type Long = scala.Double

type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.AttributeValue]

type NextTokenString = java.lang.String

type NonKeyAttributeName = java.lang.String

type NonKeyAttributeNameList = js.Array[typings.awsSdk.dynamodbMod.NonKeyAttributeName]

type NonNegativeLongObject = scala.Double

type NullAttributeValue = scala.Boolean

type NumberAttributeValue = java.lang.String

type NumberSetAttributeValue = js.Array[typings.awsSdk.dynamodbMod.NumberAttributeValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type PointInTimeRecoveryStatus = typings.awsSdk.dynamodbMod._PointInTimeRecoveryStatus | java.lang.String

type PositiveIntegerObject = scala.Double

type PositiveLongObject = scala.Double

type ProjectionExpression = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.KEYS_ONLY
  - typings.awsSdk.awsSdkStrings.INCLUDE
  - java.lang.String
*/
type ProjectionType = typings.awsSdk.dynamodbMod._ProjectionType | java.lang.String

type PutItemInputAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.AttributeValue]

type RegionName = java.lang.String

type ReplicaAutoScalingDescriptionList = js.Array[typings.awsSdk.dynamodbMod.ReplicaAutoScalingDescription]

type ReplicaAutoScalingUpdateList = js.Array[typings.awsSdk.dynamodbMod.ReplicaAutoScalingUpdate]

type ReplicaDescriptionList = js.Array[typings.awsSdk.dynamodbMod.ReplicaDescription]

type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = js.Array[typings.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexAutoScalingDescription]

type ReplicaGlobalSecondaryIndexAutoScalingUpdateList = js.Array[typings.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexAutoScalingUpdate]

type ReplicaGlobalSecondaryIndexDescriptionList = js.Array[typings.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexDescription]

type ReplicaGlobalSecondaryIndexList = js.Array[typings.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndex]

type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[typings.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexSettingsDescription]

type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[typings.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexSettingsUpdate]

type ReplicaList = js.Array[typings.awsSdk.dynamodbMod.Replica]

type ReplicaSettingsDescriptionList = js.Array[typings.awsSdk.dynamodbMod.ReplicaSettingsDescription]

type ReplicaSettingsUpdateList = js.Array[typings.awsSdk.dynamodbMod.ReplicaSettingsUpdate]

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
type ReplicaStatus = typings.awsSdk.dynamodbMod._ReplicaStatus | java.lang.String

type ReplicaStatusDescription = java.lang.String

type ReplicaStatusPercentProgress = java.lang.String

type ReplicaUpdateList = js.Array[typings.awsSdk.dynamodbMod.ReplicaUpdate]

type ReplicationGroupUpdateList = js.Array[typings.awsSdk.dynamodbMod.ReplicationGroupUpdate]

type ResourceArnString = java.lang.String

type RestoreInProgress = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INDEXES
  - typings.awsSdk.awsSdkStrings.TOTAL
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ReturnConsumedCapacity = typings.awsSdk.dynamodbMod._ReturnConsumedCapacity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SIZE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ReturnItemCollectionMetrics = typings.awsSdk.dynamodbMod._ReturnItemCollectionMetrics | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.ALL_OLD
  - typings.awsSdk.awsSdkStrings.UPDATED_OLD
  - typings.awsSdk.awsSdkStrings.ALL_NEW
  - typings.awsSdk.awsSdkStrings.UPDATED_NEW
  - java.lang.String
*/
type ReturnValue = typings.awsSdk.dynamodbMod._ReturnValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_OLD
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ReturnValuesOnConditionCheckFailure = typings.awsSdk.dynamodbMod._ReturnValuesOnConditionCheckFailure | java.lang.String

type S3Bucket = java.lang.String

type S3BucketOwner = java.lang.String

type S3Prefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES256
  - typings.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
type S3SseAlgorithm = typings.awsSdk.dynamodbMod._S3SseAlgorithm | java.lang.String

type S3SseKmsKeyId = java.lang.String

type SSEEnabled = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type SSEStatus = typings.awsSdk.dynamodbMod._SSEStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES256
  - typings.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
type SSEType = typings.awsSdk.dynamodbMod._SSEType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S
  - typings.awsSdk.awsSdkStrings.N
  - typings.awsSdk.awsSdkStrings.B
  - java.lang.String
*/
type ScalarAttributeType = typings.awsSdk.dynamodbMod._ScalarAttributeType | java.lang.String

type ScanSegment = scala.Double

type ScanTotalSegments = scala.Double

type SecondaryIndexesCapacityMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbMod.Capacity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_ATTRIBUTES
  - typings.awsSdk.awsSdkStrings.ALL_PROJECTED_ATTRIBUTES
  - typings.awsSdk.awsSdkStrings.SPECIFIC_ATTRIBUTES
  - typings.awsSdk.awsSdkStrings.COUNT
  - java.lang.String
*/
type Select = typings.awsSdk.dynamodbMod._Select | java.lang.String

type StreamArn = java.lang.String

type StreamEnabled = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEW_IMAGE
  - typings.awsSdk.awsSdkStrings.OLD_IMAGE
  - typings.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
  - typings.awsSdk.awsSdkStrings.KEYS_ONLY
  - java.lang.String
*/
type StreamViewType = typings.awsSdk.dynamodbMod._StreamViewType | java.lang.String

type String = java.lang.String

type StringAttributeValue = java.lang.String

type StringSetAttributeValue = js.Array[typings.awsSdk.dynamodbMod.StringAttributeValue]

type TableArn = java.lang.String

type TableCreationDateTime = typings.std.Date

type TableId = java.lang.String

type TableName = java.lang.String

type TableNameList = js.Array[typings.awsSdk.dynamodbMod.TableName]

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
type TableStatus = typings.awsSdk.dynamodbMod._TableStatus | java.lang.String

type TagKeyList = js.Array[typings.awsSdk.dynamodbMod.TagKeyString]

type TagKeyString = java.lang.String

type TagList = js.Array[typings.awsSdk.dynamodbMod.Tag]

type TagValueString = java.lang.String

type TimeRangeLowerBound = typings.std.Date

type TimeRangeUpperBound = typings.std.Date

type TimeToLiveAttributeName = java.lang.String

type TimeToLiveEnabled = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type TimeToLiveStatus = typings.awsSdk.dynamodbMod._TimeToLiveStatus | java.lang.String

type TransactGetItemList = js.Array[typings.awsSdk.dynamodbMod.TransactGetItem]

type TransactWriteItemList = js.Array[typings.awsSdk.dynamodbMod.TransactWriteItem]

type UpdateExpression = java.lang.String

type WriteRequests = js.Array[typings.awsSdk.dynamodbMod.WriteRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2011-12-05`
  - typings.awsSdk.awsSdkStrings.`2012-08-10`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.dynamodbMod._apiVersion | java.lang.String
