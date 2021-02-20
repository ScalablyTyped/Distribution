package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrainingJobsForHyperParameterTuningJobResponse extends StObject {
  
  /**
    * If the result of this ListTrainingJobsForHyperParameterTuningJob request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * A list of TrainingJobSummary objects that describe the training jobs that the ListTrainingJobsForHyperParameterTuningJob request returned.
    */
  var TrainingJobSummaries: HyperParameterTrainingJobSummaries = js.native
}
object ListTrainingJobsForHyperParameterTuningJobResponse {
  
  @scala.inline
  def apply(TrainingJobSummaries: HyperParameterTrainingJobSummaries): ListTrainingJobsForHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(TrainingJobSummaries = TrainingJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsForHyperParameterTuningJobResponse]
  }
  
  @scala.inline
  implicit class ListTrainingJobsForHyperParameterTuningJobResponseMutableBuilder[Self <: ListTrainingJobsForHyperParameterTuningJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTrainingJobSummaries(value: HyperParameterTrainingJobSummaries): Self = StObject.set(x, "TrainingJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobSummariesVarargs(value: HyperParameterTrainingJobSummary*): Self = StObject.set(x, "TrainingJobSummaries", js.Array(value :_*))
  }
}
