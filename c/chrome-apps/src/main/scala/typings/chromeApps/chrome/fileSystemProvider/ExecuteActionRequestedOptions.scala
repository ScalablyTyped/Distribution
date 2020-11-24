package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since Chrome 45. */
@js.native
trait ExecuteActionRequestedOptions extends js.Object {
  
  /** The identifier of the action to be executed. */
  var actionId: String = js.native
  
  /** The path of the entry to be used for the action. */
  var entryPath: String = js.native
  
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String = js.native
  
  /** The unique identifier of this request. */
  var requestId: integer = js.native
}
object ExecuteActionRequestedOptions {
  
  @scala.inline
  def apply(actionId: String, entryPath: String, fileSystemId: String, requestId: integer): ExecuteActionRequestedOptions = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteActionRequestedOptions]
  }
  
  @scala.inline
  implicit class ExecuteActionRequestedOptionsOps[Self <: ExecuteActionRequestedOptions] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: String): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPath(value: String): Self = this.set("entryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: integer): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
}
