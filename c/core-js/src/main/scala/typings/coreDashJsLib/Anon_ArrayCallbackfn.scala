package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayCallbackfn extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ Array[T], 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ Array[T], 
      scala.Unit
    ]
  ): Array[T] = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ Array[T], 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ Array[T], 
      scala.Unit
    ],
    memo: Array[T]
  ): Array[T] = js.native
  def apply[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit],
    memo: U
  ): U = js.native
}

