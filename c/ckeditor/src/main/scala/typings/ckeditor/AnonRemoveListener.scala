package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoveListener extends js.Object {
  def removeListener(): Unit
}

object AnonRemoveListener {
  @scala.inline
  def apply(removeListener: () => Unit): AnonRemoveListener = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
  
    __obj.asInstanceOf[AnonRemoveListener]
  }
}

