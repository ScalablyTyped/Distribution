package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelineParametersForExecutionResponse extends StObject {
  
  /**
    * If the result of the previous ListPipelineParametersForExecution request was truncated, the response includes a NextToken. To retrieve the next set of parameters, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * Contains a list of pipeline parameters. This list can be empty. 
    */
  var PipelineParameters: js.UndefOr[ParameterList] = js.undefined
}
object ListPipelineParametersForExecutionResponse {
  
  inline def apply(): ListPipelineParametersForExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelineParametersForExecutionResponse]
  }
  
  extension [Self <: ListPipelineParametersForExecutionResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPipelineParameters(value: ParameterList): Self = StObject.set(x, "PipelineParameters", value.asInstanceOf[js.Any])
    
    inline def setPipelineParametersUndefined: Self = StObject.set(x, "PipelineParameters", js.undefined)
    
    inline def setPipelineParametersVarargs(value: Parameter*): Self = StObject.set(x, "PipelineParameters", js.Array(value*))
  }
}
