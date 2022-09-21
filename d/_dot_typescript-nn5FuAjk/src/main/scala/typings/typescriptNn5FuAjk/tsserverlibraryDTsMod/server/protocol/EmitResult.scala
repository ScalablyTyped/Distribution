package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitResult extends StObject {
  
  var diagnostics: Array[Diagnostic | DiagnosticWithLinePosition]
  
  var emitSkipped: Boolean
}
object EmitResult {
  
  inline def apply(diagnostics: Array[Diagnostic | DiagnosticWithLinePosition], emitSkipped: Boolean): EmitResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], emitSkipped = emitSkipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitResult]
  }
  
  extension [Self <: EmitResult](x: Self) {
    
    inline def setDiagnostics(value: Array[Diagnostic | DiagnosticWithLinePosition]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setEmitSkipped(value: Boolean): Self = StObject.set(x, "emitSkipped", value.asInstanceOf[js.Any])
  }
}
