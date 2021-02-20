package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.EntryPathRequestedEventOptions
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEntryRequestedEventOptions extends EntryPathRequestedEventOptions {
  
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean = js.native
}
object DeleteEntryRequestedEventOptions {
  
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): DeleteEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntryRequestedEventOptions]
  }
  
  @scala.inline
  implicit class DeleteEntryRequestedEventOptionsMutableBuilder[Self <: DeleteEntryRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
