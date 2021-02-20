package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileBrowserExpandedParams extends StObject {
  
  var children: js.Array[FileTreeNode] = js.native
  
  var expandPath: String = js.native
  
  var message: String = js.native
  
  var ownerUri: String = js.native
  
  var succeeded: Boolean = js.native
}
object FileBrowserExpandedParams {
  
  @scala.inline
  def apply(
    children: js.Array[FileTreeNode],
    expandPath: String,
    message: String,
    ownerUri: String,
    succeeded: Boolean
  ): FileBrowserExpandedParams = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], expandPath = expandPath.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserExpandedParams]
  }
  
  @scala.inline
  implicit class FileBrowserExpandedParamsMutableBuilder[Self <: FileBrowserExpandedParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[FileTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: FileTreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setExpandPath(value: String): Self = StObject.set(x, "expandPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
