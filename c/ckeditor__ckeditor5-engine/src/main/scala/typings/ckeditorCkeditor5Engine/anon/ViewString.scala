package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.upcastdispatcherMod.UpcastConversionApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewString extends StObject {
  
  var converterPriority: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
  ] = js.undefined
  
  var model: js.UndefOr[js.Function2[/* name */ String, /* api */ UpcastConversionApi, String]] = js.undefined
  
  var view: String
}
object ViewString {
  
  inline def apply(view: String): ViewString = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewString]
  }
  
  extension [Self <: ViewString](x: Self) {
    
    inline def setConverterPriority(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
    ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: (/* name */ String, /* api */ UpcastConversionApi) => String): Self = StObject.set(x, "model", js.Any.fromFunction2(value))
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
