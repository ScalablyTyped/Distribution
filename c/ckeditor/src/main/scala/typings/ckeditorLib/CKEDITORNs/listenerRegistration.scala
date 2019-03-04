package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait listenerRegistration extends js.Object {
  def removeListener(): scala.Unit
}

object listenerRegistration {
  @scala.inline
  def apply(removeListener: js.Function0[scala.Unit]): listenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = removeListener)
  
    __obj.asInstanceOf[listenerRegistration]
  }
}

