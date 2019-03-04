package typings
package bootstrapDashColorpickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPicker extends js.Object {
  var color: Color
  var component: scala.Boolean
  var container: scala.Boolean
  var disabled: scala.Boolean
  var element: JQuery
  var format: java.lang.String
  var input: JQuery
  var options: ColorPickerOptions
  var picker: JQuery
}

object ColorPicker {
  @scala.inline
  def apply(
    color: Color,
    component: scala.Boolean,
    container: scala.Boolean,
    disabled: scala.Boolean,
    element: JQuery,
    format: java.lang.String,
    input: JQuery,
    options: ColorPickerOptions,
    picker: JQuery
  ): ColorPicker = {
    val __obj = js.Dynamic.literal(color = color, component = component, container = container, disabled = disabled, element = element, format = format, input = input, options = options, picker = picker)
  
    __obj.asInstanceOf[ColorPicker]
  }
}

