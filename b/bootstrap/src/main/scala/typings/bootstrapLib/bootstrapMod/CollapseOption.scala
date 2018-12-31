package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseOption extends js.Object {
  /**
    * If parent is provided, then all collapsible elements under the specified parent will be closed when
    * this collapsible item is shown. (similar to traditional accordion behavior - this is dependent on the card class).
    * The attribute has to be set on the target collapsible area.
    *
    * @default ""
    */
  var parent: js.UndefOr[
    java.lang.String | bootstrapLib.bootstrapMod.Global.JQuery[stdLib.HTMLElement] | stdLib.Element
  ] = js.undefined
  /**
    * Toggles the collapsible element on invocation.
    *
    * @default true
    */
  var toggle: js.UndefOr[scala.Boolean] = js.undefined
}

