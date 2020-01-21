package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.openShare")
@js.native
object openShare extends js.Object {
  /**
  	 * 调起分享面板。
  	 * bug : 百度App Android 客户端 10.13 以下版本，点击分享
  	 * 面板的取消时,不会执行 fail 回调。
  	 */
  def apply(options: openShareOptions): Unit = js.native
}

