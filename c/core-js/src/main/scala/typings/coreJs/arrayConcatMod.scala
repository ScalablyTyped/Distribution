package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayConcatMod {
  
  /* was `typeof core.Array.concat` */
  inline def apply[T](array: ArrayLike[T], items: (Array[T] | T)*): Array[T] = ^.asInstanceOf[js.Dynamic].apply(List(array.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Array[T]]
  
  @JSImport("core-js/library/fn/array/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
