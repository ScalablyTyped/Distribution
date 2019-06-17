package typings
package baseuiLib.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalState extends js.Object {
  var isVisible: scala.Boolean
  var mounted: scala.Boolean
}

object ModalState {
  @scala.inline
  def apply(isVisible: scala.Boolean, mounted: scala.Boolean): ModalState = {
    val __obj = js.Dynamic.literal(isVisible = isVisible, mounted = mounted)
  
    __obj.asInstanceOf[ModalState]
  }
}

