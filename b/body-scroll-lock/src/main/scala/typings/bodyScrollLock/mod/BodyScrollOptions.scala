package typings.bodyScrollLock.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyScrollOptions extends js.Object {
  var allowTouchMove: js.UndefOr[js.Function1[/* el */ HTMLElement | Element, Unit]] = js.undefined
  var reserveScrollBarGap: js.UndefOr[Boolean] = js.undefined
}

object BodyScrollOptions {
  @scala.inline
  def apply(
    allowTouchMove: /* el */ HTMLElement | Element => Unit = null,
    reserveScrollBarGap: js.UndefOr[Boolean] = js.undefined
  ): BodyScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (allowTouchMove != null) __obj.updateDynamic("allowTouchMove")(js.Any.fromFunction1(allowTouchMove))
    if (!js.isUndefined(reserveScrollBarGap)) __obj.updateDynamic("reserveScrollBarGap")(reserveScrollBarGap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyScrollOptions]
  }
}

