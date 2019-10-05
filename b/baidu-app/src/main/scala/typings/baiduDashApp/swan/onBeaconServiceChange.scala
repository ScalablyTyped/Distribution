package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.onBeaconServiceChange")
@js.native
object onBeaconServiceChange extends js.Object {
  /**
  	 * 监听 iBeacon 服务的状态变化
  	 * @version 1.2.0
  	 */
  def apply(): Unit = js.native
  def apply(callback: js.Function2[/* available */ Boolean, /* discovering */ Boolean, Unit]): Unit = js.native
}

