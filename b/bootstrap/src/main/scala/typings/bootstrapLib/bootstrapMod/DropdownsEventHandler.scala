package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownsEventHandler[TElement]
  extends jqueryLib.JQueryNs.TriggeredEvent[TElement, js.UndefOr[scala.Nothing], stdLib.HTMLElement, stdLib.HTMLElement] {
   // overridden only for better JsDoc
  /**
    * The toggling anchor element.
    */
  var relatedTarget: stdLib.HTMLElement
}

