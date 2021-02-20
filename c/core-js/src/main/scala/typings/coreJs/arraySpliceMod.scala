package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arraySpliceMod {
  
  @JSImport("core-js/library/fn/array/splice", JSImport.Namespace)
  @js.native
  def apply[T](array: ArrayLike[T], start: Double, deleteCount: js.UndefOr[scala.Nothing], items: T*): Array[T] = js.native
  /* was `typeof core.Array.splice` */
  @JSImport("core-js/library/fn/array/splice", JSImport.Namespace)
  @js.native
  def apply[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): Array[T] = js.native
}
