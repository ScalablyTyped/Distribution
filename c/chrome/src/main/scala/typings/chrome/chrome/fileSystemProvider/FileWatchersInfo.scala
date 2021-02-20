package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileWatchersInfo extends StObject {
  
  /** The path of the entry being observed. */
  var entryPath: String = js.native
  
  /** Optional. Tag used by the last notification for the watcher.  */
  var lastTag: js.UndefOr[String] = js.native
  
  /** Whether watching should include all child entries recursively. It can be true for directories only. */
  var recursive: Boolean = js.native
}
object FileWatchersInfo {
  
  @scala.inline
  def apply(entryPath: String, recursive: Boolean): FileWatchersInfo = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileWatchersInfo]
  }
  
  @scala.inline
  implicit class FileWatchersInfoMutableBuilder[Self <: FileWatchersInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTag(value: String): Self = StObject.set(x, "lastTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTagUndefined: Self = StObject.set(x, "lastTag", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
