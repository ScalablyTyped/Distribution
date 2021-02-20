package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object route53Mod {
  
  type AWSAccountID = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MAX_HEALTH_CHECKS_BY_OWNER
    - typings.awsSdk.awsSdkStrings.MAX_HOSTED_ZONES_BY_OWNER
    - typings.awsSdk.awsSdkStrings.MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER
    - typings.awsSdk.awsSdkStrings.MAX_REUSABLE_DELEGATION_SETS_BY_OWNER
    - typings.awsSdk.awsSdkStrings.MAX_TRAFFIC_POLICIES_BY_OWNER
    - java.lang.String
  */
  type AccountLimitType = typings.awsSdk.route53Mod._AccountLimitType | java.lang.String
  
  type AlarmName = java.lang.String
  
  type AliasHealthEnabled = scala.Boolean
  
  type AssociateVPCComment = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE
    - typings.awsSdk.awsSdkStrings.DELETE
    - typings.awsSdk.awsSdkStrings.UPSERT
    - java.lang.String
  */
  type ChangeAction = typings.awsSdk.route53Mod._ChangeAction | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.INSYNC
    - java.lang.String
  */
  type ChangeStatus = typings.awsSdk.route53Mod._ChangeStatus | java.lang.String
  
  type Changes = js.Array[typings.awsSdk.route53Mod.Change]
  
  type CheckerIpRanges = js.Array[typings.awsSdk.route53Mod.IPAddressCidr]
  
  type ChildHealthCheckList = js.Array[typings.awsSdk.route53Mod.HealthCheckId]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.route53Mod.ClientApiVersions
  
  type CloudWatchLogsLogGroupArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`us-east-1`
    - typings.awsSdk.awsSdkStrings.`us-east-2`
    - typings.awsSdk.awsSdkStrings.`us-west-1`
    - typings.awsSdk.awsSdkStrings.`us-west-2`
    - typings.awsSdk.awsSdkStrings.`ca-central-1`
    - typings.awsSdk.awsSdkStrings.`eu-central-1`
    - typings.awsSdk.awsSdkStrings.`eu-west-1`
    - typings.awsSdk.awsSdkStrings.`eu-west-2`
    - typings.awsSdk.awsSdkStrings.`eu-west-3`
    - typings.awsSdk.awsSdkStrings.`ap-east-1`
    - typings.awsSdk.awsSdkStrings.`me-south-1`
    - typings.awsSdk.awsSdkStrings.`ap-south-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typings.awsSdk.awsSdkStrings.`eu-north-1`
    - typings.awsSdk.awsSdkStrings.`sa-east-1`
    - typings.awsSdk.awsSdkStrings.`cn-northwest-1`
    - typings.awsSdk.awsSdkStrings.`cn-north-1`
    - typings.awsSdk.awsSdkStrings.`af-south-1`
    - typings.awsSdk.awsSdkStrings.`eu-south-1`
    - typings.awsSdk.awsSdkStrings.`us-gov-west-1`
    - typings.awsSdk.awsSdkStrings.`us-gov-east-1`
    - typings.awsSdk.awsSdkStrings.`us-iso-east-1`
    - typings.awsSdk.awsSdkStrings.`us-isob-east-1`
    - java.lang.String
  */
  type CloudWatchRegion = typings.awsSdk.route53Mod._CloudWatchRegion | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typings.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typings.awsSdk.awsSdkStrings.LessThanThreshold
    - typings.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperator = typings.awsSdk.route53Mod._ComparisonOperator | java.lang.String
  
  type DNSName = java.lang.String
  
  type DNSRCode = java.lang.String
  
  type DelegationSetNameServers = js.Array[typings.awsSdk.route53Mod.DNSName]
  
  type DelegationSets = js.Array[typings.awsSdk.route53Mod.DelegationSet]
  
  type DimensionField = java.lang.String
  
  type DimensionList = js.Array[typings.awsSdk.route53Mod.Dimension]
  
  type Disabled = scala.Boolean
  
  type DisassociateVPCComment = java.lang.String
  
  type EnableSNI = scala.Boolean
  
  type EvaluationPeriods = scala.Double
  
  type FailureThreshold = scala.Double
  
  type FullyQualifiedDomainName = java.lang.String
  
  type GeoLocationContinentCode = java.lang.String
  
  type GeoLocationContinentName = java.lang.String
  
  type GeoLocationCountryCode = java.lang.String
  
  type GeoLocationCountryName = java.lang.String
  
  type GeoLocationDetailsList = js.Array[typings.awsSdk.route53Mod.GeoLocationDetails]
  
  type GeoLocationSubdivisionCode = java.lang.String
  
  type GeoLocationSubdivisionName = java.lang.String
  
  type HealthCheckCount = scala.Double
  
  type HealthCheckId = java.lang.String
  
  type HealthCheckNonce = java.lang.String
  
  type HealthCheckObservations = js.Array[typings.awsSdk.route53Mod.HealthCheckObservation]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`us-east-1`
    - typings.awsSdk.awsSdkStrings.`us-west-1`
    - typings.awsSdk.awsSdkStrings.`us-west-2`
    - typings.awsSdk.awsSdkStrings.`eu-west-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typings.awsSdk.awsSdkStrings.`sa-east-1`
    - java.lang.String
  */
  type HealthCheckRegion = typings.awsSdk.route53Mod._HealthCheckRegion | java.lang.String
  
  type HealthCheckRegionList = js.Array[typings.awsSdk.route53Mod.HealthCheckRegion]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HTTP
    - typings.awsSdk.awsSdkStrings.HTTPS
    - typings.awsSdk.awsSdkStrings.HTTP_STR_MATCH
    - typings.awsSdk.awsSdkStrings.HTTPS_STR_MATCH
    - typings.awsSdk.awsSdkStrings.TCP
    - typings.awsSdk.awsSdkStrings.CALCULATED
    - typings.awsSdk.awsSdkStrings.CLOUDWATCH_METRIC
    - java.lang.String
  */
  type HealthCheckType = typings.awsSdk.route53Mod._HealthCheckType | java.lang.String
  
  type HealthCheckVersion = scala.Double
  
  type HealthChecks = js.Array[typings.awsSdk.route53Mod.HealthCheck]
  
  type HealthThreshold = scala.Double
  
  type HostedZoneCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MAX_RRSETS_BY_ZONE
    - typings.awsSdk.awsSdkStrings.MAX_VPCS_ASSOCIATED_BY_ZONE
    - java.lang.String
  */
  type HostedZoneLimitType = typings.awsSdk.route53Mod._HostedZoneLimitType | java.lang.String
  
  type HostedZoneOwningService = java.lang.String
  
  type HostedZoneRRSetCount = scala.Double
  
  type HostedZoneSummaries = js.Array[typings.awsSdk.route53Mod.HostedZoneSummary]
  
  type HostedZones = js.Array[typings.awsSdk.route53Mod.HostedZone]
  
  type IPAddress = java.lang.String
  
  type IPAddressCidr = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Healthy_
    - typings.awsSdk.awsSdkStrings.Unhealthy_
    - typings.awsSdk.awsSdkStrings.LastKnownStatus
    - java.lang.String
  */
  type InsufficientDataHealthStatus = typings.awsSdk.route53Mod._InsufficientDataHealthStatus | java.lang.String
  
  type Inverted = scala.Boolean
  
  type IsPrivateZone = scala.Boolean
  
  type LimitValue = scala.Double
  
  type MaxResults = java.lang.String
  
  type MeasureLatency = scala.Boolean
  
  type Message = java.lang.String
  
  type MetricName = java.lang.String
  
  type Nameserver = java.lang.String
  
  type Namespace = java.lang.String
  
  type Nonce = java.lang.String
  
  type PageMarker = java.lang.String
  
  type PageMaxItems = java.lang.String
  
  type PageTruncated = scala.Boolean
  
  type PaginationToken = java.lang.String
  
  type Period = scala.Double
  
  type Port = scala.Double
  
  type QueryLoggingConfigId = java.lang.String
  
  type QueryLoggingConfigs = js.Array[typings.awsSdk.route53Mod.QueryLoggingConfig]
  
  type RData = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SOA
    - typings.awsSdk.awsSdkStrings.A
    - typings.awsSdk.awsSdkStrings.TXT
    - typings.awsSdk.awsSdkStrings.NS
    - typings.awsSdk.awsSdkStrings.CNAME
    - typings.awsSdk.awsSdkStrings.MX
    - typings.awsSdk.awsSdkStrings.NAPTR
    - typings.awsSdk.awsSdkStrings.PTR
    - typings.awsSdk.awsSdkStrings.SRV
    - typings.awsSdk.awsSdkStrings.SPF
    - typings.awsSdk.awsSdkStrings.AAAA
    - typings.awsSdk.awsSdkStrings.CAA
    - java.lang.String
  */
  type RRType = typings.awsSdk.route53Mod._RRType | java.lang.String
  
  type RecordData = js.Array[typings.awsSdk.route53Mod.RecordDataEntry]
  
  type RecordDataEntry = java.lang.String
  
  type RequestInterval = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FullyQualifiedDomainName
    - typings.awsSdk.awsSdkStrings.Regions
    - typings.awsSdk.awsSdkStrings.ResourcePath
    - typings.awsSdk.awsSdkStrings.ChildHealthChecks
    - java.lang.String
  */
  type ResettableElementName = typings.awsSdk.route53Mod._ResettableElementName | java.lang.String
  
  type ResettableElementNameList = js.Array[typings.awsSdk.route53Mod.ResettableElementName]
  
  type ResourceDescription = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResourcePath = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PRIMARY
    - typings.awsSdk.awsSdkStrings.SECONDARY
    - java.lang.String
  */
  type ResourceRecordSetFailover = typings.awsSdk.route53Mod._ResourceRecordSetFailover | java.lang.String
  
  type ResourceRecordSetIdentifier = java.lang.String
  
  type ResourceRecordSetMultiValueAnswer = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`us-east-1`
    - typings.awsSdk.awsSdkStrings.`us-east-2`
    - typings.awsSdk.awsSdkStrings.`us-west-1`
    - typings.awsSdk.awsSdkStrings.`us-west-2`
    - typings.awsSdk.awsSdkStrings.`ca-central-1`
    - typings.awsSdk.awsSdkStrings.`eu-west-1`
    - typings.awsSdk.awsSdkStrings.`eu-west-2`
    - typings.awsSdk.awsSdkStrings.`eu-west-3`
    - typings.awsSdk.awsSdkStrings.`eu-central-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typings.awsSdk.awsSdkStrings.`eu-north-1`
    - typings.awsSdk.awsSdkStrings.`sa-east-1`
    - typings.awsSdk.awsSdkStrings.`cn-north-1`
    - typings.awsSdk.awsSdkStrings.`cn-northwest-1`
    - typings.awsSdk.awsSdkStrings.`ap-east-1`
    - typings.awsSdk.awsSdkStrings.`me-south-1`
    - typings.awsSdk.awsSdkStrings.`ap-south-1`
    - typings.awsSdk.awsSdkStrings.`af-south-1`
    - typings.awsSdk.awsSdkStrings.`eu-south-1`
    - java.lang.String
  */
  type ResourceRecordSetRegion = typings.awsSdk.route53Mod._ResourceRecordSetRegion | java.lang.String
  
  type ResourceRecordSetWeight = scala.Double
  
  type ResourceRecordSets = js.Array[typings.awsSdk.route53Mod.ResourceRecordSet]
  
  type ResourceRecords = js.Array[typings.awsSdk.route53Mod.ResourceRecord]
  
  type ResourceTagSetList = js.Array[typings.awsSdk.route53Mod.ResourceTagSet]
  
  type ResourceURI = java.lang.String
  
  type ReusableDelegationSetLimitType = typings.awsSdk.awsSdkStrings.MAX_ZONES_BY_REUSABLE_DELEGATION_SET | java.lang.String
  
  type SearchString = java.lang.String
  
  type ServicePrincipal = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Average_
    - typings.awsSdk.awsSdkStrings.Sum_
    - typings.awsSdk.awsSdkStrings.SampleCount
    - typings.awsSdk.awsSdkStrings.Maximum_
    - typings.awsSdk.awsSdkStrings.Minimum_
    - java.lang.String
  */
  type Statistic = typings.awsSdk.route53Mod._Statistic | java.lang.String
  
  type Status = java.lang.String
  
  type SubnetMask = java.lang.String
  
  type TTL = scala.Double
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.route53Mod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.route53Mod.Tag]
  
  type TagResourceId = java.lang.String
  
  type TagResourceIdList = js.Array[typings.awsSdk.route53Mod.TagResourceId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.healthcheck
    - typings.awsSdk.awsSdkStrings.hostedzone
    - java.lang.String
  */
  type TagResourceType = typings.awsSdk.route53Mod._TagResourceType | java.lang.String
  
  type TagValue = java.lang.String
  
  type Threshold = scala.Double
  
  type TimeStamp = typings.std.Date
  
  type TrafficPolicies = js.Array[typings.awsSdk.route53Mod.TrafficPolicy]
  
  type TrafficPolicyComment = java.lang.String
  
  type TrafficPolicyDocument = java.lang.String
  
  type TrafficPolicyId = java.lang.String
  
  type TrafficPolicyInstanceCount = scala.Double
  
  type TrafficPolicyInstanceId = java.lang.String
  
  type TrafficPolicyInstanceState = java.lang.String
  
  type TrafficPolicyInstances = js.Array[typings.awsSdk.route53Mod.TrafficPolicyInstance]
  
  type TrafficPolicyName = java.lang.String
  
  type TrafficPolicySummaries = js.Array[typings.awsSdk.route53Mod.TrafficPolicySummary]
  
  type TrafficPolicyVersion = scala.Double
  
  type TrafficPolicyVersionMarker = java.lang.String
  
  type TransportProtocol = java.lang.String
  
  type UsageCount = scala.Double
  
  type VPCId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`us-east-1`
    - typings.awsSdk.awsSdkStrings.`us-east-2`
    - typings.awsSdk.awsSdkStrings.`us-west-1`
    - typings.awsSdk.awsSdkStrings.`us-west-2`
    - typings.awsSdk.awsSdkStrings.`eu-west-1`
    - typings.awsSdk.awsSdkStrings.`eu-west-2`
    - typings.awsSdk.awsSdkStrings.`eu-west-3`
    - typings.awsSdk.awsSdkStrings.`eu-central-1`
    - typings.awsSdk.awsSdkStrings.`ap-east-1`
    - typings.awsSdk.awsSdkStrings.`me-south-1`
    - typings.awsSdk.awsSdkStrings.`us-gov-west-1`
    - typings.awsSdk.awsSdkStrings.`us-gov-east-1`
    - typings.awsSdk.awsSdkStrings.`us-iso-east-1`
    - typings.awsSdk.awsSdkStrings.`us-isob-east-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typings.awsSdk.awsSdkStrings.`ap-south-1`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typings.awsSdk.awsSdkStrings.`eu-north-1`
    - typings.awsSdk.awsSdkStrings.`sa-east-1`
    - typings.awsSdk.awsSdkStrings.`ca-central-1`
    - typings.awsSdk.awsSdkStrings.`cn-north-1`
    - typings.awsSdk.awsSdkStrings.`af-south-1`
    - typings.awsSdk.awsSdkStrings.`eu-south-1`
    - java.lang.String
  */
  type VPCRegion = typings.awsSdk.route53Mod._VPCRegion | java.lang.String
  
  type VPCs = js.Array[typings.awsSdk.route53Mod.VPC]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2013-04-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.route53Mod._apiVersion | java.lang.String
}
