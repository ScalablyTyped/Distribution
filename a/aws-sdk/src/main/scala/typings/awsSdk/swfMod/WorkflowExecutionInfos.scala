package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionInfos extends StObject {
  
  /**
    * The list of workflow information structures.
    */
  var executionInfos: WorkflowExecutionInfoList = js.native
  
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
}
object WorkflowExecutionInfos {
  
  @scala.inline
  def apply(executionInfos: WorkflowExecutionInfoList): WorkflowExecutionInfos = {
    val __obj = js.Dynamic.literal(executionInfos = executionInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionInfos]
  }
  
  @scala.inline
  implicit class WorkflowExecutionInfosMutableBuilder[Self <: WorkflowExecutionInfos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionInfos(value: WorkflowExecutionInfoList): Self = StObject.set(x, "executionInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionInfosVarargs(value: WorkflowExecutionInfo*): Self = StObject.set(x, "executionInfos", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
