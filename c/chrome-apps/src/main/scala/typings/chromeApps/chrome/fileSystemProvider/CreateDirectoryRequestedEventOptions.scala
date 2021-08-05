package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectoryRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** The path of the directory which is to be operated on. */
  var directoryPath: String
  
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean
}
object CreateDirectoryRequestedEventOptions {
  
  inline def apply(directoryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): CreateDirectoryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryRequestedEventOptions]
  }
  
  extension [Self <: CreateDirectoryRequestedEventOptions](x: Self) {
    
    inline def setDirectoryPath(value: String): Self = StObject.set(x, "directoryPath", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
