package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.25`
import typings.carbonElements.carbonElementsStrings.`2rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsFontSizeFontWeight extends StObject {
  
  var breakpoints: Lg
  
  var fontSize: `2rem`
  
  var fontWeight: typings.carbonElements.carbonElementsInts.`300`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.25`
}
object BreakpointsFontSizeFontWeight {
  
  inline def apply(breakpoints: Lg): BreakpointsFontSizeFontWeight = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], fontSize = "2rem", fontWeight = 300, letterSpacing = 0, lineHeight = 1.25d)
    __obj.asInstanceOf[BreakpointsFontSizeFontWeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreakpointsFontSizeFontWeight] (val x: Self) extends AnyVal {
    
    inline def setBreakpoints(value: Lg): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `2rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: typings.carbonElements.carbonElementsInts.`300`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.25`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
