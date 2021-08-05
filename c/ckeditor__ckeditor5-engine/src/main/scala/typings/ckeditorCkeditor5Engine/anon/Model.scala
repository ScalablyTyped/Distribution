package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.Element
import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  var model: String | js.Object
  
  var upcastAlso: js.UndefOr[MatcherPattern | js.Array[MatcherPattern]] = js.undefined
  
  var view: js.UndefOr[String | js.Object] = js.undefined
}
object Model {
  
  inline def apply(model: String | js.Object): Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setModel(value: String | js.Object): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setUpcastAlso(value: MatcherPattern | js.Array[MatcherPattern]): Self = StObject.set(x, "upcastAlso", value.asInstanceOf[js.Any])
    
    inline def setUpcastAlsoFunction1(value: /* element */ Element => Null | Attribute): Self = StObject.set(x, "upcastAlso", js.Any.fromFunction1(value))
    
    inline def setUpcastAlsoUndefined: Self = StObject.set(x, "upcastAlso", js.undefined)
    
    inline def setUpcastAlsoVarargs(value: MatcherPattern*): Self = StObject.set(x, "upcastAlso", js.Array(value :_*))
    
    inline def setView(value: String | js.Object): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
