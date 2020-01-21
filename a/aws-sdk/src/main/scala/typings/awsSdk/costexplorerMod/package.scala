package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object costexplorerMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PAYER
    - typings.awsSdk.awsSdkStrings.LINKED
    - java.lang.String
  */
  type AccountScope = typings.awsSdk.costexplorerMod._AccountScope | java.lang.String
  type AmortizedRecurringFee = java.lang.String
  type AmortizedUpfrontFee = java.lang.String
  type Arn = java.lang.String
  type AttributeType = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.costexplorerMod.AttributeValue]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.costexplorerMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COST_AND_USAGE
    - typings.awsSdk.awsSdkStrings.RESERVATIONS
    - typings.awsSdk.awsSdkStrings.SAVINGS_PLANS
    - java.lang.String
  */
  type Context = typings.awsSdk.costexplorerMod._Context | java.lang.String
  type CostCategoryName = java.lang.String
  type CostCategoryReferencesList = js.Array[typings.awsSdk.costexplorerMod.CostCategoryReference]
  type CostCategoryRuleVersion = typings.awsSdk.awsSdkStrings.CostCategoryExpressionDotv1 | java.lang.String
  type CostCategoryRulesList = js.Array[typings.awsSdk.costexplorerMod.CostCategoryRule]
  type CostCategoryValue = java.lang.String
  type CoverageHoursPercentage = java.lang.String
  type CoverageNormalizedUnitsPercentage = java.lang.String
  type CoveragesByTime = js.Array[typings.awsSdk.costexplorerMod.CoverageByTime]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AZ
    - typings.awsSdk.awsSdkStrings.INSTANCE_TYPE
    - typings.awsSdk.awsSdkStrings.LINKED_ACCOUNT
    - typings.awsSdk.awsSdkStrings.OPERATION
    - typings.awsSdk.awsSdkStrings.PURCHASE_TYPE
    - typings.awsSdk.awsSdkStrings.REGION
    - typings.awsSdk.awsSdkStrings.SERVICE
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
    - java.lang.String
  */
  type Dimension = typings.awsSdk.costexplorerMod._Dimension | java.lang.String
  type DimensionValuesWithAttributesList = js.Array[typings.awsSdk.costexplorerMod.DimensionValuesWithAttributes]
  type Entity = java.lang.String
  type Estimated = scala.Boolean
  type Expressions = js.Array[typings.awsSdk.costexplorerMod.Expression]
  type ForecastResultsByTime = js.Array[typings.awsSdk.costexplorerMod.ForecastResult]
  type GenericBoolean = scala.Boolean
  type GenericString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DAILY
    - typings.awsSdk.awsSdkStrings.MONTHLY
    - typings.awsSdk.awsSdkStrings.HOURLY
    - java.lang.String
  */
  type Granularity = typings.awsSdk.costexplorerMod._Granularity | java.lang.String
  type GroupDefinitionKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DIMENSION
    - typings.awsSdk.awsSdkStrings.TAG
    - typings.awsSdk.awsSdkStrings.COST_CATEGORY
    - java.lang.String
  */
  type GroupDefinitionType = typings.awsSdk.costexplorerMod._GroupDefinitionType | java.lang.String
  type GroupDefinitions = js.Array[typings.awsSdk.costexplorerMod.GroupDefinition]
  type Groups = js.Array[typings.awsSdk.costexplorerMod.Group]
  type Key = java.lang.String
  type Keys = js.Array[typings.awsSdk.costexplorerMod.Key]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SEVEN_DAYS
    - typings.awsSdk.awsSdkStrings.THIRTY_DAYS
    - typings.awsSdk.awsSdkStrings.SIXTY_DAYS
    - java.lang.String
  */
  type LookbackPeriodInDays = typings.awsSdk.costexplorerMod._LookbackPeriodInDays | java.lang.String
  type MaxResults = scala.Double
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
  type Metric = typings.awsSdk.costexplorerMod._Metric | java.lang.String
  type MetricAmount = java.lang.String
  type MetricName = java.lang.String
  type MetricNames = js.Array[typings.awsSdk.costexplorerMod.MetricName]
  type MetricUnit = java.lang.String
  type Metrics = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.costexplorerMod.MetricValue]
  type NetRISavings = java.lang.String
  type NextPageToken = java.lang.String
  type NonNegativeInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.CONVERTIBLE
    - java.lang.String
  */
  type OfferingClass = typings.awsSdk.costexplorerMod._OfferingClass | java.lang.String
  type OnDemandCost = java.lang.String
  type OnDemandCostOfRIHoursUsed = java.lang.String
  type OnDemandHours = java.lang.String
  type OnDemandNormalizedUnits = java.lang.String
  type PageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NO_UPFRONT
    - typings.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
    - typings.awsSdk.awsSdkStrings.ALL_UPFRONT
    - typings.awsSdk.awsSdkStrings.LIGHT_UTILIZATION
    - typings.awsSdk.awsSdkStrings.MEDIUM_UTILIZATION
    - typings.awsSdk.awsSdkStrings.HEAVY_UTILIZATION
    - java.lang.String
  */
  type PaymentOption = typings.awsSdk.costexplorerMod._PaymentOption | java.lang.String
  type PredictionIntervalLevel = scala.Double
  type PurchasedHours = java.lang.String
  type PurchasedUnits = java.lang.String
  type ReservationCoverageGroups = js.Array[typings.awsSdk.costexplorerMod.ReservationCoverageGroup]
  type ReservationGroupKey = java.lang.String
  type ReservationGroupValue = java.lang.String
  type ReservationPurchaseRecommendationDetails = js.Array[typings.awsSdk.costexplorerMod.ReservationPurchaseRecommendationDetail]
  type ReservationPurchaseRecommendations = js.Array[typings.awsSdk.costexplorerMod.ReservationPurchaseRecommendation]
  type ReservationUtilizationGroups = js.Array[typings.awsSdk.costexplorerMod.ReservationUtilizationGroup]
  type ReservedHours = java.lang.String
  type ReservedNormalizedUnits = java.lang.String
  type ResultsByTime = js.Array[typings.awsSdk.costexplorerMod.ResultByTime]
  type RightsizingRecommendationList = js.Array[typings.awsSdk.costexplorerMod.RightsizingRecommendation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TERMINATE
    - typings.awsSdk.awsSdkStrings.MODIFY
    - java.lang.String
  */
  type RightsizingType = typings.awsSdk.costexplorerMod._RightsizingType | java.lang.String
  type SavingsPlanArn = java.lang.String
  type SavingsPlansCoverages = js.Array[typings.awsSdk.costexplorerMod.SavingsPlansCoverage]
  type SavingsPlansPurchaseRecommendationDetailList = js.Array[typings.awsSdk.costexplorerMod.SavingsPlansPurchaseRecommendationDetail]
  type SavingsPlansUtilizationDetails = js.Array[typings.awsSdk.costexplorerMod.SavingsPlansUtilizationDetail]
  type SavingsPlansUtilizationsByTime = js.Array[typings.awsSdk.costexplorerMod.SavingsPlansUtilizationByTime]
  type SearchString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPUTE_SP
    - typings.awsSdk.awsSdkStrings.EC2_INSTANCE_SP
    - java.lang.String
  */
  type SupportedSavingsPlansType = typings.awsSdk.costexplorerMod._SupportedSavingsPlansType | java.lang.String
  type TagKey = java.lang.String
  type TagList = js.Array[typings.awsSdk.costexplorerMod.Entity]
  type TagValuesList = js.Array[typings.awsSdk.costexplorerMod.TagValues]
  type TargetInstancesList = js.Array[typings.awsSdk.costexplorerMod.TargetInstance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ONE_YEAR
    - typings.awsSdk.awsSdkStrings.THREE_YEARS
    - java.lang.String
  */
  type TermInYears = typings.awsSdk.costexplorerMod._TermInYears | java.lang.String
  type TotalActualHours = java.lang.String
  type TotalActualUnits = java.lang.String
  type TotalAmortizedFee = java.lang.String
  type TotalPotentialRISavings = java.lang.String
  type TotalRunningHours = java.lang.String
  type TotalRunningNormalizedUnits = java.lang.String
  type UnusedHours = java.lang.String
  type UnusedUnits = java.lang.String
  type UtilizationPercentage = java.lang.String
  type UtilizationPercentageInUnits = java.lang.String
  type UtilizationsByTime = js.Array[typings.awsSdk.costexplorerMod.UtilizationByTime]
  type Value = java.lang.String
  type Values = js.Array[typings.awsSdk.costexplorerMod.Value]
  type YearMonthDay = java.lang.String
  type ZonedDateTime = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-10-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.costexplorerMod._apiVersion | java.lang.String
}
