package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.16`
import typings.carbonElements.carbonElementsStrings.`-0Dot64px`
import typings.carbonElements.carbonElementsStrings.`3Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var fontSize: `3Dot75rem`
  
  var letterSpacing: `-0Dot64px`
  
  var lineHeight: `1.16`
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal(fontSize = "3.75rem", letterSpacing = "-0.64px", lineHeight = 1.16d)
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `39`] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: `3Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `-0Dot64px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.16`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
