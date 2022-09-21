package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ALLOCATION_PERCENTAGES
import typings.awsSdk.awsSdkStrings.COST_EXPLORER
import typings.awsSdk.awsSdkStrings.CostCategoryExpressionDotv1
import typings.awsSdk.awsSdkStrings.SERVICE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PAYER
  - typings.awsSdk.awsSdkStrings.LINKED
  - java.lang.String
*/
type AccountScope = _AccountScope | String

type AmortizedRecurringFee = String

type AmortizedUpfrontFee = String

type Anomalies = js.Array[Anomaly]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.YES
  - typings.awsSdk.awsSdkStrings.NO
  - typings.awsSdk.awsSdkStrings.PLANNED_ACTIVITY
  - java.lang.String
*/
type AnomalyFeedbackType = _AnomalyFeedbackType | String

type AnomalyMonitors = js.Array[AnomalyMonitor]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DAILY
  - typings.awsSdk.awsSdkStrings.IMMEDIATE
  - typings.awsSdk.awsSdkStrings.WEEKLY
  - java.lang.String
*/
type AnomalySubscriptionFrequency = _AnomalySubscriptionFrequency | String

type AnomalySubscriptions = js.Array[AnomalySubscription]

type Arn = String

type AttributeType = String

type AttributeValue = String

