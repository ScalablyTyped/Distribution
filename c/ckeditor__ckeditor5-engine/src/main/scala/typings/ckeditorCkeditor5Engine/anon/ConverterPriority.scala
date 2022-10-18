package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConverterPriority extends StObject {
  
  var converterPriority: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
  ] = js.undefined
  
  var model: String | Values
  
  var view: String | KeyValue | (js.Function1[/* modelAttributeValue */ Any, KeyString])
}
object ConverterPriority {
  
  inline def apply(
    model: String | Values,
    view: String | KeyValue | (js.Function1[/* modelAttributeValue */ Any, KeyString])
  ): ConverterPriority = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterPriority]
  }
  
  extension [Self <: ConverterPriority](x: Self) {
    
    inline def setConverterPriority(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
    ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: String | Values): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setView(value: String | KeyValue | (js.Function1[/* modelAttributeValue */ Any, KeyString])): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewFunction1(value: /* modelAttributeValue */ Any => KeyString): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
  }
}
