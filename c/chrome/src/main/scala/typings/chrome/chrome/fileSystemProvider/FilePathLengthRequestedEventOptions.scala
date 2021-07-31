package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePathLengthRequestedEventOptions
  extends StObject
     with FilePathRequestedEventOptions {
  
  /** Number of bytes to be retained after the operation completes. */
  var length: Double
}
object FilePathLengthRequestedEventOptions {
  
  @scala.inline
  def apply(filePath: String, fileSystemId: String, length: Double, requestId: Double): FilePathLengthRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathLengthRequestedEventOptions]
  }
  
  @scala.inline
  implicit class FilePathLengthRequestedEventOptionsMutableBuilder[Self <: FilePathLengthRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
