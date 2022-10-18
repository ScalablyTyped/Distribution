package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.25`
import typings.carbonElements.carbonElementsInts.`600`
import typings.carbonElements.carbonElementsStrings.`0Dot16px`
import typings.carbonElements.carbonElementsStrings.`0Dot875rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var fontSize: `0Dot875rem`
  
  var fontWeight: `600`
  
  var letterSpacing: `0Dot16px`
  
  var lineHeight: `1.25`
}
object `34` {
  
  inline def apply(): `34` = {
    val __obj = js.Dynamic.literal(fontSize = "0.875rem", fontWeight = 600, letterSpacing = "0.16px", lineHeight = 1.25d)
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setFontSize(value: `0Dot875rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `600`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `0Dot16px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.25`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
