package typings.coreJs

import typings.std.ArrayLike
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/fn/array/values", JSImport.Namespace)
@js.native
object valuesMod extends js.Object {
  def apply[T](array: ArrayLike[T]): IterableIterator[T] = js.native
}

