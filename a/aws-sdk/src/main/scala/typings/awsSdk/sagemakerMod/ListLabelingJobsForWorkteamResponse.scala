package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLabelingJobsForWorkteamResponse extends StObject {
  
  /**
    * An array of LabelingJobSummary objects, each describing a labeling job.
    */
  var LabelingJobSummaryList: LabelingJobForWorkteamSummaryList = js.native
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListLabelingJobsForWorkteamResponse {
  
  @scala.inline
  def apply(LabelingJobSummaryList: LabelingJobForWorkteamSummaryList): ListLabelingJobsForWorkteamResponse = {
    val __obj = js.Dynamic.literal(LabelingJobSummaryList = LabelingJobSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLabelingJobsForWorkteamResponse]
  }
  
  @scala.inline
  implicit class ListLabelingJobsForWorkteamResponseMutableBuilder[Self <: ListLabelingJobsForWorkteamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelingJobSummaryList(value: LabelingJobForWorkteamSummaryList): Self = StObject.set(x, "LabelingJobSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingJobSummaryListVarargs(value: LabelingJobForWorkteamSummary*): Self = StObject.set(x, "LabelingJobSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
