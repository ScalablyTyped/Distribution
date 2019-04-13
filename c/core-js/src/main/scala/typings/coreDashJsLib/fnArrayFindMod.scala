package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/find", JSImport.Namespace)
@js.native
object fnArrayFindMod extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* obj */ coreDashJsLib.Array[T], 
      scala.Boolean
    ]
  ): T = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* obj */ coreDashJsLib.Array[T], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): T = js.native
}

