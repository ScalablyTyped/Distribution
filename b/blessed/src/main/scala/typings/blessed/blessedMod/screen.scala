package typings.blessed.blessedMod

import typings.blessed.blessedMod.Widgets.IScreenOptions
import typings.blessed.blessedMod.Widgets.Screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "screen")
@js.native
object screen extends js.Object {
  def apply(): Screen = js.native
  def apply(options: IScreenOptions): Screen = js.native
}

