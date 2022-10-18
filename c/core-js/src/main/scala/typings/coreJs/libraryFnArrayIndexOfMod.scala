package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnArrayIndexOfMod {
  
  /* was `typeof core.Array.indexOf` */
  inline def apply[T](array: ArrayLike[T], searchElement: T): Double = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply[T](array: ArrayLike[T], searchElement: T, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("core-js/library/fn/array/index-of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
