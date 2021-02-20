package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeGenNode extends StObject {
  
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
  implicit class CodeGenNodeMutableBuilder[Self <: CodeGenNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: CodeGenNodeArgs): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: CodeGenNodeArg*): Self = StObject.set(x, "Args", js.Array(value :_*))
    
    @scala.inline
    def setId(value: CodeGenIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Integer): Self = StObject.set(x, "LineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberUndefined: Self = StObject.set(x, "LineNumber", js.undefined)
    
    @scala.inline
    def setNodeType(value: CodeGenNodeType): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
  }
}
