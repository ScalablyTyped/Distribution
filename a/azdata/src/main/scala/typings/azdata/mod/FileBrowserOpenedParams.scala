package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileBrowserOpenedParams extends StObject {
  
  var fileTree: FileTree = js.native
  
  var message: String = js.native
  
  var ownerUri: String = js.native
  
  var succeeded: Boolean = js.native
}
object FileBrowserOpenedParams {
  
  @scala.inline
  def apply(fileTree: FileTree, message: String, ownerUri: String, succeeded: Boolean): FileBrowserOpenedParams = {
    val __obj = js.Dynamic.literal(fileTree = fileTree.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserOpenedParams]
  }
  
  @scala.inline
  implicit class FileBrowserOpenedParamsMutableBuilder[Self <: FileBrowserOpenedParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileTree(value: FileTree): Self = StObject.set(x, "fileTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
