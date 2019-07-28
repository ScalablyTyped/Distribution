package typings.concatDashMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("concat-map", JSImport.Namespace)
@js.native
object concatDashMapMod extends js.Object {
  def apply[T, R](xs: js.Array[T], fn: js.Function1[/* x */ T, R | js.Array[R]]): js.Array[R] = js.native
}

