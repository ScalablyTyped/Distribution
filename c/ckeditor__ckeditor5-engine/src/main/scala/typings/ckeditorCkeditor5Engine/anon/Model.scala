package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.Element
import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  var model: String | js.Object = js.native
  
  var upcastAlso: js.UndefOr[MatcherPattern | js.Array[MatcherPattern]] = js.native
  
  var view: js.UndefOr[String | js.Object] = js.native
}
object Model {
  
  @scala.inline
  def apply(model: String | js.Object): Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModel(value: String | js.Object): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpcastAlsoVarargs(value: MatcherPattern*): Self = this.set("upcastAlso", js.Array(value :_*))
    
    @scala.inline
    def setUpcastAlsoFunction1(value: /* element */ Element => Null | Attribute): Self = this.set("upcastAlso", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpcastAlso(value: MatcherPattern | js.Array[MatcherPattern]): Self = this.set("upcastAlso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpcastAlso: Self = this.set("upcastAlso", js.undefined)
    
    @scala.inline
    def setView(value: String | js.Object): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
