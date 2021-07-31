package typings.chunk

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](array: ArrayLike[T]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
  @scala.inline
  def apply[T](array: ArrayLike[T], size: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  
  @JSImport("chunk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
