package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.downcastdispatcherMod.DowncastConversionApi
import typings.ckeditorCkeditor5Engine.downcasthelpersMod.HighlightDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConverterPriorityModelView extends StObject {
  
  var converterPriority: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
  ] = js.undefined
  
  var model: String
  
  var view: HighlightDescriptor | (js.Function2[/* data */ Any, /* api */ DowncastConversionApi[Any], HighlightDescriptor])
}
object ConverterPriorityModelView {
  
  inline def apply(
    model: String,
    view: HighlightDescriptor | (js.Function2[/* data */ Any, /* api */ DowncastConversionApi[Any], HighlightDescriptor])
  ): ConverterPriorityModelView = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterPriorityModelView]
  }
  
  extension [Self <: ConverterPriorityModelView](x: Self) {
    
    inline def setConverterPriority(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
    ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setView(
      value: HighlightDescriptor | (js.Function2[/* data */ Any, /* api */ DowncastConversionApi[Any], HighlightDescriptor])
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewFunction2(value: (/* data */ Any, /* api */ DowncastConversionApi[Any]) => HighlightDescriptor): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
  }
}
