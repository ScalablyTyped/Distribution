package typings.baseui.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToasterContainerState extends js.Object {
  var isMounted: Boolean
  var toasts: ToastProps
}

object ToasterContainerState {
  @scala.inline
  def apply(isMounted: Boolean, toasts: ToastProps): ToasterContainerState = {
    val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any], toasts = toasts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToasterContainerState]
  }
}

