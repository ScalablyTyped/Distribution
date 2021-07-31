package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelineExecutionsOutput extends StObject {
  
  /**
    * A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of executions in the history of a pipeline.
    */
  var pipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList] = js.undefined
}
object ListPipelineExecutionsOutput {
  
  @scala.inline
  def apply(): ListPipelineExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelineExecutionsOutput]
  }
  
  @scala.inline
  implicit class ListPipelineExecutionsOutputMutableBuilder[Self <: ListPipelineExecutionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPipelineExecutionSummaries(value: PipelineExecutionSummaryList): Self = StObject.set(x, "pipelineExecutionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineExecutionSummariesUndefined: Self = StObject.set(x, "pipelineExecutionSummaries", js.undefined)
    
    @scala.inline
    def setPipelineExecutionSummariesVarargs(value: PipelineExecutionSummary*): Self = StObject.set(x, "pipelineExecutionSummaries", js.Array(value :_*))
  }
}
