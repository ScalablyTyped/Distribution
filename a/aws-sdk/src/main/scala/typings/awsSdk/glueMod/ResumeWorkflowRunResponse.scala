package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeWorkflowRunResponse extends StObject {
  
  /**
    * A list of the node IDs for the nodes that were actually restarted.
    */
  var NodeIds: js.UndefOr[NodeIdList] = js.undefined
  
  /**
    * The new ID assigned to the resumed workflow run. Each resume of a workflow run will have a new run ID.
    */
  var RunId: js.UndefOr[IdString] = js.undefined
}
object ResumeWorkflowRunResponse {
  
  inline def apply(): ResumeWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeWorkflowRunResponse]
  }
  
  extension [Self <: ResumeWorkflowRunResponse](x: Self) {
    
    inline def setNodeIds(value: NodeIdList): Self = StObject.set(x, "NodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsUndefined: Self = StObject.set(x, "NodeIds", js.undefined)
    
    inline def setNodeIdsVarargs(value: NameString*): Self = StObject.set(x, "NodeIds", js.Array(value*))
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
