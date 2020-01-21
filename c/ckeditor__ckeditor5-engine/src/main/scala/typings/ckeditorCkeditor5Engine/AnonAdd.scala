package typings.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdd extends js.Object {
  def add(): Unit
}

object AnonAdd {
  @scala.inline
  def apply(add: () => Unit): AnonAdd = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction0(add))
  
    __obj.asInstanceOf[AnonAdd]
  }
}

