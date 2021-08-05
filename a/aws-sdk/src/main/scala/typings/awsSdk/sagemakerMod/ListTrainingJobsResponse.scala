package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrainingJobsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * An array of TrainingJobSummary objects, each listing a training job.
    */
  var TrainingJobSummaries: typings.awsSdk.sagemakerMod.TrainingJobSummaries
}
object ListTrainingJobsResponse {
  
  inline def apply(TrainingJobSummaries: TrainingJobSummaries): ListTrainingJobsResponse = {
    val __obj = js.Dynamic.literal(TrainingJobSummaries = TrainingJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsResponse]
  }
  
  extension [Self <: ListTrainingJobsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrainingJobSummaries(value: TrainingJobSummaries): Self = StObject.set(x, "TrainingJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobSummariesVarargs(value: TrainingJobSummary*): Self = StObject.set(x, "TrainingJobSummaries", js.Array(value :_*))
  }
}
