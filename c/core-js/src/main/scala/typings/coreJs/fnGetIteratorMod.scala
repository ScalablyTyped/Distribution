package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnGetIteratorMod {
  
  /* was `typeof core.getIterator` */
  inline def apply[T](iterable: js.Iterable[T]): js.Iterator[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[T]]
  
  @JSImport("core-js/library/fn/get-iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
