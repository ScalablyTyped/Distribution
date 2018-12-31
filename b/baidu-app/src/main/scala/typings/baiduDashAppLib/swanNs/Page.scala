package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page[D, P] extends Component[D, P] {
  def createCanvasContext(selector: java.lang.String): CanvasContext = js.native
  /**
  		 * 强制更新
  		 */
  def forceUpdate(): scala.Unit = js.native
  /**
  		 * 将页面滚动到目标位置。
  		 *
  		 * scrollTop 滚动到页面的目标位置（单位px）
  		 * [duration] 滚动动画的时长，默认300ms，单位 ms
  		 * @version 1.4.0
  		 */
  def pageScrollTo(): scala.Unit = js.native
  def pageScrollTo(option: PageScrollToOptions): scala.Unit = js.native
  /**
  		 * 字段可以获取到当前页面的路径。
  		 */
  def route(): scala.Unit = js.native
  /**
  		 * 更新
  		 */
  def update(): scala.Unit = js.native
}

