package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryPathRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** The path of the directory which is to be operated on. */
  var directoryPath: String
}
object DirectoryPathRequestedEventOptions {
  
  inline def apply(directoryPath: String, fileSystemId: String, requestId: Double): DirectoryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryPathRequestedEventOptions]
  }
  
  extension [Self <: DirectoryPathRequestedEventOptions](x: Self) {
    
    inline def setDirectoryPath(value: String): Self = StObject.set(x, "directoryPath", value.asInstanceOf[js.Any])
  }
}
