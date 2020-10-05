package typings.coreJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/fn/array/splice", JSImport.Namespace)
@js.native
object spliceMod extends js.Object {
  def apply[T](array: ArrayLike[T], start: Double, deleteCount: js.UndefOr[scala.Nothing], items: T*): Array[T] = js.native
  def apply[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): Array[T] = js.native
}

