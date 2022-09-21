package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.mod.CompilerOptions
import typings.typescriptNn5FuAjk.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsCompilerOptions extends StObject {
  
  var errors: Array[Diagnostic]
  
  var options: CompilerOptions
}
object OptionsCompilerOptions {
  
  inline def apply(errors: Array[Diagnostic], options: CompilerOptions): OptionsCompilerOptions = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCompilerOptions]
  }
  
  extension [Self <: OptionsCompilerOptions](x: Self) {
    
    inline def setErrors(value: Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
