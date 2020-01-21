package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTapIndex extends js.Object {
  /**
  			 * 用户点击的按钮，从上到下的顺序，从0开始
  			 */
  var tapIndex: Double
}

object AnonTapIndex {
  @scala.inline
  def apply(tapIndex: Double): AnonTapIndex = {
    val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTapIndex]
  }
}

