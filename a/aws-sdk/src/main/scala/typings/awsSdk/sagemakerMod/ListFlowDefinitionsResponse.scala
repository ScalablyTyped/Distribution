package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFlowDefinitionsResponse extends StObject {
  
  /**
    * An array of objects describing the flow definitions.
    */
  var FlowDefinitionSummaries: typings.awsSdk.sagemakerMod.FlowDefinitionSummaries
  
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListFlowDefinitionsResponse {
  
  inline def apply(FlowDefinitionSummaries: FlowDefinitionSummaries): ListFlowDefinitionsResponse = {
    val __obj = js.Dynamic.literal(FlowDefinitionSummaries = FlowDefinitionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFlowDefinitionsResponse]
  }
  
  extension [Self <: ListFlowDefinitionsResponse](x: Self) {
    
    inline def setFlowDefinitionSummaries(value: FlowDefinitionSummaries): Self = StObject.set(x, "FlowDefinitionSummaries", value.asInstanceOf[js.Any])
    
    inline def setFlowDefinitionSummariesVarargs(value: FlowDefinitionSummary*): Self = StObject.set(x, "FlowDefinitionSummaries", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
