package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.17`
import typings.carbonElements.carbonElementsStrings.`3rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  var fontSize: `3rem`
  
  var lineHeight: `1.17`
}
object `41` {
  
  inline def apply(): `41` = {
    val __obj = js.Dynamic.literal(fontSize = "3rem", lineHeight = 1.17d)
    __obj.asInstanceOf[`41`]
  }
  
  extension [Self <: `41`](x: Self) {
    
    inline def setFontSize(value: `3rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.17`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
