package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFileRequestedEventOptions
  extends StObject
     with FilePathRequestedEventOptions {
  
  /** Whether the file will be used for reading or writing. */
  var mode: String
}
object OpenFileRequestedEventOptions {
  
  inline def apply(filePath: String, fileSystemId: String, mode: String, requestId: Double): OpenFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFileRequestedEventOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenFileRequestedEventOptions] (val x: Self) extends AnyVal {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
