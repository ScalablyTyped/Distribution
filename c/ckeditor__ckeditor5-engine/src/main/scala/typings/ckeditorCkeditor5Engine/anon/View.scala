package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.attributeelementMod.default
import typings.ckeditorCkeditor5Engine.downcastdispatcherMod.DowncastConversionApi
import typings.ckeditorCkeditor5Engine.elementdefinitionMod.ElementDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  var converterPriority: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
  ] = js.undefined
  
  var model: String | Values
  
  var view: String | ElementDefinition | (js.Function2[/* value */ String, /* api */ DowncastConversionApi[Any], default])
}
object View {
  
  inline def apply(
    model: String | Values,
    view: String | ElementDefinition | (js.Function2[/* value */ String, /* api */ DowncastConversionApi[Any], default])
  ): View = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  extension [Self <: View](x: Self) {
    
    inline def setConverterPriority(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
    ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: String | Values): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setView(
      value: String | ElementDefinition | (js.Function2[/* value */ String, /* api */ DowncastConversionApi[Any], default])
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewFunction2(value: (/* value */ String, /* api */ DowncastConversionApi[Any]) => default): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
  }
}
