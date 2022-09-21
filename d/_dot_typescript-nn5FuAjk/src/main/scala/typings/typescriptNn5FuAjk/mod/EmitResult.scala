package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitResult extends StObject {
  
  /** Contains declaration emit diagnostics */
  var diagnostics: Array[Diagnostic]
  
  var emitSkipped: Boolean
  
  var emittedFiles: js.UndefOr[Array[java.lang.String]] = js.undefined
}
object EmitResult {
  
  inline def apply(diagnostics: Array[Diagnostic], emitSkipped: Boolean): EmitResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], emitSkipped = emitSkipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitResult]
  }
  
  extension [Self <: EmitResult](x: Self) {
    
    inline def setDiagnostics(value: Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setEmitSkipped(value: Boolean): Self = StObject.set(x, "emitSkipped", value.asInstanceOf[js.Any])
    
    inline def setEmittedFiles(value: Array[java.lang.String]): Self = StObject.set(x, "emittedFiles", value.asInstanceOf[js.Any])
    
    inline def setEmittedFilesUndefined: Self = StObject.set(x, "emittedFiles", js.undefined)
  }
}
