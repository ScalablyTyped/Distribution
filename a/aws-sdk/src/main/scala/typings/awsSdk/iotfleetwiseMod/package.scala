package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.WAITING_FOR_APPROVAL
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.SUSPENDED
  - java.lang.String
*/
type CampaignStatus = _CampaignStatus | java.lang.String

type CanInterfaceName = java.lang.String

type CanSignalName = java.lang.String

type CloudWatchLogGroupName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.SNAPPY
  - java.lang.String
*/
type Compression = _Compression | java.lang.String

type DataExtraDimensionNodePathList = js.Array[NodePath]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.SEND_ACTIVE_DTCS
  - java.lang.String
*/
type DiagnosticsMode = _DiagnosticsMode | java.lang.String

type Fqns = js.Array[FullyQualifiedName]

type FullyQualifiedName = java.lang.String

type IAMRoleArn = java.lang.String

type InterfaceId = java.lang.String

type InterfaceIds = js.Array[InterfaceId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type LogType = _LogType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DRAFT
  - java.lang.String
*/
type ManifestStatus = _ManifestStatus | java.lang.String

type ModelSignalsMap = StringDictionary[java.lang.String]

type NetworkFileBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type NetworkFileDefinitions = js.Array[NetworkFileDefinition]

type NetworkFilesList = js.Array[NetworkFileBlob]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CAN_INTERFACE
  - typings.awsSdk.awsSdkStrings.OBD_INTERFACE
  - java.lang.String
*/
type NetworkInterfaceType = _NetworkInterfaceType | java.lang.String

type NetworkInterfaces = js.Array[NetworkInterface]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INT8
  - typings.awsSdk.awsSdkStrings.UINT8
  - typings.awsSdk.awsSdkStrings.INT16
  - typings.awsSdk.awsSdkStrings.UINT16
  - typings.awsSdk.awsSdkStrings.INT32
  - typings.awsSdk.awsSdkStrings.UINT32
  - typings.awsSdk.awsSdkStrings.INT64
  - typings.awsSdk.awsSdkStrings.UINT64
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.FLOAT
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.UNIX_TIMESTAMP
  - typings.awsSdk.awsSdkStrings.INT8_ARRAY
  - typings.awsSdk.awsSdkStrings.UINT8_ARRAY
  - typings.awsSdk.awsSdkStrings.INT16_ARRAY
  - typings.awsSdk.awsSdkStrings.UINT16_ARRAY
  - typings.awsSdk.awsSdkStrings.INT32_ARRAY
  - typings.awsSdk.awsSdkStrings.UINT32_ARRAY
  - typings.awsSdk.awsSdkStrings.INT64_ARRAY
  - typings.awsSdk.awsSdkStrings.UINT64_ARRAY
  - typings.awsSdk.awsSdkStrings.BOOLEAN_ARRAY
  - typings.awsSdk.awsSdkStrings.FLOAT_ARRAY
  - typings.awsSdk.awsSdkStrings.DOUBLE_ARRAY
  - typings.awsSdk.awsSdkStrings.STRING_ARRAY
  - typings.awsSdk.awsSdkStrings.UNIX_TIMESTAMP_ARRAY
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type NodeDataType = _NodeDataType | java.lang.String

type NodePath = java.lang.String

type NodePaths = js.Array[NodePath]

type Nodes = js.Array[Node]

type ObdBitmaskLength = Double

type ObdByteLength = Double

type ObdInterfaceName = java.lang.String

type ObdStandard = java.lang.String

type ProtocolName = java.lang.String

type ProtocolVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGISTRATION_PENDING
  - typings.awsSdk.awsSdkStrings.REGISTRATION_SUCCESS
  - typings.awsSdk.awsSdkStrings.REGISTRATION_FAILURE
  - java.lang.String
*/
type RegistrationStatus = _RegistrationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CAN_SIGNAL
  - typings.awsSdk.awsSdkStrings.OBD_SIGNAL
  - java.lang.String
*/
type SignalDecoderType = _SignalDecoderType | java.lang.String

type SignalDecoders = js.Array[SignalDecoder]

type SignalInformationList = js.Array[SignalInformation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.TO_DISK
  - java.lang.String
*/
type SpoolingMode = _SpoolingMode | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TimestreamDatabaseName = java.lang.String

type TimestreamTableName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS
  - typings.awsSdk.awsSdkStrings.RISING_EDGE
  - java.lang.String
*/
type TriggerMode = _TriggerMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.APPROVE
  - typings.awsSdk.awsSdkStrings.SUSPEND
  - typings.awsSdk.awsSdkStrings.RESUME
  - typings.awsSdk.awsSdkStrings.UPDATE
  - java.lang.String
*/
type UpdateCampaignAction = _UpdateCampaignAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Overwrite_
  - typings.awsSdk.awsSdkStrings.Merge_
  - java.lang.String
*/
type UpdateMode = _UpdateMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CreateIotThing
  - typings.awsSdk.awsSdkStrings.ValidateIotThingExists
  - java.lang.String
*/
type VehicleAssociationBehavior = _VehicleAssociationBehavior | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.SUSPENDED
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type VehicleState = _VehicleState | java.lang.String

type VehicleStatusList = js.Array[VehicleStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-06-17`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type arn = java.lang.String

type attributeName = java.lang.String

type attributeValue = java.lang.String

type attributesMap = StringDictionary[attributeValue]

type campaignName = java.lang.String

type campaignSummaries = js.Array[CampaignSummary]

type collectionPeriodMs = Double

type createVehicleErrors = js.Array[CreateVehicleError]

type createVehicleRequestItems = js.Array[CreateVehicleRequestItem]

type createVehicleResponses = js.Array[CreateVehicleResponseItem]

type customerAccountId = java.lang.String

type decoderManifestSummaries = js.Array[DecoderManifestSummary]

type description = java.lang.String

type double = Double

type errorMessage = java.lang.String

type eventExpression = java.lang.String

type fleetId = java.lang.String

type fleetSummaries = js.Array[FleetSummary]

type fleets = js.Array[fleetId]

type languageVersion = Double

type listOfStrings = js.Array[java.lang.String]

type listVehiclesMaxResults = Double

type maxResults = Double

type maxSampleCount = Double

type modelManifestSummaries = js.Array[ModelManifestSummary]

type nextToken = java.lang.String

type nonNegativeInteger = Double

type positiveInteger = Double

type priority = Double

type resourceName = java.lang.String

type signalCatalogSummaries = js.Array[SignalCatalogSummary]

type status = java.lang.String

type timestamp = js.Date

type uint32 = Double

type updateVehicleErrors = js.Array[UpdateVehicleError]

type updateVehicleRequestItems = js.Array[UpdateVehicleRequestItem]

type updateVehicleResponseItems = js.Array[UpdateVehicleResponseItem]

type vehicleName = java.lang.String

type vehicleSummaries = js.Array[VehicleSummary]

type vehicles = js.Array[vehicleName]

type wildcardSignalName = java.lang.String
