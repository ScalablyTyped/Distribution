package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/for-each", JSImport.Namespace)
@js.native
object fnArrayForDashEachMod extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      scala.Unit
    ],
    thisArg: js.Any
  ): scala.Unit = js.native
}

