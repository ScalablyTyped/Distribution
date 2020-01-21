package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.setWifiList")
@js.native
object setWifiList extends js.Object {
  /**
  	 * iOS特有接口 在 onGetWifiList 回调后，利用接口设置 wifiList 中 AP 的相关信息。
  	 * 注意：
  	 * + 该接口只能在 onGetWifiList 回调之后才能调用。
  	 * + 此时客户端会挂起，等待小程序设置 Wi-Fi 信息，请务必尽快调用该接口，若无数据请传入一个空数组。
  	 * + 有可能随着周边 Wi-Fi 列表的刷新，单个流程内收到多次带有存在重复的 Wi-Fi 列表的回调。
  	 * @version 1.6.0
  	 */
  def apply(options: SetWifiListOptions): Unit = js.native
}

