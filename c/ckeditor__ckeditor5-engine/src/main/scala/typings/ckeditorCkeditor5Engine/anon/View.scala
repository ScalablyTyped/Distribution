package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.Element
import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.native
  var model: String | Value = js.native
  var view: MatcherPattern = js.native
}

object View {
  @scala.inline
  def apply(model: String | Value, view: MatcherPattern): View = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
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
    def setModel(value: String | Value): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewFunction1(value: /* element */ Element => Null | Attribute): Self = this.set("view", js.Any.fromFunction1(value))
    @scala.inline
    def setView(value: MatcherPattern): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setConverterPriority(value: PriorityString): Self = this.set("converterPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverterPriority: Self = this.set("converterPriority", js.undefined)
  }
  
}

