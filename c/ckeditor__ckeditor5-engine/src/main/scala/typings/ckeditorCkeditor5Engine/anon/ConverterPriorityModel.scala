package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConverterPriorityModel extends StObject {
  
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  
  var model: String | Element | js.Function
  
  var view: MatcherPattern
}
object ConverterPriorityModel {
  
  inline def apply(model: String | Element | js.Function, view: MatcherPattern): ConverterPriorityModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterPriorityModel]
  }
  
  extension [Self <: ConverterPriorityModel](x: Self) {
    
    inline def setConverterPriority(value: PriorityString): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: String | Element | js.Function): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setView(value: MatcherPattern): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewFunction1(value: /* element */ typings.ckeditorCkeditor5Engine.mod.view.Element => Null | Attribute): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
  }
}
