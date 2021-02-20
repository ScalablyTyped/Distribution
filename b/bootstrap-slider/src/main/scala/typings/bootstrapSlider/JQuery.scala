package typings.bootstrapSlider

import typings.bootstrapSlider.bootstrapSliderBooleans.`false`
import typings.bootstrapSlider.bootstrapSliderStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Creates a slider from the current element.
    */
  def bootstrapSlider(): this.type = js.native
  def bootstrapSlider(methodName: String, args: js.Any*): this.type = js.native
  def bootstrapSlider(options: SliderOptions): this.type = js.native
  @JSName("bootstrapSlider")
  var bootstrapSlider_Original: SliderPlugin[this.type] = js.native
  
  def on(event: slide, handler: js.Function1[/* slideEvt */ SliderEvent, `false` | Unit]): this.type = js.native
  
  /**
    * Creates a slider from the current element.
    */
  def slider(): this.type = js.native
  def slider(methodName: String, args: js.Any*): this.type = js.native
  def slider(options: SliderOptions): this.type = js.native
  @JSName("slider")
  var slider_Original: SliderPlugin[this.type] = js.native
}
