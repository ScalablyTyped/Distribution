package typings.awsSdk.iotwirelessMod

import typings.awsSdk.awsSdkStrings.GNSS
import typings.awsSdk.awsSdkStrings.LoRaWAN
import typings.awsSdk.awsSdkStrings.Semtech
import typings.awsSdk.awsSdkStrings.Sidewalk
import typings.awsSdk.awsSdkStrings.UPDATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountLinked = Boolean

type AckModeRetryDurationSecs = scala.Double

type AddGwMetadata = Boolean

type AmazonId = String

type AmazonResourceName = String

type AppEui = String

type AppKey = String

type AppSKey = String

type AppServerPrivateKey = String

type AutoCreateTasks = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.normal_
  - typings.awsSdk.awsSdkStrings.low__
  - typings.awsSdk.awsSdkStrings.critical__
  - java.lang.String
*/
type BatteryLevel = _BatteryLevel | String

type BeaconingDataRate = scala.Double

type BeaconingFrequencies = js.Array[BeaconingFrequency]

type BeaconingFrequency = scala.Double

type CertificatePEM = String

type CertificateValue = String

type ChannelMask = String

type ClassBTimeout = scala.Double

type ClassCTimeout = scala.Double

type ClientRequestToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Connected_
  - typings.awsSdk.awsSdkStrings.Disconnected_
  - java.lang.String
*/
type ConnectionStatus = _ConnectionStatus | String

type Crc = scala.Double

type CreatedAt = js.Date

type Description = String

type DestinationArn = String

type DestinationList = js.Array[Destinations]

type DestinationName = String

type DevAddr = String

type DevEui = String

type DevStatusReqFreq = scala.Double

type DeviceCertificateList = js.Array[CertificateList]

type DeviceProfileArn = String

type DeviceProfileId = String

type DeviceProfileList = js.Array[DeviceProfile]

type DeviceProfileName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Provisioned_
  - typings.awsSdk.awsSdkStrings.RegisteredNotSeen
  - typings.awsSdk.awsSdkStrings.RegisteredReachable
  - typings.awsSdk.awsSdkStrings.RegisteredUnreachable
  - java.lang.String
*/
type DeviceState = _DeviceState | String

type DlBucketSize = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ClassB
  - typings.awsSdk.awsSdkStrings.ClassC
  - java.lang.String
*/
type DlClass = _DlClass | String

type DlDr = scala.Double

type DlFreq = scala.Double

type DlRate = scala.Double

type DlRatePolicy = String

type Double = scala.Double

type DownlinkFrequency = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SEQUENTIAL
  - typings.awsSdk.awsSdkStrings.CONCURRENT
  - typings.awsSdk.awsSdkStrings.USING_UPLINK_GATEWAY
  - java.lang.String
*/
type DownlinkMode = _DownlinkMode | String

type DownlinkQueueMessagesList = js.Array[DownlinkQueueMessage]

type DrMax = scala.Double

type DrMaxBox = scala.Double

type DrMin = scala.Double

type DrMinBox = scala.Double

type EndPoint = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.discovered_
  - typings.awsSdk.awsSdkStrings.lost
  - typings.awsSdk.awsSdkStrings.ack_
  - typings.awsSdk.awsSdkStrings.nack
  - typings.awsSdk.awsSdkStrings.passthrough___
  - java.lang.String
*/
type Event = _Event | String

type EventConfigurationsList = js.Array[EventConfigurationItem]

type EventNotificationPartnerType = Sidewalk | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SidewalkAccount
  - typings.awsSdk.awsSdkStrings.WirelessDevice
  - typings.awsSdk.awsSdkStrings.WirelessGateway
  - java.lang.String
*/
type EventNotificationResourceType = _EventNotificationResourceType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type EventNotificationTopicStatus = _EventNotificationTopicStatus | String

type Expression = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RuleName
  - typings.awsSdk.awsSdkStrings.MqttTopic
  - java.lang.String
*/
type ExpressionType = _ExpressionType | String

type FCntStart = scala.Double

type FNwkSIntKey = String

type FPort = scala.Double

type FactoryPresetFreqsList = js.Array[PresetFreq]

type Fingerprint = String

type FirmwareUpdateImage = String

