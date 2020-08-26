package typings.bootstrap.mod

import typings.bootstrap.bootstrapBooleans.`false`
import typings.bootstrap.bootstrapStrings.carousel
import typings.bootstrap.bootstrapStrings.hover
import typings.bootstrap.bootstrapStrings.next
import typings.bootstrap.bootstrapStrings.prev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselOption extends js.Object {
  /**
    * The amount of time to delay between automatically cycling an item. If false, carousel will not automatically cycle.
    *
    * @default 5000
    */
  var interval: js.UndefOr[`false` | Double] = js.native
  /**
    * Whether the carousel should react to keyboard events.
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * If set to "hover", pauses the cycling of the carousel on `mouseenter` and resumes the cycling of the carousel on `mouseleave`.
    * If set to false, hovering over the carousel won't pause it.
    *
    * On touch-enabled devices, when set to "hover", cycling will pause on `touchend` (once the user finished interacting with the carousel)
    * for two intervals, before automatically resuming. Note that this is in addition to the above mouse behavior.
    *
    * @default "hover"
    */
  var pause: js.UndefOr[hover | `false`] = js.native
  /**
    * Autoplays the carousel after the user manually cycles the first item.
    * If `carousel`, autoplays the carousel on load.
    * @default false
    */
  var ride: js.UndefOr[carousel | Boolean] = js.native
  /**
    * Use to easily control the position of the carousel. It accepts the keywords prev or next, which alters the slide position
    * relative to its current position. Alternatively, use `data-slide-to` to pass a raw slide index to the carousel.
    *
    * @default false
    */
  var slide: js.UndefOr[next | prev | `false`] = js.native
  /**
    * Whether the carousel should support left/right swipe interactions on touchscreen devices.
    *
    * @default true
    */
  var touch: js.UndefOr[Boolean] = js.native
  /**
    * Whether the carousel should cycle continuously or have hard stops.
    *
    * @default true
    */
  var wrap: js.UndefOr[Boolean] = js.native
}

object CarouselOption {
  @scala.inline
  def apply(): CarouselOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselOption]
  }
  @scala.inline
  implicit class CarouselOptionOps[Self <: CarouselOption] (val x: Self) extends AnyVal {
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
    def setInterval(value: `false` | Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setPause(value: hover | `false`): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setRide(value: carousel | Boolean): Self = this.set("ride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRide: Self = this.set("ride", js.undefined)
    @scala.inline
    def setSlide(value: next | prev | `false`): Self = this.set("slide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

