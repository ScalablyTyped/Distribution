package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectedWifiOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetConnectedWifiOptions(wifi: WiFi): Unit = js.native
}

object GetConnectedWifiOptions {
  @scala.inline
  def apply(success: WiFi => Unit): GetConnectedWifiOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetConnectedWifiOptions]
  }
  @scala.inline
  implicit class GetConnectedWifiOptionsOps[Self <: GetConnectedWifiOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: WiFi => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

