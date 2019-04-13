package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/some", JSImport.Namespace)
@js.native
object libraryFnArraySomeMod extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): scala.Boolean = js.native
}

