package typings.coreDashJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/concat", JSImport.Namespace)
@js.native
object fnArrayConcatMod extends js.Object {
  def apply[T](array: ArrayLike[T], items: (Array[T] | T)*): Array[T] = js.native
}

