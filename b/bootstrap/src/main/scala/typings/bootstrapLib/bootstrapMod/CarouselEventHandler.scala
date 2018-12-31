package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselEventHandler[TElement]
  extends jqueryLib.JQueryNs.TriggeredEvent[TElement, js.UndefOr[scala.Nothing], stdLib.HTMLElement, stdLib.HTMLElement] {
   // overridden only for better JsDoc
  /**
    * The direction in which the carousel is sliding.
    */
  var direction: bootstrapLib.bootstrapLibStrings.left | bootstrapLib.bootstrapLibStrings.right
  /**
    * The index of the current item.
    */
  var from: scala.Double
  /**
    * The DOM element that is being slid into place as the active item.
    */
  var relatedTarget: stdLib.HTMLElement
  /**
    * The index of the next item.
    */
  var to: scala.Double
}

