package typings.chunk

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chunk", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T](array: ArrayLike[T]): js.Array[js.Array[T]] = js.native
  def apply[T](array: ArrayLike[T], size: Double): js.Array[js.Array[T]] = js.native
}
