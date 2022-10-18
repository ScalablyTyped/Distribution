package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var converterPriority: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
  ] = js.undefined
  
  var model: String | `10` | `11`
  
  var view: String | KeyName | NameStyles
}
object `12` {
  
  inline def apply(model: String | `10` | `11`, view: String | KeyName | NameStyles): `12` = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setConverterPriority(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
    ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: String | `10` | `11`): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setView(value: String | KeyName | NameStyles): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
