package typings.baiduDashApp.swan

import typings.baiduDashApp.Anon_CharacteristicIdDeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.onBLECharacteristicValueChange")
@js.native
object onBLECharacteristicValueChange extends js.Object {
  /**
  	 * 监听低功耗蓝牙设备的特征值变化。必须先启用notify接口才能接收到设备推送的notification。
  	 */
  def apply(callback: js.Function1[/* res */ Anon_CharacteristicIdDeviceId, Unit]): Unit = js.native
}

