package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateShareMenuOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否使用带 shareTicket 的转发详情 */
  var withShareTicket: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateShareMenuOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null,
    withShareTicket: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateShareMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(withShareTicket)) __obj.updateDynamic("withShareTicket")(withShareTicket)
    __obj.asInstanceOf[UpdateShareMenuOptions]
  }
}

