package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalEventHandler[TElement]
  extends jqueryLib.JQueryNs.TriggeredEvent[TElement, js.UndefOr[scala.Nothing], stdLib.HTMLElement, stdLib.HTMLElement] {
   // overridden only for better JsDoc
  /**
    * For `show.bs.modal` and `shown.bs.modal` is the clicked element, when caused by a _click_.
    * Otherwise is undefined.
    */
  var relatedTarget: js.UndefOr[stdLib.HTMLElement]
}

