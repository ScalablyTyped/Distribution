package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayTurnMod {
  
  /* was `typeof core.Array.turn` */
  @scala.inline
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  @scala.inline
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: Array[T]
  ): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  @scala.inline
  def apply[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: U
  ): U = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[U]
  
  @JSImport("core-js/library/fn/array/turn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
