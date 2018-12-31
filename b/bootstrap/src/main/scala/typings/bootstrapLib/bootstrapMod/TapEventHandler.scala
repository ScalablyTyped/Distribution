package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapEventHandler[TElement]
  extends jqueryLib.JQueryNs.TriggeredEvent[TElement, js.UndefOr[scala.Nothing], stdLib.HTMLElement, stdLib.HTMLElement] {
   // overridden only for better JsDoc
  /**
    * * For `show.bs.tab` and `shown.bs.tab`, is the previous active tab.
    * * For `hide.bs.tab`, is the new soon-to-be-active tab.
    * * For `hidden.bs.tab`, is the new active tab.
    */
  var relatedTarget: stdLib.HTMLElement
}

