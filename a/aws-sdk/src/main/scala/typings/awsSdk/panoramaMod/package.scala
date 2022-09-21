package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.OTA
import typings.awsSdk.awsSdkStrings.PACKAGE
import typings.awsSdk.awsSdkStrings.RTSP_CAMERA_STREAM
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlternateSoftwares = js.Array[AlternateSoftwareMetadata]

type ApplicationInstanceArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - java.lang.String
*/
type ApplicationInstanceHealthStatus = _ApplicationInstanceHealthStatus | String

type ApplicationInstanceId = String

type ApplicationInstanceName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_PENDING
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_REQUESTED
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_ERROR
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.REMOVAL_PENDING
  - typings.awsSdk.awsSdkStrings.REMOVAL_REQUESTED
  - typings.awsSdk.awsSdkStrings.REMOVAL_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.REMOVAL_FAILED
  - typings.awsSdk.awsSdkStrings.REMOVAL_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_FAILED
  - java.lang.String
*/
type ApplicationInstanceStatus = _ApplicationInstanceStatus | String

type ApplicationInstanceStatusDescription = String

type ApplicationInstances = js.Array[ApplicationInstance]

type Boolean = scala.Boolean

type Bucket = String

type BucketName = String

type Certificates = Buffer | js.typedarray.Uint8Array | Blob | String

type ClientToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STATIC_IP
  - typings.awsSdk.awsSdkStrings.DHCP
  - java.lang.String
*/
type ConnectionType = _ConnectionType | String

type CreatedTime = js.Date

type CurrentSoftware = String

type DefaultGateway = String

type DefaultRuntimeContextDevice = String

type Description = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.AWAITING_PROVISIONING
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ONLINE
  - typings.awsSdk.awsSdkStrings.OFFLINE
  - typings.awsSdk.awsSdkStrings.LEASE_EXPIRED
  - typings.awsSdk.awsSdkStrings.UPDATE_NEEDED
  - java.lang.String
*/
type DeviceAggregatedStatus = _DeviceAggregatedStatus | String

type DeviceArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_PANORAMA
  - typings.awsSdk.awsSdkStrings.LENOVO
  - java.lang.String
*/
type DeviceBrand = _DeviceBrand | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONLINE
  - typings.awsSdk.awsSdkStrings.OFFLINE
  - typings.awsSdk.awsSdkStrings.AWAITING_CREDENTIALS
  - typings.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type DeviceConnectionStatus = _DeviceConnectionStatus | String

type DeviceId = String

type DeviceIdList = js.Array[DeviceId]

type DeviceJobList = js.Array[DeviceJob]

type DeviceList = js.Array[Device]

type DeviceName = String

type DeviceSerialNumber = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWAITING_PROVISIONING
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type DeviceStatus = _DeviceStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PANORAMA_APPLIANCE_DEVELOPER_KIT
  - typings.awsSdk.awsSdkStrings.PANORAMA_APPLIANCE
  - java.lang.String
*/
type DeviceType = _DeviceType | String

type Dns = String

type DnsList = js.Array[Dns]

type HwAddress = String

type ImageVersion = String

type InputPortList = js.Array[NodeInputPort]

type IotThingName = String

type IpAddress = String

type IpAddressOrServerName = String

type JobId = String

type JobList = js.Array[Job]

type JobResourceType = PACKAGE | String

type JobTagsList = js.Array[JobResourceTags]

type JobType = OTA | String

type LastUpdatedTime = js.Date

type LatestAlternateSoftware = String

type LatestSoftware = String

type LeaseExpirationTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEVICE_ID
  - typings.awsSdk.awsSdkStrings.CREATED_TIME
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.DEVICE_AGGREGATED_STATUS
  - java.lang.String
*/
type ListDevicesSortBy = _ListDevicesSortBy | String

type ManifestOverridesPayloadData = String

type ManifestPayloadData = String

type MarkLatestPatch = scala.Boolean

type Mask = String

type MaxConnections = Double

type MaxSize25 = Double

type NameFilter = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONNECTED
  - typings.awsSdk.awsSdkStrings.NOT_CONNECTED
  - typings.awsSdk.awsSdkStrings.CONNECTING
  - java.lang.String
*/
type NetworkConnectionStatus = _NetworkConnectionStatus | String

type NextToken = String

type NodeAssetName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BUSINESS_LOGIC
  - typings.awsSdk.awsSdkStrings.ML_MODEL
  - typings.awsSdk.awsSdkStrings.MEDIA_SOURCE
  - typings.awsSdk.awsSdkStrings.MEDIA_SINK
  - java.lang.String
*/
type NodeCategory = _NodeCategory | String

type NodeFromTemplateJobList = js.Array[NodeFromTemplateJob]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type NodeFromTemplateJobStatus = _NodeFromTemplateJobStatus | String

type NodeFromTemplateJobStatusMessage = String

type NodeId = String

type NodeInstanceId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - java.lang.String
*/
type NodeInstanceStatus = _NodeInstanceStatus | String

type NodeInstances = js.Array[NodeInstance]

type NodeName = String

type NodePackageArn = String

type NodePackageId = String

type NodePackageName = String

type NodePackagePatchVersion = String

type NodePackageVersion = String

type NodesList = js.Array[Node]

type NtpServerList = js.Array[IpAddressOrServerName]

type NtpServerName = String

type Object = String

type ObjectKey = String

type OutputPortList = js.Array[NodeOutputPort]

type PackageImportJobList = js.Array[PackageImportJob]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PackageImportJobStatus = _PackageImportJobStatus | String

type PackageImportJobStatusMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NODE_PACKAGE_VERSION
  - typings.awsSdk.awsSdkStrings.MARKETPLACE_NODE_PACKAGE_VERSION
  - java.lang.String
*/
type PackageImportJobType = _PackageImportJobType | String

type PackageList = js.Array[PackageListItem]

type PackageObjects = js.Array[PackageObject]

type PackageOwnerAccount = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGISTER_PENDING
  - typings.awsSdk.awsSdkStrings.REGISTER_COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type PackageVersionStatus = _PackageVersionStatus | String

type PackageVersionStatusDescription = String

type PortDefaultValue = String

type PortName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.INT32
  - typings.awsSdk.awsSdkStrings.FLOAT32
  - typings.awsSdk.awsSdkStrings.MEDIA
  - java.lang.String
*/
type PortType = _PortType | String

type PrincipalArn = String

type PrincipalArnsList = js.Array[PrincipalArn]

type Region = String

type ResourceArn = String

type RuntimeRoleArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_ERROR
  - typings.awsSdk.awsSdkStrings.REMOVAL_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.REMOVAL_FAILED
  - typings.awsSdk.awsSdkStrings.PROCESSING_DEPLOYMENT
  - typings.awsSdk.awsSdkStrings.PROCESSING_REMOVAL
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_FAILED
  - java.lang.String
*/
type StatusFilter = _StatusFilter | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TemplateKey = String

type TemplateParametersMap = StringDictionary[TemplateValue]

type TemplateType = RTSP_CAMERA_STREAM | String

type TemplateValue = String

type TimeStamp = js.Date

type Token = String

type UpdateCreatedTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.VERIFYING
  - typings.awsSdk.awsSdkStrings.REBOOTING
  - typings.awsSdk.awsSdkStrings.DOWNLOADING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type UpdateProgress = _UpdateProgress | String

type Version = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-07-24`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
