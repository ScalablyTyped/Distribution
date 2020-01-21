package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.getWifiList")
@js.native
object getWifiList extends js.Object {
  /**
  	 * 请求获取 Wi-Fi 列表
  	 * 在 onGetWifiList 注册的回调中返回 wifiList 数据。
  	 * iOS 将跳转到系统的 Wi-Fi 界面，Android 不会跳转。
  	 * iOS 11.0 及 iOS 11.1 两个版本因系统问题，该方法失效。但在 iOS 11.2 中已修复。
  	 * @version 1.6.0
  	 */
  def apply(): Unit = js.native
  def apply(options: BaseOptions[_, _]): Unit = js.native
}

