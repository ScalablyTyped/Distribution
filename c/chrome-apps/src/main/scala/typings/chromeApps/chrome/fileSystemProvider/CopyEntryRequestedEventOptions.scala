package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyEntryRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** The source path for the operation. */
  var sourcePath: String
  
  /** The destination path for the operation. */
  var targetPath: String
}
object CopyEntryRequestedEventOptions {
  
  inline def apply(fileSystemId: String, requestId: integer, sourcePath: String, targetPath: String): CopyEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyEntryRequestedEventOptions]
  }
  
  extension [Self <: CopyEntryRequestedEventOptions](x: Self) {
    
    inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    
    inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
  }
}
