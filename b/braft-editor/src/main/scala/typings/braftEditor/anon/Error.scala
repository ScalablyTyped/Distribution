package typings.braftEditor.anon

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends js.Object {
  
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
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    
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
    def setError(value: Msg => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryId(value: String): Self = this.set("libraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double => Unit): Self = this.set("progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: Meta => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
