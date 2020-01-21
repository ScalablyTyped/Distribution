package typings.bootstrapColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrapColorpicker.bootstrapColorpickerStrings.hex
  - typings.bootstrapColorpicker.bootstrapColorpickerStrings.rgb
  - typings.bootstrapColorpicker.bootstrapColorpickerStrings.rgba
*/
trait ColorFormat extends js.Object

object ColorFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.bootstrapColorpicker.bootstrapColorpickerStrings.hex = this.cast("hex")
  @scala.inline
  def rgb: typings.bootstrapColorpicker.bootstrapColorpickerStrings.rgb = this.cast("rgb")
  @scala.inline
  def rgba: typings.bootstrapColorpicker.bootstrapColorpickerStrings.rgba = this.cast("rgba")
}

