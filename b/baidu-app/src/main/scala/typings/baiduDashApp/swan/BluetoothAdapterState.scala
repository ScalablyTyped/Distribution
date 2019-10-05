package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothAdapterState extends js.Object {
  /**
  		 * 蓝牙适配器是否可用
  		 */
  var available: Boolean
  /**
  		 * 蓝牙适配器是否处于搜索状态
  		 */
  var discovering: Boolean
}

object BluetoothAdapterState {
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): BluetoothAdapterState = {
    val __obj = js.Dynamic.literal(available = available, discovering = discovering)
  
    __obj.asInstanceOf[BluetoothAdapterState]
  }
}

