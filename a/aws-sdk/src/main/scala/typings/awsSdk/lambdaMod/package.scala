package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ALL
import typings.awsSdk.awsSdkStrings.KAFKA_BOOTSTRAP_SERVERS
import typings.awsSdk.awsSdkStrings.ReportBatchItemFailures
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Action = java.lang.String

type AdditionalVersion = java.lang.String

type AdditionalVersionWeights = StringDictionary[Weight]

type Alias = java.lang.String

type AliasList = js.Array[AliasConfiguration]

type AllowCredentials = scala.Boolean

type AllowMethodsList = js.Array[Method]

type AllowOriginsList = js.Array[Origin]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.x86_64_
  - typings.awsSdk.awsSdkStrings.arm64_
  - java.lang.String
*/
type Architecture = _Architecture | java.lang.String

type ArchitecturesList = js.Array[Architecture]

type Arn = java.lang.String

type BatchSize = Double

type BisectBatchOnFunctionError = scala.Boolean

type BlobStream = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type Boolean = scala.Boolean

type CodeSigningConfigArn = java.lang.String

type CodeSigningConfigId = java.lang.String

type CodeSigningConfigList = js.Array[CodeSigningConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Warn_
  - typings.awsSdk.awsSdkStrings.Enforce_
  - java.lang.String
*/
type CodeSigningPolicy = _CodeSigningPolicy | java.lang.String

type CompatibleArchitectures = js.Array[Architecture]

type CompatibleRuntimes = js.Array[Runtime]

type Date = js.Date

type Description = java.lang.String

type DestinationArn = java.lang.String

type Enabled = scala.Boolean

type EndPointType = KAFKA_BOOTSTRAP_SERVERS | java.lang.String

type Endpoint = java.lang.String

type EndpointLists = js.Array[Endpoint]

type Endpoints = StringDictionary[EndpointLists]

type EnvironmentVariableName = java.lang.String

type EnvironmentVariableValue = java.lang.String

type EnvironmentVariables = StringDictionary[EnvironmentVariableValue]

type EphemeralStorageSize = Double

type EventSourceMappingsList = js.Array[EventSourceMappingConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typings.awsSdk.awsSdkStrings.LATEST
  - typings.awsSdk.awsSdkStrings.AT_TIMESTAMP
  - java.lang.String
*/
type EventSourcePosition = _EventSourcePosition | java.lang.String

type EventSourceToken = java.lang.String

type FileSystemArn = java.lang.String

type FileSystemConfigList = js.Array[FileSystemConfig]

type FilterList = js.Array[Filter]

type FunctionArn = java.lang.String

type FunctionArnList = js.Array[FunctionArn]

type FunctionEventInvokeConfigList = js.Array[FunctionEventInvokeConfig]

type FunctionList = js.Array[FunctionConfiguration]

type FunctionName = java.lang.String

type FunctionResponseType = ReportBatchItemFailures | java.lang.String

type FunctionResponseTypeList = js.Array[FunctionResponseType]

type FunctionUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.AWS_IAM
  - java.lang.String
*/
type FunctionUrlAuthType = _FunctionUrlAuthType | java.lang.String

type FunctionUrlConfigList = js.Array[FunctionUrlConfig]

type FunctionUrlQualifier = java.lang.String

type FunctionVersion = ALL | java.lang.String

type Handler = java.lang.String

type Header = java.lang.String

type HeadersList = js.Array[Header]

type HttpStatus = Double

type Integer = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Event_
  - typings.awsSdk.awsSdkStrings.RequestResponse
  - typings.awsSdk.awsSdkStrings.DryRun
  - java.lang.String
*/
type InvocationType = _InvocationType | java.lang.String

type KMSKeyArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Successful_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - java.lang.String
*/
type LastUpdateStatus = _LastUpdateStatus | java.lang.String

type LastUpdateStatusReason = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EniLimitExceeded_
  - typings.awsSdk.awsSdkStrings.InsufficientRolePermissions
  - typings.awsSdk.awsSdkStrings.InvalidConfiguration
  - typings.awsSdk.awsSdkStrings.InternalError
  - typings.awsSdk.awsSdkStrings.SubnetOutOfIPAddresses
  - typings.awsSdk.awsSdkStrings.InvalidSubnet
  - typings.awsSdk.awsSdkStrings.InvalidSecurityGroup
  - typings.awsSdk.awsSdkStrings.ImageDeleted
  - typings.awsSdk.awsSdkStrings.ImageAccessDenied
  - typings.awsSdk.awsSdkStrings.InvalidImage
  - java.lang.String
*/
type LastUpdateStatusReasonCode = _LastUpdateStatusReasonCode | java.lang.String

type LayerArn = java.lang.String

type LayerList = js.Array[LayerVersionArn]

type LayerName = java.lang.String

type LayerPermissionAllowedAction = java.lang.String

type LayerPermissionAllowedPrincipal = java.lang.String

type LayerVersionArn = java.lang.String

type LayerVersionNumber = Double

type LayerVersionsList = js.Array[LayerVersionsListItem]

type LayersList = js.Array[LayersListItem]

type LayersReferenceList = js.Array[Layer]

type LicenseInfo = java.lang.String

type LocalMountPath = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.None_
  - typings.awsSdk.awsSdkStrings.Tail
  - java.lang.String
*/
type LogType = _LogType | java.lang.String

type Long = Double

type MasterRegion = java.lang.String

type MaxAge = Double

type MaxFunctionEventInvokeConfigListItems = Double

type MaxItems = Double

type MaxLayerListItems = Double

type MaxListItems = Double

type MaxProvisionedConcurrencyConfigListItems = Double

type MaximumBatchingWindowInSeconds = Double

type MaximumEventAgeInSeconds = Double

type MaximumRecordAgeInSeconds = Double

type MaximumRetryAttempts = Double

type MaximumRetryAttemptsEventSourceMapping = Double

type MemorySize = Double

type Method = java.lang.String

type NameSpacedFunctionArn = java.lang.String

type NamespacedFunctionName = java.lang.String

type NamespacedStatementId = java.lang.String

type NonNegativeInteger = Double

type OrganizationId = java.lang.String

type Origin = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Zip_
  - typings.awsSdk.awsSdkStrings.Image
  - java.lang.String
*/
type PackageType = _PackageType | java.lang.String

type ParallelizationFactor = Double

type Pattern = java.lang.String

type PositiveInteger = Double

type Principal = java.lang.String

type PrincipalOrgID = java.lang.String

type ProvisionedConcurrencyConfigList = js.Array[ProvisionedConcurrencyConfigListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ProvisionedConcurrencyStatusEnum = _ProvisionedConcurrencyStatusEnum | java.lang.String

type Qualifier = java.lang.String

type Queue = java.lang.String

type Queues = js.Array[Queue]

type ReservedConcurrentExecutions = Double

type ResourceArn = java.lang.String

type RoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.nodejs
  - typings.awsSdk.awsSdkStrings.nodejs4Dot3
  - typings.awsSdk.awsSdkStrings.nodejs6Dot10
  - typings.awsSdk.awsSdkStrings.nodejs8Dot10
  - typings.awsSdk.awsSdkStrings.nodejs10Dotx
  - typings.awsSdk.awsSdkStrings.nodejs12Dotx
  - typings.awsSdk.awsSdkStrings.nodejs14Dotx
  - typings.awsSdk.awsSdkStrings.nodejs16Dotx
  - typings.awsSdk.awsSdkStrings.java8
  - typings.awsSdk.awsSdkStrings.java8Dotal2
  - typings.awsSdk.awsSdkStrings.java11
  - typings.awsSdk.awsSdkStrings.python2Dot7
  - typings.awsSdk.awsSdkStrings.python3Dot6
  - typings.awsSdk.awsSdkStrings.python3Dot7
  - typings.awsSdk.awsSdkStrings.python3Dot8
  - typings.awsSdk.awsSdkStrings.python3Dot9
  - typings.awsSdk.awsSdkStrings.dotnetcore1Dot0
  - typings.awsSdk.awsSdkStrings.dotnetcore2Dot0
  - typings.awsSdk.awsSdkStrings.dotnetcore2Dot1
  - typings.awsSdk.awsSdkStrings.dotnetcore3Dot1
  - typings.awsSdk.awsSdkStrings.dotnet6
  - typings.awsSdk.awsSdkStrings.`nodejs4Dot3-edge`
  - typings.awsSdk.awsSdkStrings.go1Dotx
  - typings.awsSdk.awsSdkStrings.ruby2Dot5
  - typings.awsSdk.awsSdkStrings.ruby2Dot7
  - typings.awsSdk.awsSdkStrings.provided
  - typings.awsSdk.awsSdkStrings.providedDotal2
  - java.lang.String
*/
type Runtime = _Runtime | java.lang.String

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type S3ObjectVersion = java.lang.String

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[SecurityGroupId]

type SensitiveString = java.lang.String

type SigningProfileVersionArns = js.Array[Arn]

type SourceAccessConfigurations = js.Array[SourceAccessConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BASIC_AUTH
  - typings.awsSdk.awsSdkStrings.VPC_SUBNET
  - typings.awsSdk.awsSdkStrings.VPC_SECURITY_GROUP
  - typings.awsSdk.awsSdkStrings.SASL_SCRAM_512_AUTH
  - typings.awsSdk.awsSdkStrings.SASL_SCRAM_256_AUTH
  - typings.awsSdk.awsSdkStrings.VIRTUAL_HOST
  - typings.awsSdk.awsSdkStrings.CLIENT_CERTIFICATE_TLS_AUTH
  - typings.awsSdk.awsSdkStrings.SERVER_ROOT_CA_CERTIFICATE
  - java.lang.String
*/
type SourceAccessType = _SourceAccessType | java.lang.String

type SourceOwner = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type State = _State | java.lang.String

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
  - typings.awsSdk.awsSdkStrings.InvalidSubnet
  - typings.awsSdk.awsSdkStrings.InvalidSecurityGroup
  - typings.awsSdk.awsSdkStrings.ImageDeleted
  - typings.awsSdk.awsSdkStrings.ImageAccessDenied
  - typings.awsSdk.awsSdkStrings.InvalidImage
  - java.lang.String
*/
type StateReasonCode = _StateReasonCode | java.lang.String

type StatementId = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type SubnetId = java.lang.String

type SubnetIds = js.Array[SubnetId]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = StringDictionary[TagValue]

type Timeout = Double

type Timestamp = java.lang.String

type Topic = java.lang.String

type Topics = js.Array[Topic]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.PassThrough_
  - java.lang.String
*/
type TracingMode = _TracingMode | java.lang.String

type TumblingWindowInSeconds = Double

type URI = java.lang.String

type UnreservedConcurrentExecutions = Double

type Version = java.lang.String

type VpcId = java.lang.String

type Weight = Double

type WorkingDirectory = java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2014-11-11`
  - typings.awsSdk.awsSdkStrings.`2015-03-31`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
