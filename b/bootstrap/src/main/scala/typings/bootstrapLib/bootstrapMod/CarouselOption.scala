package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CarouselOption extends js.Object {
  /**
       * The amount of time to delay between automatically cycling an item. If false, carousel will not automatically cycle.
       *
       * @default 5000
       */
  var interval: js.UndefOr[bootstrapLib.bootstrapLibNumbers.`false` | scala.Double] = js.undefined
  /**
       * Whether the carousel should react to keyboard events.
       *
       * @default true
       */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If set to "hover", pauses the cycling of the carousel on mouseenter and resumes the cycling of the carousel on mouseleave.
       * If set to false, hovering over the carousel won't pause it.
       * On touch-enabled devices, when set to "hover", cycling will pause on touchend (once the user finished interacting with the carousel)
       * for two intervals, before automatically resuming. Note that this is in addition to the above mouse behavior.
       *
       * @default "hover"
       */
  var pause: js.UndefOr[
    bootstrapLib.bootstrapLibStrings.hover | bootstrapLib.bootstrapLibNumbers.`false`
  ] = js.undefined
  /**
       * Use to easily control the position of the carousel. It accepts the keywords prev or next, which alters the slide position
       * relative to its current position. Alternatively, use `data-slide-to` to pass a raw slide index to the carousel.
       *
       * @default false
       */
  var slide: js.UndefOr[
    bootstrapLib.bootstrapLibStrings.next | bootstrapLib.bootstrapLibStrings.prev | bootstrapLib.bootstrapLibNumbers.`false`
  ] = js.undefined
  /**
       * Whether the carousel should cycle continuously or have hard stops.
       *
       * @default true
       */
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

