package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object greengrassMod {
  
  type BulkDeploymentResults = js.Array[typings.awsSdk.greengrassMod.BulkDeploymentResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Initializing_
    - typings.awsSdk.awsSdkStrings.Running_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type BulkDeploymentStatus = typings.awsSdk.greengrassMod._BulkDeploymentStatus | java.lang.String
  
  type BulkDeployments = js.Array[typings.awsSdk.greengrassMod.BulkDeployment]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.greengrassMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InSync_
    - typings.awsSdk.awsSdkStrings.OutOfSync
    - java.lang.String
  */
  type ConfigurationSyncStatus = typings.awsSdk.greengrassMod._ConfigurationSyncStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NewDeployment
    - typings.awsSdk.awsSdkStrings.Redeployment
    - typings.awsSdk.awsSdkStrings.ResetDeployment
    - typings.awsSdk.awsSdkStrings.ForceResetDeployment
    - java.lang.String
  */
  type DeploymentType = typings.awsSdk.greengrassMod._DeploymentType | java.lang.String
  
  type Deployments = js.Array[typings.awsSdk.greengrassMod.Deployment]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.binary__
    - typings.awsSdk.awsSdkStrings.json_
    - java.lang.String
  */
  type EncodingType = typings.awsSdk.greengrassMod._EncodingType | java.lang.String
  
  type ErrorDetails = js.Array[typings.awsSdk.greengrassMod.ErrorDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GreengrassContainer
    - typings.awsSdk.awsSdkStrings.NoContainer
    - java.lang.String
  */
  type FunctionIsolationMode = typings.awsSdk.greengrassMod._FunctionIsolationMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GreengrassSystem
    - typings.awsSdk.awsSdkStrings.Lambda_
    - java.lang.String
  */
  type LoggerComponent = typings.awsSdk.greengrassMod._LoggerComponent | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEBUG
    - typings.awsSdk.awsSdkStrings.INFO
    - typings.awsSdk.awsSdkStrings.WARN
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.FATAL
    - java.lang.String
  */
  type LoggerLevel = typings.awsSdk.greengrassMod._LoggerLevel | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FileSystem
    - typings.awsSdk.awsSdkStrings.AWSCloudWatch
    - java.lang.String
  */
  type LoggerType = typings.awsSdk.greengrassMod._LoggerType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ro_
    - typings.awsSdk.awsSdkStrings.rw_
    - java.lang.String
  */
  type Permission = typings.awsSdk.greengrassMod._Permission | java.lang.String
  
  type S3UrlSignerRole = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.core__
    - typings.awsSdk.awsSdkStrings.ota_agent
    - java.lang.String
  */
  type SoftwareToUpdate = typings.awsSdk.greengrassMod._SoftwareToUpdate | java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.greengrassMod.string]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.On_
    - typings.awsSdk.awsSdkStrings.Off_
    - java.lang.String
  */
  type Telemetry = typings.awsSdk.greengrassMod._Telemetry | java.lang.String
  
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
  type UpdateAgentLogLevel = typings.awsSdk.greengrassMod._UpdateAgentLogLevel | java.lang.String
  
  type UpdateTargets = js.Array[typings.awsSdk.greengrassMod.string]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.armv6l
    - typings.awsSdk.awsSdkStrings.armv7l
    - typings.awsSdk.awsSdkStrings.x86_64_
    - typings.awsSdk.awsSdkStrings.aarch64
    - java.lang.String
  */
  type UpdateTargetsArchitecture = typings.awsSdk.greengrassMod._UpdateTargetsArchitecture | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ubuntu_
    - typings.awsSdk.awsSdkStrings.raspbian
    - typings.awsSdk.awsSdkStrings.amazon_linux_
    - typings.awsSdk.awsSdkStrings.openwrt
    - java.lang.String
  */
  type UpdateTargetsOperatingSystem = typings.awsSdk.greengrassMod._UpdateTargetsOperatingSystem | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-06-07`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.greengrassMod._apiVersion | java.lang.String
  
  type boolean = scala.Boolean
  
  type integer = scala.Double
  
  type listOfConnectivityInfo = js.Array[typings.awsSdk.greengrassMod.ConnectivityInfo]
  
  type listOfConnector = js.Array[typings.awsSdk.greengrassMod.Connector]
  
  type listOfCore = js.Array[typings.awsSdk.greengrassMod.Core]
  
  type listOfDefinitionInformation = js.Array[typings.awsSdk.greengrassMod.DefinitionInformation]
  
  type listOfDevice = js.Array[typings.awsSdk.greengrassMod.Device]
  
  type listOfFunction = js.Array[typings.awsSdk.greengrassMod.Function]
  
  type listOfGroupCertificateAuthorityProperties = js.Array[typings.awsSdk.greengrassMod.GroupCertificateAuthorityProperties]
  
  type listOfGroupInformation = js.Array[typings.awsSdk.greengrassMod.GroupInformation]
  
  type listOfLogger = js.Array[typings.awsSdk.greengrassMod.Logger]
  
  type listOfResource = js.Array[typings.awsSdk.greengrassMod.Resource]
  
  type listOfResourceAccessPolicy = js.Array[typings.awsSdk.greengrassMod.ResourceAccessPolicy]
  
  type listOfString = js.Array[typings.awsSdk.greengrassMod.string]
  
  type listOfSubscription = js.Array[typings.awsSdk.greengrassMod.Subscription]
  
  type listOfVersionInformation = js.Array[typings.awsSdk.greengrassMod.VersionInformation]
  
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.greengrassMod.string]
  
  type string = java.lang.String
}
