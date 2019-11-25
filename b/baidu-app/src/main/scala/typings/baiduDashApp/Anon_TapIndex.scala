package typings.baiduDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TapIndex extends js.Object {
  /**
  			 * 用户点击的按钮，从上到下的顺序，从0开始
  			 */
  var tapIndex: Double
}

object Anon_TapIndex {
  @scala.inline
  def apply(tapIndex: Double): Anon_TapIndex = {
    val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TapIndex]
  }
}

