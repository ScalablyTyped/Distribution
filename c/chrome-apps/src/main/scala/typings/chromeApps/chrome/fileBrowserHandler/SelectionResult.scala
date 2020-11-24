package typings.chromeApps.chrome.fileBrowserHandler

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionResult extends js.Object {
  
  /** Selected file entry. It will be null if a file hasn't been selected. */
  var entry: FileEntry | Null = js.native
  
  /** Whether the file has been selected. */
  var success: Boolean = js.native
}
object SelectionResult {
  
  @scala.inline
  def apply(success: Boolean): SelectionResult = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionResult]
  }
  
  @scala.inline
  implicit class SelectionResultOps[Self <: SelectionResult] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntry(value: FileEntry): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryNull: Self = this.set("entry", null)
  }
}
