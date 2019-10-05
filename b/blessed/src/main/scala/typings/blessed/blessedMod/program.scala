package typings.blessed.blessedMod

import typings.blessed.blessedMod.Widgets.IScreenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "program")
@js.native
object program extends js.Object {
  def apply(): BlessedProgram = js.native
  def apply(options: IScreenOptions): BlessedProgram = js.native
}

