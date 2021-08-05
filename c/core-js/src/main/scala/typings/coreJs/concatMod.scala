package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  /* was `typeof core.Array.concat` */
  inline def apply[T](array: ArrayLike[T], items: (Array[T] | T)*): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  @JSImport("core-js/fn/array/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
