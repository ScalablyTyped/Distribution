package typings.colorDashNamer

import typings.colorDashNamer.colorDashNamerMod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Omit[T /* <: Palette */] extends js.Object {
  var omit: js.Array[T]
}

object Anon_Omit {
  @scala.inline
  def apply[T /* <: Palette */](omit: js.Array[T]): Anon_Omit[T] = {
    val __obj = js.Dynamic.literal(omit = omit)
  
    __obj.asInstanceOf[Anon_Omit[T]]
  }
}

