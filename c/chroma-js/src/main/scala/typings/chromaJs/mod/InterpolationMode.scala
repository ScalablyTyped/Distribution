package typings.chromaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromaJs.chromaJsStrings.rgb
  - typings.chromaJs.chromaJsStrings.hsl
  - typings.chromaJs.chromaJsStrings.hsv
  - typings.chromaJs.chromaJsStrings.hsi
  - typings.chromaJs.chromaJsStrings.lab
  - typings.chromaJs.chromaJsStrings.lch
  - typings.chromaJs.chromaJsStrings.hcl
  - typings.chromaJs.chromaJsStrings.lrgb
*/
trait InterpolationMode extends js.Object

object InterpolationMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hcl: typings.chromaJs.chromaJsStrings.hcl = this.cast("hcl")
  @scala.inline
  def hsi: typings.chromaJs.chromaJsStrings.hsi = this.cast("hsi")
  @scala.inline
  def hsl: typings.chromaJs.chromaJsStrings.hsl = this.cast("hsl")
  @scala.inline
  def hsv: typings.chromaJs.chromaJsStrings.hsv = this.cast("hsv")
  @scala.inline
  def lab: typings.chromaJs.chromaJsStrings.lab = this.cast("lab")
  @scala.inline
  def lch: typings.chromaJs.chromaJsStrings.lch = this.cast("lch")
  @scala.inline
  def lrgb: typings.chromaJs.chromaJsStrings.lrgb = this.cast("lrgb")
  @scala.inline
  def rgb: typings.chromaJs.chromaJsStrings.rgb = this.cast("rgb")
}

