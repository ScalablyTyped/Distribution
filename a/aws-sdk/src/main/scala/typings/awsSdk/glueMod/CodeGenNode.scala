package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeGenNode extends StObject {
  
  /**
    * Properties of the node, in the form of name-value pairs.
    */
  var Args: CodeGenNodeArgs
  
  /**
    * A node identifier that is unique within the node's graph.
    */
  var Id: CodeGenIdentifier
  
  /**
    * The line number of the node.
    */
  var LineNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The type of node that this is.
    */
  var NodeType: CodeGenNodeType
}
object CodeGenNode {
  
  inline def apply(Args: CodeGenNodeArgs, Id: CodeGenIdentifier, NodeType: CodeGenNodeType): CodeGenNode = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenNode]
  }
  
  extension [Self <: CodeGenNode](x: Self) {
    
    inline def setArgs(value: CodeGenNodeArgs): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: CodeGenNodeArg*): Self = StObject.set(x, "Args", js.Array(value :_*))
    
    inline def setId(value: CodeGenIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Integer): Self = StObject.set(x, "LineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "LineNumber", js.undefined)
    
    inline def setNodeType(value: CodeGenNodeType): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
  }
}
