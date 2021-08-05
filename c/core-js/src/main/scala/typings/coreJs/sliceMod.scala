package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceMod {
  
  /* was `typeof core.Array.slice` */
  inline def apply[T](array: ArrayLike[T]): Array[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  inline def apply[T](array: ArrayLike[T], start: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def apply[T](array: ArrayLike[T], start: Double, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def apply[T](array: ArrayLike[T], start: Unit, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  @JSImport("core-js/fn/array/slice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
