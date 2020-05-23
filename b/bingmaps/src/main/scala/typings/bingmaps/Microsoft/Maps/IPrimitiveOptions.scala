package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrimitiveOptions extends js.Object {
  /** The css cursor to show when the IPrimitive has mouse events on it. Default value is pointer (hand). */
  var cursor: js.UndefOr[String] = js.undefined
  /** Boolean indicating whether the IPrimitive is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IPrimitiveOptions {
  @scala.inline
  def apply(cursor: String = null, visible: js.UndefOr[Boolean] = js.undefined): IPrimitiveOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrimitiveOptions]
  }
}

