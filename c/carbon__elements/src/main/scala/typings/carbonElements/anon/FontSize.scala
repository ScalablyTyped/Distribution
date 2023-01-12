package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`16px`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSize extends StObject {
  
  var fontSize: `16px`
}
object FontSize {
  
  inline def apply(): FontSize = {
    val __obj = js.Dynamic.literal(fontSize = "16px")
    __obj.asInstanceOf[FontSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSize] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: `16px`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
