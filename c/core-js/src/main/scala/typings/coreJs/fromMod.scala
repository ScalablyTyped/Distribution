package typings.coreJs

import typings.std.ArrayLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromMod {
  
  /* was `typeof core.Array.from` */
  @JSImport("core-js/fn/array/from", JSImport.Namespace)
  @js.native
  def apply[T](arrayLike: ArrayLike[T]): Array[T] = js.native
  @JSImport("core-js/fn/array/from", JSImport.Namespace)
  @js.native
  def apply[T](arrayLike: Iterable[T]): Array[T] = js.native
  /* was `typeof core.Array.from` */
  @JSImport("core-js/fn/array/from", JSImport.Namespace)
  @js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  @JSImport("core-js/fn/array/from", JSImport.Namespace)
  @js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
  @JSImport("core-js/fn/array/from", JSImport.Namespace)
  @js.native
  def apply[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  @JSImport("core-js/fn/array/from", JSImport.Namespace)
  @js.native
  def apply[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
}
