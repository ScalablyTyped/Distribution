package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActionsRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** The path of the entry to which this operation is related to. */
  var entryPaths: js.Array[String]
}
object GetActionsRequestedEventOptions {
  
  inline def apply(entryPaths: js.Array[String], fileSystemId: String, requestId: integer): GetActionsRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPaths = entryPaths.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActionsRequestedEventOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetActionsRequestedEventOptions] (val x: Self) extends AnyVal {
    
    inline def setEntryPaths(value: js.Array[String]): Self = StObject.set(x, "entryPaths", value.asInstanceOf[js.Any])
    
    inline def setEntryPathsVarargs(value: String*): Self = StObject.set(x, "entryPaths", js.Array(value*))
  }
}
