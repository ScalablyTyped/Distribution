package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotPriceHistoryRequest extends StObject {
  
  /**
    * Filters the results by the specified Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time, up to the current date, from which to stop retrieving the price history data, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * One or more filters.    availability-zone - The Availability Zone for which prices should be returned.    instance-type - The type of instance (for example, m3.medium).    product-description - The product description for the Spot price (Linux/UNIX | Red Hat Enterprise Linux | SUSE Linux | Windows | Linux/UNIX (Amazon VPC) | Red Hat Enterprise Linux (Amazon VPC) | SUSE Linux (Amazon VPC) | Windows (Amazon VPC)).    spot-price - The Spot price. The value must match exactly (or use wildcards; greater than or less than comparison is not supported).    timestamp - The time stamp of the Spot price history, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). You can use wildcards (* and ?). Greater than or less than comparison is not supported.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Filters the results by the specified instance types.
    */
  var InstanceTypes: js.UndefOr[InstanceTypeList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value is 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Filters the results by the specified basic product descriptions.
    */
  var ProductDescriptions: js.UndefOr[ProductDescriptionList] = js.undefined
  
  /**
    * The date and time, up to the past 90 days, from which to start retrieving the price history data, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
}
object DescribeSpotPriceHistoryRequest {
  
  inline def apply(): DescribeSpotPriceHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotPriceHistoryRequest]
  }
  
  extension [Self <: DescribeSpotPriceHistoryRequest](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEndTime(value: DateTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setInstanceTypes(value: InstanceTypeList): Self = StObject.set(x, "InstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "InstanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: InstanceType*): Self = StObject.set(x, "InstanceTypes", js.Array(value :_*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProductDescriptions(value: ProductDescriptionList): Self = StObject.set(x, "ProductDescriptions", value.asInstanceOf[js.Any])
    
    inline def setProductDescriptionsUndefined: Self = StObject.set(x, "ProductDescriptions", js.undefined)
    
    inline def setProductDescriptionsVarargs(value: String*): Self = StObject.set(x, "ProductDescriptions", js.Array(value :_*))
    
    inline def setStartTime(value: DateTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
