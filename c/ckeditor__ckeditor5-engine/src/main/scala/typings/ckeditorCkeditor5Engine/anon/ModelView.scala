package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.DowncastConversionApi
import typings.ckeditorCkeditor5Engine.srcViewElementdefinitionMod.ElementDefinition
import typings.ckeditorCkeditor5Engine.srcViewUielementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelView extends StObject {
  
  var converterPriority: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
  ] = js.undefined
  
  var model: String
  
  var view: ElementDefinition | (js.Function2[/* data */ Dictkey, /* api */ DowncastConversionApi[Any], default])
}
object ModelView {
  
  inline def apply(
    model: String,
    view: ElementDefinition | (js.Function2[/* data */ Dictkey, /* api */ DowncastConversionApi[Any], default])
  ): ModelView = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelView]
  }
  
  extension [Self <: ModelView](x: Self) {
    
    inline def setConverterPriority(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
    ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setView(
      value: ElementDefinition | (js.Function2[/* data */ Dictkey, /* api */ DowncastConversionApi[Any], default])
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewFunction2(value: (/* data */ Dictkey, /* api */ DowncastConversionApi[Any]) => default): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
  }
}
