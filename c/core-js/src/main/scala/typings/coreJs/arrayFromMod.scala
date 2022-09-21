package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayFromMod {
  
  inline def apply[T](arrayLike: js.Iterable[T]): Array[T] = ^.asInstanceOf[js.Dynamic].apply(arrayLike.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  /* was `typeof core.Array.from` */
  inline def apply[T](arrayLike: ArrayLike[T]): Array[T] = ^.asInstanceOf[js.Dynamic].apply(arrayLike.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  inline def apply[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = (^.asInstanceOf[js.Dynamic].apply(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  inline def apply[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): Array[U] = (^.asInstanceOf[js.Dynamic].apply(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  /* was `typeof core.Array.from` */
  inline def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = (^.asInstanceOf[js.Dynamic].apply(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  inline def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): Array[U] = (^.asInstanceOf[js.Dynamic].apply(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  
  @JSImport("core-js/library/fn/array/from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