type FirmwareUpdateRole = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Initial_
  - typings.awsSdk.awsSdkStrings.Package_Not_Supported
  - typings.awsSdk.awsSdkStrings.FragAlgo_unsupported
  - typings.awsSdk.awsSdkStrings.Not_enough_memory
  - typings.awsSdk.awsSdkStrings.FragIndex_unsupported
  - typings.awsSdk.awsSdkStrings.Wrong_descriptor
  - typings.awsSdk.awsSdkStrings.SessionCnt_replay
  - typings.awsSdk.awsSdkStrings.MissingFrag
  - typings.awsSdk.awsSdkStrings.MemoryError
  - typings.awsSdk.awsSdkStrings.MICError
  - typings.awsSdk.awsSdkStrings.Successful_
  - java.lang.String
*/
type FuotaDeviceStatus = _FuotaDeviceStatus | String

type FuotaTaskArn = String

type FuotaTaskId = String

type FuotaTaskList = js.Array[FuotaTask]

type FuotaTaskName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.FuotaSession_Waiting
  - typings.awsSdk.awsSdkStrings.In_FuotaSession
  - typings.awsSdk.awsSdkStrings.FuotaDone
  - typings.awsSdk.awsSdkStrings.Delete_Waiting
  - java.lang.String
*/
type FuotaTaskStatus = _FuotaTaskStatus | String

type GatewayEui = String

type GatewayList = js.Array[GatewayListItem]

type GenAppKey = String

type HorizontalAccuracy = scala.Double

type HrAllowed = Boolean

type ISODateTimeString = String

type Identifier = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PartnerAccountId
  - typings.awsSdk.awsSdkStrings.DevEui
  - typings.awsSdk.awsSdkStrings.GatewayEui
  - typings.awsSdk.awsSdkStrings.WirelessDeviceId
  - typings.awsSdk.awsSdkStrings.WirelessGatewayId
  - java.lang.String
*/
type IdentifierType = _IdentifierType | String

type Integer = scala.Double

type IotCertificateId = String

type JoinEui = String

type JoinEuiFilters = js.Array[JoinEuiRange]

type JoinEuiRange = js.Array[JoinEui]

