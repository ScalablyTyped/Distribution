package typings.bootstrapColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPicker extends js.Object {
  var color: Color
  var component: Boolean
  var container: Boolean
  var disabled: Boolean
  var element: JQuery
  var format: String
  var input: JQuery
  var options: ColorPickerOptions
  var picker: JQuery
}

object ColorPicker {
  @scala.inline
  def apply(
    color: Color,
    component: Boolean,
    container: Boolean,
    disabled: Boolean,
    element: JQuery,
    format: String,
    input: JQuery,
    options: ColorPickerOptions,
    picker: JQuery
  ): ColorPicker = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorPicker]
  }
}

