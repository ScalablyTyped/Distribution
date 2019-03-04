package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkTypeOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 接口调用成功，返回网络类型 networkType */
  @JSName("success")
  def success_MGetNetworkTypeOptions(res: NetworkTypeData): scala.Unit
}

object GetNetworkTypeOptions {
  @scala.inline
  def apply(
    success: js.Function1[NetworkTypeData, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal(success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
}

