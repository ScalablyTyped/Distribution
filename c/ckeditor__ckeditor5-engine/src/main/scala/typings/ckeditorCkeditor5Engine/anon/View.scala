package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.Element
import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  
  var model: String | Value
  
  var view: MatcherPattern
}
object View {
  
  inline def apply(model: String | Value, view: MatcherPattern): View = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  extension [Self <: View](x: Self) {
    
    inline def setConverterPriority(value: PriorityString): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: String | Value): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setView(value: MatcherPattern): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewFunction1(value: /* element */ Element => Null | Attribute): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
  }
}
