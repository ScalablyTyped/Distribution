package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryPathRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** The path of the entry to which this operation is related to. */
  var entryPath: String
}
object EntryPathRequestedEventOptions {
  
  inline def apply(entryPath: String, fileSystemId: String, requestId: Double): EntryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPathRequestedEventOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntryPathRequestedEventOptions] (val x: Self) extends AnyVal {
    
    inline def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
  }
}
