package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 关闭WebSocket连接。
	 */
trait CloseSocketOptions
  extends BaseOptions[js.Any, js.Any] {
  var code: js.UndefOr[scala.Double] = js.undefined
   // 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。如果这个参数没有被指定，默认的取值是1000 （表示正常连接关闭）	1.4.0
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

