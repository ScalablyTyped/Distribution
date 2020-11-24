package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudhsmMod {
  
  type AZ = java.lang.String
  
  type AZList = js.Array[typings.awsSdk.cloudhsmMod.AZ]
  
  type Certificate = java.lang.String
  
  type CertificateFingerprint = java.lang.String
  
  type ClientArn = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cloudhsmMod.ClientApiVersions
  
  type ClientLabel = java.lang.String
  
  type ClientList = js.Array[typings.awsSdk.cloudhsmMod.ClientArn]
  
  type ClientToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`5Dot1`
    - typings.awsSdk.awsSdkStrings.`5Dot3`
    - java.lang.String
  */
  type ClientVersion = typings.awsSdk.cloudhsmMod._ClientVersion | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type CloudHsmObjectState = typings.awsSdk.cloudhsmMod._CloudHsmObjectState | java.lang.String
  
  type EniId = java.lang.String
  
  type ExternalId = java.lang.String
  
  type HapgArn = java.lang.String
  
  type HapgList = js.Array[typings.awsSdk.cloudhsmMod.HapgArn]
  
  type HsmArn = java.lang.String
  
  type HsmList = js.Array[typings.awsSdk.cloudhsmMod.HsmArn]
  
  type HsmSerialNumber = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.SUSPENDED
    - typings.awsSdk.awsSdkStrings.TERMINATING
    - typings.awsSdk.awsSdkStrings.TERMINATED
    - typings.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type HsmStatus = typings.awsSdk.cloudhsmMod._HsmStatus | java.lang.String
  
  type IamRoleArn = java.lang.String
  
  type IpAddress = java.lang.String
  
  type Label = java.lang.String
  
  type PaginationToken = java.lang.String
  
  type PartitionArn = java.lang.String
  
  type PartitionList = js.Array[typings.awsSdk.cloudhsmMod.PartitionArn]
  
  type PartitionSerial = java.lang.String
  
  type PartitionSerialList = js.Array[typings.awsSdk.cloudhsmMod.PartitionSerial]
  
  type SshKey = java.lang.String
  
  type String = java.lang.String
  
  type SubnetId = java.lang.String
  
  type SubscriptionType = typings.awsSdk.awsSdkStrings.PRODUCTION | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.cloudhsmMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.cloudhsmMod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = java.lang.String
  
  type VpcId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-05-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cloudhsmMod._apiVersion | java.lang.String
}
