package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.05`
import typings.carbonElements.carbonElementsStrings.`-0Dot96px`
import typings.carbonElements.carbonElementsStrings.`9Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var fontSize: `9Dot75rem`
  
  var letterSpacing: `-0Dot96px`
  
  var lineHeight: `1.05`
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal(fontSize = "9.75rem", letterSpacing = "-0.96px", lineHeight = 1.05d)
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `45`] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: `9Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `-0Dot96px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.05`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
