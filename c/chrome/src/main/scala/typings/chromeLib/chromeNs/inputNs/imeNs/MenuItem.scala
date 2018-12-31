package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  /** Indicates this item should be drawn with a check. */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates this item is enabled. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** String that will be passed to callbacks referencing this MenuItem. */
  var id: java.lang.String
  /** Optional. Text displayed in the menu for this item. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The type of menu item. */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Indicates this item is visible. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

