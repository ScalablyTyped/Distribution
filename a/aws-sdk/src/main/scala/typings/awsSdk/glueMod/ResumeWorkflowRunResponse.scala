package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResumeWorkflowRunResponse extends StObject {
  
  /**
    * A list of the node IDs for the nodes that were actually restarted.
    */
  var NodeIds: js.UndefOr[NodeIdList] = js.native
  
  /**
    * The new ID assigned to the resumed workflow run. Each resume of a workflow run will have a new run ID.
    */
  var RunId: js.UndefOr[IdString] = js.native
}
object ResumeWorkflowRunResponse {
  
  @scala.inline
  def apply(): ResumeWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeWorkflowRunResponse]
  }
  
  @scala.inline
  implicit class ResumeWorkflowRunResponseMutableBuilder[Self <: ResumeWorkflowRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeIds(value: NodeIdList): Self = StObject.set(x, "NodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdsUndefined: Self = StObject.set(x, "NodeIds", js.undefined)
    
    @scala.inline
    def setNodeIdsVarargs(value: NameString*): Self = StObject.set(x, "NodeIds", js.Array(value :_*))
    
    @scala.inline
    def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
