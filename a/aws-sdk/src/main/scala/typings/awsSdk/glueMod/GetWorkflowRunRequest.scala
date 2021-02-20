package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkflowRunRequest extends StObject {
  
  /**
    * Specifies whether to include the workflow graph in response or not.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * Name of the workflow being run.
    */
  var Name: NameString = js.native
  
  /**
    * The ID of the workflow run.
    */
  var RunId: IdString = js.native
}
object GetWorkflowRunRequest {
  
  @scala.inline
  def apply(Name: NameString, RunId: IdString): GetWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunRequest]
  }
  
  @scala.inline
  implicit class GetWorkflowRunRequestMutableBuilder[Self <: GetWorkflowRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeGraph(value: NullableBoolean): Self = StObject.set(x, "IncludeGraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGraphUndefined: Self = StObject.set(x, "IncludeGraph", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
