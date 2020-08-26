package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkTypeOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 接口调用成功，返回网络类型 networkType */
  @JSName("success")
  def success_MGetNetworkTypeOptions(res: NetworkTypeData): Unit = js.native
}

object GetNetworkTypeOptions {
  @scala.inline
  def apply(success: NetworkTypeData => Unit): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
  @scala.inline
  implicit class GetNetworkTypeOptionsOps[Self <: GetNetworkTypeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSuccess(value: NetworkTypeData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

