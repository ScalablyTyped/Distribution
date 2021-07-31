package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataflowGraphResponse extends StObject {
  
  /**
    * A list of the edges in the resulting DAG.
    */
  var DagEdges: js.UndefOr[typings.awsSdk.glueMod.DagEdges] = js.undefined
  
  /**
    * A list of the nodes in the resulting DAG.
    */
  var DagNodes: js.UndefOr[typings.awsSdk.glueMod.DagNodes] = js.undefined
}
object GetDataflowGraphResponse {
  
  @scala.inline
  def apply(): GetDataflowGraphResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataflowGraphResponse]
  }
  
  @scala.inline
  implicit class GetDataflowGraphResponseMutableBuilder[Self <: GetDataflowGraphResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDagEdges(value: DagEdges): Self = StObject.set(x, "DagEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDagEdgesUndefined: Self = StObject.set(x, "DagEdges", js.undefined)
    
    @scala.inline
    def setDagEdgesVarargs(value: CodeGenEdge*): Self = StObject.set(x, "DagEdges", js.Array(value :_*))
    
    @scala.inline
    def setDagNodes(value: DagNodes): Self = StObject.set(x, "DagNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDagNodesUndefined: Self = StObject.set(x, "DagNodes", js.undefined)
    
    @scala.inline
    def setDagNodesVarargs(value: CodeGenNode*): Self = StObject.set(x, "DagNodes", js.Array(value :_*))
  }
}
