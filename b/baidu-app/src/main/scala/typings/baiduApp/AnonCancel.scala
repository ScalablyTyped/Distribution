package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  /**
  			 * 为 true 时，表示用户点击了取消（用于 Android 系统区分点击蒙层关闭还是点击取消按钮关闭）
  			 */
  var cancel: Boolean
  /**
  			 * 为 true 时，表示用户点击了确定按钮
  			 */
  var confirm: Boolean
}

object AnonCancel {
  @scala.inline
  def apply(cancel: Boolean, confirm: Boolean): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancel]
  }
}

