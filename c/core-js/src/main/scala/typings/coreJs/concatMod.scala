package typings.coreJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/fn/array/concat", JSImport.Namespace)
@js.native
object concatMod extends js.Object {
  
  def apply[T](array: ArrayLike[T], items: (Array[T] | T)*): Array[T] = js.native
}
