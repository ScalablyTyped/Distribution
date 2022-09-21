package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.viewElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementMatch extends StObject {
  
  var element: default
  
  var `match`: Attribute
}
object ElementMatch {
  
  inline def apply(element: default, `match`: Attribute): ElementMatch = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementMatch]
  }
  
  extension [Self <: ElementMatch](x: Self) {
    
    inline def setElement(value: default): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: Attribute): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
