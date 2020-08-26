package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configserviceMod {
  type ARN = java.lang.String
  type AccountAggregationSourceAccountList = js.Array[typings.awsSdk.configserviceMod.AccountId]
  type AccountAggregationSourceList = js.Array[typings.awsSdk.configserviceMod.AccountAggregationSource]
  type AccountId = java.lang.String
  type AggregateComplianceByConfigRuleList = js.Array[typings.awsSdk.configserviceMod.AggregateComplianceByConfigRule]
  type AggregateComplianceCountList = js.Array[typings.awsSdk.configserviceMod.AggregateComplianceCount]
  type AggregateEvaluationResultList = js.Array[typings.awsSdk.configserviceMod.AggregateEvaluationResult]
  type AggregatedSourceStatusList = js.Array[typings.awsSdk.configserviceMod.AggregatedSourceStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.OUTDATED
    - java.lang.String
  */
  type AggregatedSourceStatusType = typings.awsSdk.configserviceMod._AggregatedSourceStatusType | java.lang.String
  type AggregatedSourceStatusTypeList = js.Array[typings.awsSdk.configserviceMod.AggregatedSourceStatusType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCOUNT
    - typings.awsSdk.awsSdkStrings.ORGANIZATION
    - java.lang.String
  */
  type AggregatedSourceType = typings.awsSdk.configserviceMod._AggregatedSourceType | java.lang.String
  type AggregationAuthorizationList = js.Array[typings.awsSdk.configserviceMod.AggregationAuthorization]
  type AggregatorRegionList = js.Array[typings.awsSdk.configserviceMod.String]
  type AllSupported = scala.Boolean
  type AmazonResourceName = java.lang.String
  type Annotation = java.lang.String
  type AutoRemediationAttemptSeconds = scala.Double
  type AutoRemediationAttempts = scala.Double
  type AvailabilityZone = java.lang.String
  type AwsRegion = java.lang.String
  type BaseConfigurationItems = js.Array[typings.awsSdk.configserviceMod.BaseConfigurationItem]
  type BaseResourceId = java.lang.String
  type Boolean = scala.Boolean
  type ChannelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Reverse
    - typings.awsSdk.awsSdkStrings.Forward_
    - java.lang.String
  */
  type ChronologicalOrder = typings.awsSdk.configserviceMod._ChronologicalOrder | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.configserviceMod.ClientApiVersions
  type ComplianceByConfigRules = js.Array[typings.awsSdk.configserviceMod.ComplianceByConfigRule]
  type ComplianceByResources = js.Array[typings.awsSdk.configserviceMod.ComplianceByResource]
  type ComplianceResourceTypes = js.Array[typings.awsSdk.configserviceMod.StringWithCharLimit256]
  type ComplianceSummariesByResourceType = js.Array[typings.awsSdk.configserviceMod.ComplianceSummaryByResourceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLIANT
    - typings.awsSdk.awsSdkStrings.NON_COMPLIANT
    - typings.awsSdk.awsSdkStrings.NOT_APPLICABLE
    - typings.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type ComplianceType = typings.awsSdk.configserviceMod._ComplianceType | java.lang.String
  type ComplianceTypes = js.Array[typings.awsSdk.configserviceMod.ComplianceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCOUNT_ID
    - typings.awsSdk.awsSdkStrings.AWS_REGION
    - java.lang.String
  */
  type ConfigRuleComplianceSummaryGroupKey = typings.awsSdk.configserviceMod._ConfigRuleComplianceSummaryGroupKey | java.lang.String
  type ConfigRuleEvaluationStatusList = js.Array[typings.awsSdk.configserviceMod.ConfigRuleEvaluationStatus]
  type ConfigRuleName = java.lang.String
  type ConfigRuleNames = js.Array[typings.awsSdk.configserviceMod.ConfigRuleName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETING_RESULTS
    - typings.awsSdk.awsSdkStrings.EVALUATING
    - java.lang.String
  */
  type ConfigRuleState = typings.awsSdk.configserviceMod._ConfigRuleState | java.lang.String
  type ConfigRules = js.Array[typings.awsSdk.configserviceMod.ConfigRule]
  type Configuration = java.lang.String
  type ConfigurationAggregatorArn = java.lang.String
  type ConfigurationAggregatorList = js.Array[typings.awsSdk.configserviceMod.ConfigurationAggregator]
  type ConfigurationAggregatorName = java.lang.String
  type ConfigurationAggregatorNameList = js.Array[typings.awsSdk.configserviceMod.ConfigurationAggregatorName]
  type ConfigurationItemCaptureTime = typings.std.Date
  type ConfigurationItemList = js.Array[typings.awsSdk.configserviceMod.ConfigurationItem]
  type ConfigurationItemMD5Hash = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OK
    - typings.awsSdk.awsSdkStrings.ResourceDiscovered
    - typings.awsSdk.awsSdkStrings.ResourceNotRecorded
    - typings.awsSdk.awsSdkStrings.ResourceDeleted
    - typings.awsSdk.awsSdkStrings.ResourceDeletedNotRecorded
    - java.lang.String
  */
  type ConfigurationItemStatus = typings.awsSdk.configserviceMod._ConfigurationItemStatus | java.lang.String
  type ConfigurationRecorderList = js.Array[typings.awsSdk.configserviceMod.ConfigurationRecorder]
  type ConfigurationRecorderNameList = js.Array[typings.awsSdk.configserviceMod.RecorderName]
  type ConfigurationRecorderStatusList = js.Array[typings.awsSdk.configserviceMod.ConfigurationRecorderStatus]
  type ConfigurationStateId = java.lang.String
  type ConformancePackArn = java.lang.String
  type ConformancePackComplianceResourceIds = js.Array[typings.awsSdk.configserviceMod.StringWithCharLimit256]
  type ConformancePackComplianceSummaryList = js.Array[typings.awsSdk.configserviceMod.ConformancePackComplianceSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLIANT
    - typings.awsSdk.awsSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type ConformancePackComplianceType = typings.awsSdk.configserviceMod._ConformancePackComplianceType | java.lang.String
  type ConformancePackConfigRuleNames = js.Array[typings.awsSdk.configserviceMod.StringWithCharLimit64]
  type ConformancePackDetailList = js.Array[typings.awsSdk.configserviceMod.ConformancePackDetail]
  type ConformancePackId = java.lang.String
  type ConformancePackInputParameters = js.Array[typings.awsSdk.configserviceMod.ConformancePackInputParameter]
  type ConformancePackName = java.lang.String
  type ConformancePackNamesList = js.Array[typings.awsSdk.configserviceMod.ConformancePackName]
  type ConformancePackNamesToSummarizeList = js.Array[typings.awsSdk.configserviceMod.ConformancePackName]
  type ConformancePackRuleComplianceList = js.Array[typings.awsSdk.configserviceMod.ConformancePackRuleCompliance]
  type ConformancePackRuleEvaluationResultsList = js.Array[typings.awsSdk.configserviceMod.ConformancePackEvaluationResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type ConformancePackState = typings.awsSdk.configserviceMod._ConformancePackState | java.lang.String
  type ConformancePackStatusDetailsList = js.Array[typings.awsSdk.configserviceMod.ConformancePackStatusDetail]
  type ConformancePackStatusReason = java.lang.String
  type CosmosPageLimit = scala.Double
  type Date = typings.std.Date
  type DeliveryChannelList = js.Array[typings.awsSdk.configserviceMod.DeliveryChannel]
  type DeliveryChannelNameList = js.Array[typings.awsSdk.configserviceMod.ChannelName]
  type DeliveryChannelStatusList = js.Array[typings.awsSdk.configserviceMod.DeliveryChannelStatus]
  type DeliveryS3Bucket = java.lang.String
  type DeliveryS3KeyPrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.Failure_
    - typings.awsSdk.awsSdkStrings.Not_Applicable_
    - java.lang.String
  */
  type DeliveryStatus = typings.awsSdk.configserviceMod._DeliveryStatus | java.lang.String
  type DescribeConformancePackComplianceLimit = scala.Double
  type DescribePendingAggregationRequestsLimit = scala.Double
  type DiscoveredResourceIdentifierList = js.Array[typings.awsSdk.configserviceMod.AggregateResourceIdentifier]
  type EarlierTime = typings.std.Date
  type EmptiableStringWithCharLimit256 = java.lang.String
  type EvaluationResults = js.Array[typings.awsSdk.configserviceMod.EvaluationResult]
  type Evaluations = js.Array[typings.awsSdk.configserviceMod.Evaluation]
  type EventSource = typings.awsSdk.awsSdkStrings.awsDotconfig | java.lang.String
  type ExcludedAccounts = js.Array[typings.awsSdk.configserviceMod.AccountId]
  type Expression = java.lang.String
  type FailedDeleteRemediationExceptionsBatches = js.Array[typings.awsSdk.configserviceMod.FailedDeleteRemediationExceptionsBatch]
  type FailedRemediationBatches = js.Array[typings.awsSdk.configserviceMod.FailedRemediationBatch]
  type FailedRemediationExceptionBatches = js.Array[typings.awsSdk.configserviceMod.FailedRemediationExceptionBatch]
  type FieldInfoList = js.Array[typings.awsSdk.configserviceMod.FieldInfo]
  type FieldName = java.lang.String
  type GetConformancePackComplianceDetailsLimit = scala.Double
  type GroupByAPILimit = scala.Double
  type GroupedResourceCountList = js.Array[typings.awsSdk.configserviceMod.GroupedResourceCount]
  type IncludeGlobalResourceTypes = scala.Boolean
  type Integer = scala.Double
  type LaterTime = typings.std.Date
  type Limit = scala.Double
  type Long = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.One_Hour_
    - typings.awsSdk.awsSdkStrings.Three_Hours
    - typings.awsSdk.awsSdkStrings.Six_Hours_
    - typings.awsSdk.awsSdkStrings.Twelve_Hours
    - typings.awsSdk.awsSdkStrings.TwentyFour_Hours
    - java.lang.String
  */
  type MaximumExecutionFrequency = typings.awsSdk.configserviceMod._MaximumExecutionFrequency | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type MemberAccountRuleStatus = typings.awsSdk.configserviceMod._MemberAccountRuleStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
    - typings.awsSdk.awsSdkStrings.ConfigurationSnapshotDeliveryCompleted
    - typings.awsSdk.awsSdkStrings.ScheduledNotification
    - typings.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
    - java.lang.String
  */
  type MessageType = typings.awsSdk.configserviceMod._MessageType | java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OrderingTimestamp = typings.std.Date
  type OrganizationConfigRuleDetailedStatus = js.Array[typings.awsSdk.configserviceMod.MemberAccountStatus]
  type OrganizationConfigRuleName = java.lang.String
  type OrganizationConfigRuleNames = js.Array[typings.awsSdk.configserviceMod.StringWithCharLimit64]
  type OrganizationConfigRuleStatuses = js.Array[typings.awsSdk.configserviceMod.OrganizationConfigRuleStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
    - typings.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
    - typings.awsSdk.awsSdkStrings.ScheduledNotification
    - java.lang.String
  */
  type OrganizationConfigRuleTriggerType = typings.awsSdk.configserviceMod._OrganizationConfigRuleTriggerType | java.lang.String
  type OrganizationConfigRuleTriggerTypes = js.Array[typings.awsSdk.configserviceMod.OrganizationConfigRuleTriggerType]
  type OrganizationConfigRules = js.Array[typings.awsSdk.configserviceMod.OrganizationConfigRule]
  type OrganizationConformancePackDetailedStatuses = js.Array[typings.awsSdk.configserviceMod.OrganizationConformancePackDetailedStatus]
  type OrganizationConformancePackName = java.lang.String
  type OrganizationConformancePackNames = js.Array[typings.awsSdk.configserviceMod.OrganizationConformancePackName]
  type OrganizationConformancePackStatuses = js.Array[typings.awsSdk.configserviceMod.OrganizationConformancePackStatus]
  type OrganizationConformancePacks = js.Array[typings.awsSdk.configserviceMod.OrganizationConformancePack]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationResourceDetailedStatus = typings.awsSdk.configserviceMod._OrganizationResourceDetailedStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationResourceStatus = typings.awsSdk.configserviceMod._OrganizationResourceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationRuleStatus = typings.awsSdk.configserviceMod._OrganizationRuleStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CUSTOM_LAMBDA
    - typings.awsSdk.awsSdkStrings.AWS
    - java.lang.String
  */
  type Owner = typings.awsSdk.configserviceMod._Owner | java.lang.String
  type PageSizeLimit = scala.Double
  type ParameterName = java.lang.String
  type ParameterValue = java.lang.String
  type PendingAggregationRequestList = js.Array[typings.awsSdk.configserviceMod.PendingAggregationRequest]
  type Percentage = scala.Double
  type RecorderName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.Failure_
    - java.lang.String
  */
  type RecorderStatus = typings.awsSdk.configserviceMod._RecorderStatus | java.lang.String
  type ReevaluateConfigRuleNames = js.Array[typings.awsSdk.configserviceMod.ConfigRuleName]
  type RelatedEvent = java.lang.String
  type RelatedEventList = js.Array[typings.awsSdk.configserviceMod.RelatedEvent]
  type RelationshipList = js.Array[typings.awsSdk.configserviceMod.Relationship]
  type RelationshipName = java.lang.String
  type RemediationConfigurations = js.Array[typings.awsSdk.configserviceMod.RemediationConfiguration]
  type RemediationExceptionResourceKeys = js.Array[typings.awsSdk.configserviceMod.RemediationExceptionResourceKey]
  type RemediationExceptions = js.Array[typings.awsSdk.configserviceMod.RemediationException]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.QUEUED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RemediationExecutionState = typings.awsSdk.configserviceMod._RemediationExecutionState | java.lang.String
  type RemediationExecutionStatuses = js.Array[typings.awsSdk.configserviceMod.RemediationExecutionStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RemediationExecutionStepState = typings.awsSdk.configserviceMod._RemediationExecutionStepState | java.lang.String
  type RemediationExecutionSteps = js.Array[typings.awsSdk.configserviceMod.RemediationExecutionStep]
  type RemediationParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.configserviceMod.RemediationParameterValue]
  type RemediationTargetType = typings.awsSdk.awsSdkStrings.SSM_DOCUMENT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RESOURCE_TYPE
    - typings.awsSdk.awsSdkStrings.ACCOUNT_ID
    - typings.awsSdk.awsSdkStrings.AWS_REGION
    - java.lang.String
  */
  type ResourceCountGroupKey = typings.awsSdk.configserviceMod._ResourceCountGroupKey | java.lang.String
  type ResourceCounts = js.Array[typings.awsSdk.configserviceMod.ResourceCount]
  type ResourceCreationTime = typings.std.Date
  type ResourceDeletionTime = typings.std.Date
  type ResourceId = java.lang.String
  type ResourceIdList = js.Array[typings.awsSdk.configserviceMod.ResourceId]
  type ResourceIdentifierList = js.Array[typings.awsSdk.configserviceMod.ResourceIdentifier]
  type ResourceIdentifiersList = js.Array[typings.awsSdk.configserviceMod.AggregateResourceIdentifier]
  type ResourceKeys = js.Array[typings.awsSdk.configserviceMod.ResourceKey]
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonCustomerGateway
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonEIP
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonHost
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonInstance
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonInternetGateway
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNetworkAcl
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNetworkInterface
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonRouteTable
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonSecurityGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonSubnet
    - typings.awsSdk.awsSdkStrings.AWSColonColonCloudTrailColonColonTrail
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVolume
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPC
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPNConnection
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPNGateway
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonRegisteredHAInstance
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNatGateway
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonEgressOnlyInternetGateway
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCEndpoint
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCEndpointService
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonFlowLog
    - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCPeeringConnection
    - typings.awsSdk.awsSdkStrings.AWSColonColonElasticsearchColonColonDomain
    - typings.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonPolicy
    - typings.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
    - typings.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonUser
    - typings.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingV2ColonColonLoadBalancer
    - typings.awsSdk.awsSdkStrings.AWSColonColonACMColonColonCertificate
    - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBInstance
    - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSubnetGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSecurityGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSnapshot
    - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBCluster
    - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBClusterSnapshot
    - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonEventSubscription
    - typings.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
    - typings.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonAccountPublicAccessBlock
    - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonCluster
    - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSnapshot
    - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterParameterGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSecurityGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSubnetGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonEventSubscription
    - typings.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonManagedInstanceInventory
    - typings.awsSdk.awsSdkStrings.AWSColonColonCloudWatchColonColonAlarm
    - typings.awsSdk.awsSdkStrings.AWSColonColonCloudFormationColonColonStack
    - typings.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingColonColonLoadBalancer
    - typings.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonAutoScalingGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonLaunchConfiguration
    - typings.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonScalingPolicy
    - typings.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonScheduledAction
    - typings.awsSdk.awsSdkStrings.AWSColonColonDynamoDBColonColonTable
    - typings.awsSdk.awsSdkStrings.AWSColonColonCodeBuildColonColonProject
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRateBasedRule
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRule
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRuleGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonWebACL
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRateBasedRule
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRule
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRuleGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonWebACL
    - typings.awsSdk.awsSdkStrings.AWSColonColonCloudFrontColonColonDistribution
    - typings.awsSdk.awsSdkStrings.AWSColonColonCloudFrontColonColonStreamingDistribution
    - typings.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
    - typings.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonApplication
    - typings.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonApplicationVersion
    - typings.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonEnvironment
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonWebACL
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonRuleGroup
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonIPSet
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonRegexPatternSet
    - typings.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonManagedRuleSet
    - typings.awsSdk.awsSdkStrings.AWSColonColonXRayColonColonEncryptionConfig
    - typings.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonAssociationCompliance
    - typings.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonPatchCompliance
    - typings.awsSdk.awsSdkStrings.AWSColonColonShieldColonColonProtection
    - typings.awsSdk.awsSdkStrings.AWSColonColonShieldRegionalColonColonProtection
    - typings.awsSdk.awsSdkStrings.AWSColonColonConfigColonColonResourceCompliance
    - typings.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonStage
    - typings.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonRestApi
    - typings.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonStage
    - typings.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonApi
    - typings.awsSdk.awsSdkStrings.AWSColonColonCodePipelineColonColonPipeline
    - typings.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProvisionedProduct
    - typings.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProduct
    - typings.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonPortfolio
    - typings.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue
    - typings.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey
    - typings.awsSdk.awsSdkStrings.AWSColonColonQLDBColonColonLedger
    - typings.awsSdk.awsSdkStrings.AWSColonColonSecretsManagerColonColonSecret
    - typings.awsSdk.awsSdkStrings.AWSColonColonSNSColonColonTopic
    - typings.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonFileData
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.configserviceMod._ResourceType | java.lang.String
  type ResourceTypeList = js.Array[typings.awsSdk.configserviceMod.ResourceType]
  type ResourceTypeString = java.lang.String
  type ResourceTypes = js.Array[typings.awsSdk.configserviceMod.StringWithCharLimit256]
  type ResourceTypesScope = js.Array[typings.awsSdk.configserviceMod.StringWithCharLimit256]
  type ResourceValueType = typings.awsSdk.awsSdkStrings.RESOURCE_ID | java.lang.String
  type Results = js.Array[typings.awsSdk.configserviceMod.String]
  type RetentionConfigurationList = js.Array[typings.awsSdk.configserviceMod.RetentionConfiguration]
  type RetentionConfigurationName = java.lang.String
  type RetentionConfigurationNameList = js.Array[typings.awsSdk.configserviceMod.RetentionConfigurationName]
  type RetentionPeriodInDays = scala.Double
  type RuleLimit = scala.Double
  type SchemaVersionId = java.lang.String
  type SourceDetails = js.Array[typings.awsSdk.configserviceMod.SourceDetail]
  type StackArn = java.lang.String
  type StaticParameterValues = js.Array[typings.awsSdk.configserviceMod.StringWithCharLimit256]
  type String = java.lang.String
  type StringWithCharLimit1024 = java.lang.String
  type StringWithCharLimit128 = java.lang.String
  type StringWithCharLimit2048 = java.lang.String
  type StringWithCharLimit256 = java.lang.String
  type StringWithCharLimit256Min0 = java.lang.String
  type StringWithCharLimit64 = java.lang.String
  type StringWithCharLimit768 = java.lang.String
  type SupplementaryConfiguration = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.configserviceMod.SupplementaryConfigurationValue]
  type SupplementaryConfigurationName = java.lang.String
  type SupplementaryConfigurationValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.configserviceMod.TagKey]
  type TagList = js.Array[typings.awsSdk.configserviceMod.Tag]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.configserviceMod.Value]
  type TagsList = js.Array[typings.awsSdk.configserviceMod.Tag]
  type TemplateBody = java.lang.String
  type TemplateS3Uri = java.lang.String
  type UnprocessedResourceIdentifierList = js.Array[typings.awsSdk.configserviceMod.AggregateResourceIdentifier]
  type Value = java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-11-12`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.configserviceMod._apiVersion | java.lang.String
}
