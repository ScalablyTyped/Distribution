package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileBrowserExpandedParams extends js.Object {
  
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
  implicit class FileBrowserExpandedParamsOps[Self <: FileBrowserExpandedParams] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: FileTreeNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[FileTreeNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandPath(value: String): Self = this.set("expandPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUri(value: String): Self = this.set("ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
}
