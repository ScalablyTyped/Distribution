package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticGpusRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Elastic Graphics accelerator IDs.
    */
  var ElasticGpuIds: js.UndefOr[ElasticGpuIdSet] = js.undefined
  
  /**
    * The filters.    availability-zone - The Availability Zone in which the Elastic Graphics accelerator resides.    elastic-gpu-health - The status of the Elastic Graphics accelerator (OK | IMPAIRED).    elastic-gpu-state - The state of the Elastic Graphics accelerator (ATTACHED).    elastic-gpu-type - The type of Elastic Graphics accelerator; for example, eg1.medium.    instance-id - The ID of the instance to which the Elastic Graphics accelerator is associated.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 5 and 1000.
    */
  var MaxResults: js.UndefOr[DescribeElasticGpusMaxResults] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeElasticGpusRequest {
  
  inline def apply(): DescribeElasticGpusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticGpusRequest]
  }
  
  extension [Self <: DescribeElasticGpusRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setElasticGpuIds(value: ElasticGpuIdSet): Self = StObject.set(x, "ElasticGpuIds", value.asInstanceOf[js.Any])
    
    inline def setElasticGpuIdsUndefined: Self = StObject.set(x, "ElasticGpuIds", js.undefined)
    
    inline def setElasticGpuIdsVarargs(value: ElasticGpuId*): Self = StObject.set(x, "ElasticGpuIds", js.Array(value*))
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeElasticGpusMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
