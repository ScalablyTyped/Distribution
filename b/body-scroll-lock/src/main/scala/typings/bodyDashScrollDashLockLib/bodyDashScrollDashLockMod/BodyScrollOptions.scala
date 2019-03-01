package typings
package bodyDashScrollDashLockLib.bodyDashScrollDashLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyScrollOptions extends js.Object {
  var allowTouchMove: js.UndefOr[js.Function1[/* el */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var reserveScrollBarGap: js.UndefOr[scala.Boolean] = js.undefined
}

object BodyScrollOptions {
  @scala.inline
  def apply(
    allowTouchMove: js.Function1[/* el */ stdLib.HTMLElement, scala.Unit] = null,
    reserveScrollBarGap: js.UndefOr[scala.Boolean] = js.undefined
  ): BodyScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (allowTouchMove != null) __obj.updateDynamic("allowTouchMove")(allowTouchMove)
    if (!js.isUndefined(reserveScrollBarGap)) __obj.updateDynamic("reserveScrollBarGap")(reserveScrollBarGap)
    __obj.asInstanceOf[BodyScrollOptions]
  }
}

