package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayFindIndexMod {
  
  /* was `typeof core.Array.findIndex` */
  @JSImport("core-js/library/fn/array/find-index", JSImport.Namespace)
  @js.native
  def apply[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = js.native
  @JSImport("core-js/library/fn/array/find-index", JSImport.Namespace)
  @js.native
  def apply[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = js.native
}
