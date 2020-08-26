package typings.bootstrapColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorPicker extends js.Object {
  var color: Color = js.native
  var component: Boolean = js.native
  var container: Boolean = js.native
  var disabled: Boolean = js.native
  var element: JQuery = js.native
  var format: String = js.native
  var input: JQuery = js.native
  var options: ColorPickerOptions = js.native
  var picker: JQuery = js.native
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
  @scala.inline
  implicit class ColorPickerOps[Self <: ColorPicker] (val x: Self) extends AnyVal {
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: Boolean): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: JQuery): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: JQuery): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: ColorPickerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicker(value: JQuery): Self = this.set("picker", value.asInstanceOf[js.Any])
  }
  
}

