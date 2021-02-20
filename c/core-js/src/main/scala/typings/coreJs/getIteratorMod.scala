package typings.coreJs

import typings.std.Iterable
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIteratorMod {
  
  /* was `typeof core.getIterator` */
  @JSImport("core-js/fn/get-iterator", JSImport.Namespace)
  @js.native
  def apply[T](iterable: Iterable[T]): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
}
