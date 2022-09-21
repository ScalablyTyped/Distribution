package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticEventBody extends StObject {
  
  /**
    * An array of diagnostic information items.
    */
  var diagnostics: Array[Diagnostic]
  
  /**
    * The file for which diagnostic information is reported.
    */
  var file: String
}
object DiagnosticEventBody {
  
  inline def apply(diagnostics: Array[Diagnostic], file: String): DiagnosticEventBody = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticEventBody]
  }
  
  extension [Self <: DiagnosticEventBody](x: Self) {
    
    inline def setDiagnostics(value: Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
