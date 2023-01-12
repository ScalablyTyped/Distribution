package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenedFileInfo extends StObject {
  
  /** The path of the opened file. */
  var filePath: String
  
  /** Whether the file was opened for reading or writing. */
  var mode: String
  
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: Double
}
object OpenedFileInfo {
  
  inline def apply(filePath: String, mode: String, openRequestId: Double): OpenedFileInfo = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenedFileInfo] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOpenRequestId(value: Double): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
