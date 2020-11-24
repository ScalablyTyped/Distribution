package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRecommendationExportJobsResponse extends js.Object {
  
  /**
    * The token to use to advance to the next page of export jobs. This value is null when there are no more pages of export jobs to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * An array of objects that describe recommendation export jobs.
    */
  var recommendationExportJobs: js.UndefOr[RecommendationExportJobs] = js.native
}
object DescribeRecommendationExportJobsResponse {
  
  @scala.inline
  def apply(): DescribeRecommendationExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommendationExportJobsResponse]
  }
  
  @scala.inline
  implicit class DescribeRecommendationExportJobsResponseOps[Self <: DescribeRecommendationExportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRecommendationExportJobsVarargs(value: RecommendationExportJob*): Self = this.set("recommendationExportJobs", js.Array(value :_*))
    
    @scala.inline
    def setRecommendationExportJobs(value: RecommendationExportJobs): Self = this.set("recommendationExportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationExportJobs: Self = this.set("recommendationExportJobs", js.undefined)
  }
}
