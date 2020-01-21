package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaMod {
  type Action = java.lang.String
  type AdditionalVersion = java.lang.String
  type AdditionalVersionWeights = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.lambdaMod.Weight]
  type Alias = java.lang.String
  type AliasList = js.Array[typings.awsSdk.lambdaMod.AliasConfiguration]
  type Arn = java.lang.String
  type BatchSize = scala.Double
  type BisectBatchOnFunctionError = scala.Boolean
  type BlobStream = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.lambdaMod.Blob | java.lang.String | typings.node.streamMod.Readable
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.lambdaMod.ClientApiVersions
  type CompatibleRuntimes = js.Array[typings.awsSdk.lambdaMod.Runtime]
  type Date = typings.std.Date
  type Description = java.lang.String
  type DestinationArn = java.lang.String
  type Enabled = scala.Boolean
  type EnvironmentVariableName = java.lang.String
  type EnvironmentVariableValue = java.lang.String
  type EnvironmentVariables = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.lambdaMod.EnvironmentVariableValue]
  type EventSourceMappingsList = js.Array[typings.awsSdk.lambdaMod.EventSourceMappingConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typings.awsSdk.awsSdkStrings.LATEST
    - typings.awsSdk.awsSdkStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type EventSourcePosition = typings.awsSdk.lambdaMod._EventSourcePosition | java.lang.String
  type EventSourceToken = java.lang.String
  type FunctionArn = java.lang.String
  type FunctionEventInvokeConfigList = js.Array[typings.awsSdk.lambdaMod.FunctionEventInvokeConfig]
  type FunctionList = js.Array[typings.awsSdk.lambdaMod.FunctionConfiguration]
  type FunctionName = java.lang.String
  type FunctionVersion = typings.awsSdk.awsSdkStrings.ALL | java.lang.String
  type Handler = java.lang.String
  type HttpStatus = scala.Double
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Event_
    - typings.awsSdk.awsSdkStrings.RequestResponse
    - typings.awsSdk.awsSdkStrings.DryRun
    - java.lang.String
  */
  type InvocationType = typings.awsSdk.lambdaMod._InvocationType | java.lang.String
  type KMSKeyArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Successful_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - java.lang.String
  */
  type LastUpdateStatus = typings.awsSdk.lambdaMod._LastUpdateStatus | java.lang.String
  type LastUpdateStatusReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EniLimitExceeded_
    - typings.awsSdk.awsSdkStrings.InsufficientRolePermissions
    - typings.awsSdk.awsSdkStrings.InvalidConfiguration
    - typings.awsSdk.awsSdkStrings.InternalError
    - java.lang.String
  */
  type LastUpdateStatusReasonCode = typings.awsSdk.lambdaMod._LastUpdateStatusReasonCode | java.lang.String
  type LayerArn = java.lang.String
  type LayerList = js.Array[typings.awsSdk.lambdaMod.LayerVersionArn]
  type LayerName = java.lang.String
  type LayerPermissionAllowedAction = java.lang.String
  type LayerPermissionAllowedPrincipal = java.lang.String
  type LayerVersionArn = java.lang.String
  type LayerVersionNumber = scala.Double
  type LayerVersionsList = js.Array[typings.awsSdk.lambdaMod.LayerVersionsListItem]
  type LayersList = js.Array[typings.awsSdk.lambdaMod.LayersListItem]
  type LayersReferenceList = js.Array[typings.awsSdk.lambdaMod.Layer]
  type LicenseInfo = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.None_
    - typings.awsSdk.awsSdkStrings.Tail
    - java.lang.String
  */
  type LogType = typings.awsSdk.lambdaMod._LogType | java.lang.String
  type Long = scala.Double
  type MasterRegion = java.lang.String
  type MaxFunctionEventInvokeConfigListItems = scala.Double
  type MaxLayerListItems = scala.Double
  type MaxListItems = scala.Double
  type MaxProvisionedConcurrencyConfigListItems = scala.Double
  type MaximumBatchingWindowInSeconds = scala.Double
  type MaximumEventAgeInSeconds = scala.Double
  type MaximumRecordAgeInSeconds = scala.Double
  type MaximumRetryAttempts = scala.Double
  type MaximumRetryAttemptsEventSourceMapping = scala.Double
  type MemorySize = scala.Double
  type NameSpacedFunctionArn = java.lang.String
  type NamespacedFunctionName = java.lang.String
  type NamespacedStatementId = java.lang.String
  type NonNegativeInteger = scala.Double
  type OrganizationId = java.lang.String
  type ParallelizationFactor = scala.Double
  type PositiveInteger = scala.Double
  type Principal = java.lang.String
  type ProvisionedConcurrencyConfigList = js.Array[typings.awsSdk.lambdaMod.ProvisionedConcurrencyConfigListItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ProvisionedConcurrencyStatusEnum = typings.awsSdk.lambdaMod._ProvisionedConcurrencyStatusEnum | java.lang.String
  type Qualifier = java.lang.String
  type ReservedConcurrentExecutions = scala.Double
  type ResourceArn = java.lang.String
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.nodejs
    - typings.awsSdk.awsSdkStrings.nodejs4Dot3
    - typings.awsSdk.awsSdkStrings.nodejs6Dot10
    - typings.awsSdk.awsSdkStrings.nodejs8Dot10
    - typings.awsSdk.awsSdkStrings.nodejs10Dotx
    - typings.awsSdk.awsSdkStrings.nodejs12Dotx
    - typings.awsSdk.awsSdkStrings.java8
    - typings.awsSdk.awsSdkStrings.java11
    - typings.awsSdk.awsSdkStrings.python2Dot7
    - typings.awsSdk.awsSdkStrings.python3Dot6
    - typings.awsSdk.awsSdkStrings.python3Dot7
    - typings.awsSdk.awsSdkStrings.python3Dot8
    - typings.awsSdk.awsSdkStrings.dotnetcore1Dot0
    - typings.awsSdk.awsSdkStrings.dotnetcore2Dot0
    - typings.awsSdk.awsSdkStrings.dotnetcore2Dot1
    - typings.awsSdk.awsSdkStrings.`nodejs4Dot3-edge`
    - typings.awsSdk.awsSdkStrings.go1Dotx
    - typings.awsSdk.awsSdkStrings.ruby2Dot5
    - typings.awsSdk.awsSdkStrings.provided
    - java.lang.String
  */
  type Runtime = typings.awsSdk.lambdaMod._Runtime | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typings.awsSdk.lambdaMod.SecurityGroupId]
  type SensitiveString = java.lang.String
  type SourceOwner = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Inactive_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type State = typings.awsSdk.lambdaMod._State | java.lang.String
  type StateReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Idle_
    - typings.awsSdk.awsSdkStrings.Creating_
    - typings.awsSdk.awsSdkStrings.Restoring_
    - typings.awsSdk.awsSdkStrings.EniLimitExceeded_
    - typings.awsSdk.awsSdkStrings.InsufficientRolePermissions
    - typings.awsSdk.awsSdkStrings.InvalidConfiguration
    - typings.awsSdk.awsSdkStrings.InternalError
    - typings.awsSdk.awsSdkStrings.SubnetOutOfIPAddresses
    - java.lang.String
  */
  type StateReasonCode = typings.awsSdk.lambdaMod._StateReasonCode | java.lang.String
  type StatementId = java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typings.awsSdk.lambdaMod.SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.lambdaMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.lambdaMod.TagValue]
  type Timeout = scala.Double
  type Timestamp = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.PassThrough_
    - java.lang.String
  */
  type TracingMode = typings.awsSdk.lambdaMod._TracingMode | java.lang.String
  type UnreservedConcurrentExecutions = scala.Double
  type Version = java.lang.String
  type VpcId = java.lang.String
  type Weight = scala.Double
  type _Blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.lambdaMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-11-11`
    - typings.awsSdk.awsSdkStrings.`2015-03-31`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.lambdaMod._apiVersion | java.lang.String
}
