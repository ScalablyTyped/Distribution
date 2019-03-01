package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowTabBarOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否需要动画效果，默认无 */
  var aniamtion: js.UndefOr[scala.Boolean] = js.undefined
}

object ShowTabBarOptions {
  @scala.inline
  def apply(
    aniamtion: js.UndefOr[scala.Boolean] = js.undefined,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): ShowTabBarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aniamtion)) __obj.updateDynamic("aniamtion")(aniamtion)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ShowTabBarOptions]
  }
}

