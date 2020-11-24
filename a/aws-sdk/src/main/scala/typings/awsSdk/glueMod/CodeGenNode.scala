package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeGenNode extends js.Object {
  
  /**
    * Properties of the node, in the form of name-value pairs.
    */
  var Args: CodeGenNodeArgs = js.native
  
  /**
    * A node identifier that is unique within the node's graph.
    */
  var Id: CodeGenIdentifier = js.native
  
  /**
    * The line number of the node.
    */
  var LineNumber: js.UndefOr[Integer] = js.native
  
  /**
    * The type of node that this is.
    */
  var NodeType: CodeGenNodeType = js.native
}
object CodeGenNode {
  
  @scala.inline
  def apply(Args: CodeGenNodeArgs, Id: CodeGenIdentifier, NodeType: CodeGenNodeType): CodeGenNode = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenNode]
  }
  
  @scala.inline
  implicit class CodeGenNodeOps[Self <: CodeGenNode] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: CodeGenNodeArg*): Self = this.set("Args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: CodeGenNodeArgs): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CodeGenIdentifier): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: CodeGenNodeType): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Integer): Self = this.set("LineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumber: Self = this.set("LineNumber", js.undefined)
  }
}
