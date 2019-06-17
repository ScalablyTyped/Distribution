package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastPrivateState extends js.Object {
  var isRendered: scala.Boolean
  var isVisible: scala.Boolean
}

object ToastPrivateState {
  @scala.inline
  def apply(isRendered: scala.Boolean, isVisible: scala.Boolean): ToastPrivateState = {
    val __obj = js.Dynamic.literal(isRendered = isRendered, isVisible = isVisible)
  
    __obj.asInstanceOf[ToastPrivateState]
  }
}

