package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelBiasJobDefinitionsResponse extends StObject {
  
  /**
    * A JSON array in which each element is a summary for a model bias jobs.
    */
  var JobDefinitionSummaries: MonitoringJobDefinitionSummaryList
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListModelBiasJobDefinitionsResponse {
  
  inline def apply(JobDefinitionSummaries: MonitoringJobDefinitionSummaryList): ListModelBiasJobDefinitionsResponse = {
    val __obj = js.Dynamic.literal(JobDefinitionSummaries = JobDefinitionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelBiasJobDefinitionsResponse]
  }
  
  extension [Self <: ListModelBiasJobDefinitionsResponse](x: Self) {
    
    inline def setJobDefinitionSummaries(value: MonitoringJobDefinitionSummaryList): Self = StObject.set(x, "JobDefinitionSummaries", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionSummariesVarargs(value: MonitoringJobDefinitionSummary*): Self = StObject.set(x, "JobDefinitionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
