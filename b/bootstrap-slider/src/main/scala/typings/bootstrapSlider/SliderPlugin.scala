package typings.bootstrapSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderPlugin[TJQuery] extends js.Object {
  /**
    * Creates a slider from the current element.
    */
  def apply(): TJQuery = js.native
  def apply(methodName: String, args: js.Any*): TJQuery = js.native
  def apply(options: SliderOptions): TJQuery = js.native
}

