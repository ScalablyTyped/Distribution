package typings.ckeditorCkeditor5Engine.mod.conversion

import typings.ckeditorCkeditor5Engine.anon.Attribute
import typings.ckeditorCkeditor5Engine.mod.view.Element
import typings.ckeditorCkeditor5Engine.mod.view.ElementDefinition
import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterDefinition extends js.Object {
  var converterPriority: PriorityString = js.native
  var model: js.Any = js.native
  var upcastAlso: MatcherPattern | js.Array[MatcherPattern] = js.native
  var view: ElementDefinition | js.Object = js.native
}

object ConverterDefinition {
  @scala.inline
  def apply(
    converterPriority: PriorityString,
    model: js.Any,
    upcastAlso: MatcherPattern | js.Array[MatcherPattern],
    view: ElementDefinition | js.Object
  ): ConverterDefinition = {
    val __obj = js.Dynamic.literal(converterPriority = converterPriority.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], upcastAlso = upcastAlso.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterDefinition]
  }
  @scala.inline
  implicit class ConverterDefinitionOps[Self <: ConverterDefinition] (val x: Self) extends AnyVal {
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
    def setConverterPriority(value: PriorityString): Self = this.set("converterPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpcastAlsoVarargs(value: MatcherPattern*): Self = this.set("upcastAlso", js.Array(value :_*))
    @scala.inline
    def setUpcastAlsoFunction1(value: /* element */ Element => Null | Attribute): Self = this.set("upcastAlso", js.Any.fromFunction1(value))
    @scala.inline
    def setUpcastAlso(value: MatcherPattern | js.Array[MatcherPattern]): Self = this.set("upcastAlso", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: ElementDefinition | js.Object): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

