package typings.chrome.chrome.fileBrowserHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileHandlerExecuteEventDetails extends js.Object {
  
  /** Array of Entry instances representing files that are targets of this action (selected in ChromeOS file browser). */
  var entries: js.Array[_] = js.native
  
  /** Optional. The ID of the tab that raised this event. Tab IDs are unique within a browser session.  */
  var tab_id: js.UndefOr[Double] = js.native
}
object FileHandlerExecuteEventDetails {
  
  @scala.inline
  def apply(entries: js.Array[_]): FileHandlerExecuteEventDetails = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileHandlerExecuteEventDetails]
  }
  
  @scala.inline
  implicit class FileHandlerExecuteEventDetailsOps[Self <: FileHandlerExecuteEventDetails] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: js.Any*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[_]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab_id(value: Double): Self = this.set("tab_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTab_id: Self = this.set("tab_id", js.undefined)
  }
}
