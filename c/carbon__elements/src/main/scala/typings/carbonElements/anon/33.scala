package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.199`
import typings.carbonElements.carbonElementsStrings.`3Dot375rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  var fontSize: `3Dot375rem`
  
  var fontWeight: typings.carbonElements.carbonElementsInts.`300`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.199`
}
object `33` {
  
  inline def apply(): `33` = {
    val __obj = js.Dynamic.literal(fontSize = "3.375rem", fontWeight = 300, letterSpacing = 0, lineHeight = 1.199d)
    __obj.asInstanceOf[`33`]
  }
  
  extension [Self <: `33`](x: Self) {
    
    inline def setFontSize(value: `3Dot375rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: typings.carbonElements.carbonElementsInts.`300`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.199`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
