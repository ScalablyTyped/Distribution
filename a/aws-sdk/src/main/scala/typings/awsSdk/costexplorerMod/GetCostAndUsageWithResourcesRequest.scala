package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCostAndUsageWithResourcesRequest extends StObject {
  
  /**
    * Filters Amazon Web Services costs by different dimensions. For example, you can specify SERVICE and LINKED_ACCOUNT and get the costs that are associated with that account's usage of that service. You can nest Expression objects to define any combination of dimension filters. For more information, see Expression.  The GetCostAndUsageWithResources operation requires that you either group by or filter by a ResourceId. It requires the Expression "SERVICE = Amazon Elastic Compute Cloud - Compute" in the filter.
    */
  var Filter: Expression = js.native
  
  /**
    * Sets the AWS cost granularity to MONTHLY, DAILY, or HOURLY. If Granularity isn't set, the response object doesn't include the Granularity, MONTHLY, DAILY, or HOURLY. 
    */
  var Granularity: js.UndefOr[typings.awsSdk.costexplorerMod.Granularity] = js.native
  
  /**
    * You can group Amazon Web Services costs using up to two different groups: DIMENSION, TAG, COST_CATEGORY.
    */
  var GroupBy: js.UndefOr[GroupDefinitions] = js.native
  
  /**
    * Which metrics are returned in the query. For more information about blended and unblended rates, see Why does the "blended" annotation appear on some line items in my bill?.  Valid values are AmortizedCost, BlendedCost, NetAmortizedCost, NetUnblendedCost, NormalizedUsageAmount, UnblendedCost, and UsageQuantity.   If you return the UsageQuantity metric, the service aggregates all usage numbers without taking the units into account. For example, if you aggregate usageQuantity across all of Amazon EC2, the results aren't meaningful because Amazon EC2 compute hours and data transfer are measured in different units (for example, hours vs. GB). To get more meaningful UsageQuantity metrics, filter by UsageType or UsageTypeGroups.    Metrics is required for GetCostAndUsageWithResources requests.
    */
  var Metrics: js.UndefOr[MetricNames] = js.native
  
  /**
    * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  
  /**
    * Sets the start and end dates for retrieving Amazon Web Services costs. The range must be within the last 14 days (the start date cannot be earlier than 14 days ago). The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
    */
  var TimePeriod: DateInterval = js.native
}
object GetCostAndUsageWithResourcesRequest {
  
  @scala.inline
  def apply(Filter: Expression, TimePeriod: DateInterval): GetCostAndUsageWithResourcesRequest = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any], TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCostAndUsageWithResourcesRequest]
  }
  
  @scala.inline
  implicit class GetCostAndUsageWithResourcesRequestMutableBuilder[Self <: GetCostAndUsageWithResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularity(value: Granularity): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "Granularity", js.undefined)
    
    @scala.inline
    def setGroupBy(value: GroupDefinitions): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
    
    @scala.inline
    def setGroupByVarargs(value: GroupDefinition*): Self = StObject.set(x, "GroupBy", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: MetricNames): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricName*): Self = StObject.set(x, "Metrics", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
