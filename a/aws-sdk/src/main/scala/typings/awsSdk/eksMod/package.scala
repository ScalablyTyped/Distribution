package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object eksMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AL2_x86_64
    - typings.awsSdk.awsSdkStrings.AL2_x86_64_GPU
    - typings.awsSdk.awsSdkStrings.AL2_ARM_64
    - java.lang.String
  */
  type AMITypes = typings.awsSdk.eksMod._AMITypes | java.lang.String
  
  type AutoScalingGroupList = js.Array[typings.awsSdk.eksMod.AutoScalingGroup]
  
  type Boolean = scala.Boolean
  
  type BoxedBoolean = scala.Boolean
  
  type BoxedInteger = scala.Double
  
  type Capacity = scala.Double
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.eksMod.ClientApiVersions
  
  type ClusterName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type ClusterStatus = typings.awsSdk.eksMod._ClusterStatus | java.lang.String
  
  type EncryptionConfigList = js.Array[typings.awsSdk.eksMod.EncryptionConfig]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SubnetNotFound
    - typings.awsSdk.awsSdkStrings.SecurityGroupNotFound
    - typings.awsSdk.awsSdkStrings.EniLimitReached
    - typings.awsSdk.awsSdkStrings.IpNotAvailable
    - typings.awsSdk.awsSdkStrings.AccessDenied
    - typings.awsSdk.awsSdkStrings.OperationNotPermitted
    - typings.awsSdk.awsSdkStrings.VpcIdNotFound
    - typings.awsSdk.awsSdkStrings.Unknown_
    - typings.awsSdk.awsSdkStrings.NodeCreationFailure
    - typings.awsSdk.awsSdkStrings.PodEvictionFailure
    - typings.awsSdk.awsSdkStrings.InsufficientFreeAddresses
    - typings.awsSdk.awsSdkStrings.ClusterUnreachable
    - java.lang.String
  */
  type ErrorCode = typings.awsSdk.eksMod._ErrorCode | java.lang.String
  
  type ErrorDetails = js.Array[typings.awsSdk.eksMod.ErrorDetail]
  
  type FargateProfileLabel = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.eksMod.String]
  
  type FargateProfileSelectors = js.Array[typings.awsSdk.eksMod.FargateProfileSelector]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type FargateProfileStatus = typings.awsSdk.eksMod._FargateProfileStatus | java.lang.String
  
  type FargateProfilesRequestMaxResults = scala.Double
  
  type IssueList = js.Array[typings.awsSdk.eksMod.Issue]
  
  type ListClustersRequestMaxResults = scala.Double
  
  type ListNodegroupsRequestMaxResults = scala.Double
  
  type ListUpdatesRequestMaxResults = scala.Double
  
  type LogSetups = js.Array[typings.awsSdk.eksMod.LogSetup]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.api_
    - typings.awsSdk.awsSdkStrings.audit_
    - typings.awsSdk.awsSdkStrings.authenticator
    - typings.awsSdk.awsSdkStrings.controllerManager
    - typings.awsSdk.awsSdkStrings.scheduler
    - java.lang.String
  */
  type LogType = typings.awsSdk.eksMod._LogType | java.lang.String
  
  type LogTypes = js.Array[typings.awsSdk.eksMod.LogType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AutoScalingGroupNotFound
    - typings.awsSdk.awsSdkStrings.AutoScalingGroupInvalidConfiguration
    - typings.awsSdk.awsSdkStrings.Ec2SecurityGroupNotFound
    - typings.awsSdk.awsSdkStrings.Ec2SecurityGroupDeletionFailure
    - typings.awsSdk.awsSdkStrings.Ec2LaunchTemplateNotFound
    - typings.awsSdk.awsSdkStrings.Ec2LaunchTemplateVersionMismatch
    - typings.awsSdk.awsSdkStrings.Ec2SubnetNotFound
    - typings.awsSdk.awsSdkStrings.Ec2SubnetInvalidConfiguration
    - typings.awsSdk.awsSdkStrings.IamInstanceProfileNotFound
    - typings.awsSdk.awsSdkStrings.IamLimitExceeded
    - typings.awsSdk.awsSdkStrings.IamNodeRoleNotFound
    - typings.awsSdk.awsSdkStrings.NodeCreationFailure
    - typings.awsSdk.awsSdkStrings.AsgInstanceLaunchFailures
    - typings.awsSdk.awsSdkStrings.InstanceLimitExceeded
    - typings.awsSdk.awsSdkStrings.InsufficientFreeAddresses
    - typings.awsSdk.awsSdkStrings.AccessDenied
    - typings.awsSdk.awsSdkStrings.InternalFailure
    - typings.awsSdk.awsSdkStrings.ClusterUnreachable
    - java.lang.String
  */
  type NodegroupIssueCode = typings.awsSdk.eksMod._NodegroupIssueCode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - typings.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type NodegroupStatus = typings.awsSdk.eksMod._NodegroupStatus | java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typings.awsSdk.eksMod.String]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.eksMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.eksMod.TagValue]
  
  type TagValue = java.lang.String
  
  type Timestamp = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Version_
    - typings.awsSdk.awsSdkStrings.PlatformVersion
    - typings.awsSdk.awsSdkStrings.EndpointPrivateAccess
    - typings.awsSdk.awsSdkStrings.EndpointPublicAccess
    - typings.awsSdk.awsSdkStrings.ClusterLogging
    - typings.awsSdk.awsSdkStrings.DesiredSize
    - typings.awsSdk.awsSdkStrings.LabelsToAdd
    - typings.awsSdk.awsSdkStrings.LabelsToRemove
    - typings.awsSdk.awsSdkStrings.MaxSize
    - typings.awsSdk.awsSdkStrings.MinSize
    - typings.awsSdk.awsSdkStrings.ReleaseVersion
    - typings.awsSdk.awsSdkStrings.PublicAccessCidrs
    - java.lang.String
  */
  type UpdateParamType = typings.awsSdk.eksMod._UpdateParamType | java.lang.String
  
  type UpdateParams = js.Array[typings.awsSdk.eksMod.UpdateParam]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.Successful_
    - java.lang.String
  */
  type UpdateStatus = typings.awsSdk.eksMod._UpdateStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VersionUpdate
    - typings.awsSdk.awsSdkStrings.EndpointAccessUpdate
    - typings.awsSdk.awsSdkStrings.LoggingUpdate
    - typings.awsSdk.awsSdkStrings.ConfigUpdate
    - java.lang.String
  */
  type UpdateType = typings.awsSdk.eksMod._UpdateType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-11-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.eksMod._apiVersion | java.lang.String
  
  type labelKey = java.lang.String
  
  type labelValue = java.lang.String
  
  type labelsKeyList = js.Array[typings.awsSdk.eksMod.String]
  
  type labelsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.eksMod.labelValue]
}
