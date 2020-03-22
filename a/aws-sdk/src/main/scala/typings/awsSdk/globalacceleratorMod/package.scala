package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globalacceleratorMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEPLOYED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - java.lang.String
  */
  type AcceleratorStatus = typings.awsSdk.globalacceleratorMod._AcceleratorStatus | java.lang.String
  type Accelerators = js.Array[typings.awsSdk.globalacceleratorMod.Accelerator]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING_PROVISIONING
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.PENDING_ADVERTISING
    - typings.awsSdk.awsSdkStrings.ADVERTISING
    - typings.awsSdk.awsSdkStrings.PENDING_WITHDRAWING
    - typings.awsSdk.awsSdkStrings.PENDING_DEPROVISIONING
    - typings.awsSdk.awsSdkStrings.DEPROVISIONED
    - typings.awsSdk.awsSdkStrings.FAILED_PROVISION
    - typings.awsSdk.awsSdkStrings.FAILED_ADVERTISING
    - typings.awsSdk.awsSdkStrings.FAILED_WITHDRAW
    - typings.awsSdk.awsSdkStrings.FAILED_DEPROVISION
    - java.lang.String
  */
  type ByoipCidrState = typings.awsSdk.globalacceleratorMod._ByoipCidrState | java.lang.String
  type ByoipCidrs = js.Array[typings.awsSdk.globalacceleratorMod.ByoipCidr]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.SOURCE_IP
    - java.lang.String
  */
  type ClientAffinity = typings.awsSdk.globalacceleratorMod._ClientAffinity | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.globalacceleratorMod.ClientApiVersions
  type EndpointConfigurations = js.Array[typings.awsSdk.globalacceleratorMod.EndpointConfiguration]
  type EndpointDescriptions = js.Array[typings.awsSdk.globalacceleratorMod.EndpointDescription]
  type EndpointGroups = js.Array[typings.awsSdk.globalacceleratorMod.EndpointGroup]
  type EndpointWeight = scala.Double
  type GenericBoolean = scala.Boolean
  type GenericString = java.lang.String
  type HealthCheckIntervalSeconds = scala.Double
  type HealthCheckPort = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TCP
    - typings.awsSdk.awsSdkStrings.HTTP
    - typings.awsSdk.awsSdkStrings.HTTPS
    - java.lang.String
  */
  type HealthCheckProtocol = typings.awsSdk.globalacceleratorMod._HealthCheckProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INITIAL
    - typings.awsSdk.awsSdkStrings.HEALTHY
    - typings.awsSdk.awsSdkStrings.UNHEALTHY
    - java.lang.String
  */
  type HealthState = typings.awsSdk.globalacceleratorMod._HealthState | java.lang.String
  type IdempotencyToken = java.lang.String
  type IpAddress = java.lang.String
  type IpAddressType = typings.awsSdk.awsSdkStrings.IPV4 | java.lang.String
  type IpAddresses = js.Array[typings.awsSdk.globalacceleratorMod.IpAddress]
  type IpSets = js.Array[typings.awsSdk.globalacceleratorMod.IpSet]
  type Listeners = js.Array[typings.awsSdk.globalacceleratorMod.Listener]
  type MaxResults = scala.Double
  type PortNumber = scala.Double
  type PortRanges = js.Array[typings.awsSdk.globalacceleratorMod.PortRange]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TCP
    - typings.awsSdk.awsSdkStrings.UDP
    - java.lang.String
  */
  type Protocol = typings.awsSdk.globalacceleratorMod._Protocol | java.lang.String
  type ResourceArn = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typings.awsSdk.globalacceleratorMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typings.awsSdk.globalacceleratorMod.Tag]
  type ThresholdCount = scala.Double
  type Timestamp = typings.std.Date
  type TrafficDialPercentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-08-08`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.globalacceleratorMod._apiVersion | java.lang.String
}
