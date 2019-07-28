package typings.colorDashNamer

import typings.colorDashNamer.colorDashNamerMod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pick[T /* <: Palette */] extends js.Object {
  var pick: js.Array[T]
}

object Anon_Pick {
  @scala.inline
  def apply[T /* <: Palette */](pick: js.Array[T]): Anon_Pick[T] = {
    val __obj = js.Dynamic.literal(pick = pick)
  
    __obj.asInstanceOf[Anon_Pick[T]]
  }
}

