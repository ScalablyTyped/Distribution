package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileBrowserExpandedParams extends StObject {
  
  var children: js.Array[FileTreeNode]
  
  var expandPath: String
  
  var message: String
  
  var ownerUri: String
  
  var succeeded: Boolean
}
object FileBrowserExpandedParams {
  
  inline def apply(
    children: js.Array[FileTreeNode],
    expandPath: String,
    message: String,
    ownerUri: String,
    succeeded: Boolean
  ): FileBrowserExpandedParams = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], expandPath = expandPath.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserExpandedParams]
  }
  
  extension [Self <: FileBrowserExpandedParams](x: Self) {
    
    inline def setChildren(value: js.Array[FileTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: FileTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setExpandPath(value: String): Self = StObject.set(x, "expandPath", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
