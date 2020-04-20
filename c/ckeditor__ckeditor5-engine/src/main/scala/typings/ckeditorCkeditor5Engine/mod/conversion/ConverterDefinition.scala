package typings.ckeditorCkeditor5Engine.mod.conversion

import typings.ckeditorCkeditor5Engine.mod.view.ElementDefinition
import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterDefinition extends js.Object {
  var converterPriority: PriorityString
  var model: js.Any
  var upcastAlso: MatcherPattern | js.Array[MatcherPattern]
  var view: ElementDefinition | js.Object
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
}

