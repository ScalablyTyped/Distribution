package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BulkDeploymentResults = js.Array[BulkDeploymentResult]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Initializing_
  - typings.awsSdk.awsSdkStrings.Running_
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Stopping_
  - typings.awsSdk.awsSdkStrings.Stopped_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type BulkDeploymentStatus = _BulkDeploymentStatus | String

type BulkDeployments = js.Array[BulkDeployment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InSync_
  - typings.awsSdk.awsSdkStrings.OutOfSync
  - java.lang.String
*/
type ConfigurationSyncStatus = _ConfigurationSyncStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NewDeployment
  - typings.awsSdk.awsSdkStrings.Redeployment
  - typings.awsSdk.awsSdkStrings.ResetDeployment
  - typings.awsSdk.awsSdkStrings.ForceResetDeployment
  - java.lang.String
*/
type DeploymentType = _DeploymentType | String

type Deployments = js.Array[Deployment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.binary__
  - typings.awsSdk.awsSdkStrings.json__
  - java.lang.String
*/
type EncodingType = _EncodingType | String

type ErrorDetails = js.Array[ErrorDetail]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GreengrassContainer
  - typings.awsSdk.awsSdkStrings.NoContainer
  - java.lang.String
*/
type FunctionIsolationMode = _FunctionIsolationMode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GreengrassSystem
  - typings.awsSdk.awsSdkStrings.Lambda_
  - java.lang.String
*/
type LoggerComponent = _LoggerComponent | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEBUG
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.WARN
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.FATAL
  - java.lang.String
*/
type LoggerLevel = _LoggerLevel | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FileSystem
  - typings.awsSdk.awsSdkStrings.AWSCloudWatch
  - java.lang.String
*/
type LoggerType = _LoggerType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ro_
  - typings.awsSdk.awsSdkStrings.rw_
  - java.lang.String
*/
type Permission = _Permission | String

type S3UrlSignerRole = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.core__
  - typings.awsSdk.awsSdkStrings.ota_agent
  - java.lang.String
*/
type SoftwareToUpdate = _SoftwareToUpdate | String

type Tags = StringDictionary[string]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.On_
  - typings.awsSdk.awsSdkStrings.Off_
  - java.lang.String
*/
type Telemetry = _Telemetry | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.TRACE
  - typings.awsSdk.awsSdkStrings.DEBUG
  - typings.awsSdk.awsSdkStrings.VERBOSE
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.WARN
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.FATAL
  - java.lang.String
*/
type UpdateAgentLogLevel = _UpdateAgentLogLevel | String

type UpdateTargets = js.Array[string]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.armv6l
  - typings.awsSdk.awsSdkStrings.armv7l
  - typings.awsSdk.awsSdkStrings.x86_64_
  - typings.awsSdk.awsSdkStrings.aarch64
  - java.lang.String
*/
type UpdateTargetsArchitecture = _UpdateTargetsArchitecture | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ubuntu_
  - typings.awsSdk.awsSdkStrings.raspbian_
  - typings.awsSdk.awsSdkStrings.amazon_linux_
  - typings.awsSdk.awsSdkStrings.openwrt
  - java.lang.String
*/
type UpdateTargetsOperatingSystem = _UpdateTargetsOperatingSystem | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-06-07`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type integer = Double

type listOfConnectivityInfo = js.Array[ConnectivityInfo]

type listOfConnector = js.Array[Connector]

type listOfCore = js.Array[Core]

type listOfDefinitionInformation = js.Array[DefinitionInformation]

type listOfDevice = js.Array[Device]

type listOfFunction = js.Array[Function]

type listOfGroupCertificateAuthorityProperties = js.Array[GroupCertificateAuthorityProperties]

type listOfGroupInformation = js.Array[GroupInformation]

type listOfLogger = js.Array[Logger]

type listOfResource = js.Array[Resource]

type listOfResourceAccessPolicy = js.Array[ResourceAccessPolicy]

type listOfString = js.Array[string]

type listOfSubscription = js.Array[Subscription]

type listOfVersionInformation = js.Array[VersionInformation]

type mapOfString = StringDictionary[string]

type string = String
