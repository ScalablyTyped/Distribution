package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelinesResponse extends StObject {
  
  /**
    * If the result of the previous ListPipelines request was truncated, the response includes a NextToken. To retrieve the next set of pipelines, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * Contains a sorted list of PipelineSummary objects matching the specified filters. Each PipelineSummary consists of PipelineArn, PipelineName, ExperimentName, PipelineDescription, CreationTime, LastModifiedTime, LastRunTime, and RoleArn. This list can be empty. 
    */
  var PipelineSummaries: js.UndefOr[PipelineSummaryList] = js.undefined
}
object ListPipelinesResponse {
  
  inline def apply(): ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesResponse]
  }
  
  extension [Self <: ListPipelinesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPipelineSummaries(value: PipelineSummaryList): Self = StObject.set(x, "PipelineSummaries", value.asInstanceOf[js.Any])
    
    inline def setPipelineSummariesUndefined: Self = StObject.set(x, "PipelineSummaries", js.undefined)
    
    inline def setPipelineSummariesVarargs(value: PipelineSummary*): Self = StObject.set(x, "PipelineSummaries", js.Array(value*))
  }
}
