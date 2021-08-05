package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayFillMod {
  
  /* was `typeof core.Array.fill` */
  inline def apply[T](array: ArrayLike[T], value: T): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def apply[T](array: ArrayLike[T], value: T, start: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def apply[T](array: ArrayLike[T], value: T, start: Double, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def apply[T](array: ArrayLike[T], value: T, start: Unit, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  @JSImport("core-js/library/fn/array/fill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
