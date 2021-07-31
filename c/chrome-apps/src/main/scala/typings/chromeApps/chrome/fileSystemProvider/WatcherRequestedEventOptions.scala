package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.EntryPathRequestedEventOptions
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherRequestedEventOptions
  extends StObject
     with EntryPathRequestedEventOptions {
  
  /**
    * Mode of the watcher.
    * Whether observing should include all child entries recursively.
    * It can be true for directories only.
    */
  var recursive: Boolean
}
object WatcherRequestedEventOptions {
  
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): WatcherRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherRequestedEventOptions]
  }
  
  @scala.inline
  implicit class WatcherRequestedEventOptionsMutableBuilder[Self <: WatcherRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
