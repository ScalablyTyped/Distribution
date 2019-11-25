package typings.bootstrapDashColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrapDashColorpicker.bootstrapDashColorpickerStrings.hex
  - typings.bootstrapDashColorpicker.bootstrapDashColorpickerStrings.rgb
  - typings.bootstrapDashColorpicker.bootstrapDashColorpickerStrings.rgba
*/
trait ColorFormat extends js.Object

object ColorFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.bootstrapDashColorpicker.bootstrapDashColorpickerStrings.hex = this.cast("hex")
  @scala.inline
  def rgb: typings.bootstrapDashColorpicker.bootstrapDashColorpickerStrings.rgb = this.cast("rgb")
  @scala.inline
  def rgba: typings.bootstrapDashColorpicker.bootstrapDashColorpickerStrings.rgba = this.cast("rgba")
}

