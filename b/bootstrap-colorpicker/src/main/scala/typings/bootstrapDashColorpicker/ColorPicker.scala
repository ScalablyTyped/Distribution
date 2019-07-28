package typings.bootstrapDashColorpicker

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
    val __obj = js.Dynamic.literal(color = color, component = component, container = container, disabled = disabled, element = element, format = format, input = input, options = options, picker = picker)
  
    __obj.asInstanceOf[ColorPicker]
  }
}

