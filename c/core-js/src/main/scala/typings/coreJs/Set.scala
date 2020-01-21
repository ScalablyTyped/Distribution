package typings.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Set[T] extends js.Object {
  def toJSON(): js.Any
}

object Set {
  @scala.inline
  def apply[T](toJSON: () => js.Any): Set[T] = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Set[T]]
  }
}

