package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryPathRecursiveRequestedEventOptions
  extends StObject
     with DirectoryPathRequestedEventOptions {
  
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean
}
object DirectoryPathRecursiveRequestedEventOptions {
  
  inline def apply(directoryPath: String, fileSystemId: String, recursive: Boolean, requestId: Double): DirectoryPathRecursiveRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryPathRecursiveRequestedEventOptions]
  }
  
  extension [Self <: DirectoryPathRecursiveRequestedEventOptions](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
