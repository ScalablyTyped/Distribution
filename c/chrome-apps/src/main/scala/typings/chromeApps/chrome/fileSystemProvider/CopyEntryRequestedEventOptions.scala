package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyEntryRequestedEventOptions extends RequestedEventOptions {
  
  /** The source path for the operation. */
  var sourcePath: String = js.native
  
  /** The destination path for the operation. */
  var targetPath: String = js.native
}
object CopyEntryRequestedEventOptions {
  
  @scala.inline
  def apply(fileSystemId: String, requestId: integer, sourcePath: String, targetPath: String): CopyEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyEntryRequestedEventOptions]
  }
  
  @scala.inline
  implicit class CopyEntryRequestedEventOptionsMutableBuilder[Self <: CopyEntryRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
  }
}
