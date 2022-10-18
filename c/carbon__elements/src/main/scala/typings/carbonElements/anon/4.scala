package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.15`
import typings.carbonElements.carbonElementsStrings.`4Dot25rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var fontSize: `4Dot25rem`
  
  var lineHeight: `1.15`
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal(fontSize = "4.25rem", lineHeight = 1.15d)
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setFontSize(value: `4Dot25rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.15`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
