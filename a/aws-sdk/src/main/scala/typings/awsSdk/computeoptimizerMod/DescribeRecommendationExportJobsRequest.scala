package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecommendationExportJobsRequest extends StObject {
  
  /**
    * An array of objects that describe a filter to return a more specific list of export jobs.
    */
  var filters: js.UndefOr[JobFilters] = js.undefined
  
  /**
    * The identification numbers of the export jobs to return. An export job ID is returned when you create an export using the ExportAutoScalingGroupRecommendations or ExportEC2InstanceRecommendations actions. All export jobs created in the last seven days are returned if this parameter is omitted.
    */
  var jobIds: js.UndefOr[JobIds] = js.undefined
  
  /**
    * The maximum number of export jobs to return with a single request. To retrieve the remaining results, make another request with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to advance to the next page of export jobs.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeRecommendationExportJobsRequest {
  
  @scala.inline
  def apply(): DescribeRecommendationExportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommendationExportJobsRequest]
  }
  
  @scala.inline
  implicit class DescribeRecommendationExportJobsRequestMutableBuilder[Self <: DescribeRecommendationExportJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: JobFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: JobFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setJobIds(value: JobIds): Self = StObject.set(x, "jobIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdsUndefined: Self = StObject.set(x, "jobIds", js.undefined)
    
    @scala.inline
    def setJobIdsVarargs(value: JobId*): Self = StObject.set(x, "jobIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
