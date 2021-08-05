package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelineExecutionsInput extends StObject {
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline execution start times. Default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token that was returned from the previous ListPipelineExecutions call, which can be used to return the next set of pipeline executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the pipeline for which you want to get execution summary information.
    */
  var pipelineName: PipelineName
}
object ListPipelineExecutionsInput {
  
  inline def apply(pipelineName: PipelineName): ListPipelineExecutionsInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelineExecutionsInput]
  }
  
  extension [Self <: ListPipelineExecutionsInput](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
  }
}
