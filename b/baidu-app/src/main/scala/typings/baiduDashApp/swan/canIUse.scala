package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.canIUse")
@js.native
object canIUse extends js.Object {
  /**
  	 * 判断小程序的API，回调，参数，组件等是否在当前版本可用。
  	 * String参数说明：
  	 * 使用 ${API}.${method}.${param}.${options}
  	 * 或者 ${component}.${attribute}.${option}方式来调用
  	 * 例如：
  	 * ${API} 代表 API 名字
  	 * ${method} 代表调用方式，有效值为return, success, object, callback
  	 * ${param} 代表参数或者返回值
  	 * ${options} 代表参数的可选值
  	 * ${component} 代表组件名字
  	 * ${attribute} 代表组件属性
  	 * ${option} 代表组件属性的可选值
  	 */
  def apply(api: String): Boolean = js.native
}

