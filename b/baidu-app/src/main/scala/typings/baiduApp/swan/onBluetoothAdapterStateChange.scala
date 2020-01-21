package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.onBluetoothAdapterStateChange")
@js.native
object onBluetoothAdapterStateChange extends js.Object {
  /**
  	 * 监听蓝牙适配器状态变化事件
  	 * @version 1.1.0
  	 */
  def apply(callback: js.Function1[/* res */ BluetoothAdapterState, Unit]): Unit = js.native
}

