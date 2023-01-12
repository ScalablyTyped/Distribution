package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileWatchersInfo extends StObject {
  
  /** The path of the entry being observed. */
  var entryPath: String
  
  /** Optional. Tag used by the last notification for the watcher.  */
  var lastTag: js.UndefOr[String] = js.undefined
  
  /** Whether watching should include all child entries recursively. It can be true for directories only. */
  var recursive: Boolean
}
object FileWatchersInfo {
  
  inline def apply(entryPath: String, recursive: Boolean): FileWatchersInfo = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileWatchersInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileWatchersInfo] (val x: Self) extends AnyVal {
    
    inline def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
    
    inline def setLastTag(value: String): Self = StObject.set(x, "lastTag", value.asInstanceOf[js.Any])
    
    inline def setLastTagUndefined: Self = StObject.set(x, "lastTag", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
