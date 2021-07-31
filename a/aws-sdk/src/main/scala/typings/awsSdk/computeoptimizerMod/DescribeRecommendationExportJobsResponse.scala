package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecommendationExportJobsResponse extends StObject {
  
  /**
    * The token to use to advance to the next page of export jobs. This value is null when there are no more pages of export jobs to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of objects that describe recommendation export jobs.
    */
  var recommendationExportJobs: js.UndefOr[RecommendationExportJobs] = js.undefined
}
object DescribeRecommendationExportJobsResponse {
  
  @scala.inline
  def apply(): DescribeRecommendationExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommendationExportJobsResponse]
  }
  
  @scala.inline
  implicit class DescribeRecommendationExportJobsResponseMutableBuilder[Self <: DescribeRecommendationExportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRecommendationExportJobs(value: RecommendationExportJobs): Self = StObject.set(x, "recommendationExportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationExportJobsUndefined: Self = StObject.set(x, "recommendationExportJobs", js.undefined)
    
    @scala.inline
    def setRecommendationExportJobsVarargs(value: RecommendationExportJob*): Self = StObject.set(x, "recommendationExportJobs", js.Array(value :_*))
  }
}
