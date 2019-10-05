package typings.blessed.blessedMod

import typings.blessed.blessedMod.Widgets.TextboxElement
import typings.blessed.blessedMod.Widgets.TextboxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "textbox")
@js.native
object textbox extends js.Object {
  def apply(): TextboxElement = js.native
  def apply(options: TextboxOptions): TextboxElement = js.native
}

