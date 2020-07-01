package typings.colorNamer.anon

import typings.colorNamer.mod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Omit[T /* <: Palette */] extends js.Object {
  var omit: js.Array[T]
}

object Omit {
  @scala.inline
  def apply[/* <: typings.colorNamer.mod.Palette */ T](omit: js.Array[T]): Omit[T] = {
    val __obj = js.Dynamic.literal(omit = omit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Omit[T]]
  }
}

