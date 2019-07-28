package typings.bootstrapDashSlider

import typings.bootstrapDashSlider.bootstrapDashSliderNumbers.`false`
import typings.bootstrapDashSlider.bootstrapDashSliderStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("bootstrapSlider")
  var bootstrapSlider_Original: SliderPlugin[this.type] = js.native
  @JSName("slider")
  var slider_Original: SliderPlugin[this.type] = js.native
  /**
    * Creates a slider from the current element.
    */
  def bootstrapSlider(): this.type = js.native
  def bootstrapSlider(methodName: String, args: js.Any*): this.type = js.native
  def bootstrapSlider(options: SliderOptions): this.type = js.native
  def on(event: slide, handler: js.Function1[/* slideEvt */ SliderEvent, `false` | Unit]): this.type = js.native
  /**
    * Creates a slider from the current element.
    */
  def slider(): this.type = js.native
  def slider(methodName: String, args: js.Any*): this.type = js.native
  def slider(options: SliderOptions): this.type = js.native
}

