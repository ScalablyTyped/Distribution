package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.28572`
import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsStrings.`1Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsFontSize extends StObject {
  
  var breakpoints: MaxFontSizeFontWeight
  
  var fontSize: `1Dot75rem`
  
  var fontWeight: `400`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.28572`
}
object BreakpointsFontSize {
  
  inline def apply(breakpoints: MaxFontSizeFontWeight): BreakpointsFontSize = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], fontSize = "1.75rem", fontWeight = 400, letterSpacing = 0, lineHeight = 1.28572d)
    __obj.asInstanceOf[BreakpointsFontSize]
  }
  
  extension [Self <: BreakpointsFontSize](x: Self) {
    
    inline def setBreakpoints(value: MaxFontSizeFontWeight): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `1Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.28572`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
