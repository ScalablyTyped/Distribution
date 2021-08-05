package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findIndexMod {
  
  /* was `typeof core.Array.findIndex` */
  inline def apply[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("core-js/fn/array/find-index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
