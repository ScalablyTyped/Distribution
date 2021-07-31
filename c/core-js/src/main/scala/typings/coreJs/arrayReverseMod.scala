package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayReverseMod {
  
  /* was `typeof core.Array.reverse` */
  @scala.inline
  def apply[T](array: ArrayLike[T]): Array[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  
  @JSImport("core-js/library/fn/array/reverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
