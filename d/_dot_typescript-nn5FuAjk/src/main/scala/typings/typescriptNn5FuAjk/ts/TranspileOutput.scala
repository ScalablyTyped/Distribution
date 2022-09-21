package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranspileOutput extends StObject {
  
  var diagnostics: js.UndefOr[Array[Diagnostic]] = js.undefined
  
  var outputText: java.lang.String
  
  var sourceMapText: js.UndefOr[java.lang.String] = js.undefined
}
object TranspileOutput {
  
  inline def apply(outputText: java.lang.String): TranspileOutput = {
    val __obj = js.Dynamic.literal(outputText = outputText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranspileOutput]
  }
  
  extension [Self <: TranspileOutput](x: Self) {
    
    inline def setDiagnostics(value: Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setOutputText(value: java.lang.String): Self = StObject.set(x, "outputText", value.asInstanceOf[js.Any])
    
    inline def setSourceMapText(value: java.lang.String): Self = StObject.set(x, "sourceMapText", value.asInstanceOf[js.Any])
    
    inline def setSourceMapTextUndefined: Self = StObject.set(x, "sourceMapText", js.undefined)
  }
}
