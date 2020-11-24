package typings.colorNamer.mod

import typings.colorNamer.anon.Omit
import typings.colorNamer.anon.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("color-namer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[T /* <: Palette */](color: String): Colors[T] = js.native
  def apply[T /* <: Palette */](color: String, options: Omit[T]): Colors[Diff[Palette, T]] = js.native
  def apply[T /* <: Palette */](color: String, options: Pick[T]): Colors[T] = js.native
}
