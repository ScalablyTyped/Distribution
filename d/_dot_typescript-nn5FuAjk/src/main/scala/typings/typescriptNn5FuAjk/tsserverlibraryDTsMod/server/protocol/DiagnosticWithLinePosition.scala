package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents diagnostic info that includes location of diagnostic in two forms
  * - start position and length of the error span
  * - startLocation and endLocation - a pair of Location objects that store start/end line and offset of the error span.
  */
trait DiagnosticWithLinePosition extends StObject {
  
  var category: String
  
  var code: Double
  
  var endLocation: Location
  
  var length: Double
  
  var message: String
  
  var relatedInformation: js.UndefOr[Array[DiagnosticRelatedInformation]] = js.undefined
  
  var reportsDeprecated: js.UndefOr[js.Object] = js.undefined
  
  /** May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic. */
  var reportsUnnecessary: js.UndefOr[js.Object] = js.undefined
  
  var start: Double
  
  var startLocation: Location
}
object DiagnosticWithLinePosition {
  
  inline def apply(
    category: String,
    code: Double,
    endLocation: Location,
    length: Double,
    message: String,
    start: Double,
    startLocation: Location
  ): DiagnosticWithLinePosition = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], endLocation = endLocation.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startLocation = startLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticWithLinePosition]
  }
  
  extension [Self <: DiagnosticWithLinePosition](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setEndLocation(value: Location): Self = StObject.set(x, "endLocation", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRelatedInformation(value: Array[DiagnosticRelatedInformation]): Self = StObject.set(x, "relatedInformation", value.asInstanceOf[js.Any])
    
    inline def setRelatedInformationUndefined: Self = StObject.set(x, "relatedInformation", js.undefined)
    
    inline def setReportsDeprecated(value: js.Object): Self = StObject.set(x, "reportsDeprecated", value.asInstanceOf[js.Any])
    
    inline def setReportsDeprecatedUndefined: Self = StObject.set(x, "reportsDeprecated", js.undefined)
    
    inline def setReportsUnnecessary(value: js.Object): Self = StObject.set(x, "reportsUnnecessary", value.asInstanceOf[js.Any])
    
    inline def setReportsUnnecessaryUndefined: Self = StObject.set(x, "reportsUnnecessary", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartLocation(value: Location): Self = StObject.set(x, "startLocation", value.asInstanceOf[js.Any])
  }
}
