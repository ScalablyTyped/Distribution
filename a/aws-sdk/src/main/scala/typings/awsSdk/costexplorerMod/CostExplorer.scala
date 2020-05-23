package typings.awsSdk.costexplorerMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostExplorer extends Service {
  @JSName("config")
  var config_CostExplorer: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new Cost Category with the requested name and rules.
    */
  def createCostCategoryDefinition(): Request[CreateCostCategoryDefinitionResponse, AWSError] = js.native
  def createCostCategoryDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateCostCategoryDefinitionResponse, Unit]): Request[CreateCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Creates a new Cost Category with the requested name and rules.
    */
  def createCostCategoryDefinition(params: CreateCostCategoryDefinitionRequest): Request[CreateCostCategoryDefinitionResponse, AWSError] = js.native
  def createCostCategoryDefinition(
    params: CreateCostCategoryDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCostCategoryDefinitionResponse, Unit]
  ): Request[CreateCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a Cost Category. Expenses from this month going forward will no longer be categorized with this Cost Category.
    */
  def deleteCostCategoryDefinition(): Request[DeleteCostCategoryDefinitionResponse, AWSError] = js.native
  def deleteCostCategoryDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCostCategoryDefinitionResponse, Unit]): Request[DeleteCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a Cost Category. Expenses from this month going forward will no longer be categorized with this Cost Category.
    */
  def deleteCostCategoryDefinition(params: DeleteCostCategoryDefinitionRequest): Request[DeleteCostCategoryDefinitionResponse, AWSError] = js.native
  def deleteCostCategoryDefinition(
    params: DeleteCostCategoryDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCostCategoryDefinitionResponse, Unit]
  ): Request[DeleteCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Returns the name, ARN, rules, definition, and effective dates of a Cost Category that's defined in the account. You have the option to use EffectiveOn to return a Cost Category that is active on a specific date. If there is no EffectiveOn specified, you’ll see a Cost Category that is effective on the current date. If Cost Category is still effective, EffectiveEnd is omitted in the response. 
    */
  def describeCostCategoryDefinition(): Request[DescribeCostCategoryDefinitionResponse, AWSError] = js.native
  def describeCostCategoryDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCostCategoryDefinitionResponse, Unit]
  ): Request[DescribeCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Returns the name, ARN, rules, definition, and effective dates of a Cost Category that's defined in the account. You have the option to use EffectiveOn to return a Cost Category that is active on a specific date. If there is no EffectiveOn specified, you’ll see a Cost Category that is effective on the current date. If Cost Category is still effective, EffectiveEnd is omitted in the response. 
    */
  def describeCostCategoryDefinition(params: DescribeCostCategoryDefinitionRequest): Request[DescribeCostCategoryDefinitionResponse, AWSError] = js.native
  def describeCostCategoryDefinition(
    params: DescribeCostCategoryDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCostCategoryDefinitionResponse, Unit]
  ): Request[DescribeCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts.
    */
  def getCostAndUsage(): Request[GetCostAndUsageResponse, AWSError] = js.native
  def getCostAndUsage(callback: js.Function2[/* err */ AWSError, /* data */ GetCostAndUsageResponse, Unit]): Request[GetCostAndUsageResponse, AWSError] = js.native
  /**
    * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts.
    */
  def getCostAndUsage(params: GetCostAndUsageRequest): Request[GetCostAndUsageResponse, AWSError] = js.native
  def getCostAndUsage(
    params: GetCostAndUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCostAndUsageResponse, Unit]
  ): Request[GetCostAndUsageResponse, AWSError] = js.native
  /**
    * Retrieves cost and usage metrics with resources for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts. This API is currently available for the Amazon Elastic Compute Cloud – Compute service only.  This is an opt-in only feature. You can enable this feature from the Cost Explorer Settings page. For information on how to access the Settings page, see Controlling Access for Cost Explorer in the AWS Billing and Cost Management User Guide. 
    */
  def getCostAndUsageWithResources(): Request[GetCostAndUsageWithResourcesResponse, AWSError] = js.native
  def getCostAndUsageWithResources(callback: js.Function2[/* err */ AWSError, /* data */ GetCostAndUsageWithResourcesResponse, Unit]): Request[GetCostAndUsageWithResourcesResponse, AWSError] = js.native
  /**
    * Retrieves cost and usage metrics with resources for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts. This API is currently available for the Amazon Elastic Compute Cloud – Compute service only.  This is an opt-in only feature. You can enable this feature from the Cost Explorer Settings page. For information on how to access the Settings page, see Controlling Access for Cost Explorer in the AWS Billing and Cost Management User Guide. 
    */
  def getCostAndUsageWithResources(params: GetCostAndUsageWithResourcesRequest): Request[GetCostAndUsageWithResourcesResponse, AWSError] = js.native
  def getCostAndUsageWithResources(
    params: GetCostAndUsageWithResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCostAndUsageWithResourcesResponse, Unit]
  ): Request[GetCostAndUsageWithResourcesResponse, AWSError] = js.native
  /**
    * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
    */
  def getCostForecast(): Request[GetCostForecastResponse, AWSError] = js.native
  def getCostForecast(callback: js.Function2[/* err */ AWSError, /* data */ GetCostForecastResponse, Unit]): Request[GetCostForecastResponse, AWSError] = js.native
  /**
    * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
    */
  def getCostForecast(params: GetCostForecastRequest): Request[GetCostForecastResponse, AWSError] = js.native
  def getCostForecast(
    params: GetCostForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCostForecastResponse, Unit]
  ): Request[GetCostForecastResponse, AWSError] = js.native
  /**
    * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
    */
  def getDimensionValues(): Request[GetDimensionValuesResponse, AWSError] = js.native
  def getDimensionValues(callback: js.Function2[/* err */ AWSError, /* data */ GetDimensionValuesResponse, Unit]): Request[GetDimensionValuesResponse, AWSError] = js.native
  /**
    * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
    */
  def getDimensionValues(params: GetDimensionValuesRequest): Request[GetDimensionValuesResponse, AWSError] = js.native
  def getDimensionValues(
    params: GetDimensionValuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDimensionValuesResponse, Unit]
  ): Request[GetDimensionValuesResponse, AWSError] = js.native
  /**
    * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's master account can see the coverage of the associated member accounts. This supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
    */
  def getReservationCoverage(): Request[GetReservationCoverageResponse, AWSError] = js.native
  def getReservationCoverage(callback: js.Function2[/* err */ AWSError, /* data */ GetReservationCoverageResponse, Unit]): Request[GetReservationCoverageResponse, AWSError] = js.native
  /**
    * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's master account can see the coverage of the associated member accounts. This supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
    */
  def getReservationCoverage(params: GetReservationCoverageRequest): Request[GetReservationCoverageResponse, AWSError] = js.native
  def getReservationCoverage(
    params: GetReservationCoverageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservationCoverageResponse, Unit]
  ): Request[GetReservationCoverageResponse, AWSError] = js.native
  /**
    * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. AWS generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of RI to purchase to maximize your estimated savings.  For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size that you want. For this example, your RI recommendation would be for c4.large because that is the smallest size instance in the c4 instance family.
    */
  def getReservationPurchaseRecommendation(): Request[GetReservationPurchaseRecommendationResponse, AWSError] = js.native
  def getReservationPurchaseRecommendation(
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservationPurchaseRecommendationResponse, Unit]
  ): Request[GetReservationPurchaseRecommendationResponse, AWSError] = js.native
  /**
    * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. AWS generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of RI to purchase to maximize your estimated savings.  For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size that you want. For this example, your RI recommendation would be for c4.large because that is the smallest size instance in the c4 instance family.
    */
  def getReservationPurchaseRecommendation(params: GetReservationPurchaseRecommendationRequest): Request[GetReservationPurchaseRecommendationResponse, AWSError] = js.native
  def getReservationPurchaseRecommendation(
    params: GetReservationPurchaseRecommendationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservationPurchaseRecommendationResponse, Unit]
  ): Request[GetReservationPurchaseRecommendationResponse, AWSError] = js.native
  /**
    * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
    */
  def getReservationUtilization(): Request[GetReservationUtilizationResponse, AWSError] = js.native
  def getReservationUtilization(callback: js.Function2[/* err */ AWSError, /* data */ GetReservationUtilizationResponse, Unit]): Request[GetReservationUtilizationResponse, AWSError] = js.native
  /**
    * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
    */
  def getReservationUtilization(params: GetReservationUtilizationRequest): Request[GetReservationUtilizationResponse, AWSError] = js.native
  def getReservationUtilization(
    params: GetReservationUtilizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservationUtilizationResponse, Unit]
  ): Request[GetReservationUtilizationResponse, AWSError] = js.native
  /**
    * Creates recommendations that helps you save cost by identifying idle and underutilized Amazon EC2 instances. Recommendations are generated to either downsize or terminate instances, along with providing savings detail and metrics. For details on calculation and function, see Optimizing Your Cost with Rightsizing Recommendations.
    */
  def getRightsizingRecommendation(): Request[GetRightsizingRecommendationResponse, AWSError] = js.native
  def getRightsizingRecommendation(callback: js.Function2[/* err */ AWSError, /* data */ GetRightsizingRecommendationResponse, Unit]): Request[GetRightsizingRecommendationResponse, AWSError] = js.native
  /**
    * Creates recommendations that helps you save cost by identifying idle and underutilized Amazon EC2 instances. Recommendations are generated to either downsize or terminate instances, along with providing savings detail and metrics. For details on calculation and function, see Optimizing Your Cost with Rightsizing Recommendations.
    */
  def getRightsizingRecommendation(params: GetRightsizingRecommendationRequest): Request[GetRightsizingRecommendationResponse, AWSError] = js.native
  def getRightsizingRecommendation(
    params: GetRightsizingRecommendationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRightsizingRecommendationResponse, Unit]
  ): Request[GetRightsizingRecommendationResponse, AWSError] = js.native
  /**
    * Retrieves the Savings Plans covered for your account. This enables you to see how much of your cost is covered by a Savings Plan. An organization’s master account can see the coverage of the associated member accounts. This supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data for Savings Plans usage with the following dimensions:    LINKED_ACCOUNT     REGION     SERVICE     INSTANCE_FAMILY    To determine valid values for a dimension, use the GetDimensionValues operation.
    */
  def getSavingsPlansCoverage(): Request[GetSavingsPlansCoverageResponse, AWSError] = js.native
  def getSavingsPlansCoverage(callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansCoverageResponse, Unit]): Request[GetSavingsPlansCoverageResponse, AWSError] = js.native
  /**
    * Retrieves the Savings Plans covered for your account. This enables you to see how much of your cost is covered by a Savings Plan. An organization’s master account can see the coverage of the associated member accounts. This supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data for Savings Plans usage with the following dimensions:    LINKED_ACCOUNT     REGION     SERVICE     INSTANCE_FAMILY    To determine valid values for a dimension, use the GetDimensionValues operation.
    */
  def getSavingsPlansCoverage(params: GetSavingsPlansCoverageRequest): Request[GetSavingsPlansCoverageResponse, AWSError] = js.native
  def getSavingsPlansCoverage(
    params: GetSavingsPlansCoverageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansCoverageResponse, Unit]
  ): Request[GetSavingsPlansCoverageResponse, AWSError] = js.native
  /**
    * Retrieves your request parameters, Savings Plan Recommendations Summary and Details. 
    */
  def getSavingsPlansPurchaseRecommendation(): Request[GetSavingsPlansPurchaseRecommendationResponse, AWSError] = js.native
  def getSavingsPlansPurchaseRecommendation(
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansPurchaseRecommendationResponse, Unit]
  ): Request[GetSavingsPlansPurchaseRecommendationResponse, AWSError] = js.native
  /**
    * Retrieves your request parameters, Savings Plan Recommendations Summary and Details. 
    */
  def getSavingsPlansPurchaseRecommendation(params: GetSavingsPlansPurchaseRecommendationRequest): Request[GetSavingsPlansPurchaseRecommendationResponse, AWSError] = js.native
  def getSavingsPlansPurchaseRecommendation(
    params: GetSavingsPlansPurchaseRecommendationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansPurchaseRecommendationResponse, Unit]
  ): Request[GetSavingsPlansPurchaseRecommendationResponse, AWSError] = js.native
  /**
    * Retrieves the Savings Plans utilization for your account across date ranges with daily or monthly granularity. Master accounts in an organization have access to member accounts. You can use GetDimensionValues in SAVINGS_PLANS to determine the possible dimension values.  You cannot group by any dimension values for GetSavingsPlansUtilization. 
    */
  def getSavingsPlansUtilization(): Request[GetSavingsPlansUtilizationResponse, AWSError] = js.native
  def getSavingsPlansUtilization(callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansUtilizationResponse, Unit]): Request[GetSavingsPlansUtilizationResponse, AWSError] = js.native
  /**
    * Retrieves the Savings Plans utilization for your account across date ranges with daily or monthly granularity. Master accounts in an organization have access to member accounts. You can use GetDimensionValues in SAVINGS_PLANS to determine the possible dimension values.  You cannot group by any dimension values for GetSavingsPlansUtilization. 
    */
  def getSavingsPlansUtilization(params: GetSavingsPlansUtilizationRequest): Request[GetSavingsPlansUtilizationResponse, AWSError] = js.native
  def getSavingsPlansUtilization(
    params: GetSavingsPlansUtilizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansUtilizationResponse, Unit]
  ): Request[GetSavingsPlansUtilizationResponse, AWSError] = js.native
  /**
    * Retrieves attribute data along with aggregate utilization and savings data for a given time period. This doesn't support granular or grouped data (daily/monthly) in response. You can't retrieve data by dates in a single response similar to GetSavingsPlanUtilization, but you have the option to make multiple calls to GetSavingsPlanUtilizationDetails by providing individual dates. You can use GetDimensionValues in SAVINGS_PLANS to determine the possible dimension values.   GetSavingsPlanUtilizationDetails internally groups data by SavingsPlansArn. 
    */
  def getSavingsPlansUtilizationDetails(): Request[GetSavingsPlansUtilizationDetailsResponse, AWSError] = js.native
  def getSavingsPlansUtilizationDetails(
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansUtilizationDetailsResponse, Unit]
  ): Request[GetSavingsPlansUtilizationDetailsResponse, AWSError] = js.native
  /**
    * Retrieves attribute data along with aggregate utilization and savings data for a given time period. This doesn't support granular or grouped data (daily/monthly) in response. You can't retrieve data by dates in a single response similar to GetSavingsPlanUtilization, but you have the option to make multiple calls to GetSavingsPlanUtilizationDetails by providing individual dates. You can use GetDimensionValues in SAVINGS_PLANS to determine the possible dimension values.   GetSavingsPlanUtilizationDetails internally groups data by SavingsPlansArn. 
    */
  def getSavingsPlansUtilizationDetails(params: GetSavingsPlansUtilizationDetailsRequest): Request[GetSavingsPlansUtilizationDetailsResponse, AWSError] = js.native
  def getSavingsPlansUtilizationDetails(
    params: GetSavingsPlansUtilizationDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansUtilizationDetailsResponse, Unit]
  ): Request[GetSavingsPlansUtilizationDetailsResponse, AWSError] = js.native
  /**
    * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
    */
  def getTags(): Request[GetTagsResponse, AWSError] = js.native
  def getTags(callback: js.Function2[/* err */ AWSError, /* data */ GetTagsResponse, Unit]): Request[GetTagsResponse, AWSError] = js.native
  /**
    * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
    */
  def getTags(params: GetTagsRequest): Request[GetTagsResponse, AWSError] = js.native
  def getTags(
    params: GetTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTagsResponse, Unit]
  ): Request[GetTagsResponse, AWSError] = js.native
  /**
    * Retrieves a forecast for how much Amazon Web Services predicts that you will use over the forecast time period that you select, based on your past usage. 
    */
  def getUsageForecast(): Request[GetUsageForecastResponse, AWSError] = js.native
  def getUsageForecast(callback: js.Function2[/* err */ AWSError, /* data */ GetUsageForecastResponse, Unit]): Request[GetUsageForecastResponse, AWSError] = js.native
  /**
    * Retrieves a forecast for how much Amazon Web Services predicts that you will use over the forecast time period that you select, based on your past usage. 
    */
  def getUsageForecast(params: GetUsageForecastRequest): Request[GetUsageForecastResponse, AWSError] = js.native
  def getUsageForecast(
    params: GetUsageForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUsageForecastResponse, Unit]
  ): Request[GetUsageForecastResponse, AWSError] = js.native
  /**
    * Returns the name, ARN, NumberOfRules and effective dates of all Cost Categories defined in the account. You have the option to use EffectiveOn to return a list of Cost Categories that were active on a specific date. If there is no EffectiveOn specified, you’ll see Cost Categories that are effective on the current date. If Cost Category is still effective, EffectiveEnd is omitted in the response. ListCostCategoryDefinitions supports pagination. The request can have a MaxResults range up to 100.
    */
  def listCostCategoryDefinitions(): Request[ListCostCategoryDefinitionsResponse, AWSError] = js.native
  def listCostCategoryDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListCostCategoryDefinitionsResponse, Unit]): Request[ListCostCategoryDefinitionsResponse, AWSError] = js.native
  /**
    * Returns the name, ARN, NumberOfRules and effective dates of all Cost Categories defined in the account. You have the option to use EffectiveOn to return a list of Cost Categories that were active on a specific date. If there is no EffectiveOn specified, you’ll see Cost Categories that are effective on the current date. If Cost Category is still effective, EffectiveEnd is omitted in the response. ListCostCategoryDefinitions supports pagination. The request can have a MaxResults range up to 100.
    */
  def listCostCategoryDefinitions(params: ListCostCategoryDefinitionsRequest): Request[ListCostCategoryDefinitionsResponse, AWSError] = js.native
  def listCostCategoryDefinitions(
    params: ListCostCategoryDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCostCategoryDefinitionsResponse, Unit]
  ): Request[ListCostCategoryDefinitionsResponse, AWSError] = js.native
  /**
    * Updates an existing Cost Category. Changes made to the Cost Category rules will be used to categorize the current month’s expenses and future expenses. This won’t change categorization for the previous months.
    */
  def updateCostCategoryDefinition(): Request[UpdateCostCategoryDefinitionResponse, AWSError] = js.native
  def updateCostCategoryDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCostCategoryDefinitionResponse, Unit]): Request[UpdateCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Updates an existing Cost Category. Changes made to the Cost Category rules will be used to categorize the current month’s expenses and future expenses. This won’t change categorization for the previous months.
    */
  def updateCostCategoryDefinition(params: UpdateCostCategoryDefinitionRequest): Request[UpdateCostCategoryDefinitionResponse, AWSError] = js.native
  def updateCostCategoryDefinition(
    params: UpdateCostCategoryDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCostCategoryDefinitionResponse, Unit]
  ): Request[UpdateCostCategoryDefinitionResponse, AWSError] = js.native
}

