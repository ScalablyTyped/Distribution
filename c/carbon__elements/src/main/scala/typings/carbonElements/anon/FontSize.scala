package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`2Dot625rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSize extends StObject {
  
  var fontSize: `2Dot625rem`
}
object FontSize {
  
  inline def apply(): FontSize = {
    val __obj = js.Dynamic.literal(fontSize = "2.625rem")
    __obj.asInstanceOf[FontSize]
  }
  
  extension [Self <: FontSize](x: Self) {
    
    inline def setFontSize(value: `2Dot625rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
