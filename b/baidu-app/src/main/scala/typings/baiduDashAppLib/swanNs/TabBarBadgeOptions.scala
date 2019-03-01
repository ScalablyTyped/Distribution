package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarBadgeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * tabBar的哪一项，从左边算起
  		 */
  var index: scala.Double
}

object TabBarBadgeOptions {
  @scala.inline
  def apply(
    index: scala.Double,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): TabBarBadgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[TabBarBadgeOptions]
  }
}

