package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/turn", JSImport.Namespace)
@js.native
object libraryFnArrayTurnMod extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ coreDashJsLib.Array[T], 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      scala.Unit
    ]
  ): coreDashJsLib.Array[T] = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ coreDashJsLib.Array[T], 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      scala.Unit
    ],
    memo: coreDashJsLib.Array[T]
  ): coreDashJsLib.Array[T] = js.native
  def apply[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ U, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      scala.Unit
    ],
    memo: U
  ): U = js.native
}

