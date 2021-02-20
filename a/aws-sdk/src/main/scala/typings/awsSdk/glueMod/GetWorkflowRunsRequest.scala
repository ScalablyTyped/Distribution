package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkflowRunsRequest extends StObject {
  
  /**
    * Specifies whether to include the workflow graph in response or not.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The maximum number of workflow runs to be included in the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * Name of the workflow whose metadata of runs should be returned.
    */
  var Name: NameString = js.native
  
  /**
    * The maximum size of the response.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object GetWorkflowRunsRequest {
  
  @scala.inline
  def apply(Name: NameString): GetWorkflowRunsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunsRequest]
  }
  
  @scala.inline
  implicit class GetWorkflowRunsRequestMutableBuilder[Self <: GetWorkflowRunsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeGraph(value: NullableBoolean): Self = StObject.set(x, "IncludeGraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGraphUndefined: Self = StObject.set(x, "IncludeGraph", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
