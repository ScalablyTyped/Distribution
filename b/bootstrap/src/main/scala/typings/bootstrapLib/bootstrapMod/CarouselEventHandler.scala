package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CarouselEventHandler[TElement]
  extends jqueryLib.JQueryNs.Event[TElement, js.UndefOr[scala.Nothing]] {
  /**
       * The direction in which the carousel is sliding.
       */
  var direction: bootstrapLib.bootstrapLibStrings.left | bootstrapLib.bootstrapLibStrings.right
  /**
       * The index of the current item.
       */
  var from: scala.Double
  /**
       * The index of the next item.
       */
  var to: scala.Double
}

