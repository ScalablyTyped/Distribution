package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.reportAnalytics")
@js.native
object reportAnalytics extends js.Object {
  /**
  	 * 自定义分析数据上报接口。使用前，需要在小程序管理后台自定义分析中新建事件，配置好事件名与字段。
  	 *
  	 * @param eventName 事件名
  	 * @param data 上报的自定义数据
  	 */
  def apply(eventName: String, data: js.Object): Unit = js.native
}

