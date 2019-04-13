package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/reduce-right", JSImport.Namespace)
@js.native
object libraryFnArrayReduceDashRightMod extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      T
    ]
  ): T = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ coreDashJsLib.Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
}

