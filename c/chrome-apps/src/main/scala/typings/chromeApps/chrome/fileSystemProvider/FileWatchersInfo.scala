package typings.chromeApps.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileWatchersInfo extends js.Object {
  
  /** The path of the entry being observed. */
  var entryPath: String = js.native
  
  /** Tag used by the last notification for the watcher.  */
  var lastTag: js.UndefOr[String] = js.native
  
  /**
    * Whether watching should include all child entries recursively.
    * It can be true for directories only.
    */
  var recursive: Boolean = js.native
}
object FileWatchersInfo {
  
  @scala.inline
  def apply(entryPath: String, recursive: Boolean): FileWatchersInfo = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileWatchersInfo]
  }
  
  @scala.inline
  implicit class FileWatchersInfoOps[Self <: FileWatchersInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntryPath(value: String): Self = this.set("entryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTag(value: String): Self = this.set("lastTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastTag: Self = this.set("lastTag", js.undefined)
  }
}
