package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelinesResponse extends StObject {
  
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of PipelineSummary objects.
    */
  var pipelineSummaries: js.UndefOr[PipelineSummaries] = js.undefined
}
object ListPipelinesResponse {
  
  @scala.inline
  def apply(): ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesResponse]
  }
  
  @scala.inline
  implicit class ListPipelinesResponseMutableBuilder[Self <: ListPipelinesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPipelineSummaries(value: PipelineSummaries): Self = StObject.set(x, "pipelineSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineSummariesUndefined: Self = StObject.set(x, "pipelineSummaries", js.undefined)
    
    @scala.inline
    def setPipelineSummariesVarargs(value: PipelineSummary*): Self = StObject.set(x, "pipelineSummaries", js.Array(value :_*))
  }
}
