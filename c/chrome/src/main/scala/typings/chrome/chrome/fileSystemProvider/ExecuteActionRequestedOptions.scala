package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteActionRequestedOptions extends StObject {
  
  /** The identifier of the action to be executed. */
  var actionId: String
  
  /** The set of paths of the entries to be used for the action. */
  var entryPaths: js.Array[String]
  
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String
  
  /** The unique identifier of this request. */
  var requestId: Double
}
object ExecuteActionRequestedOptions {
  
  inline def apply(actionId: String, entryPaths: js.Array[String], fileSystemId: String, requestId: Double): ExecuteActionRequestedOptions = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], entryPaths = entryPaths.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteActionRequestedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteActionRequestedOptions] (val x: Self) extends AnyVal {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setEntryPaths(value: js.Array[String]): Self = StObject.set(x, "entryPaths", value.asInstanceOf[js.Any])
    
    inline def setEntryPathsVarargs(value: String*): Self = StObject.set(x, "entryPaths", js.Array(value*))
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
