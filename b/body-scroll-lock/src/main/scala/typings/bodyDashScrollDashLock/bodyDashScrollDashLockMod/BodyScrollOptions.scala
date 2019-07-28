package typings.bodyDashScrollDashLock.bodyDashScrollDashLockMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyScrollOptions extends js.Object {
  var allowTouchMove: js.UndefOr[js.Function1[/* el */ HTMLElement, Unit]] = js.undefined
  var reserveScrollBarGap: js.UndefOr[Boolean] = js.undefined
}

object BodyScrollOptions {
  @scala.inline
  def apply(
    allowTouchMove: /* el */ HTMLElement => Unit = null,
    reserveScrollBarGap: js.UndefOr[Boolean] = js.undefined
  ): BodyScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (allowTouchMove != null) __obj.updateDynamic("allowTouchMove")(js.Any.fromFunction1(allowTouchMove))
    if (!js.isUndefined(reserveScrollBarGap)) __obj.updateDynamic("reserveScrollBarGap")(reserveScrollBarGap)
    __obj.asInstanceOf[BodyScrollOptions]
  }
}

