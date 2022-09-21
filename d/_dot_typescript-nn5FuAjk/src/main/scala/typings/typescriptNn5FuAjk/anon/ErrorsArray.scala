package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.ts.Diagnostic
import typings.typescriptNn5FuAjk.ts.TypeAcquisition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorsArray extends StObject {
  
  var errors: Array[Diagnostic]
  
  var options: TypeAcquisition
}
object ErrorsArray {
  
  inline def apply(errors: Array[Diagnostic], options: TypeAcquisition): ErrorsArray = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorsArray]
  }
  
  extension [Self <: ErrorsArray](x: Self) {
    
    inline def setErrors(value: Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TypeAcquisition): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
