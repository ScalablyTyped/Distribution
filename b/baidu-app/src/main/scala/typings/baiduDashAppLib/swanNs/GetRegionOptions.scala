package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRegionOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetRegionOptions(res: baiduDashAppLib.Anon_Northeast): scala.Unit
}

object GetRegionOptions {
  @scala.inline
  def apply(
    success: js.Function1[baiduDashAppLib.Anon_Northeast, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetRegionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetRegionOptions]
  }
}

