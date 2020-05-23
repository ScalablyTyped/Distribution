package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotsitewiseMod {
  type ARN = java.lang.String
  type AccessPolicySummaries = js.Array[typings.awsSdk.iotsitewiseMod.AccessPolicySummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVERAGE
    - typings.awsSdk.awsSdkStrings.COUNT
    - typings.awsSdk.awsSdkStrings.MAXIMUM
    - typings.awsSdk.awsSdkStrings.MINIMUM
    - typings.awsSdk.awsSdkStrings.SUM
    - java.lang.String
  */
  type AggregateType = typings.awsSdk.iotsitewiseMod._AggregateType | java.lang.String
  type AggregateTypes = js.Array[typings.awsSdk.iotsitewiseMod.AggregateType]
  type AggregatedDoubleValue = scala.Double
  type AggregatedValues = js.Array[typings.awsSdk.iotsitewiseMod.AggregatedValue]
  type AmazonResourceName = java.lang.String
  type AssetErrorCode = typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE | java.lang.String
  type AssetErrorMessage = java.lang.String
  type AssetHierarchies = js.Array[typings.awsSdk.iotsitewiseMod.AssetHierarchy]
  type AssetIDs = js.Array[typings.awsSdk.iotsitewiseMod.ID]
  type AssetModelHierarchies = js.Array[typings.awsSdk.iotsitewiseMod.AssetModelHierarchy]
  type AssetModelHierarchyDefinitions = js.Array[typings.awsSdk.iotsitewiseMod.AssetModelHierarchyDefinition]
  type AssetModelProperties = js.Array[typings.awsSdk.iotsitewiseMod.AssetModelProperty]
  type AssetModelPropertyDefinitions = js.Array[typings.awsSdk.iotsitewiseMod.AssetModelPropertyDefinition]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.PROPAGATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AssetModelState = typings.awsSdk.iotsitewiseMod._AssetModelState | java.lang.String
  type AssetModelSummaries = js.Array[typings.awsSdk.iotsitewiseMod.AssetModelSummary]
  type AssetProperties = js.Array[typings.awsSdk.iotsitewiseMod.AssetProperty]
  type AssetPropertyAlias = java.lang.String
  type AssetPropertyValueHistory = js.Array[typings.awsSdk.iotsitewiseMod.AssetPropertyValue]
  type AssetPropertyValues = js.Array[typings.awsSdk.iotsitewiseMod.AssetPropertyValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AssetState = typings.awsSdk.iotsitewiseMod._AssetState | java.lang.String
  type AssetSummaries = js.Array[typings.awsSdk.iotsitewiseMod.AssetSummary]
  type AssociatedAssetsSummaries = js.Array[typings.awsSdk.iotsitewiseMod.AssociatedAssetsSummary]
  type BatchAssociateProjectAssetsErrors = js.Array[typings.awsSdk.iotsitewiseMod.AssetErrorDetails]
  type BatchDisassociateProjectAssetsErrors = js.Array[typings.awsSdk.iotsitewiseMod.AssetErrorDetails]
  type BatchPutAssetPropertyErrorEntries = js.Array[typings.awsSdk.iotsitewiseMod.BatchPutAssetPropertyErrorEntry]
  type BatchPutAssetPropertyErrors = js.Array[typings.awsSdk.iotsitewiseMod.BatchPutAssetPropertyError]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ResourceNotFoundException
    - typings.awsSdk.awsSdkStrings.InvalidRequestException
    - typings.awsSdk.awsSdkStrings.InternalFailureException
    - typings.awsSdk.awsSdkStrings.ServiceUnavailableException
    - typings.awsSdk.awsSdkStrings.ThrottlingException
    - typings.awsSdk.awsSdkStrings.LimitExceededException
    - typings.awsSdk.awsSdkStrings.ConflictingOperationException
    - typings.awsSdk.awsSdkStrings.TimestampOutOfRangeException
    - typings.awsSdk.awsSdkStrings.AccessDeniedException
    - java.lang.String
  */
  type BatchPutAssetPropertyValueErrorCode = typings.awsSdk.iotsitewiseMod._BatchPutAssetPropertyValueErrorCode | java.lang.String
  type CapabilityConfiguration = java.lang.String
  type CapabilityNamespace = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_SYNC
    - typings.awsSdk.awsSdkStrings.OUT_OF_SYNC
    - typings.awsSdk.awsSdkStrings.SYNC_FAILED
    - java.lang.String
  */
  type CapabilitySyncStatus = typings.awsSdk.iotsitewiseMod._CapabilitySyncStatus | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.iotsitewiseMod.ClientApiVersions
  type ClientToken = java.lang.String
  type DashboardDefinition = java.lang.String
  type DashboardSummaries = js.Array[typings.awsSdk.iotsitewiseMod.DashboardSummary]
  type DefaultValue = java.lang.String
  type Description = java.lang.String
  type Email = java.lang.String
  type EntryId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - java.lang.String
  */
  type ErrorCode = typings.awsSdk.iotsitewiseMod._ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type Expression = java.lang.String
  type ExpressionVariables = js.Array[typings.awsSdk.iotsitewiseMod.ExpressionVariable]
  type GatewayCapabilitySummaries = js.Array[typings.awsSdk.iotsitewiseMod.GatewayCapabilitySummary]
  type GatewaySummaries = js.Array[typings.awsSdk.iotsitewiseMod.GatewaySummary]
  type ID = java.lang.String
  type IDs = js.Array[typings.awsSdk.iotsitewiseMod.ID]
  type IdentityId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type IdentityType = typings.awsSdk.iotsitewiseMod._IdentityType | java.lang.String
  type ImageFileData = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.iotsitewiseMod.Blob | java.lang.String
  type ImageFileType = typings.awsSdk.awsSdkStrings.PNG | java.lang.String
  type Interval = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.TOP_LEVEL
    - java.lang.String
  */
  type ListAssetsFilter = typings.awsSdk.iotsitewiseMod._ListAssetsFilter | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.INFO
    - typings.awsSdk.awsSdkStrings.OFF
    - java.lang.String
  */
  type LoggingLevel = typings.awsSdk.iotsitewiseMod._LoggingLevel | java.lang.String
  type Macro = java.lang.String
  type MaxResults = scala.Double
  type MonitorErrorCode = typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE | java.lang.String
  type MonitorErrorMessage = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OffsetInNanos = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ADMINISTRATOR
    - typings.awsSdk.awsSdkStrings.VIEWER
    - java.lang.String
  */
  type Permission = typings.awsSdk.iotsitewiseMod._Permission | java.lang.String
  type PortalClientId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type PortalState = typings.awsSdk.iotsitewiseMod._PortalState | java.lang.String
  type PortalSummaries = js.Array[typings.awsSdk.iotsitewiseMod.PortalSummary]
  type ProjectSummaries = js.Array[typings.awsSdk.iotsitewiseMod.ProjectSummary]
  type PropertyAlias = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STRING
    - typings.awsSdk.awsSdkStrings.INTEGER
    - typings.awsSdk.awsSdkStrings.DOUBLE
    - typings.awsSdk.awsSdkStrings.BOOLEAN
    - java.lang.String
  */
  type PropertyDataType = typings.awsSdk.iotsitewiseMod._PropertyDataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type PropertyNotificationState = typings.awsSdk.iotsitewiseMod._PropertyNotificationState | java.lang.String
  type PropertyNotificationTopic = java.lang.String
  type PropertyUnit = java.lang.String
  type PropertyValueBooleanValue = scala.Boolean
  type PropertyValueDoubleValue = scala.Double
  type PropertyValueIntegerValue = scala.Double
  type PropertyValueStringValue = java.lang.String
  type PutAssetPropertyValueEntries = js.Array[typings.awsSdk.iotsitewiseMod.PutAssetPropertyValueEntry]
  type Qualities = js.Array[typings.awsSdk.iotsitewiseMod.Quality]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GOOD
    - typings.awsSdk.awsSdkStrings.BAD
    - typings.awsSdk.awsSdkStrings.UNCERTAIN
    - java.lang.String
  */
  type Quality = typings.awsSdk.iotsitewiseMod._Quality | java.lang.String
  type Resolution = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PORTAL
    - typings.awsSdk.awsSdkStrings.PROJECT
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.iotsitewiseMod._ResourceType | java.lang.String
  type SSOApplicationId = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.iotsitewiseMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotsitewiseMod.TagValue]
  type TagValue = java.lang.String
  type TimeInSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASCENDING
    - typings.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type TimeOrdering = typings.awsSdk.iotsitewiseMod._TimeOrdering | java.lang.String
  type Timestamp = typings.std.Date
  type Timestamps = js.Array[typings.awsSdk.iotsitewiseMod.TimeInNanos]
  type Url = java.lang.String
  type VariableName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-12-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.iotsitewiseMod._apiVersion | java.lang.String
}
