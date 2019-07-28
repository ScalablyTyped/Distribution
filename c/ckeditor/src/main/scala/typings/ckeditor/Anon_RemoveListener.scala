package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoveListener extends js.Object {
  def removeListener(): Unit
}

object Anon_RemoveListener {
  @scala.inline
  def apply(removeListener: () => Unit): Anon_RemoveListener = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
  
    __obj.asInstanceOf[Anon_RemoveListener]
  }
}

