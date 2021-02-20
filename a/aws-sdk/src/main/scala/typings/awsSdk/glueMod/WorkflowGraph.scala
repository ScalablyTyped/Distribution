package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowGraph extends StObject {
  
  /**
    * A list of all the directed connections between the nodes belonging to the workflow.
    */
  var Edges: js.UndefOr[EdgeList] = js.native
  
  /**
    * A list of the the AWS Glue components belong to the workflow represented as nodes.
    */
  var Nodes: js.UndefOr[NodeList] = js.native
}
object WorkflowGraph {
  
  @scala.inline
  def apply(): WorkflowGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowGraph]
  }
  
  @scala.inline
  implicit class WorkflowGraphMutableBuilder[Self <: WorkflowGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: EdgeList): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesUndefined: Self = StObject.set(x, "Edges", js.undefined)
    
    @scala.inline
    def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "Edges", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: NodeList): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "Nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = StObject.set(x, "Nodes", js.Array(value :_*))
  }
}
