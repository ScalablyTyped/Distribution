package typings.bootstrapColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrapColorpicker.bootstrapColorpickerStrings.create
  - typings.bootstrapColorpicker.bootstrapColorpickerStrings.showPicker
  - typings.bootstrapColorpicker.bootstrapColorpickerStrings.hidePicker
  - typings.bootstrapColorpicker.bootstrapColorpickerStrings.changeColor
  - typings.bootstrapColorpicker.bootstrapColorpickerStrings.disable
  - typings.bootstrapColorpicker.bootstrapColorpickerStrings.enable
  - typings.bootstrapColorpicker.bootstrapColorpickerStrings.destroy
*/
trait ColorPickerEvents extends js.Object

object ColorPickerEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def changeColor: typings.bootstrapColorpicker.bootstrapColorpickerStrings.changeColor = this.cast("changeColor")
  @scala.inline
  def create: typings.bootstrapColorpicker.bootstrapColorpickerStrings.create = this.cast("create")
  @scala.inline
  def destroy: typings.bootstrapColorpicker.bootstrapColorpickerStrings.destroy = this.cast("destroy")
  @scala.inline
  def disable: typings.bootstrapColorpicker.bootstrapColorpickerStrings.disable = this.cast("disable")
  @scala.inline
  def enable: typings.bootstrapColorpicker.bootstrapColorpickerStrings.enable = this.cast("enable")
  @scala.inline
  def hidePicker: typings.bootstrapColorpicker.bootstrapColorpickerStrings.hidePicker = this.cast("hidePicker")
  @scala.inline
  def showPicker: typings.bootstrapColorpicker.bootstrapColorpickerStrings.showPicker = this.cast("showPicker")
}

