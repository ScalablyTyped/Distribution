package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkTypeOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 接口调用成功，返回网络类型 networkType */
  @JSName("success")
  def success_MGetNetworkTypeOptions(res: NetworkTypeData): Unit
}

object GetNetworkTypeOptions {
  @scala.inline
  def apply(
    success: NetworkTypeData => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
}

