package typings.baiduApp.swan

import typings.baiduApp.anon.devicesArrayBluetoothDevi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.Array[String] = js.native
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: devicesArrayBluetoothDevi): Unit = js.native
}

object GetConnectedBluetoothDevicesOptions {
  @scala.inline
  def apply(services: js.Array[String], success: devicesArrayBluetoothDevi => Unit): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
  @scala.inline
  implicit class GetConnectedBluetoothDevicesOptionsOps[Self <: GetConnectedBluetoothDevicesOptions] (val x: Self) extends AnyVal {
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
    def setServicesVarargs(value: String*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[String]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: devicesArrayBluetoothDevi => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

