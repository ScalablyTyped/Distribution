package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.18`
import typings.carbonElements.carbonElementsStrings.`3Dot375rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var fontSize: `3Dot375rem`
  
  var lineHeight: `1.18`
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal(fontSize = "3.375rem", lineHeight = 1.18d)
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setFontSize(value: `3Dot375rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.18`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
