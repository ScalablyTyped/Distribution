package typings.blessed.blessedMod

import typings.blessed.blessedMod.Widgets.TerminalElement
import typings.blessed.blessedMod.Widgets.TerminalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "terminal")
@js.native
object terminal extends js.Object {
  def apply(): TerminalElement = js.native
  def apply(options: TerminalOptions): TerminalElement = js.native
}

