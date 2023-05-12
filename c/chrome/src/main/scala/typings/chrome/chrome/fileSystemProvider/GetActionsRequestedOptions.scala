package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActionsRequestedOptions extends StObject {
  
  /** List of paths of entries for the list of actions. */
  var entryPaths: js.Array[String]
  
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String
  
  /** The unique identifier of this request. */
  var requestId: Double
}
object GetActionsRequestedOptions {
  
  inline def apply(entryPaths: js.Array[String], fileSystemId: String, requestId: Double): GetActionsRequestedOptions = {
    val __obj = js.Dynamic.literal(entryPaths = entryPaths.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActionsRequestedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetActionsRequestedOptions] (val x: Self) extends AnyVal {
    
    inline def setEntryPaths(value: js.Array[String]): Self = StObject.set(x, "entryPaths", value.asInstanceOf[js.Any])
    
    inline def setEntryPathsVarargs(value: String*): Self = StObject.set(x, "entryPaths", js.Array(value*))
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
