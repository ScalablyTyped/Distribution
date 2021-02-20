package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrainingJobsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * An array of TrainingJobSummary objects, each listing a training job.
    */
  var TrainingJobSummaries: typings.awsSdk.sagemakerMod.TrainingJobSummaries = js.native
}
object ListTrainingJobsResponse {
  
  @scala.inline
  def apply(TrainingJobSummaries: TrainingJobSummaries): ListTrainingJobsResponse = {
    val __obj = js.Dynamic.literal(TrainingJobSummaries = TrainingJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsResponse]
  }
  
  @scala.inline
  implicit class ListTrainingJobsResponseMutableBuilder[Self <: ListTrainingJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTrainingJobSummaries(value: TrainingJobSummaries): Self = StObject.set(x, "TrainingJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobSummariesVarargs(value: TrainingJobSummary*): Self = StObject.set(x, "TrainingJobSummaries", js.Array(value :_*))
  }
}
