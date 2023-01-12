package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.11`
import typings.carbonElements.carbonElementsStrings.`-0Dot64px`
import typings.carbonElements.carbonElementsStrings.`5Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43` extends StObject {
  
  var fontSize: `5Dot75rem`
  
  var letterSpacing: `-0Dot64px`
  
  var lineHeight: `1.11`
}
object `43` {
  
  inline def apply(): `43` = {
    val __obj = js.Dynamic.literal(fontSize = "5.75rem", letterSpacing = "-0.64px", lineHeight = 1.11d)
    __obj.asInstanceOf[`43`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `43`] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: `5Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `-0Dot64px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.11`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
