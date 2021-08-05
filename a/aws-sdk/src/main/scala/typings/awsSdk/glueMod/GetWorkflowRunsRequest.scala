package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowRunsRequest extends StObject {
  
  /**
    * Specifies whether to include the workflow graph in response or not.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The maximum number of workflow runs to be included in the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * Name of the workflow whose metadata of runs should be returned.
    */
  var Name: NameString
  
  /**
    * The maximum size of the response.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object GetWorkflowRunsRequest {
  
  inline def apply(Name: NameString): GetWorkflowRunsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunsRequest]
  }
  
  extension [Self <: GetWorkflowRunsRequest](x: Self) {
    
    inline def setIncludeGraph(value: NullableBoolean): Self = StObject.set(x, "IncludeGraph", value.asInstanceOf[js.Any])
    
    inline def setIncludeGraphUndefined: Self = StObject.set(x, "IncludeGraph", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
