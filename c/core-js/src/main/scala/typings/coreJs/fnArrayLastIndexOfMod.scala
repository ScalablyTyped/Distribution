package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnArrayLastIndexOfMod {
  
  /* was `typeof core.Array.lastIndexOf` */
  inline def apply[T](array: ArrayLike[T], earchElement: T): Double = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], earchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply[T](array: ArrayLike[T], earchElement: T, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], earchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("core-js/fn/array/last-index-of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
