package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelineExecutionsResponse extends StObject {
  
  /**
    * If the result of the previous ListPipelineExecutions request was truncated, the response includes a NextToken. To retrieve the next set of pipeline executions, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * Contains a sorted list of pipeline execution summary objects matching the specified filters. Each run summary includes the Amazon Resource Name (ARN) of the pipeline execution, the run date, and the status. This list can be empty. 
    */
  var PipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList] = js.undefined
}
object ListPipelineExecutionsResponse {
  
  inline def apply(): ListPipelineExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelineExecutionsResponse]
  }
  
  extension [Self <: ListPipelineExecutionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPipelineExecutionSummaries(value: PipelineExecutionSummaryList): Self = StObject.set(x, "PipelineExecutionSummaries", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionSummariesUndefined: Self = StObject.set(x, "PipelineExecutionSummaries", js.undefined)
    
    inline def setPipelineExecutionSummariesVarargs(value: PipelineExecutionSummary*): Self = StObject.set(x, "PipelineExecutionSummaries", js.Array(value*))
  }
}
