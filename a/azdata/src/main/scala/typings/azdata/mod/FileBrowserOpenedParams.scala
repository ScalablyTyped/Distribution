package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileBrowserOpenedParams extends StObject {
  
  var fileTree: FileTree
  
  var message: String
  
  var ownerUri: String
  
  var succeeded: Boolean
}
object FileBrowserOpenedParams {
  
  inline def apply(fileTree: FileTree, message: String, ownerUri: String, succeeded: Boolean): FileBrowserOpenedParams = {
    val __obj = js.Dynamic.literal(fileTree = fileTree.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserOpenedParams]
  }
  
  extension [Self <: FileBrowserOpenedParams](x: Self) {
    
    inline def setFileTree(value: FileTree): Self = StObject.set(x, "fileTree", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
