package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Add extends js.Object {
  def add(): Unit
}

object Add {
  @scala.inline
  def apply(add: () => Unit): Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction0(add))
    __obj.asInstanceOf[Add]
  }
}

