package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/filter", JSImport.Namespace)
@js.native
object libraryFnArrayFilterMod extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      scala.Boolean
    ]
  ): coreDashJsLib.Array[T] = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): coreDashJsLib.Array[T] = js.native
}

