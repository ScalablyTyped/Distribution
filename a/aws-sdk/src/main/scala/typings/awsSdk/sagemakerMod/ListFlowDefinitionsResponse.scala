package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFlowDefinitionsResponse extends StObject {
  
  /**
    * An array of objects describing the flow definitions.
    */
  var FlowDefinitionSummaries: typings.awsSdk.sagemakerMod.FlowDefinitionSummaries = js.native
  
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListFlowDefinitionsResponse {
  
  @scala.inline
  def apply(FlowDefinitionSummaries: FlowDefinitionSummaries): ListFlowDefinitionsResponse = {
    val __obj = js.Dynamic.literal(FlowDefinitionSummaries = FlowDefinitionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFlowDefinitionsResponse]
  }
  
  @scala.inline
  implicit class ListFlowDefinitionsResponseMutableBuilder[Self <: ListFlowDefinitionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowDefinitionSummaries(value: FlowDefinitionSummaries): Self = StObject.set(x, "FlowDefinitionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowDefinitionSummariesVarargs(value: FlowDefinitionSummary*): Self = StObject.set(x, "FlowDefinitionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
