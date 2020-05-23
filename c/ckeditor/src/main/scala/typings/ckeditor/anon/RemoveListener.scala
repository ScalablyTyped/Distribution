package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveListener extends js.Object {
  def removeListener(): Unit
}

object RemoveListener {
  @scala.inline
  def apply(removeListener: () => Unit): RemoveListener = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
    __obj.asInstanceOf[RemoveListener]
  }
}

