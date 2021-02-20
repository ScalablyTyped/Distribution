package typings.babylonjs.BABYLON

import typings.std.Error
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadFileError extends Error {
  
  var file: js.UndefOr[File] = js.native
  
  var request: js.UndefOr[WebRequest] = js.native
}
object LoadFileError {
  
  @scala.inline
  def apply(message: String, name: String): LoadFileError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadFileError]
  }
  
  @scala.inline
  implicit class LoadFileErrorMutableBuilder[Self <: LoadFileError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setRequest(value: WebRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
