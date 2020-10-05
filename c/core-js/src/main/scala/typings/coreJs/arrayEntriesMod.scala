package typings.coreJs

import typings.std.ArrayLike
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/library/fn/array/entries", JSImport.Namespace)
@js.native
object arrayEntriesMod extends js.Object {
  def apply[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = js.native
}

