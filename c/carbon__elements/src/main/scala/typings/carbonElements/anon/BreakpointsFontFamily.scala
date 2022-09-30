package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.3`
import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsStrings.`1Dot25rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsFontFamily extends StObject {
  
  var breakpoints: MaxMd
  
  var fontFamily: String
  
  var fontSize: `1Dot25rem`
  
  var fontWeight: `400`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.3`
}
object BreakpointsFontFamily {
  
  inline def apply(breakpoints: MaxMd): BreakpointsFontFamily = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], fontFamily = "'IBM Plex Serif', 'Georgia', Times, serif", fontSize = "1.25rem", fontWeight = 400, letterSpacing = 0, lineHeight = 1.3d)
    __obj.asInstanceOf[BreakpointsFontFamily]
  }
  
  extension [Self <: BreakpointsFontFamily](x: Self) {
    
    inline def setBreakpoints(value: MaxMd): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `1Dot25rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.3`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
