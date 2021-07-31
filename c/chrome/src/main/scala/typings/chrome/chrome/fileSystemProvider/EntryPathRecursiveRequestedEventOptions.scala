package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryPathRecursiveRequestedEventOptions
  extends StObject
     with EntryPathRequestedEventOptions {
  
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean
}
object EntryPathRecursiveRequestedEventOptions {
  
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, recursive: Boolean, requestId: Double): EntryPathRecursiveRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPathRecursiveRequestedEventOptions]
  }
  
  @scala.inline
  implicit class EntryPathRecursiveRequestedEventOptionsMutableBuilder[Self <: EntryPathRecursiveRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
