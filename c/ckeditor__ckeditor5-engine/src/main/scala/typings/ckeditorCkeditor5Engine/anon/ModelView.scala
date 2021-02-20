package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.Element
import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelView extends StObject {
  
  var converterPriority: js.UndefOr[PriorityString] = js.native
  
  var model: String | js.Function = js.native
  
  var view: MatcherPattern = js.native
}
object ModelView {
  
  @scala.inline
  def apply(model: String | js.Function, view: MatcherPattern): ModelView = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelView]
  }
  
  @scala.inline
  implicit class ModelViewMutableBuilder[Self <: ModelView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverterPriority(value: PriorityString): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    @scala.inline
    def setModel(value: String | js.Function): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: MatcherPattern): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewFunction1(value: /* element */ Element => Null | Attribute): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
  }
}
