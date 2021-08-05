package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayJoinMod {
  
  /* was `typeof core.Array.join` */
  inline def apply[T](array: ArrayLike[T]): java.lang.String = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def apply[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @JSImport("core-js/library/fn/array/join", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
