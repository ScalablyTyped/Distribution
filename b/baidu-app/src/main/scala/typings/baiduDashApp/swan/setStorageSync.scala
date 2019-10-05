package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.setStorageSync")
@js.native
object setStorageSync extends js.Object {
  /**
  	 * 将 data 存储在本地缓存中指定的 key 中，
  	 * 会覆盖掉原来该 key 对应的内容，这是一个同步接口。
  	 *
  	 * @param key 本地缓存中的指定的 key
  	 * @param data 需要存储的内容
  	 */
  def apply(key: String, data: js.Any): Unit = js.native
}

