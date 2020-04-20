package typings.colorNamer

import typings.colorNamer.mod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPick[T /* <: Palette */] extends js.Object {
  var pick: js.Array[T]
}

object AnonPick {
  @scala.inline
  def apply[T /* <: Palette */](pick: js.Array[T]): AnonPick[T] = {
    val __obj = js.Dynamic.literal(pick = pick.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPick[T]]
  }
}

