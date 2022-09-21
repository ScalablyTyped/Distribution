package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents additional spans returned with a diagnostic which are relevant to it
  */
trait DiagnosticRelatedInformation extends StObject {
  
  /**
    * The category of the related information message, e.g. "error", "warning", or "suggestion".
    */
  var category: String
  
  /**
    * The code used ot identify the related information
    */
  var code: Double
  
  /**
    * Text of related or additional information.
    */
  var message: String
  
  /**
    * Associated location
    */
  var span: js.UndefOr[FileSpan] = js.undefined
}
object DiagnosticRelatedInformation {
  
  inline def apply(category: String, code: Double, message: String): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
  
  extension [Self <: DiagnosticRelatedInformation](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSpan(value: FileSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
