package typings.colorNamer.mod

import typings.colorNamer.AnonOmit
import typings.colorNamer.AnonPick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-namer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: Palette */](color: String): Colors[T] = js.native
  def apply[T /* <: Palette */](color: String, options: AnonOmit[T]): Colors[Diff[Palette, T]] = js.native
  def apply[T /* <: Palette */](color: String, options: AnonPick[T]): Colors[T] = js.native
}

