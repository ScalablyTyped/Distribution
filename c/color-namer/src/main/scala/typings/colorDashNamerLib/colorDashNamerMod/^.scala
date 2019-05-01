package typings
package colorDashNamerLib.colorDashNamerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-namer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: Palette */](color: java.lang.String): Colors[Diff[Palette, T]] = js.native
  def apply[T /* <: Palette */](color: java.lang.String, options: colorDashNamerLib.Anon_Omit[T]): Colors[Diff[Palette, T]] = js.native
  def apply[T /* <: Palette */](color: java.lang.String, options: colorDashNamerLib.Anon_Pick[T]): Colors[T] = js.native
}

