package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait listenerRegistration extends js.Object {
  def removeListener(): Unit
}

object listenerRegistration {
  @scala.inline
  def apply(removeListener: () => Unit): listenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
    __obj.asInstanceOf[listenerRegistration]
  }
}

