package typings.braftEditor.anon

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  def error(err: Msg): Unit
  
  var file: File
  
  var libraryId: String
  
  def progress(progress: Double): Unit
  
  def success(res: Meta): Unit
}
object Error {
  
  inline def apply(error: Msg => Unit, file: File, libraryId: String, progress: Double => Unit, success: Meta => Unit): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), file = file.asInstanceOf[js.Any], libraryId = libraryId.asInstanceOf[js.Any], progress = js.Any.fromFunction1(progress), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: Msg => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setLibraryId(value: String): Self = StObject.set(x, "libraryId", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: Meta => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
