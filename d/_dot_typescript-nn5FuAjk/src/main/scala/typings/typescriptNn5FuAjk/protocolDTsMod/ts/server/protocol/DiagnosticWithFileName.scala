package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticWithFileName
  extends StObject
     with Diagnostic {
  
  /**
    * Name of the file the diagnostic is in
    */
  var fileName: String
}
object DiagnosticWithFileName {
  
  inline def apply(category: String, end: Location, fileName: String, start: Location, text: String): DiagnosticWithFileName = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticWithFileName]
  }
  
  extension [Self <: DiagnosticWithFileName](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
