package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.setStorage")
@js.native
object setStorage extends js.Object {
  /**
  	 * 将数据存储在本地缓存中指定的 key 中，
  	 * 会覆盖掉原来该 key 对应的内容，这是一个异步接口。
  	 */
  def apply(options: SetStorageOptions): Unit = js.native
}

