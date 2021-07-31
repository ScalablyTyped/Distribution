package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arraySliceMod {
  
  /* was `typeof core.Array.slice` */
  @scala.inline
  def apply[T](array: ArrayLike[T]): Array[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  @scala.inline
  def apply[T](array: ArrayLike[T], start: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  @scala.inline
  def apply[T](array: ArrayLike[T], start: Double, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  @scala.inline
  def apply[T](array: ArrayLike[T], start: Unit, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  @JSImport("core-js/library/fn/array/slice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
