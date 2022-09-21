package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.mod.Diagnostic
import typings.typescriptNn5FuAjk.mod.TypeAcquisition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTypeAcquisition extends StObject {
  
  var errors: Array[Diagnostic]
  
  var options: TypeAcquisition
}
object OptionsTypeAcquisition {
  
  inline def apply(errors: Array[Diagnostic], options: TypeAcquisition): OptionsTypeAcquisition = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTypeAcquisition]
  }
  
  extension [Self <: OptionsTypeAcquisition](x: Self) {
    
    inline def setErrors(value: Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TypeAcquisition): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
