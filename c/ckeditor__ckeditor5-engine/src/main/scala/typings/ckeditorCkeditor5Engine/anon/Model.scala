package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcViewElementMod.default
import typings.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  var model: String | Key
  
  var upcastAlso: js.UndefOr[MatcherPattern | js.Array[MatcherPattern]] = js.undefined
  
  var view: String | (Record[String, Name])
}
object Model {
  
  inline def apply(model: String | Key, view: String | (Record[String, Name])): Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setModel(value: String | Key): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setUpcastAlso(value: MatcherPattern | js.Array[MatcherPattern]): Self = StObject.set(x, "upcastAlso", value.asInstanceOf[js.Any])
    
    inline def setUpcastAlsoFunction1(value: /* element */ default => scala.Unit | Null | Attribute): Self = StObject.set(x, "upcastAlso", js.Any.fromFunction1(value))
    
    inline def setUpcastAlsoUndefined: Self = StObject.set(x, "upcastAlso", js.undefined)
    
    inline def setUpcastAlsoVarargs(value: MatcherPattern*): Self = StObject.set(x, "upcastAlso", js.Array(value*))
    
    inline def setView(value: String | (Record[String, Name])): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
