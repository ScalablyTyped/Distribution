package typings.colorNamer

import typings.colorNamer.mod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOmit[T /* <: Palette */] extends js.Object {
  var omit: js.Array[T]
}

object AnonOmit {
  @scala.inline
  def apply[T /* <: Palette */](omit: js.Array[T]): AnonOmit[T] = {
    val __obj = js.Dynamic.literal(omit = omit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOmit[T]]
  }
}

