package typings.blueprintjsDatetime

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/common/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def measureTextWidth(text: String): Double = js.native
  def measureTextWidth(text: String, className: String): Double = js.native
  def measureTextWidth(text: String, className: String, containerElement: HTMLElement): Double = js.native
  def padWithZeroes(str: String, minLength: Double): String = js.native
}

