package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  /**
  		 * 获取当前页面
  		 */
  def getCurrentPage(): Page[js.Object, js.Object]
}

object App {
  @scala.inline
  def apply(getCurrentPage: () => Page[js.Object, js.Object]): App = {
    val __obj = js.Dynamic.literal(getCurrentPage = js.Any.fromFunction0(getCurrentPage))
  
    __obj.asInstanceOf[App]
  }
}

