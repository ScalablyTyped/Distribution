package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayForEachMod {
  
  /* was `typeof core.Array.forEach` */
  @JSImport("core-js/library/fn/array/for-each", JSImport.Namespace)
  @js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): Unit = js.native
  @JSImport("core-js/library/fn/array/for-each", JSImport.Namespace)
  @js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
}
