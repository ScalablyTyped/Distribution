package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.authorize")
@js.native
object authorize extends js.Object {
  /**
  	 * 提前向用户发起授权请求。
  	 * 调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，
  	 * 但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。
  	 */
  def apply(options: AuthorizeOptions): Unit = js.native
}

