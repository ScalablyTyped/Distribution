package typings.chromaDashJs.chromaDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromaDashJs.chromaDashJsStrings.rgb
  - typings.chromaDashJs.chromaDashJsStrings.hsl
  - typings.chromaDashJs.chromaDashJsStrings.hsv
  - typings.chromaDashJs.chromaDashJsStrings.hsi
  - typings.chromaDashJs.chromaDashJsStrings.lab
  - typings.chromaDashJs.chromaDashJsStrings.lch
  - typings.chromaDashJs.chromaDashJsStrings.hcl
  - typings.chromaDashJs.chromaDashJsStrings.lrgb
*/
trait InterpolationMode extends js.Object

object InterpolationMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hcl: typings.chromaDashJs.chromaDashJsStrings.hcl = this.cast("hcl")
  @scala.inline
  def hsi: typings.chromaDashJs.chromaDashJsStrings.hsi = this.cast("hsi")
  @scala.inline
  def hsl: typings.chromaDashJs.chromaDashJsStrings.hsl = this.cast("hsl")
  @scala.inline
  def hsv: typings.chromaDashJs.chromaDashJsStrings.hsv = this.cast("hsv")
  @scala.inline
  def lab: typings.chromaDashJs.chromaDashJsStrings.lab = this.cast("lab")
  @scala.inline
  def lch: typings.chromaDashJs.chromaDashJsStrings.lch = this.cast("lch")
  @scala.inline
  def lrgb: typings.chromaDashJs.chromaDashJsStrings.lrgb = this.cast("lrgb")
  @scala.inline
  def rgb: typings.chromaDashJs.chromaDashJsStrings.rgb = this.cast("rgb")
}

