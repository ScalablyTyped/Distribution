package typings.braftEditor.anon

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  def error(err: Msg): Unit = js.native
  
  var file: File = js.native
  
  var libraryId: String = js.native
  
  def progress(progress: Double): Unit = js.native
  
  def success(res: Meta): Unit = js.native
}
object Error {
  
  @scala.inline
  def apply(error: Msg => Unit, file: File, libraryId: String, progress: Double => Unit, success: Meta => Unit): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), file = file.asInstanceOf[js.Any], libraryId = libraryId.asInstanceOf[js.Any], progress = js.Any.fromFunction1(progress), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Msg => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryId(value: String): Self = StObject.set(x, "libraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: Meta => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
