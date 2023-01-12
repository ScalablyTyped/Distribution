package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.DowncastConversionApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConverterPriorityModel extends StObject {
  
  var converterPriority: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
  ] = js.undefined
  
  var model: String
  
  var view: js.UndefOr[
    js.Function2[/* markerName */ String, /* api */ DowncastConversionApi[Any], Group]
  ] = js.undefined
}
object ConverterPriorityModel {
  
  inline def apply(model: String): ConverterPriorityModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterPriorityModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConverterPriorityModel] (val x: Self) extends AnyVal {
    
    inline def setConverterPriority(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
    ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setView(value: (/* markerName */ String, /* api */ DowncastConversionApi[Any]) => Group): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
