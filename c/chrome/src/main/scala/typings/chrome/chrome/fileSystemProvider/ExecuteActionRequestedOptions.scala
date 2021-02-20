package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteActionRequestedOptions extends StObject {
  
  /** The identifier of the action to be executed. */
  var actionId: String = js.native
  
  /** The path of the entry to be used for the action. */
  var entryPath: String = js.native
  
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String = js.native
  
  /** The unique identifier of this request. */
  var requestId: Double = js.native
}
object ExecuteActionRequestedOptions {
  
  @scala.inline
  def apply(actionId: String, entryPath: String, fileSystemId: String, requestId: Double): ExecuteActionRequestedOptions = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteActionRequestedOptions]
  }
  
  @scala.inline
  implicit class ExecuteActionRequestedOptionsMutableBuilder[Self <: ExecuteActionRequestedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
