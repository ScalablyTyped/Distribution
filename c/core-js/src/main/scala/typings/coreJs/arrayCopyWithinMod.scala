package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayCopyWithinMod {
  
  /* was `typeof core.Array.copyWithin` */
  @scala.inline
  def apply[T](array: ArrayLike[T], target: Double, start: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  @scala.inline
  def apply[T](array: ArrayLike[T], target: Double, start: Double, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  @JSImport("core-js/library/fn/array/copy-within", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
