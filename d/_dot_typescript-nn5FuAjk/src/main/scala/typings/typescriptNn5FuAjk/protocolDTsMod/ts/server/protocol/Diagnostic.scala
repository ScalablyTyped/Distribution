package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Item of diagnostic information found in a DiagnosticEvent message.
  */
trait Diagnostic extends StObject {
  
  /**
    * The category of the diagnostic message, e.g. "error", "warning", or "suggestion".
    */
  var category: String
  
  /**
    * The error code of the diagnostic message.
    */
  var code: js.UndefOr[Double] = js.undefined
  
  /**
    * The last file location at which the text applies.
    */
  var end: Location
  
  /**
    * Any related spans the diagnostic may have, such as other locations relevant to an error, such as declarartion sites
    */
  var relatedInformation: js.UndefOr[Array[DiagnosticRelatedInformation]] = js.undefined
  
  var reportsDeprecated: js.UndefOr[js.Object] = js.undefined
  
  var reportsUnnecessary: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The name of the plugin reporting the message.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Starting file location at which text applies.
    */
  var start: Location
  
  /**
    * Text of diagnostic message.
    */
  var text: String
}
object Diagnostic {
  
  inline def apply(category: String, end: Location, start: Location, text: String): Diagnostic = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
  
  extension [Self <: Diagnostic](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setEnd(value: Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setRelatedInformation(value: Array[DiagnosticRelatedInformation]): Self = StObject.set(x, "relatedInformation", value.asInstanceOf[js.Any])
    
    inline def setRelatedInformationUndefined: Self = StObject.set(x, "relatedInformation", js.undefined)
    
    inline def setReportsDeprecated(value: js.Object): Self = StObject.set(x, "reportsDeprecated", value.asInstanceOf[js.Any])
    
    inline def setReportsDeprecatedUndefined: Self = StObject.set(x, "reportsDeprecated", js.undefined)
    
    inline def setReportsUnnecessary(value: js.Object): Self = StObject.set(x, "reportsUnnecessary", value.asInstanceOf[js.Any])
    
    inline def setReportsUnnecessaryUndefined: Self = StObject.set(x, "reportsUnnecessary", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStart(value: Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
