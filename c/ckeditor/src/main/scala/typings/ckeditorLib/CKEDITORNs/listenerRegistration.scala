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
  def apply(removeListener: () => scala.Unit): listenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
  
    __obj.asInstanceOf[listenerRegistration]
  }
}

