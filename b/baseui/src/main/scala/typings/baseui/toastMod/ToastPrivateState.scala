package typings.baseui.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastPrivateState extends js.Object {
  var isRendered: Boolean
  var isVisible: Boolean
}

object ToastPrivateState {
  @scala.inline
  def apply(isRendered: Boolean, isVisible: Boolean): ToastPrivateState = {
    val __obj = js.Dynamic.literal(isRendered = isRendered.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToastPrivateState]
  }
}

