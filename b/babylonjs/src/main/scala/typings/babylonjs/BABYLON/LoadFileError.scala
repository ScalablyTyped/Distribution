package typings.babylonjs.BABYLON

import typings.std.Error
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadFileError
  extends StObject
     with Error {
  
  var file: js.UndefOr[File] = js.undefined
  
  var request: js.UndefOr[WebRequest] = js.undefined
}
object LoadFileError {
  
  inline def apply(message: String, name: String): LoadFileError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadFileError]
  }
  
  extension [Self <: LoadFileError](x: Self) {
    
    inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setRequest(value: WebRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
