package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.matcherMod.MatcherPattern
import typings.ckeditorCkeditor5Engine.viewElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelViewMatcherPattern extends StObject {
  
  var model: String | (js.Function1[/* el */ default, String])
  
  var view: MatcherPattern
}
object ModelViewMatcherPattern {
  
  inline def apply(model: String | (js.Function1[/* el */ default, String]), view: MatcherPattern): ModelViewMatcherPattern = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelViewMatcherPattern]
  }
  
  extension [Self <: ModelViewMatcherPattern](x: Self) {
    
    inline def setModel(value: String | (js.Function1[/* el */ default, String])): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelFunction1(value: /* el */ default => String): Self = StObject.set(x, "model", js.Any.fromFunction1(value))
    
    inline def setView(value: MatcherPattern): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewFunction1(value: /* element */ default => scala.Unit | Null | Attribute): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
  }
}
