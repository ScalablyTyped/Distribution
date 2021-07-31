package typings.carbonComponentsReact.anon

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddedFiles extends StObject {
  
  var addedFiles: js.Array[File]
}
object AddedFiles {
  
  @scala.inline
  def apply(addedFiles: js.Array[File]): AddedFiles = {
    val __obj = js.Dynamic.literal(addedFiles = addedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedFiles]
  }
  
  @scala.inline
  implicit class AddedFilesMutableBuilder[Self <: AddedFiles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedFiles(value: js.Array[File]): Self = StObject.set(x, "addedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedFilesVarargs(value: File*): Self = StObject.set(x, "addedFiles", js.Array(value :_*))
  }
}
