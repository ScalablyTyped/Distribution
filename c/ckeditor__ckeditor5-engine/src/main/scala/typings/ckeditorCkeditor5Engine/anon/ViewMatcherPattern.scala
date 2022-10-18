package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcViewElementMod.default
import typings.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewMatcherPattern extends StObject {
  
  var converterPriority: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
  ] = js.undefined
  
  var model: String | KeyStringValue
  
  var view: MatcherPattern
}
object ViewMatcherPattern {
  
  inline def apply(model: String | KeyStringValue, view: MatcherPattern): ViewMatcherPattern = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewMatcherPattern]
  }
  
  extension [Self <: ViewMatcherPattern](x: Self) {
    
    inline def setConverterPriority(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
    ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: String | KeyStringValue): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setView(value: MatcherPattern): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewFunction1(value: /* element */ default => scala.Unit | Null | Attribute): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
  }
}
