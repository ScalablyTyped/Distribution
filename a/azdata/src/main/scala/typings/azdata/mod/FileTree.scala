package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileTree extends StObject {
  
  var rootNode: FileTreeNode
  
  var selectedNode: FileTreeNode
}
object FileTree {
  
  inline def apply(rootNode: FileTreeNode, selectedNode: FileTreeNode): FileTree = {
    val __obj = js.Dynamic.literal(rootNode = rootNode.asInstanceOf[js.Any], selectedNode = selectedNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTree]
  }
  
  extension [Self <: FileTree](x: Self) {
    
    inline def setRootNode(value: FileTreeNode): Self = StObject.set(x, "rootNode", value.asInstanceOf[js.Any])
    
    inline def setSelectedNode(value: FileTreeNode): Self = StObject.set(x, "selectedNode", value.asInstanceOf[js.Any])
  }
}
