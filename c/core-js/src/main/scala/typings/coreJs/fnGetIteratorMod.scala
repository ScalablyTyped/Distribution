package typings.coreJs

import typings.std.Iterable
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnGetIteratorMod {
  
  /* was `typeof core.getIterator` */
  @scala.inline
  def apply[T](iterable: Iterable[T]): Iterator[T, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, Unit]]
  
  @JSImport("core-js/library/fn/get-iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
