package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.navigateTo")
@js.native
object navigateTo extends js.Object {
  /**
  	 * 保留当前页面，跳转到应用内的某个页面，使用swan.navigateBack可以返回到原页面。
  	 *
  	 * 注意：为了不让用户在使用小程序时造成困扰，
  	 * 我们规定页面路径只能是五层，请尽量避免多层级的交互方式。
  	 */
  def apply(options: NavigateToOptions): Unit = js.native
}

