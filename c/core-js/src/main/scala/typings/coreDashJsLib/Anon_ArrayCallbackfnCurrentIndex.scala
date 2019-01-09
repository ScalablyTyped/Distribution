package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayCallbackfnCurrentIndex extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
}

