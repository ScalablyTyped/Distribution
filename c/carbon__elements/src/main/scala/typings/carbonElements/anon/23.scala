package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.28572`
import typings.carbonElements.carbonElementsStrings.`1Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var fontSize: `1Dot75rem`
  
  var lineHeight: `1.28572`
}
object `23` {
  
  inline def apply(): `23` = {
    val __obj = js.Dynamic.literal(fontSize = "1.75rem", lineHeight = 1.28572d)
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `23`] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: `1Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.28572`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
