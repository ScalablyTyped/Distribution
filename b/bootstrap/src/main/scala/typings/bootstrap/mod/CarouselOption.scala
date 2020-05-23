package typings.bootstrap.mod

import typings.bootstrap.bootstrapBooleans.`false`
import typings.bootstrap.bootstrapStrings.carousel
import typings.bootstrap.bootstrapStrings.hover
import typings.bootstrap.bootstrapStrings.next
import typings.bootstrap.bootstrapStrings.prev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOption extends js.Object {
  /**
    * The amount of time to delay between automatically cycling an item. If false, carousel will not automatically cycle.
    *
    * @default 5000
    */
  var interval: js.UndefOr[`false` | Double] = js.undefined
  /**
    * Whether the carousel should react to keyboard events.
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to "hover", pauses the cycling of the carousel on `mouseenter` and resumes the cycling of the carousel on `mouseleave`.
    * If set to false, hovering over the carousel won't pause it.
    *
    * On touch-enabled devices, when set to "hover", cycling will pause on `touchend` (once the user finished interacting with the carousel)
    * for two intervals, before automatically resuming. Note that this is in addition to the above mouse behavior.
    *
    * @default "hover"
    */
  var pause: js.UndefOr[hover | `false`] = js.undefined
  /**
    * Autoplays the carousel after the user manually cycles the first item.
    * If `carousel`, autoplays the carousel on load.
    * @default false
    */
  var ride: js.UndefOr[carousel | Boolean] = js.undefined
  /**
    * Use to easily control the position of the carousel. It accepts the keywords prev or next, which alters the slide position
    * relative to its current position. Alternatively, use `data-slide-to` to pass a raw slide index to the carousel.
    *
    * @default false
    */
  var slide: js.UndefOr[next | prev | `false`] = js.undefined
  /**
    * Whether the carousel should support left/right swipe interactions on touchscreen devices.
    *
    * @default true
    */
  var touch: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the carousel should cycle continuously or have hard stops.
    *
    * @default true
    */
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object CarouselOption {
  @scala.inline
  def apply(
    interval: `false` | Double = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    pause: hover | `false` = null,
    ride: carousel | Boolean = null,
    slide: next | prev | `false` = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): CarouselOption = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.get.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (ride != null) __obj.updateDynamic("ride")(ride.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselOption]
  }
}

