package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object efsMod {
  type AccessPointArn = java.lang.String
  type AccessPointDescriptions = js.Array[typings.awsSdk.efsMod.AccessPointDescription]
  type AccessPointId = java.lang.String
  type AvailabilityZoneId = java.lang.String
  type AvailabilityZoneName = java.lang.String
  type AwsAccountId = java.lang.String
  type BypassPolicyLockoutSafetyCheck = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.efsMod.ClientApiVersions
  type ClientToken = java.lang.String
  type CreationToken = java.lang.String
  type Encrypted = scala.Boolean
  type FileSystemDescriptions = js.Array[typings.awsSdk.efsMod.FileSystemDescription]
  type FileSystemId = java.lang.String
  type FileSystemNullableSizeValue = scala.Double
  type FileSystemSizeValue = scala.Double
  type Gid = scala.Double
  type IpAddress = java.lang.String
  type KmsKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.creating__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.updating__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type LifeCycleState = typings.awsSdk.efsMod._LifeCycleState | java.lang.String
  type LifecyclePolicies = js.Array[typings.awsSdk.efsMod.LifecyclePolicy]
  type Marker = java.lang.String
  type MaxItems = scala.Double
  type MaxResults = scala.Double
  type MountTargetCount = scala.Double
  type MountTargetDescriptions = js.Array[typings.awsSdk.efsMod.MountTargetDescription]
  type MountTargetId = java.lang.String
  type Name = java.lang.String
  type NetworkInterfaceId = java.lang.String
  type OwnerGid = scala.Double
  type OwnerUid = scala.Double
  type Path = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.generalPurpose
    - typings.awsSdk.awsSdkStrings.maxIO
    - java.lang.String
  */
  type PerformanceMode = typings.awsSdk.efsMod._PerformanceMode | java.lang.String
  type Permissions = java.lang.String
  type Policy = java.lang.String
  type ProvisionedThroughputInMibps = scala.Double
  type ResourceId = java.lang.String
  type SecondaryGids = js.Array[typings.awsSdk.efsMod.Gid]
  type SecurityGroup = java.lang.String
  type SecurityGroups = js.Array[typings.awsSdk.efsMod.SecurityGroup]
  type SubnetId = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typings.awsSdk.efsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typings.awsSdk.efsMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.bursting
    - typings.awsSdk.awsSdkStrings.provisioned_
    - java.lang.String
  */
  type ThroughputMode = typings.awsSdk.efsMod._ThroughputMode | java.lang.String
  type Timestamp = typings.std.Date
  type Token = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AFTER_7_DAYS
    - typings.awsSdk.awsSdkStrings.AFTER_14_DAYS
    - typings.awsSdk.awsSdkStrings.AFTER_30_DAYS
    - typings.awsSdk.awsSdkStrings.AFTER_60_DAYS
    - typings.awsSdk.awsSdkStrings.AFTER_90_DAYS
    - java.lang.String
  */
  type TransitionToIARules = typings.awsSdk.efsMod._TransitionToIARules | java.lang.String
  type Uid = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-02-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.efsMod._apiVersion | java.lang.String
}
