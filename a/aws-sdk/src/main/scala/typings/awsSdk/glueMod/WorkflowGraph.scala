package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowGraph extends js.Object {
  
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
  implicit class WorkflowGraphOps[Self <: WorkflowGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEdgesVarargs(value: Edge*): Self = this.set("Edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: EdgeList): Self = this.set("Edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdges: Self = this.set("Edges", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("Nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: NodeList): Self = this.set("Nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("Nodes", js.undefined)
  }
}
