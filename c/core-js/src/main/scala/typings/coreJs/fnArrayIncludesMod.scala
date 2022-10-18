package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnArrayIncludesMod {
  
  /* was `typeof core.Array.includes` */
  inline def apply[T](array: ArrayLike[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("core-js/fn/array/includes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
