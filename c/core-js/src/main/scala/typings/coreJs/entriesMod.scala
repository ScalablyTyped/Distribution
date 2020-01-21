package typings.coreJs

import typings.std.ArrayLike
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/entries", JSImport.Namespace)
@js.native
object entriesMod extends js.Object {
  def apply[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = js.native
}

