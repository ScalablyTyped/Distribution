package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnmountOptions extends StObject {
  
  /** The identifier of the file system to be unmounted. */
  var fileSystemId: String
}
object UnmountOptions {
  
  @scala.inline
  def apply(fileSystemId: String): UnmountOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmountOptions]
  }
  
  @scala.inline
  implicit class UnmountOptionsMutableBuilder[Self <: UnmountOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
  }
}
