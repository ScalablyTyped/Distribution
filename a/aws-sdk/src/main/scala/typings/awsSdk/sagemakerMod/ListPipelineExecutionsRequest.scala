package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelineExecutionsRequest extends StObject {
  
  /**
    * A filter that returns the pipeline executions that were created after a specified time.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns the pipeline executions that were created before a specified time.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of pipeline executions to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * If the result of the previous ListPipelineExecutions request was truncated, the response includes a NextToken. To retrieve the next set of pipeline executions, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var PipelineName: typings.awsSdk.sagemakerMod.PipelineName
  
  /**
    * The field by which to sort results. The default is CreatedTime.
    */
  var SortBy: js.UndefOr[SortPipelineExecutionsBy] = js.undefined
  
  /**
    * The sort order for results.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.undefined
}
object ListPipelineExecutionsRequest {
  
  inline def apply(PipelineName: PipelineName): ListPipelineExecutionsRequest = {
    val __obj = js.Dynamic.literal(PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelineExecutionsRequest]
  }
  
  extension [Self <: ListPipelineExecutionsRequest](x: Self) {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
    
    inline def setSortBy(value: SortPipelineExecutionsBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
