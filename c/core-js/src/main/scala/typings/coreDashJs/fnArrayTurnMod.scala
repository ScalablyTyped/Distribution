package typings.coreDashJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/turn", JSImport.Namespace)
@js.native
object fnArrayTurnMod extends js.Object {
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): Array[T] = js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: Array[T]
  ): Array[T] = js.native
  def apply[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: U
  ): U = js.native
}

