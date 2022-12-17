package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.19`
import typings.carbonElements.carbonElementsStrings.`2Dot625rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var fontSize: `2Dot625rem`
  
  var lineHeight: `1.19`
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal(fontSize = "2.625rem", lineHeight = 1.19d)
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setFontSize(value: `2Dot625rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.19`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
