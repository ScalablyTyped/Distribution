package typings.bootstrapSlider

import typings.bootstrapSlider.bootstrapSliderBooleans.`false`
import typings.bootstrapSlider.bootstrapSliderStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * Creates a slider from the current element.
    */
  def bootstrapSlider(): this.type
  def bootstrapSlider(methodName: String, args: js.Any*): this.type
  def bootstrapSlider(options: SliderOptions): this.type
  @JSName("bootstrapSlider")
  var bootstrapSlider_Original: SliderPlugin[this.type]
  
  def on(event: slide, handler: js.Function1[/* slideEvt */ SliderEvent, `false` | Unit]): this.type
  
  /**
    * Creates a slider from the current element.
    */
  def slider(): this.type
  def slider(methodName: String, args: js.Any*): this.type
  def slider(options: SliderOptions): this.type
  @JSName("slider")
  var slider_Original: SliderPlugin[this.type]
}
object JQuery {
  
  inline def apply(
    bootstrapSlider: SliderPlugin[JQuery],
    on: (slide, js.Function1[/* slideEvt */ SliderEvent, `false` | Unit]) => JQuery,
    slider: SliderPlugin[JQuery]
  ): JQuery = {
    val __obj = js.Dynamic.literal(bootstrapSlider = bootstrapSlider.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), slider = slider.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setBootstrapSlider(value: SliderPlugin[JQuery]): Self = StObject.set(x, "bootstrapSlider", value.asInstanceOf[js.Any])
    
    inline def setOn(value: (slide, js.Function1[/* slideEvt */ SliderEvent, `false` | Unit]) => JQuery): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setSlider(value: SliderPlugin[JQuery]): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
  }
}
