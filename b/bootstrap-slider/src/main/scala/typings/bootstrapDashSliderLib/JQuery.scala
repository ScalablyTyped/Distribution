package typings
package bootstrapDashSliderLib

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
  def bootstrapSlider(methodName: java.lang.String, args: js.Any*): this.type = js.native
  /**
       * Creates a slider from the current element.
       */
  def bootstrapSlider(options: SliderOptions): this.type = js.native
  @JSName("on")
  def on_slide(
    event: bootstrapDashSliderLib.bootstrapDashSliderLibStrings.slide,
    handler: js.Function1[
      /* slideEvt */ SliderEvent, 
      bootstrapDashSliderLib.bootstrapDashSliderLibNumbers.`false` | scala.Unit
    ]
  ): this.type = js.native
  /**
       * Creates a slider from the current element.
       */
  def slider(): this.type = js.native
  def slider(methodName: java.lang.String, args: js.Any*): this.type = js.native
  /**
       * Creates a slider from the current element.
       */
  def slider(options: SliderOptions): this.type = js.native
}