type LoRaWANGatewayMetadataList = js.Array[LoRaWANGatewayMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type LogLevel = _LogLevel | String

type MacVersion = String

type MaxDutyCycle = scala.Double

type MaxEirp = scala.Double

type MaxResults = scala.Double

type McGroupId = scala.Double

type MessageId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_NOTIFY
  - typings.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_GET
  - typings.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_SET
  - typings.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_RESP
  - java.lang.String
*/
type MessageType = _MessageType | String

type MinGwDiversity = scala.Double

type Model = String

type MulticastDeviceStatus = String

type MulticastGroupArn = String

type MulticastGroupId = String

type MulticastGroupList = js.Array[MulticastGroup]

type MulticastGroupListByFuotaTask = js.Array[MulticastGroupByFuotaTask]

type MulticastGroupMessageId = String

type MulticastGroupName = String

type MulticastGroupStatus = String

type NetId = String

type NetIdFilters = js.Array[NetId]

type NetworkAnalyzerConfigurationArn = String

type NetworkAnalyzerConfigurationList = js.Array[NetworkAnalyzerConfigurations]

type NetworkAnalyzerConfigurationName = String

type NextToken = String

type NumberOfDevicesInGroup = scala.Double

type NumberOfDevicesRequested = scala.Double

type NwkGeoLoc = Boolean

type NwkKey = String

type NwkSEncKey = String

type NwkSKey = String

type PackageVersion = String

type PartnerAccountArn = String

type PartnerAccountId = String

type PartnerType = Sidewalk | String

type PayloadData = String

type PingSlotDr = scala.Double

type PingSlotFreq = scala.Double

type PingSlotPeriod = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ROSE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type PositionConfigurationFec = _PositionConfigurationFec | String

type PositionConfigurationList = js.Array[PositionConfigurationItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type PositionConfigurationStatus = _PositionConfigurationStatus | String

type PositionCoordinate = js.Array[PositionCoordinateValue]

type PositionCoordinateValue = scala.Double

type PositionResourceIdentifier = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WirelessDevice
  - typings.awsSdk.awsSdkStrings.WirelessGateway
  - java.lang.String
*/
type PositionResourceType = _PositionResourceType | String

type PositionSolverProvider = Semtech | String

type PositionSolverType = GNSS | String

type PositionSolverVersion = String

type PrAllowed = Boolean

type PresetFreq = scala.Double

type QueryString = String

type RaAllowed = Boolean

type RegParamsRevision = String

type ReportDevStatusBattery = Boolean

type ReportDevStatusMargin = Boolean

type ResourceIdentifier = String

type ResourceType = String

type Result = String

type RfRegion = String

type RoleArn = String

type RxDataRate2 = scala.Double

type RxDelay1 = scala.Double

type RxDrOffset1 = scala.Double

type RxFreq2 = scala.Double

type SNwkSIntKey = String

type Seq = scala.Double

type ServiceProfileArn = String

type ServiceProfileId = String

type ServiceProfileList = js.Array[ServiceProfile]

type ServiceProfileName = String

type SessionStartTimeTimestamp = js.Date

type SessionTimeout = scala.Double

type SidewalkAccountList = js.Array[SidewalkAccountInfoWithFingerprint]

type SidewalkId = String

type SidewalkManufacturingSn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Ed25519
  - typings.awsSdk.awsSdkStrings.P256r1
  - java.lang.String
*/
type SigningAlg = _SigningAlg | String

type StartTime = js.Date

type Station = String

type SubBand = scala.Double

type SubBands = js.Array[SubBand]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EU868
  - typings.awsSdk.awsSdkStrings.US915
  - typings.awsSdk.awsSdkStrings.AU915
  - typings.awsSdk.awsSdkStrings.`AS923-1`
  - java.lang.String
*/
type SupportedRfRegion = _SupportedRfRegion | String

type Supports32BitFCnt = Boolean

type SupportsClassB = Boolean

type SupportsClassC = Boolean

type SupportsJoin = Boolean

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TargetPer = scala.Double

type ThingArn = String

type ThingName = String

type TransmissionInterval = scala.Double

type TransmitMode = scala.Double

type UlBucketSize = scala.Double

type UlRate = scala.Double

type UlRatePolicy = String

type UpdateDataSource = String

type UpdateSignature = String

type VerticalAccuracy = scala.Double

type WirelessDeviceArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Join
  - typings.awsSdk.awsSdkStrings.Rejoin
  - typings.awsSdk.awsSdkStrings.Uplink_Data
  - typings.awsSdk.awsSdkStrings.Downlink_Data
  - typings.awsSdk.awsSdkStrings.Registration
  - java.lang.String
*/
type WirelessDeviceEvent = _WirelessDeviceEvent | String

type WirelessDeviceEventLogOptionList = js.Array[WirelessDeviceEventLogOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type WirelessDeviceFrameInfo = _WirelessDeviceFrameInfo | String

type WirelessDeviceId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WirelessDeviceId
  - typings.awsSdk.awsSdkStrings.DevEui
  - typings.awsSdk.awsSdkStrings.ThingName
  - typings.awsSdk.awsSdkStrings.SidewalkManufacturingSn
  - java.lang.String
*/
type WirelessDeviceIdType = _WirelessDeviceIdType | String

type WirelessDeviceList = js.Array[WirelessDeviceId]

type WirelessDeviceLogOptionList = js.Array[WirelessDeviceLogOption]

type WirelessDeviceName = String

type WirelessDeviceStatisticsList = js.Array[WirelessDeviceStatistics]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Sidewalk
  - typings.awsSdk.awsSdkStrings.LoRaWAN
  - java.lang.String
*/
type WirelessDeviceType = _WirelessDeviceType | String

type WirelessGatewayArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUPS_Request
  - typings.awsSdk.awsSdkStrings.Certificate_
  - java.lang.String
*/
type WirelessGatewayEvent = _WirelessGatewayEvent | String

type WirelessGatewayEventLogOptionList = js.Array[WirelessGatewayEventLogOption]

type WirelessGatewayId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GatewayEui
  - typings.awsSdk.awsSdkStrings.WirelessGatewayId
  - typings.awsSdk.awsSdkStrings.ThingName
  - java.lang.String
*/
type WirelessGatewayIdType = _WirelessGatewayIdType | String

type WirelessGatewayList = js.Array[WirelessGatewayId]

type WirelessGatewayLogOptionList = js.Array[WirelessGatewayLogOption]

type WirelessGatewayName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUPS
  - typings.awsSdk.awsSdkStrings.LNS
  - java.lang.String
*/
type WirelessGatewayServiceType = _WirelessGatewayServiceType | String

type WirelessGatewayStatisticsList = js.Array[WirelessGatewayStatistics]

type WirelessGatewayTaskDefinitionArn = String

type WirelessGatewayTaskDefinitionId = String

type WirelessGatewayTaskDefinitionList = js.Array[UpdateWirelessGatewayTaskEntry]

type WirelessGatewayTaskDefinitionType = UPDATE | String

type WirelessGatewayTaskName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FIRST_RETRY
  - typings.awsSdk.awsSdkStrings.SECOND_RETRY
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type WirelessGatewayTaskStatus = _WirelessGatewayTaskStatus | String

type WirelessGatewayType = LoRaWAN | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-11-22`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
