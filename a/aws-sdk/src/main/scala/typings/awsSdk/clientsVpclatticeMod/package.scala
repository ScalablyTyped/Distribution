package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessLogDestinationArn = java.lang.String

type AccessLogSubscriptionArn = java.lang.String

type AccessLogSubscriptionId = java.lang.String

type AccessLogSubscriptionIdentifier = java.lang.String

type AccessLogSubscriptionList = js.Array[AccessLogSubscriptionSummary]

type AccountId = java.lang.String

type Arn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type AuthPolicyState = _AuthPolicyState | java.lang.String

type AuthPolicyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.AWS_IAM
  - java.lang.String
*/
type AuthType = _AuthType | java.lang.String

type Boolean = scala.Boolean

type CertificateArn = java.lang.String

type ClientToken = java.lang.String

type CreateServiceNetworkVpcAssociationRequestSecurityGroupIdsList = js.Array[SecurityGroupId]

type DeregisterTargetsRequestTargetsList = js.Array[Target]

type FailureCode = java.lang.String

type FailureMessage = java.lang.String

type HeaderMatchContains = java.lang.String

type HeaderMatchExact = java.lang.String

type HeaderMatchList = js.Array[HeaderMatch]

type HeaderMatchName = java.lang.String

type HeaderMatchPrefix = java.lang.String

type HealthCheckIntervalSeconds = Double

type HealthCheckPath = java.lang.String

type HealthCheckPort = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP1
  - typings.awsSdk.awsSdkStrings.HTTP2
  - java.lang.String
*/
type HealthCheckProtocolVersion = _HealthCheckProtocolVersion | java.lang.String

type HealthCheckTimeoutSeconds = Double

type HealthyThresholdCount = Double

type HttpCodeMatcher = java.lang.String

type HttpMethod = java.lang.String

type HttpStatusCode = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IPV4
  - typings.awsSdk.awsSdkStrings.IPV6
  - java.lang.String
*/
type IpAddressType = _IpAddressType | java.lang.String

type ListTargetsRequestTargetsList = js.Array[Target]

type ListenerArn = java.lang.String

type ListenerId = java.lang.String

type ListenerIdentifier = java.lang.String

type ListenerName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP
  - typings.awsSdk.awsSdkStrings.HTTPS
  - java.lang.String
*/
type ListenerProtocol = _ListenerProtocol | java.lang.String

type ListenerSummaryList = js.Array[ListenerSummary]

type Long = Double

type MaxResults = Double

type NextToken = java.lang.String

type PathMatchExact = java.lang.String

type PathMatchPrefix = java.lang.String

type PolicyString = java.lang.String

type Port = Double

type RegisterTargetsRequestTargetsList = js.Array[Target]

type ResourceArn = java.lang.String

type ResourceId = java.lang.String

type ResourceIdentifier = java.lang.String

type RuleArn = java.lang.String

type RuleId = java.lang.String

type RuleIdentifier = java.lang.String

type RuleName = java.lang.String

type RulePriority = Double

type RuleSummaryList = js.Array[RuleSummary]

type RuleUpdateFailureList = js.Array[RuleUpdateFailure]

type RuleUpdateList = js.Array[RuleUpdate]

type RuleUpdateSuccessList = js.Array[RuleUpdateSuccess]

type SecurityGroupId = java.lang.String

type SecurityGroupList = js.Array[SecurityGroupId]

type ServiceArn = java.lang.String

type ServiceArnList = js.Array[ServiceArn]

type ServiceCustomDomainName = java.lang.String

type ServiceId = java.lang.String

type ServiceIdentifier = java.lang.String

type ServiceList = js.Array[ServiceSummary]

type ServiceName = java.lang.String

type ServiceNetworkArn = java.lang.String

type ServiceNetworkId = java.lang.String

type ServiceNetworkIdentifier = java.lang.String

type ServiceNetworkList = js.Array[ServiceNetworkSummary]

type ServiceNetworkName = java.lang.String

type ServiceNetworkServiceAssociationArn = java.lang.String

type ServiceNetworkServiceAssociationIdentifier = java.lang.String

type ServiceNetworkServiceAssociationList = js.Array[ServiceNetworkServiceAssociationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type ServiceNetworkServiceAssociationStatus = _ServiceNetworkServiceAssociationStatus | java.lang.String

type ServiceNetworkVpcAssociationArn = java.lang.String

type ServiceNetworkVpcAssociationId = java.lang.String

type ServiceNetworkVpcAssociationIdentifier = java.lang.String

type ServiceNetworkVpcAssociationList = js.Array[ServiceNetworkVpcAssociationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type ServiceNetworkVpcAssociationStatus = _ServiceNetworkVpcAssociationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type ServiceStatus = _ServiceStatus | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TargetFailureList = js.Array[TargetFailure]

type TargetGroupArn = java.lang.String

type TargetGroupId = java.lang.String

type TargetGroupIdentifier = java.lang.String

type TargetGroupList = js.Array[TargetGroupSummary]

type TargetGroupName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP
  - typings.awsSdk.awsSdkStrings.HTTPS
  - java.lang.String
*/
type TargetGroupProtocol = _TargetGroupProtocol | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP1
  - typings.awsSdk.awsSdkStrings.HTTP2
  - typings.awsSdk.awsSdkStrings.GRPC
  - java.lang.String
*/
type TargetGroupProtocolVersion = _TargetGroupProtocolVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type TargetGroupStatus = _TargetGroupStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IP
  - typings.awsSdk.awsSdkStrings.LAMBDA
  - typings.awsSdk.awsSdkStrings.INSTANCE
  - typings.awsSdk.awsSdkStrings.ALB
  - java.lang.String
*/
type TargetGroupType = _TargetGroupType | java.lang.String

type TargetGroupWeight = Double

type TargetIdString = java.lang.String

type TargetList = js.Array[Target]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DRAINING
  - typings.awsSdk.awsSdkStrings.UNAVAILABLE
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - typings.awsSdk.awsSdkStrings.INITIAL
  - typings.awsSdk.awsSdkStrings.UNUSED
  - java.lang.String
*/
type TargetStatus = _TargetStatus | java.lang.String

type TargetSummaryList = js.Array[TargetSummary]

type Timestamp = js.Date

type UnhealthyThresholdCount = Double

type UpdateServiceNetworkVpcAssociationRequestSecurityGroupIdsList = js.Array[SecurityGroupId]

type VpcId = java.lang.String

type WeightedTargetGroupList = js.Array[WeightedTargetGroup]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2022-11-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
