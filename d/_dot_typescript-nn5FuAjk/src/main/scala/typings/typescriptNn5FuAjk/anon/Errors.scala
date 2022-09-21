package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.CompilerOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: Array[Diagnostic]
  
  var options: CompilerOptions
}
object Errors {
  
  inline def apply(errors: Array[Diagnostic], options: CompilerOptions): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
