package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrimitiveOptions extends js.Object {
  /** The css cursor to show when the IPrimitive has mouse events on it. Default value is pointer (hand). */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /** Boolean indicating whether the IPrimitive is visible. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object IPrimitiveOptions {
  @scala.inline
  def apply(cursor: java.lang.String = null, visible: js.UndefOr[scala.Boolean] = js.undefined): IPrimitiveOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IPrimitiveOptions]
  }
}

