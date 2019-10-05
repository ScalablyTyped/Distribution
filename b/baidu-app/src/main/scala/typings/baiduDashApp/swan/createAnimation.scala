package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.createAnimation")
@js.native
object createAnimation extends js.Object {
  /**
  	 * 创建一个动画实例animation。调用实例的方法来描述动画。
  	 * 最后通过动画实例的export方法导出动画数据传递给组件的animation属性。
  	 *
  	 * 注意: export 方法每次调用后会清掉之前的动画操作
  	 */
  def apply(): Animation = js.native
  def apply(options: CreateAnimationOptions): Animation = js.native
}

