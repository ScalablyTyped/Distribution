package typings.chrome.chrome.downloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadFilenameSuggestion extends StObject {
  
  /** Optional. The action to take if filename already exists.  */
  var conflictAction: js.UndefOr[String] = js.undefined
  
  /** The DownloadItem's new target DownloadItem.filename, as a path relative to the user's default Downloads directory, possibly containing subdirectories. Absolute paths, empty paths, and paths containing back-references ".." will be ignored. */
  var filename: String
}
object DownloadFilenameSuggestion {
  
  inline def apply(filename: String): DownloadFilenameSuggestion = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFilenameSuggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadFilenameSuggestion] (val x: Self) extends AnyVal {
    
    inline def setConflictAction(value: String): Self = StObject.set(x, "conflictAction", value.asInstanceOf[js.Any])
    
    inline def setConflictActionUndefined: Self = StObject.set(x, "conflictAction", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
  }
}