type Attributes = StringDictionary[AttributeValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COST_AND_USAGE
  - typings.awsSdk.awsSdkStrings.RESERVATIONS
  - typings.awsSdk.awsSdkStrings.SAVINGS_PLANS
  - java.lang.String
*/
type Context = _Context | String

type CostAllocationTagKeyList = js.Array[TagKey]

type CostAllocationTagList = js.Array[CostAllocationTag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type CostAllocationTagStatus = _CostAllocationTagStatus | String

type CostAllocationTagStatusList = js.Array[CostAllocationTagStatusEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWSGenerated
  - typings.awsSdk.awsSdkStrings.UserDefined
  - java.lang.String
*/
type CostAllocationTagType = _CostAllocationTagType | String

type CostAllocationTagsMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LINKED_ACCOUNT_NAME
  - typings.awsSdk.awsSdkStrings.TAG
  - java.lang.String
*/
type CostCategoryInheritedValueDimensionName = _CostCategoryInheritedValueDimensionName | String

type CostCategoryMaxResults = Double

type CostCategoryName = String

type CostCategoryNamesList = js.Array[CostCategoryName]

type CostCategoryProcessingStatusList = js.Array[CostCategoryProcessingStatus]

type CostCategoryReferencesList = js.Array[CostCategoryReference]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGULAR
  - typings.awsSdk.awsSdkStrings.INHERITED_VALUE
  - java.lang.String
*/
type CostCategoryRuleType = _CostCategoryRuleType | String

type CostCategoryRuleVersion = CostCategoryExpressionDotv1 | String

type CostCategoryRulesList = js.Array[CostCategoryRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FIXED
  - typings.awsSdk.awsSdkStrings.PROPORTIONAL
  - typings.awsSdk.awsSdkStrings.EVEN
  - java.lang.String
*/
type CostCategorySplitChargeMethod = _CostCategorySplitChargeMethod | String

type CostCategorySplitChargeRuleParameterType = ALLOCATION_PERCENTAGES | String

type CostCategorySplitChargeRuleParameterValuesList = js.Array[GenericString]

type CostCategorySplitChargeRuleParametersList = js.Array[CostCategorySplitChargeRuleParameter]

type CostCategorySplitChargeRuleTargetsList = js.Array[GenericString]

type CostCategorySplitChargeRulesList = js.Array[CostCategorySplitChargeRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROCESSING
  - typings.awsSdk.awsSdkStrings.APPLIED
  - java.lang.String
*/
type CostCategoryStatus = _CostCategoryStatus | String

type CostCategoryStatusComponent = COST_EXPLORER | String

type CostCategoryValue = String

type CostCategoryValuesList = js.Array[CostCategoryValue]

type CoverageHoursPercentage = String

type CoverageNormalizedUnitsPercentage = String

type CoveragesByTime = js.Array[CoverageByTime]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AZ
  - typings.awsSdk.awsSdkStrings.INSTANCE_TYPE
  - typings.awsSdk.awsSdkStrings.LINKED_ACCOUNT
  - typings.awsSdk.awsSdkStrings.LINKED_ACCOUNT_NAME
  - typings.awsSdk.awsSdkStrings.OPERATION
  - typings.awsSdk.awsSdkStrings.PURCHASE_TYPE
  - typings.awsSdk.awsSdkStrings.REGION
  - typings.awsSdk.awsSdkStrings.SERVICE
  - typings.awsSdk.awsSdkStrings.SERVICE_CODE
  - typings.awsSdk.awsSdkStrings.USAGE_TYPE
  - typings.awsSdk.awsSdkStrings.USAGE_TYPE_GROUP
  - typings.awsSdk.awsSdkStrings.RECORD_TYPE
  - typings.awsSdk.awsSdkStrings.OPERATING_SYSTEM
  - typings.awsSdk.awsSdkStrings.TENANCY
  - typings.awsSdk.awsSdkStrings.SCOPE
  - typings.awsSdk.awsSdkStrings.PLATFORM
  - typings.awsSdk.awsSdkStrings.SUBSCRIPTION_ID
  - typings.awsSdk.awsSdkStrings.LEGAL_ENTITY_NAME
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_OPTION
  - typings.awsSdk.awsSdkStrings.DATABASE_ENGINE
  - typings.awsSdk.awsSdkStrings.CACHE_ENGINE
  - typings.awsSdk.awsSdkStrings.INSTANCE_TYPE_FAMILY
  - typings.awsSdk.awsSdkStrings.BILLING_ENTITY
  - typings.awsSdk.awsSdkStrings.RESERVATION_ID
  - typings.awsSdk.awsSdkStrings.RESOURCE_ID
  - typings.awsSdk.awsSdkStrings.RIGHTSIZING_TYPE
  - typings.awsSdk.awsSdkStrings.SAVINGS_PLANS_TYPE
  - typings.awsSdk.awsSdkStrings.SAVINGS_PLAN_ARN
  - typings.awsSdk.awsSdkStrings.PAYMENT_OPTION
  - typings.awsSdk.awsSdkStrings.AGREEMENT_END_DATE_TIME_AFTER
  - typings.awsSdk.awsSdkStrings.AGREEMENT_END_DATE_TIME_BEFORE
  - typings.awsSdk.awsSdkStrings.INVOICING_ENTITY
  - java.lang.String
*/
type Dimension = _Dimension | String

type DimensionValuesWithAttributesList = js.Array[DimensionValuesWithAttributes]

type Entity = String

type ErrorMessage = String

type Estimated = Boolean

type Expressions = js.Array[Expression]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CPU_OVER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.CPU_UNDER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.MEMORY_OVER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.MEMORY_UNDER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.EBS_THROUGHPUT_OVER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.EBS_THROUGHPUT_UNDER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.EBS_IOPS_OVER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.EBS_IOPS_UNDER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.NETWORK_BANDWIDTH_OVER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.NETWORK_BANDWIDTH_UNDER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.NETWORK_PPS_OVER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.NETWORK_PPS_UNDER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.DISK_IOPS_OVER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.DISK_IOPS_UNDER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.DISK_THROUGHPUT_OVER_PROVISIONED
  - typings.awsSdk.awsSdkStrings.DISK_THROUGHPUT_UNDER_PROVISIONED
  - java.lang.String
*/
type FindingReasonCode = _FindingReasonCode | String

type FindingReasonCodes = js.Array[FindingReasonCode]

type ForecastResultsByTime = js.Array[ForecastResult]

type GenericBoolean = Boolean

type GenericDouble = Double

type GenericString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DAILY
  - typings.awsSdk.awsSdkStrings.MONTHLY
  - typings.awsSdk.awsSdkStrings.HOURLY
  - java.lang.String
*/
type Granularity = _Granularity | String

type GroupDefinitionKey = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DIMENSION
  - typings.awsSdk.awsSdkStrings.TAG
  - typings.awsSdk.awsSdkStrings.COST_CATEGORY
  - java.lang.String
*/
type GroupDefinitionType = _GroupDefinitionType | String

type GroupDefinitions = js.Array[GroupDefinition]

type Groups = js.Array[Group]

type Key = String

type Keys = js.Array[Key]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SEVEN_DAYS
  - typings.awsSdk.awsSdkStrings.THIRTY_DAYS
  - typings.awsSdk.awsSdkStrings.SIXTY_DAYS
  - java.lang.String
*/
type LookbackPeriodInDays = _LookbackPeriodInDays | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUALS
  - typings.awsSdk.awsSdkStrings.ABSENT
  - typings.awsSdk.awsSdkStrings.STARTS_WITH
  - typings.awsSdk.awsSdkStrings.ENDS_WITH
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.CASE_SENSITIVE
  - typings.awsSdk.awsSdkStrings.CASE_INSENSITIVE
  - java.lang.String
*/
type MatchOption = _MatchOption | String

type MatchOptions = js.Array[MatchOption]

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BLENDED_COST
  - typings.awsSdk.awsSdkStrings.UNBLENDED_COST
  - typings.awsSdk.awsSdkStrings.AMORTIZED_COST
  - typings.awsSdk.awsSdkStrings.NET_UNBLENDED_COST
  - typings.awsSdk.awsSdkStrings.NET_AMORTIZED_COST
  - typings.awsSdk.awsSdkStrings.USAGE_QUANTITY
  - typings.awsSdk.awsSdkStrings.NORMALIZED_USAGE_AMOUNT
  - java.lang.String
*/
type Metric = _Metric | String

type MetricAmount = String

type MetricName = String

type MetricNames = js.Array[MetricName]

type MetricUnit = String

type Metrics = StringDictionary[MetricValue]

type MonitorArnList = js.Array[Arn]

type MonitorDimension = SERVICE | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DIMENSIONAL
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type MonitorType = _MonitorType | String

type NetRISavings = String

type NextPageToken = String

type NonNegativeInteger = Double

type NullableNonNegativeDouble = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUAL
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - java.lang.String
*/
type NumericOperator = _NumericOperator | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.CONVERTIBLE
  - java.lang.String
*/
type OfferingClass = _OfferingClass | String

type OnDemandCost = String

type OnDemandCostOfRIHoursUsed = String

type OnDemandHours = String

type OnDemandNormalizedUnits = String

type PageSize = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_UPFRONT
  - typings.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
  - typings.awsSdk.awsSdkStrings.ALL_UPFRONT
  - typings.awsSdk.awsSdkStrings.LIGHT_UTILIZATION
  - typings.awsSdk.awsSdkStrings.MEDIUM_UTILIZATION
  - typings.awsSdk.awsSdkStrings.HEAVY_UTILIZATION
  - java.lang.String
*/
type PaymentOption = _PaymentOption | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HYPERVISOR
  - typings.awsSdk.awsSdkStrings.NETWORK_INTERFACE
  - typings.awsSdk.awsSdkStrings.STORAGE_INTERFACE
  - typings.awsSdk.awsSdkStrings.INSTANCE_STORE_AVAILABILITY
  - typings.awsSdk.awsSdkStrings.VIRTUALIZATION_TYPE
  - java.lang.String
*/
type PlatformDifference = _PlatformDifference | String

type PlatformDifferences = js.Array[PlatformDifference]

type PredictionIntervalLevel = Double

type PurchasedHours = String

type PurchasedUnits = String

type RICostForUnusedHours = String

type RealizedSavings = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SAME_INSTANCE_FAMILY
  - typings.awsSdk.awsSdkStrings.CROSS_INSTANCE_FAMILY
  - java.lang.String
*/
type RecommendationTarget = _RecommendationTarget | String

type ReservationCoverageGroups = js.Array[ReservationCoverageGroup]

type ReservationGroupKey = String

type ReservationGroupValue = String

type ReservationPurchaseRecommendationDetails = js.Array[ReservationPurchaseRecommendationDetail]

type ReservationPurchaseRecommendations = js.Array[ReservationPurchaseRecommendation]

type ReservationUtilizationGroups = js.Array[ReservationUtilizationGroup]

type ReservedHours = String

type ReservedNormalizedUnits = String

type ResourceTagKey = String

type ResourceTagKeyList = js.Array[ResourceTagKey]

type ResourceTagList = js.Array[ResourceTag]

type ResourceTagValue = String

type ResultsByTime = js.Array[ResultByTime]

type RightsizingRecommendationList = js.Array[RightsizingRecommendation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TERMINATE
  - typings.awsSdk.awsSdkStrings.MODIFY
  - java.lang.String
*/
type RightsizingType = _RightsizingType | String

type RootCauses = js.Array[RootCause]

type SavingsPlanArn = String

type SavingsPlansCoverages = js.Array[SavingsPlansCoverage]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ATTRIBUTES
  - typings.awsSdk.awsSdkStrings.UTILIZATION
  - typings.awsSdk.awsSdkStrings.AMORTIZED_COMMITMENT
  - typings.awsSdk.awsSdkStrings.SAVINGS
  - java.lang.String
*/
type SavingsPlansDataType = _SavingsPlansDataType | String

type SavingsPlansDataTypes = js.Array[SavingsPlansDataType]

type SavingsPlansPurchaseRecommendationDetailList = js.Array[SavingsPlansPurchaseRecommendationDetail]

type SavingsPlansUtilizationDetails = js.Array[SavingsPlansUtilizationDetail]

type SavingsPlansUtilizationsByTime = js.Array[SavingsPlansUtilizationByTime]

type SearchString = String

type SortDefinitionKey = String

type SortDefinitions = js.Array[SortDefinition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | String

type SubscriberAddress = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONFIRMED
  - typings.awsSdk.awsSdkStrings.DECLINED
  - java.lang.String
*/
type SubscriberStatus = _SubscriberStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.SNS
  - java.lang.String
*/
type SubscriberType = _SubscriberType | String

type Subscribers = js.Array[Subscriber]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPUTE_SP
  - typings.awsSdk.awsSdkStrings.EC2_INSTANCE_SP
  - typings.awsSdk.awsSdkStrings.SAGEMAKER_SP
  - java.lang.String
*/
type SupportedSavingsPlansType = _SupportedSavingsPlansType | String

type TagKey = String

type TagList = js.Array[Entity]

type TagValuesList = js.Array[TagValues]

type TargetInstancesList = js.Array[TargetInstance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONE_YEAR
  - typings.awsSdk.awsSdkStrings.THREE_YEARS
  - java.lang.String
*/
type TermInYears = _TermInYears | String

type TotalActualHours = String

type TotalActualUnits = String

type TotalAmortizedFee = String

type TotalPotentialRISavings = String

type TotalRunningHours = String

type TotalRunningNormalizedUnits = String

type UnrealizedSavings = String

type UnusedHours = String

type UnusedUnits = String

type UpdateCostAllocationTagsStatusErrors = js.Array[UpdateCostAllocationTagsStatusError]

type UtilizationPercentage = String

type UtilizationPercentageInUnits = String

type UtilizationsByTime = js.Array[UtilizationByTime]

type Value = String

type Values = js.Array[Value]

type YearMonthDay = String

type ZonedDateTime = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-10-25`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
