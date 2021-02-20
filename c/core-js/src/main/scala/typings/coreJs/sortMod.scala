package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortMod {
  
  /* was `typeof core.Array.sort` */
  @JSImport("core-js/fn/array/sort", JSImport.Namespace)
  @js.native
  def apply[T](array: ArrayLike[T]): Array[T] = js.native
  @JSImport("core-js/fn/array/sort", JSImport.Namespace)
  @js.native
  def apply[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): Array[T] = js.native
}
