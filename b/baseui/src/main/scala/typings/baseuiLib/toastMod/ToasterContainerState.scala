package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToasterContainerState extends js.Object {
  var isMounted: scala.Boolean
  var toasts: stdLib.Readonly[ToastProps]
}

object ToasterContainerState {
  @scala.inline
  def apply(isMounted: scala.Boolean, toasts: stdLib.Readonly[ToastProps]): ToasterContainerState = {
    val __obj = js.Dynamic.literal(isMounted = isMounted, toasts = toasts)
  
    __obj.asInstanceOf[ToasterContainerState]
  }
}

