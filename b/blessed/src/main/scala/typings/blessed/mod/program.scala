package typings.blessed.mod

import typings.blessed.mod.Widgets.IScreenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "program")
@js.native
object program extends js.Object {
  def apply(): BlessedProgram = js.native
  def apply(options: IScreenOptions): BlessedProgram = js.native
}

