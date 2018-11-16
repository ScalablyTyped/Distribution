package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PopoverOption extends TooltipOption {
  /**
       * Default content value if data-content attribute isn't present.
       * If a function is given, it will be called with its this reference
       * set to the element that the popover is attached to.
       *
       * @default ""
       */
  var content: js.UndefOr[
    java.lang.String | stdLib.Element | (js.ThisFunction0[/* this */ stdLib.Element, java.lang.String | stdLib.Element])
  ] = js.undefined
}

