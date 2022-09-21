package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelQualityJobDefinitionsResponse extends StObject {
  
  /**
    * A list of summaries of model quality monitoring job definitions.
    */
  var JobDefinitionSummaries: MonitoringJobDefinitionSummaryList
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of model quality monitoring job definitions, use it in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListModelQualityJobDefinitionsResponse {
  
  inline def apply(JobDefinitionSummaries: MonitoringJobDefinitionSummaryList): ListModelQualityJobDefinitionsResponse = {
    val __obj = js.Dynamic.literal(JobDefinitionSummaries = JobDefinitionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelQualityJobDefinitionsResponse]
  }
  
  extension [Self <: ListModelQualityJobDefinitionsResponse](x: Self) {
    
    inline def setJobDefinitionSummaries(value: MonitoringJobDefinitionSummaryList): Self = StObject.set(x, "JobDefinitionSummaries", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionSummariesVarargs(value: MonitoringJobDefinitionSummary*): Self = StObject.set(x, "JobDefinitionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
