package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExtConfigOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetExtConfigOptions(res: baiduDashAppLib.Anon_ErrMsg with ExtConfig): scala.Unit
}

object GetExtConfigOptions {
  @scala.inline
  def apply(
    success: js.Function1[baiduDashAppLib.Anon_ErrMsg with ExtConfig, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetExtConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetExtConfigOptions]
  }
}

