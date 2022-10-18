package typings.coreJs

import typings.std.ArrayLike
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnArrayKeysMod {
  
  /* was `typeof core.Array.keys` */
  inline def apply[T](array: ArrayLike[T]): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Double]]
  
  @JSImport("core-js/library/fn/array/keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
