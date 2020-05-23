package typings.colorNamer.anon

import typings.colorNamer.mod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pick[T /* <: Palette */] extends js.Object {
  var pick: js.Array[T]
}

object Pick {
  @scala.inline
  def apply[T](pick: js.Array[T]): Pick[T] = {
    val __obj = js.Dynamic.literal(pick = pick.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pick[T]]
  }
}

