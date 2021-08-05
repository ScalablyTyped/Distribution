package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDirectionsStepWarning extends StObject {
  
  /** Where the warning starts. */
  var origin: String
  
  /** The severity of the warning. Values can be: Low Impact, Minor, Moderate, Serious or None. */
  var severity: String
  
  /** The warning text. */
  var text: String
  
  /** Where the warning ends. */
  var to: String
  
  /** The type of warning. A list of Warning type values can be found here: https://msdn.microsoft.com/en-us/library/hh441731.aspx */
  var warningType: String
}
object IDirectionsStepWarning {
  
  inline def apply(origin: String, severity: String, text: String, to: String, warningType: String): IDirectionsStepWarning = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], warningType = warningType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsStepWarning]
  }
  
  extension [Self <: IDirectionsStepWarning](x: Self) {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setWarningType(value: String): Self = StObject.set(x, "warningType", value.asInstanceOf[js.Any])
  }
}
