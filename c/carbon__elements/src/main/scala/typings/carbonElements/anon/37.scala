package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.16`
import typings.carbonElements.carbonElementsStrings.`3Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  var fontSize: `3Dot75rem`
  
  var lineHeight: `1.16`
}
object `37` {
  
  inline def apply(): `37` = {
    val __obj = js.Dynamic.literal(fontSize = "3.75rem", lineHeight = 1.16d)
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `37`] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: `3Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.16`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
