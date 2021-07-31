package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinMod {
  
  /* was `typeof core.Array.join` */
  @scala.inline
  def apply[T](array: ArrayLike[T]): java.lang.String = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def apply[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @JSImport("core-js/fn/array/join", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
