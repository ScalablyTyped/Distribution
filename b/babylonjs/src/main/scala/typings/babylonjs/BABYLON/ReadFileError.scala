package typings.babylonjs.BABYLON

import typings.std.Error
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadFileError
  extends StObject
     with Error {
  
  var file: File
}
object ReadFileError {
  
  inline def apply(file: File, message: String, name: String): ReadFileError = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileError]
  }
  
  extension [Self <: ReadFileError](x: Self) {
    
    inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
