package typings.bootstrap.carouselMod.Carousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The amount of time to delay between automatically cycling an item. If
    * false, carousel will not automatically cycle.
    *
    * @default 5000
    */
  var interval: Double = js.native
  
  /**
    * Whether the carousel should react to keyboard events.
    *
    * @default true
    */
  var keyboard: Boolean = js.native
  
  /**
    * If set to "hover", pauses the cycling of the carousel on mouseenter and
    * resumes the cycling of the carousel on mouseleave. If set to false,
    * hovering over the carousel won't pause it. On touch-enabled devices, when
    * set to "hover", cycling will pause on touchend (once the user finished
    * interacting with the carousel) for two intervals, before automatically
    * resuming. Note that this is in addition to the above mouse behavior.
    *
    * @default "hover"
    */
  var pause: String | Boolean = js.native
  
  /**
    * Autoplays the carousel after the user manually cycles the first item. If
    * "carousel", autoplays the carousel on load.
    *
    * @default false
    */
  var slide: String | Boolean = js.native
  
  /**
    * Whether the carousel should support left/right swipe interactions on
    * touchscreen devices.
    *
    * @default true
    */
  var touch: Boolean = js.native
  
  /**
    * Whether the carousel should cycle continuously or have hard stops.
    *
    * @default true
    */
  var wrap: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(
    interval: Double,
    keyboard: Boolean,
    pause: String | Boolean,
    slide: String | Boolean,
    touch: Boolean,
    wrap: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], slide = slide.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: String | Boolean): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlide(value: String | Boolean): Self = this.set("slide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
  }
}
